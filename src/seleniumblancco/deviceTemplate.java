/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumblancco;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import static org.openqa.selenium.By.name;

/**
 *
 * @author Vince
 */
public class deviceTemplate {
    
    private LinkedHashMap<String,String> criteriaType;
    private String devName;
    
    deviceTemplate(String devName, LinkedHashMap<String,String> criteriaType){
        this.devName = " ";
        criteriaType = new LinkedHashMap<String,String>();
        
        this.devName = devName;
        
        this.criteriaType = criteriaType;
    }
    
    deviceTemplate(String name){
        this.devName = " ";
        criteriaType = new LinkedHashMap<String,String>();

        this.devName = name;   
    }
    
    deviceTemplate(){
        this.devName = " ";
        criteriaType = new LinkedHashMap<String,String>(); 
    }
    
    LinkedHashMap<String,String> getCriteria(){
        return this.criteriaType;
    }
    
    String getDeviceName(){
        return this.devName;
    }
    
    public void setNewName(String name){
        this.devName = name;
    }
    
    public void addCriteriaType(String criteriaName,String criteria){
        criteriaType.put(criteriaName, criteria);
    }
    
    public void removeDeviceType(String device){
        criteriaType.remove(device);
    }
    
    public void updateTemplateName(String name){
        this.devName = name;
    }
    
}
