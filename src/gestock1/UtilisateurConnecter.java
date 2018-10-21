/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class UtilisateurConnecter extends JFrame{
    
     private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;

    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    DefaultTableModel d;
    
    public UtilisateurConnecter(){
        
        initComponents();
        
    }
    
    private void initComponents() {

       
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("GESTOCK");
        setPreferredSize(new Dimension(629, 470));
        
        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Utilisateur du Jour");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(180, 10, 190, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 630, 50);

       jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 50, 40, 390);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(900, 100, 0, 400);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
   
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 550, 350);

        jPanel9.setBackground(new java.awt.Color(0, 51, 51));
        jPanel9.setLayout(null);
        getContentPane().add(jPanel9);
        jPanel9.setBounds(590, 50, 40, 390);
        
        jPanel6.setBackground(new java.awt.Color(0, 51, 51));
        jPanel6.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel6.add(jButton1);
        jButton1.setBounds(0, 10, 100, 25);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(40, 400, 550, 40);
        
        jButton1.addActionListener(new Quitter());

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
            
            ResultSet b = a.executeQuery("SELECT * FROM utiljour");
           
            String log;
            
            String mot;
            
            String etre;
            
            String sort;
            
            String mote ="********";
            
       
            
            while(b.next()){
          
                log=b.getString("Login");
                
                mot=b.getString("Motdepasse");
                
                etre=b.getString("Date_Ent");
                
                sort=b.getString("Date_Sorti");
                
                ligne(log, mote, etre, sort);
             
               
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
                new UtilisateurConnecter().setVisible(true);
            }
        });
    }
    
      public void CreateColonne(){
        
        d=(DefaultTableModel) jTable1.getModel();
        
        
        d.addColumn("Login");
        d.addColumn("Mot de Passe");
        d.addColumn("Date d'Entrée");
        d.addColumn("Date de Sortie");
    
        
    }
      
      public void ligne(String a, String b, String c, String e ){
            
          
                  Object[] line ={a, b, c, e};
                  
                  d.addRow(line);
          
          
      }
      
      class Quitter implements  ActionListener{
          
          public void actionPerformed(ActionEvent e){
              
              setVisible(false);
              
              pageadmin p = new pageadmin();
          }
      }
}
