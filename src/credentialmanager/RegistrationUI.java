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

import static credentialmanager.StoreUI.frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private static JLabel error;
    
    static JFrame frame = new JFrame("Credential Manager (Register)");
    
    public static void openRegistration() {
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        RegistrationUI.placeComponents(panel);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public static void placeComponents(JPanel panel){
        panel.setLayout(null);
        
        error = new JLabel("here");
        error.setBounds(10,10,10,10);
        panel.add(error);
        
        usernameL = new JLabel("Username");
        usernameL.setBounds(50, 30, 80, 25);
        panel.add(usernameL);
        
        userText = new JTextField(20);
        userText.setBounds(130, 30, 160, 25);
	panel.add(userText);

        passwordL = new JLabel("Password");
	passwordL.setBounds(50, 70, 80, 25);
	panel.add(passwordL);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(130, 70, 160, 25);
	panel.add(passwordText);
        
        registerButton = new JButton("Register");
	registerButton.setBounds(80, 110, 80, 25);
	panel.add(registerButton);
        
        backOneStep = new JButton("Back");
        backOneStep.setBounds(180, 110, 80, 25);
        panel.add(backOneStep);
        
       registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String pass = passwordText.getText();
                
                    if(!username.equals("")&&!pass.equals("")){
                    String fileName = "src/usersDB.txt";
                    try {
                        
                       File file = new File(fileName);
                        
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        
                       FileWriter fw = new java.io.FileWriter(file.getAbsoluteFile(), true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        String s = username + " " + pass;
                        bw.write(s + "\n");
                        
                        bw.close();
                    }
                     catch (IOException a) {
                        a.printStackTrace();
                    }
                    }
                    
                    else{
                        error.setText("Error: both fields must be entered.");
                    }
                    
                    
               
                }
            
        });
    
        backOneStep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        
}
    
    
    
}
