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
        
public class RegistrationUI extends JFrame{
    
    private static JButton registerButton;
    private static JButton backOneStep;
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JLabel usernameL;
    private static JLabel firstnameL;
    private static JLabel lastnameL;
    private static JLabel passwordL;
    
    
    public static void placeComponents(JPanel panel){
        panel.setLayout(null);
        usernameL = new JLabel("Username");
        usernameL.setBounds(50, 30, 80, 25);
        panel.add(usernameL);
        
        userText = new JTextField(20);
        userText.setBounds(130, 30, 160, 25);
	panel.add(userText);
        
        firstnameL = new JLabel("First Name");
        firstnameL.setBounds(50, 70, 80, 25);
        panel.add(firstnameL);
        
        userText = new JTextField(20);
        userText.setBounds(130, 70, 160, 25);
	panel.add(userText);
        
        lastnameL = new JLabel("Last Name");
        lastnameL.setBounds(50, 110, 80, 25);
        panel.add(lastnameL);
        
        userText = new JTextField(20);
        userText.setBounds(130, 110, 160, 25);
	panel.add(userText);

        passwordL = new JLabel("Password");
	passwordL.setBounds(50, 150, 80, 25);
	panel.add(passwordL);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(130, 150, 160, 25);
	panel.add(passwordText);
        
        registerButton = new JButton("Register");
	registerButton.setBounds(80, 190, 80, 25);
	panel.add(registerButton);
        
        backOneStep = new JButton("Back");
        backOneStep.setBounds(180, 190, 80, 25);
        panel.add(backOneStep);
    
}
    
    
    
}
