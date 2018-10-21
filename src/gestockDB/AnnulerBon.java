/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestockDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Papa NDIAYE
 */
public class AnnulerBon {
     private String url= "jdbc:mysql://localhost:3306/gestion";
            
    private String user="root"; 
            
    private String pass="";
    
    private Object o;
    
    private int n;
    private Annuler annuler;

  

   
    public AnnulerBon(Object o) {
       try {
            this.o = o;
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            a.executeUpdate("DELETE FROM bon  WHERE Identifiant = '"+o+"'");
        } catch (SQLException ex) {
            Logger.getLogger(Annuler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AnnuleGar()
    {
        try {
            Connection c1 =DriverManager.getConnection(url, user, pass);            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement ad = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement a1 = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet b = a.executeQuery("SELECT * FROM ventegar WHERE IDr = '"+o+"'");
               
            while (b.next()) {
                
                int ref = b.getInt("bonneref");
                int qt = b.getInt("Quantite");
                int id = b.getInt("Identifiant");
                System.out.println("enter..........!!!!!!!!!!!"); 
                ad.executeUpdate("DELETE FROM ventegar  WHERE Identifiant = '"+id+"'");
                System.out.println("bingooooooooooooooo..........!!!!!!!!!!!"); 
                ResultSet b1 =  a1.executeQuery("SELECT * FROM garnitures  WHERE bonneref = '"+ref+"'");
                
                b1.first();
                int qti = b1.getInt("Quantite");
                b1.updateInt("Quantite", qt+qti);
                b1.updateRow();
                
            }
            b.close();
           
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void AnnulePiece()
    {
        try {
            Connection c1 =DriverManager.getConnection(url, user, pass);            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement ad = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement a1 = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet b2 = a.executeQuery("SELECT * FROM ventepieces WHERE IDr = '"+o+"'");
            
               
            while (b2.next()) {
                System.out.println("enter..........!!!!!!!!!!!");
                int ref = b2.getInt("bonneref");
                int qt = b2.getInt("Quantite");
                int id = b2.getInt("Identifiant");
                
                ad.executeUpdate("DELETE FROM ventepieces  WHERE Identifiant = '"+id+"'");
                  System.out.println("bingooooooooooooooo..........!!!!!!!!!!!"); 
                ResultSet b1 =  a1.executeQuery("SELECT * FROM pieces  WHERE bonneref = '"+ref+"'");
                b1.first();
                int qti = b1.getInt("Quantite");
                b1.updateInt("Quantite", qt+qti);
                b1.updateRow();
                
            }
           
            b2.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void AnnuleAutre()
    {
        try {
            Connection c1 =DriverManager.getConnection(url, user, pass);            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement ad = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement a1 = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet b3 = a.executeQuery("SELECT * FROM venteau WHERE IDr = '"+o+"'");
           
                  
            while (b3.next()) {
                System.out.println("enter..........!!!!!!!!!!!");
                int ref = b3.getInt("bonneref");
                int qt = b3.getInt("Quantite");
                int id = b3.getInt("Identifiant");
                
                ad.executeUpdate("DELETE FROM venteau  WHERE Identifiant = '"+id+"'");
                System.out.println("bingooooooooooooooo..........!!!!!!!!!!!");
                ResultSet b1 =  a1.executeQuery("SELECT * FROM autres  WHERE bonneref = '"+ref+"'");
                b1.first();
                int qti = b1.getInt("Quantite");
                b1.updateInt("Quantite", qt+qti);
                b1.updateRow();
                
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
                     
    }
    
    
    
    
}
