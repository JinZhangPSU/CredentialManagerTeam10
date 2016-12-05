/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maf5723
 */
public class FileWriterText {}
/*


    private File file;
    private FileWriter fw;
    private BufferedWriter bw;
    private User user;
        
                try{
                    String fileName = "src/"+user.getUserName()+".txt";
                    file=new File(fileName);
                    
                    if(!file.exists())
                        
                            file.createNewFile();
                    
                    
                    fw = new java.io.FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);
                    
                    String s = labelEntry.getText();
                    bw.write(s+"\n");
                    
                    bw.close();
                    
                    
                }
                catch(IOException a){
                    a.printStackTrace();
                }
                    
                }
*/