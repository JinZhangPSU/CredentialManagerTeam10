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

    static JFrame frame = new JFrame("Credential Manager (Login)");

    public static void OpenHomePage(String name, String password) {
        User u = new User("a", "b", name, password);
        if (name.compareTo("zhangjin") == 0 && password.compareTo("123") == 0) {
            CredentialManager.openHomePage(u);
            frame.dispose();
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
