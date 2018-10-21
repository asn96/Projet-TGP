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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KINGBOURY
 */
public class Utilisateur extends JFrame {
    
     private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    
    public Utilisateur(){
        initComponents();
        
    }
                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setTitle("GESTOCK");
        setVisible(true);
        setResizable(false);
        setPreferredSize(new Dimension(638, 638));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("pieces\\admine1 (1).png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(190, 10, 200, 181);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ajout d'un Utilisateur");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 220, 200, 22);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Identifiant");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(110, 60, 80, 16);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mot de Passe");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(90, 110, 100, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirmation");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(100, 160, 90, 16);
        jPanel3.add(jPasswordField1);
        jPasswordField1.setBounds(200, 110, 150, 22);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(200, 60, 150, 22);
        jPanel3.add(jPasswordField2);
        jPasswordField2.setBounds(200, 160, 150, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel3.add(jButton1);
        jButton1.setBounds(40, 240, 110, 25);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\ajouter.jpg")); // NOI18N
        jButton2.setText("Ajouter");
        jPanel3.add(jButton2);
        jButton2.setBounds(180, 240, 130, 25);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\Supprimer1 - Copie.jpg")); // NOI18N
        jButton3.setText("Supprimer");
        jPanel3.add(jButton3);
        jButton3.setBounds(350, 240, 130, 25);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(60, 270, 530, 300);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 640, 610);

        pack();
        
        setLocationRelativeTo(null);
        
        jButton1.addActionListener(new Quitter());
        
        jButton3.addActionListener(new supp1());
        
        jButton2.addActionListener(new Ajouter());
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilisateur().setVisible(true);
            }
        });
    }
    
        class supp1 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                JOptionPane ti = new JOptionPane();
                 String hosp = ti.showInputDialog(null, "Veuillez entrer l'identifiant!", "Information !",JOptionPane.QUESTION_MESSAGE);
               
            if(hosp.isEmpty()==true){
                
                try {
                    
                } catch (Exception r) {
                }
            
            }
            else{
                
                int vr=0;
                 try {
            
           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               
           }
                
                String url= "jdbc:mysql://localhost:3306/gestion";
            
                String user="root"; 
            
                String pass1="";
                
                java.sql.Connection c1=DriverManager.getConnection(url, user, pass1);
               
                System.out.println("Connection etablie");
               
                Statement a = c1.createStatement();
               
                ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Login='"+hosp+"'");
                
                b.first();
                
                vr= b.getInt("Identifiant");
            
         
            } catch (SQLException ex) {
                ex.printStackTrace();
          
            }
                 if(vr==0){
                 
                     JOptionPane.showMessageDialog(null,"L'identifiant que vous avez saisie n'existe pas","GESTOCK", JOptionPane.ERROR_MESSAGE);
                 
                 }
                 else{
            
                    try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            a.executeUpdate("DELETE FROM connection WHERE Login='"+hosp+"'");
            
           }
            catch(Exception ko){}
            
            
                    JOptionPane jop1 = new JOptionPane();
                    jop1.showMessageDialog(null, "Suppression effectuee", "GESTOCK",JOptionPane.INFORMATION_MESSAGE);
                    jop1.setVisible(true);  
            
            
  }
            }         
           
 }

}
         class Ajouter implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                int verifi=0;
                
                 String g ="Secretaire";
               
                if(jTextField1.getText().isEmpty() || jPasswordField1.getText().isEmpty() || jPasswordField2.getText().isEmpty()){
                
                      JOptionPane.showMessageDialog(null, "Veuillez renseignez les champs vides", "GESTOCK", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(!jPasswordField1.getText().equals(jPasswordField2.getText())){
                    
                        
                        JOptionPane.showMessageDialog(null, "Verifier les informations saisies", "GESTOCK", JOptionPane.ERROR_MESSAGE);
                    
                    }
                    else{
                
                     try {
            
           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               
           }
                
                String url= "jdbc:mysql://localhost:3306/gestion";
            
                String user="root"; 
            
                String pass1="";
                
                java.sql.Connection c1=DriverManager.getConnection(url, user, pass1);
               
                System.out.println("Connection etablie");
               
                Statement a = c1.createStatement();
               
                ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Login='"+jTextField1.getText()+"'");
                
                b.first();
                
                verifi = b.getInt("Identifiant");
              
            
         
            } catch (SQLException ex) {
                ex.printStackTrace();
          
            }
                 if(verifi==0){
                     
              try {
            
                       try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               
           }
                
                String url= "jdbc:mysql://localhost:3306/gestion";
            
                String user="root"; 
            
                String pass1="";
                
                java.sql.Connection c1=DriverManager.getConnection(url, user, pass1);
               
                System.out.println("Connection etablie");
                
               
                Statement a = c1.createStatement();
               
                a.executeUpdate("INSERT INTO connection(Travail, Login, Password) VALUES('"+g+"','"+jTextField1.getText()+"', '"+jPasswordField1.getText()+"')");
             
                JOptionPane.showMessageDialog(null,"Ajout bien effectuee", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
               
                 jTextField1.setText("");
                  
                  jPasswordField1.setText("");
                  
                  jPasswordField2.setText("");
         
            } catch (SQLException ex) {
          ex.printStackTrace();
            }
                         
           }      
               
               if(verifi!=0){
                   
                  JOptionPane.showMessageDialog(null, jTextField1.getText()+ "existe deja dans la base", "GESTOCK", JOptionPane.ERROR_MESSAGE);
               
                  jTextField1.setText("");
                  
                  jPasswordField1.setText("");
                  
                  jPasswordField2.setText("");
            
               }
             
             
                    }
                
          }
       }
       
       
    }
         
           class Quitter implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                setVisible(false);
                
                pageadmin p = new pageadmin();
            
            
            }
           
           }
          
        
    
    
}
