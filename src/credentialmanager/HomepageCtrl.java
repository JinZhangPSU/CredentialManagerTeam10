/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialmanager;

import java.io.IOException;
import java.security.GeneralSecurityException;



/**
 *
 * @author Jin
 */
public class HomepageCtrl {
    public boolean authenticate = false;
    HomepageUI HomepageUI;
    
    public static void openStorePage(User u){
        User user=u;
        StoreUI.openStore(user);
    }
    
    public static void openViewPage(User u) throws IOException, GeneralSecurityException{
        User user=u;
        ViewUI.openView(u);
    }
    
    
    
 
}


