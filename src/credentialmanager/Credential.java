/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialmanager;

/**
 *
 * @author Michael
 */
public class Credential {
    
    private String username;
    private String password;
    
    public Credential(String uName, String pass){
        
        username=uName;
        password=pass;
        
    }
    
    public String getUserName(){
        
        return username;
        
    }
    
    public String getPass(){
        
        return password;
    }
}
