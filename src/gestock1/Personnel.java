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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class Personnel extends JFrame {
    
     private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    
    public Personnel(){
    
        initComponents();
    
    }
     private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

         setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
         setTitle("GESTOCK");
         setVisible(true);
          setResizable(false);
         setPreferredSize(new Dimension(620, 575));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("pieces\\admine1 (1).png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 100, 200, 181);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informations sur votre Compte");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(250, 80, 290, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Identifiant:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(250, 160, 80, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mot de Passe:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(230, 220, 100, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(340, 160, 50, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("************");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(340, 220, 110, 16);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Changement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ancien Mot de Passe");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 50, 150, 16);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nouveau Identifiant");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(60, 90, 140, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nouveau Mot de Passe");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 130, 150, 16);
        jPanel3.add(jPasswordField1);
        jPasswordField1.setBounds(200, 50, 150, 22);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(200, 90, 150, 22);
        jPanel3.add(jPasswordField2);
        jPasswordField2.setBounds(200, 130, 150, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel3.add(jButton1);
        jButton1.setBounds(30, 170, 110, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\valider2.jpg")); // NOI18N
        jButton2.setText("Appliquer");
        jButton2.setBackground(new Color(255, 255, 255));
        jPanel3.add(jButton2);
        jButton2.setBounds(160, 170, 130, 25);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(190, 300, 390, 210);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 610, 530);
        
                                  try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            String gh="";
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String h="Administrateur";
            
            ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Travail='"+h+"'");
            
            b.first();
 
            gh=b.getString("Login");
            
            jLabel5.setText(gh);
           
     
      }catch(Exception er){
          
                       JOptionPane jop1 = new JOptionPane();
                       jop1.showMessageDialog(null,er.toString(), "Information",JOptionPane.INFORMATION_MESSAGE);
                                     
        
      }

        pack();
        
        setLocationRelativeTo(null);
        
        jButton1.addActionListener(new Quitter());
        
        jButton2.addActionListener(new Appliquer());
        
        
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
                new Personnel().setVisible(true);
            }
        });
    }
  
   class Quitter implements ActionListener {
           
            public void actionPerformed(ActionEvent e){
                
                setVisible(false);
                
                pageadmin p = new pageadmin();
            }
       
       
       }
         class Appliquer implements ActionListener {
           
        
            public void actionPerformed(ActionEvent e){
            
                          try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            String tr="Administrateur";
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Travail='"+tr+"'");
            
            b.first();
            
            String p=b.getString("Password");
            
            if(p.equals(jPasswordField1.getText())){
                
                b.updateString("Login", jTextField1.getText());
            
                b.updateString("Password", jPasswordField2.getText());
            
                b.updateRow();
                
               JOptionPane jop1 = new JOptionPane();
               
               jop1.showMessageDialog(null,"modifications appliquees", "Information",JOptionPane.INFORMATION_MESSAGE);
                                     
                jLabel5.setText(jTextField1.getText());
                
                jTextField1.setText("");
                jPasswordField1.setText("");
                jPasswordField2.setText("");
            
            }
            else{
                
               JOptionPane.showMessageDialog(null, "Votre ancien Mot de passe est incoorect", "GESTOCK", JOptionPane.ERROR_MESSAGE);
            
            }
            
            
        
          
           
     
      }catch(Exception er){
        
      }
                     
            }
       
       
       }
         
     public void  setDefaultCloseOperation(){
         
          setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
          
          pageadmin j = new pageadmin();
      
     }
    
}
