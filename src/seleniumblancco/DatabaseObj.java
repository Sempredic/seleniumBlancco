/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumblancco;

/**
 *
 * @author 311015
 */

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Vince
 */
public class DatabaseObj {
    
    
    static Connection conn;
    static boolean status;
    static boolean userStatus;
    static Statement stmt;
    static PreparedStatement preparedStatement;
    static String dbLocation;
    static DateFormat dateFormat;
    static Date theDate;
    
    public DatabaseObj(){
        
        stmt = null;
        preparedStatement = null;
        dbLocation = readLocSave();
        dateFormat = new SimpleDateFormat("hh:mm a");
	theDate = new Date();
        userStatus = false;
        
        readLocSave();
        connectToDatabase();  
               
    }

    static public void connectToDatabase(){
        try{
          ///////////////////////////CONNECTION////////////////////////////////
            //STEP 2: Register JDBC driver
          Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            //STEP 3: Open a connection
          System.out.println("Connecting to database: " + dbLocation + "...");
          conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbLocation);
          status = true;
 
       }catch(Exception e){
          //////////////////////////NO CONNECTION/////////////////////////////////
          status = false;
          System.out.println(e.toString());
       }
    }
    
    static public String readLocSave(){
        
        String location = " ";
        
        try{
            
            File tmpDir = new File("dbLocation.txt");
            boolean exists = tmpDir.exists();

            if(exists){
                for(String loc:Files.readAllLines(Paths.get("dbLocation.txt"))){
                    location = loc;
                }
            }else{
                tmpDir.createNewFile();
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
           
        return location;
    }
    
    static public void getUserQuery(){
        
        String user = System.getProperty("user.name");
        
        try{
            String stmt = "SELECT USERS.UserID FROM USERS WHERE USERS.UserID = ?";
        
            preparedStatement = conn.prepareStatement(stmt);
            
            preparedStatement.setString(1, user);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                userStatus = true;
            }
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
    static public boolean getUserStatus(){
        return userStatus;
    }
    
    static public LinkedHashMap<String,String> getLogin(){
        LinkedHashMap<String,String> login = new LinkedHashMap<String,String>();
        
        try{
            
            String sql = "SELECT LOGIN.Username, LOGIN.Password FROM LOGIN";
        
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                login.put("Username", rs.getString("Username"));
                login.put("Password", rs.getString("Password"));
            }
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        return login;
    }
   
    
}