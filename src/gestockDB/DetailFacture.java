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
 * @author asndiaye
 */
public class DetailFacture {
    
    private static String url= "jdbc:mysql://localhost:3306/gestion";
            
    private static String user="root"; 
            
    private static String pass="";

    private int reference;

    public DetailFacture(int reference) {
        this.reference = reference;
    }
    
    public void infoGar(){
        try {
            Connection c1 =DriverManager.getConnection(url, user, pass);
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement ad = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement a1 = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet b = a.executeQuery("SELECT * FROM ventegar WHERE IDr = '"+this.reference+"'");
            
            while (b.next()) {
                
                int ref = b.getInt("bonneref");
                int qt = b.getInt("Quantite");
                int id = b.getInt("Identifiant");
                System.out.println("info sur vente garniture : "+"reference => "+ref+"; identifiant => "+id); 
                System.out.println("bingooooooooooooooo..........!!!!!!!!!!!"); 
                ResultSet b1 =  a1.executeQuery("SELECT * FROM garnitures  WHERE bonneref = '"+ref+"'");
                
                b1.first();
                int bonneref = b1.getInt("bonneref");
                
                String lib = b1.getString("Designation");
                System.out.println("infos Garniture : "+" bonne ref => "+bonneref+" ; Désignation => "+lib);
                
            }
            b.close();
            a.close();
        } catch (SQLException ex) {
            Logger.getLogger(DetailFacture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void main(String[] args) {
        DetailFacture detailFacture = new DetailFacture(167);
        
        detailFacture.infoGar();
    }
    
}
