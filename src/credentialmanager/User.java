/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialmanager;

/**
 *
 * @author Jin
 */
public class User {
    
    private String username;
    private String password;
    private String fName;
    private String lName;
    
    public User(String f, String l, String u, String p){
       
       fName=f;
       lName=l; 
       username = u;
       password = p;
    }
    public String getfName(){
        return fName;
    }
    public String getlName(){
        return lName;
    }
    public String getUserName(){
        return username;
    } 
    public String getPassword(){
        return password;
    }
}
