/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialmanager;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jin
 */
public class LoginCtrl {

    static JFrame frame = new JFrame("Credential Manager (Login)");

    public static void OpenHomePage(String name, String password) throws GeneralSecurityException, UnsupportedEncodingException, IOException {
         Scanner fileScan = new Scanner(new File("src/usersDB.txt"));
         User u = new User("a", "b", name, password);
         if(!name.equals("")&&!password.equals(""))
         {
         while (fileScan.hasNextLine()){
            String  username = fileScan.nextLine();
            if(username.equals(name))
            {
                while (fileScan.hasNextLine()){
                    String userpassword = fileScan.nextLine();
                    if(userpassword.equals(password)){
                    AESCrypt aes = new AESCrypt(true, "pass");
                    aes.decrypt("src/zhangjin.txt","src/tempFile.txt");
                    CredentialManager.openHomePage(u);
                    frame.dispose();
                    break;
                    }
                    else if(fileScan.hasNextLine()==false) {
                   JOptionPane.showMessageDialog(null,
                   "Invalid password. Try again.",
                   "Error Message",
                   JOptionPane.ERROR_MESSAGE);
                    }
                }             
            }  

         }
       
         }
            else{
                   JOptionPane.showMessageDialog(null,
                   "Both field must be entered!",
                   "Error Message",
                   JOptionPane.ERROR_MESSAGE);
            }
    }

    public static void OpenSignUpPage() {
        RegistrationUI.openRegistration();

    }

    public static void openLogin() {

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
