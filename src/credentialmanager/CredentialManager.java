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

import javax.swing.*;

public class CredentialManager {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) 
            {   
                //openRegistration();
                //Database db = new Database();
                //db.getConnection();
                LoginCtrl.openLogin();
            }
        
        
        
        public void openHomePage(){
            JFrame frame = new JFrame("HomePage");
            frame.setSize(350, 350);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            frame.add(panel);
            HomepageUI.createPanel(panel);
            frame.setVisible(true);
            frame.setResizable(false);
        }
        
        
        

        
       
        
        
        
        
        
        
        
        

        
        
        
        
        
     
}
