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


import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    
 private static Connection conn;
 private static String DRIVER = "com.mysql.jdbc.Driver";
 private static String URL = "jdbc:mysql://localhost:3306/";
 private static String USER = "root";
 private static String PASS = "password";
 
 public static Connection getConnection(){
  try {
   Class.forName(DRIVER);
   conn = DriverManager.getConnection(URL,USER,PASS);
  } 
  catch (Exception e) {
   System.out.println(e);
  }
  return conn;
 }

}
