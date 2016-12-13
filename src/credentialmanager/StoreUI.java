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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoreUI extends JFrame {

    private JButton storeButton;
    private JButton generateButton;
    private JButton backButton;
    private JTextField userText;
    private JTextField userText1;
    private JTextField passwordText;
    private JLabel credentialL;
    private JLabel usernameL;
    private JLabel passwordL;
    private JLabel error;
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;
    private User user;

    static JFrame frame = new JFrame("Store Credential");
    
    public static void openStore(User u){
            User user=u;
            
            frame.setSize(300, 235);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            frame.add(panel);
            StoreUI sUI = new StoreUI();
            sUI.placeComponents(panel,user);
            frame.setVisible(true);
            frame.setResizable(false);       
        }
    
    public void placeComponents(JPanel panel, User u) {
        user = u;
        panel.setLayout(null);
        
        error = new JLabel("here");
        error.setBounds(10, 10, 10, 10);
        panel.add(error);
        credentialL = new JLabel("Credential");
        credentialL.setBounds(20, 30, 80, 25);
        panel.add(credentialL);

        userText = new JTextField(20);
        userText.setBounds(100, 30, 160, 25);
        panel.add(userText);
        
        usernameL = new JLabel("Username");
        usernameL.setBounds(20, 60, 80, 25);
        panel.add(usernameL);
        
        userText1 = new JTextField(20);
        userText1.setBounds(100, 60, 160, 25);
        panel.add(userText1);

        passwordL = new JLabel("Password");
        passwordL.setBounds(20, 90, 80, 25);
        panel.add(passwordL);

        passwordText = new JTextField(20);
        passwordText.setBounds(100, 90, 160, 25);
        panel.add(passwordText);

        storeButton = new JButton("Store");;
        storeButton.setBounds(60, 155, 80, 25);
        panel.add(storeButton);

        storeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                    String credName = userText.getText();
                    String username = userText1.getText();
                    String password = passwordText.getText();
                    
                if(!credName.equals("")&&!username.equals("")&&!password.equals("")){
                try {
                    
                    String fileName = "src/tempFile.txt";
                    try {
                        
                        file = new File(fileName);
                        
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        
                        fw = new java.io.FileWriter(file.getAbsoluteFile(), true);
                        bw = new BufferedWriter(fw);
                        
                        String s = credName+": "+username + " " + password;
                        bw.write(s + "\n");
                        
                        bw.close();
                        
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                    
                    AESCrypt aes = new AESCrypt(true, "pass");
                    
                    aes.encrypt(1,fileName,"src/"+user.getUserName()+".txt");
                    
                } catch (GeneralSecurityException ex) {
                    Logger.getLogger(StoreUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(StoreUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(StoreUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                else{
                    error.setText("Error: all fields must be entered.");
                }
            }

        });

        generateButton = new JButton("Generate Password");;
        generateButton.setBounds(90, 120, 180, 25);
        panel.add(generateButton);

        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String randPass = generatePassword();
                passwordText.setText(randPass);
                passwordText.repaint();
            }
        });

        backButton = new JButton("Back");
        backButton.setBounds(170, 155, 80, 25);
        panel.add(backButton);
        
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        
    }

    public String generatePassword() {

        final String alphaNumeric = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String randPassword = "";

        for (int i = 0; i < 8; i++) {
            char tempChar = alphaNumeric.charAt(generateNum());
            randPassword += tempChar;
        }

        return randPassword;
    }

    int generateNum() {

        Random rand = new Random();
        int n = rand.nextInt(71) + 1;

        return n;
    }
}
