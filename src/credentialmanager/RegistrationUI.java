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
    
        backOneStep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        
}
    
    
    
}
