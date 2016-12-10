/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialmanager;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jin
 */
public class RegistrationCtrl {

    public static void openRegistration() {
        JFrame frame = new JFrame("Credential Manager (Register)");
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        RegistrationUI.placeComponents(panel);
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
