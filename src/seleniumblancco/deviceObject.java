/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumblancco;

import java.util.LinkedHashMap;

/**
 *
 * @author Vince
 */
public class deviceObject {
    
    private String deviceName;
    private boolean isMatch;
    private LinkedHashMap<Object,LinkedHashMap<Object,Object>> elements;
    
    deviceObject(String deviceName){
        this.deviceName = deviceName;
        this.elements = new LinkedHashMap<Object,LinkedHashMap<Object,Object>>();
    }
    
    public String getName(){
        return this.deviceName;
    }
    
    public boolean getMatchBoolean(){
        return this.isMatch;
    }
    
    public LinkedHashMap<Object,LinkedHashMap<Object,Object>> getElementMap(){
        return this.elements;
    }
    
    public void setMatchBoolean(boolean isMatch){
        this.isMatch = isMatch;
    }
}
