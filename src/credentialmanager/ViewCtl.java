/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialmanager;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.swing.*;

/**
 *
 * @author Jin
 */
public class ViewCtl {
    public static void openView(User u) throws IOException, GeneralSecurityException{
            User user=u;
            JFrame frame = new JFrame("View Credentials");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            frame.add(panel);
            ViewUI vUI = new ViewUI();
            vUI.placeComponents(panel,user);
            frame.setVisible(true);
            frame.setResizable(false);       
        }
}
