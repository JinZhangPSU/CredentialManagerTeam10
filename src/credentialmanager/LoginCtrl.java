/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialmanager;
import javax.swing.*;
/**
 *
 * @author Jin
 */
public class LoginCtrl {
    
    public void  OpenHomePage(String name, String password)
    {
        if(name.compareTo("zhangjin") == 0 && password.compareTo("123")==0){
        CredentialManager.openHomePage();
    }
        
    }
    
    public void OpenSignUpPage(){
        RegistrationCtrl.openRegistration();
        
    }
    
    public void openLogin(){
            JFrame frame = new JFrame("Credential Manager (Login)");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            frame.add(panel);
            LoginUI.placeComponents(panel);
            frame.setVisible(true);
            frame.setResizable(false);
            //Build Login Frame           
            }
    
}
