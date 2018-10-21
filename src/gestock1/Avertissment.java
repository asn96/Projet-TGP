/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lalita
 */
public class Avertissment extends JFrame implements Runnable{
    
    Thread tr;
    
    JOptionPane p = new JOptionPane();
    
    public Avertissment(){
       
        if(tr==null){
            
            tr=new Thread();
            
            tr.start();
        }
        
    
    }

   
    public void run() {
        
      boolean  bool=true;
        
        while(bool){
            
             String q="";
            
                          try {
                              
                              
            
           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               
           }
                
                String url= "jdbc:mysql://localhost:3306/gestion?useUnicode=true&characterEncoding=UTF-8";
            
                String user="root"; 
            
                String pass1="";
                
                java.sql.Connection c1=DriverManager.getConnection(url, user, pass1);
               
                System.out.println("Connection etablie");
               
                Statement a = c1.createStatement();
               
                ResultSet b = a.executeQuery("SELECT * FROM Pieces");
                
                while(b.next()){
                  
                    q=b.getString("Designation");
                    
                    p.showMessageDialog(null, "La piece détachée "+q+" est entrain de s'épuiser", "GESTOCK", JOptionPane.ERROR_MESSAGE);
                
                }
                
                
         
            } catch (SQLException ex) {
                ex.printStackTrace();
          
            }
                           try {
                              
                              
            
           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               
           }
                
                String url= "jdbc:mysql://localhost:3306/gestion?useUnicode=true&characterEncoding=UTF-8";
            
                String user="root"; 
            
                String pass1="";
                
                java.sql.Connection c1=DriverManager.getConnection(url, user, pass1);
               
                System.out.println("Connection etablie");
               
                Statement a = c1.createStatement();
               
                ResultSet b = a.executeQuery("SELECT * FROM garnitures WHERE Quantite<='"+5+"'");
                
                while(b.next()){
                  
                    q=b.getString("Designation");
                    
                    p.showMessageDialog(null, "La garniture "+q+" est entrain de s'épuiser", "GESTOCK", JOptionPane.ERROR_MESSAGE);
                
                }
                
                
         
            } catch (SQLException ex) {
                ex.printStackTrace();
          
            }
                           
                           try {
                             
                               Thread.sleep(300000);
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
    }
    
    public JOptionPane getMe(){
        
        return p;
    }
    
    public static void main(String[] args) {
        
        Avertissment t = new Avertissment();
        
        t.getMe();
    }
    
    
}
