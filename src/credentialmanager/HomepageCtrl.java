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
public class HomepageCtrl {
    public boolean authenticate = false;
    HomepageUI HomepageUI;
    
    public static void openStorePage(User u){
        User user=u;
        StoreCtrl.openStore(user);
    }
    
    
    
 
}


