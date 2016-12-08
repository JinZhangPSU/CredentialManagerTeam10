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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomepageUI extends JFrame{
   


    public void createPanel(JPanel homePanel) {
        
        
        homePanel.setLayout(new GridLayout(2,2));
        
        JButton storeButton = new JButton();
        JButton generateButton = new JButton();
        JButton viewButton = new JButton();
        JButton logoutButton = new JButton();
        
        storeButton.setText("Store Credential");
        generateButton.setText("Generate Password");
        viewButton.setText("My Credential(s)");
        logoutButton.setText("Logout");
        
        storeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                HomepageCtrl.openStorePage();
            }
        });
        
        homePanel.add(storeButton);
        homePanel.add(generateButton);
        homePanel.add(viewButton);
        homePanel.add(logoutButton);
      
  
        
    }
        
    }
