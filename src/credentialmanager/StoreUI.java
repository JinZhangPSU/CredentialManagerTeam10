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
import java.util.Random;

public class StoreUI extends JFrame {

    private JButton storeButton;
    private JButton generateButton;
    private JButton backButton;
    private JTextField userText;
    private JTextField passwordText;
    private JLabel usernameL;
    private JLabel passwordL;
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;
    private User user;

    static JFrame frame = new JFrame("Store Credential");
    
    public static void openStore(User u){
            User user=u;
            
            frame.setSize(300, 200);
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
        usernameL = new JLabel("Credential");
        usernameL.setBounds(20, 30, 80, 25);
        panel.add(usernameL);

        userText = new JTextField(20);
        userText.setBounds(100, 30, 160, 25);
        panel.add(userText);

        passwordL = new JLabel("Password");
        passwordL.setBounds(20, 70, 80, 25);
        panel.add(passwordL);

        passwordText = new JTextField(20);
        passwordText.setBounds(100, 70, 160, 25);
        panel.add(passwordText);

        storeButton = new JButton("Store");;
        storeButton.setBounds(60, 130, 80, 25);
        panel.add(storeButton);

        storeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = passwordText.getText();

                try {
                    String fileName = "src/" + user.getUserName() + ".txt";
                    file = new File(fileName);

                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    fw = new java.io.FileWriter(file.getAbsoluteFile(), true);
                    bw = new BufferedWriter(fw);

                    String s = username + " " + password;
                    bw.write(s + "\n");

                    bw.close();

                } catch (IOException a) {
                    a.printStackTrace();
                }

            }

        });

        generateButton = new JButton("Generate Password");;
        generateButton.setBounds(90, 100, 180, 25);
        panel.add(generateButton);

        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String randPass = generatePassword();
                passwordText.setText(randPass);
                passwordText.repaint();
            }
        });

        backButton = new JButton("Back");
        backButton.setBounds(170, 130, 80, 25);
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
