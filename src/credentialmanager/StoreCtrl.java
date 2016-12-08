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
public class StoreCtrl {
    public void openStore(){
            JFrame frame = new JFrame("Store Credential");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            frame.add(panel);
            StoreUI.placeComponents(panel);
            frame.setVisible(true);
            frame.setResizable(false);       
        }
}
