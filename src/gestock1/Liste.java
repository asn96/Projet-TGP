/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KINGBOURY
 */
   public class Liste extends JFrame {
    
         private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
       DefaultTableModel d;
       public Liste(){
       
           initComponents();
       
       
       }
       
       private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setTitle("GESTOCK");
        setVisible(true);
        setResizable(false);
        setPreferredSize(new Dimension(645, 535));
           

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 20, 120, 25);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\rechercher.jpg")); // NOI18N
        jButton2.setText("Rechercher");
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 17, 130, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\Supprimer1 - copie.jpg")); // NOI18N
        jButton3.setText("Supprimer");
        jPanel1.add(jButton3);
        jButton3.setBounds(330, 20, 130, 25);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("pieces\\imprimer1.jpg")); // NOI18N
        jButton4.setText("Imprimer");
        jPanel1.add(jButton4);
        jButton4.setBounds(480, 20, 140, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 430, 640, 60);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(600, 0, 40, 430);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 0, 570, 30);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 30, 430);
        
        jTable2.setForeground(new Color(255, 255, 255));
        
        jTable2.setBackground(new Color(0, 153, 153));
        
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 13));

      
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 30, 570, 402);

        pack();
        
        CreateColonne();
        
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM Partenaires");
          
           String h;
           
           String g; 
           
           String k;
           
           
        
            
       
            
            while(b.next()){
                    
          h=b.getString("Nom");
          
          g=b.getString("Ville");
          
          k=b.getString("Region");
          
         
          ligne(h, g, k);
                
                
               
    
            
      }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
      
             jButton1.addActionListener(new Quitter());
             jButton2.addActionListener(new Rechercher());
             jButton3.addActionListener(new Supprimer());
             jButton4.addActionListener(new Imprimer());
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
            java.util.logging.Logger.getLogger(Authen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liste().setVisible(true);
            }
        });
    }
     public void CreateColonne(){
        
        d=(DefaultTableModel) jTable2.getModel();
        
        
        d.addColumn("Nom");
        d.addColumn("Ville");
        d.addColumn("Region");
       

        
    }
     
     public void ligne(String e , String f , String g ){
        
         Object[] line ={e, f, g};
        
         d.addRow(line);
    }
         
      class Rechercher implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
               String id="";
                
               String id1="";
               
               String st="";
               
               
                 JOptionPane ti = new JOptionPane();
                 String hosp = ti.showInputDialog(null, "Veuillez Entrer le nom!", "Information !",JOptionPane.QUESTION_MESSAGE);
                 int fp=0;
                 try {
                     fp=Integer.parseInt(hosp);
                    
                } catch (Exception elo) {
                }
               
                     try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM Partenaires WHERE Nom='"+hosp+"'");
            
            b.first();
            
            id=b.getString("Nom");
            
            id1=b.getString("Ville");
            
            st = b.getString("Region");
            
            
            
                     }catch(Exception ex){}
            
                     if(id==""){
                       JOptionPane jop1 = new JOptionPane();
                       jop1.showMessageDialog(null,"Aucune information", "GESTOCK",JOptionPane.INFORMATION_MESSAGE);
                     
                     }
                     else{
                       JOptionPane jop1 = new JOptionPane();
                       jop1.showMessageDialog(null,"Nom:\t\t"+id+"\n"+"Ville:\t\t"+id1+"\n"+"Region:\t\t"+st+"\n", "GESTOCK",JOptionPane.INFORMATION_MESSAGE);
                     
                       id="";
                     }
                     
            }
            
            
      }
      
    class Supprimer implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                int n = jTable2.getSelectedRow();
                
                Object ob = d.getValueAt(n, 0);
             
                    try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            a.executeUpdate("DELETE FROM partenaires WHERE Nom='"+ob+"'");
            
            d.removeRow(n);
            
            JOptionPane.showMessageDialog(null, "Suppression effectuée", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
          
       
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
                
           
            
         
       
}            
    
       
 
  }
     class Imprimer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                MessageFormat hed = new MessageFormat("Liste des Partenaires");
                
                 MessageFormat hed1 = new MessageFormat("Page{0, number, integer}");
                try{
                    jTable2.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
                }
                catch(Exception l){
                    
                    System.out.println("Erreur d'impression");
                }
   
   
            }
   }
      
       class Quitter implements ActionListener {
           
            public void actionPerformed(ActionEvent e){
                
                setVisible(false);
            }
       
       
       } 
    
  }
