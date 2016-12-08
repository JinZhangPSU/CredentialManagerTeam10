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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame {
    
    private  JButton loginButton;
    private  JButton signupButton;
    private  JTextField userText;
    private  JPasswordField passwordText;
    private  JLabel usernameL;
    private  JLabel passwordL;
    
    
    public void placeComponents(JPanel panel){
        panel.setLayout(null);
        usernameL = new JLabel("Username");
        usernameL.setBounds(20, 30, 80, 25);
        panel.add(usernameL);
        
        userText = new JTextField(20);
        userText.setBounds(100, 30, 160, 25);
	panel.add(userText);

        passwordL = new JLabel("Password");
	passwordL.setBounds(20, 70, 80, 25);
	panel.add(passwordL);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 70, 160, 25);
	panel.add(passwordText);

        loginButton = new JButton("Login");;
	loginButton.setBounds(60, 130, 80, 25);
        loginButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String username =  userText.getText();
                    String password = passwordText.getText();
                    LoginCtrl.OpenHomePage(username, password);
                }}
        );
	panel.add(loginButton);

        signupButton = new JButton("Signup");
	signupButton.setBounds(170, 130, 80, 25);
        signupButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                LoginCtrl.OpenSignUpPage();
            }
        });
	panel.add(signupButton);

        


	                
    }
    
    

            


    
}
