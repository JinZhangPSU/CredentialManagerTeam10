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
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewUI extends JFrame {

  
    private JButton backButton;
    private JTextArea viewArea;
    private JScrollPane scroll;
    private FileReader fr;
    private BufferedReader br;
    private String filePath;
    private User user;
    
    static JFrame frame = new JFrame("View Credentials");
    
    public static void openView(User u) throws IOException, GeneralSecurityException{
            User user=u;
            
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            frame.add(panel);
            ViewUI vUI = new ViewUI();
            vUI.placeComponents(panel,user);
            frame.setVisible(true);
            frame.setResizable(false);       
        }

    public void placeComponents(JPanel panel, User u) throws IOException, GeneralSecurityException{
        user = u;
        panel.setLayout(null);
        
       
        filePath = "src/tempFile.txt";
        
        AESCrypt aes = new AESCrypt(true,"pass");
        aes.decrypt("src/"+u.getUserName()+".txt", filePath);
        
       
        backButton = new JButton("Back");
        backButton.setBounds(170, 130, 80, 25);
        panel.add(backButton);
        
        viewArea = new JTextArea();
       
        viewArea.setEditable(false);
        viewArea.setText(getCredentials());
        scroll = new JScrollPane(viewArea);
        scroll.setBounds(30,30,200,100);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
  
        panel.add(scroll);
       
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.validate();
                frame.dispose();
                
            }
        });

    }
    
    public String getCredentials() throws IOException{
        String creds = "";
        fr = new FileReader(filePath);
        br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            creds = creds+"\n"+line;
            
        }
        
        System.out.println(creds);
       
        br.close();
        
        
        
        return creds;
    }
    
   

   
}
