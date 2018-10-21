/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock1;

import gestockDB.AnnulerBon;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lalita
 */
public class Infobononpayé extends JFrame{
    
     private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2, jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    DefaultTableModel d;
    public JButton b1;
    
    public Infobononpayé(){
       
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        b1 = new JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("GESTOCK");
        setPreferredSize(new Dimension(936, 590));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 20, 110, 25);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\imprimer1.jpg")); // NOI18N
        jButton2.setText("Imprimer");
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 20, 130, 29);
        
        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setText("Payer");
        jPanel1.add(b1);
        b1.setBounds(340, 20, 130, 29);
        
        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\actu.jpg")); // NOI18N
        jButton3.setText("Annuler");
        jButton3.addActionListener(new supprimer());
        jPanel1.add(jButton3);
        jButton3.setBounds(510, 20, 130, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 500, 940, 60);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 50);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 50, 30, 450);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(900, 50, 40, 450);

        
        
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 870, 450);

        pack();
        
        jButton1.addActionListener(new Quitter());
        
        jButton2.addActionListener(new Imprimer());
        
        b1.addActionListener(new Payer());
        
        CreateColonne();
        
        
        
           
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM bon WHERE Etat='"+0+"' ORDER BY Date DESC");
          
           int bonn;
           
           String nom;
           
           String vi;
           
           String reg;
           
           String numa;
           
           double mont;
           
           String datet;
           
           
            while(b.next()){
          
                bonn = b.getInt("Identifiant");
                
                nom = b.getString("Nom");
                
                vi = b.getString("Ville");
                
                reg = b.getString("Region");
                
                numa = b.getString("Numero_auto");
                
                mont = b.getDouble("Montant");
                
                datet = b.getString("Date");
                
                ligne(bonn, nom, vi, reg, numa, mont, datet);
                
             }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
           
                 
        
        setLocationRelativeTo(null);
    }                      

  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Infobononpayé().setVisible(true);
            }
        });
    }
    
    public void CreateColonne(){
        
        d=(DefaultTableModel) jTable1.getModel();
        
        
        d.addColumn("Identifiant");
        d.addColumn("Nom");
        d.addColumn("Ville");
        d.addColumn("Region");
        d.addColumn("Numero auto");
        d.addColumn("Montant");
        d.addColumn("Date");

        
   

    }
     public void ligne(int a, String b, String c, String e, String f, double g, String i  ){
        
                  Object[] line ={a, b, c, e, f, g, i};
                  
                  d.addRow(line);
     }
     
    class Quitter implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
            
                setVisible(false);
            
            }
    
    
    }
     
     class Imprimer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                MessageFormat hed = new MessageFormat("Liste des produits vendus");
                
                 MessageFormat hed1 = new MessageFormat("Page{0, number, integer}");
                try{
                    jTable1.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
                }
                catch(Exception l){
                    
                    System.out.println(l.getMessage());
                }
   
   
            }
   }
     
   class Payer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
               
                 int n = jTable1.getSelectedRow();
                 
                 Object ob1 = d.getValueAt(n, 0);
                 
                      try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM bon WHERE Identifiant='"+ob1+"'");
            
            b.first();
            
            b.updateInt("Etat", 1);
            
            b.updateRow();
            
            d.removeRow(n);
            
            JOptionPane.showMessageDialog(null, "Payement effectué", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
          
            }catch(Exception oui){
                          
                          
            }
            
            }
    
    
    }
   
    class supprimer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                int n = jTable1.getSelectedRow();
                
                Object ob = d.getValueAt(n, 0);
                
                AnnulerBon a = new AnnulerBon(ob);
                a.AnnuleGar();
                a.AnnulePiece();
                a.AnnuleAutre();
                d.removeRow(n);
                JOptionPane.showMessageDialog(null,"Le Bon a été annulée avec succés","Confirmation",JOptionPane.INFORMATION_MESSAGE);
            
                }
            }
    
}
