/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KINGBOURY
 */
public class depense extends JFrame{

         private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    
    
        public depense(){
        
          initComponents();
        }
        
        
          private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setTitle("GESTOCK");
        setVisible(true);
        setResizable(false);
        setPreferredSize(new Dimension(625, 625));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(830, 320, 10, 10);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Depense");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(250, 120, 120, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("pieces\\logo.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(10, 20, 100, 62);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GESTOCK");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(140, 10, 130, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Application de Gestion de Stock");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(140, 60, 290, 22);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(0, 102, 620, 10);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton2.setText("Fermer");
       
        jPanel5.add(jButton2);
        jButton2.setBounds(90, 420, 120, 25);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\ajouter.jpg")); // NOI18N
        jButton1.setText("Ajouter");
        jPanel5.add(jButton1);
        jButton1.setBounds(240, 420, 140, 25);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Montant");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(60, 36, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Commentaire");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(30, 100, 90, 16);
        jPanel7.add(jTextField1);
        jTextField1.setBounds(140, 40, 160, 22);

        
        jPanel7.add(jTextField2);
        jTextField2.setBounds(140, 100, 160, 22);

        jPanel5.add(jPanel7);
        jPanel7.setBounds(80, 180, 420, 200);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Derniere mise a jour 24 avril 2018");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 10, 220, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Technologie: JAVA");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 50, 140, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Version1.0");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 80, 90, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Developee par: Amad Said NDIAYE");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(310, 10, 240, 16);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Diadioula BAL");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(450, 40, 110, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ELhadji Babacar DIALLO");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(390, 80, 160, 16);

        jPanel5.add(jPanel1);
        jPanel1.setBounds(20, 470, 580, 110);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 620, 590);

        pack();
        
        setLocationRelativeTo(null);
        
        jButton1.addActionListener(new Ajouter());
        
        jButton2.addActionListener(new Quitter());
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
                new depense().setVisible(true);
            }
        });
    }
    class Quitter implements ActionListener{
        
        public void  actionPerformed(ActionEvent e){
            
            setVisible(false);
            
            pagesec er = new pagesec();
        }
    }
    
     class Ajouter implements ActionListener{
        
        public void  actionPerformed(ActionEvent e){
            
            if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()){
            
                 JOptionPane.showMessageDialog(null,"Veuillez rensigner les champs vides", "GESTOCK", JOptionPane.ERROR_MESSAGE);
            }
            else{
            
            double mon=0d;
            
            SimpleDateFormat for1 = new SimpleDateFormat("yyyy-MM-dd");
            
            String dat2 = for1.format(new Date());
             
                try {
                    mon=Double.parseDouble(jTextField1.getText());

                } catch (Exception vfe) {
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
               
                PreparedStatement a = c1.prepareStatement("INSERT INTO depense VALUES(?, ?, ?, ?)");
                

                a.setInt(1, 0);
                
                a.setDouble(2, mon);
                
                a.setString(3, jTextField2.getText());
                
                a.setString(4, dat2);

                a.executeUpdate();

            
                JOptionPane.showMessageDialog(null,"Ajout bien effectuee", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
                
                jTextField1.setText("");
                
                jTextField2.setText("");

              
              
            } catch (SQLException ex) {
          ex.printStackTrace();
            }
             
            }

        }
    }
}
