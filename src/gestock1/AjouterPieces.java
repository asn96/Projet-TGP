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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
public class AjouterPieces extends JFrame{
    
     private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelpu;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    
    public AjouterPieces(){
    initComponents();
    
    }
     private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelpu = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
    
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setPreferredSize(new Dimension(750, 750));
        setVisible(true);
        setTitle("GESTOCK");
        setResizable(false);
     
        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("pieces\\logo.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Application de Gestion de Stock");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 60, 310, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTOCK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 10, 150, 29);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 110, 750, 2);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bonne Reference");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 50, 120, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reference code");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(90, 100, 110, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Designation");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(120, 150, 80, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantite");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(140, 200, 60, 16);
        
        jLabelpu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelpu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpu.setText("Prix Unitaire");
        jPanel2.add(jLabelpu);
        jLabelpu.setBounds(120, 250, 80, 16);
        
        
        jPanel2.add(jTextField1);
        jTextField1.setBounds(220, 50, 150, 22);

        jPanel2.add(jTextField2);
        jTextField2.setBounds(220, 100, 150, 22);

   
        jPanel2.add(jTextField3);
        jTextField3.setBounds(220, 150, 150, 22);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(220, 200, 150, 22);

        jPanel2.add(jTextField5);
        jTextField5.setBounds(220, 250, 150, 22);
        
        jPanel1.add(jPanel2);
        jPanel2.setBounds(90, 150, 520, 300);
        

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Derniere mise a jour 01 Mai 2019");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 10, 230, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Technologie JAVA");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 36, 130, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Version1.0");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 70, 80, 16);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Developpee par:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(400, 10, 130, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Amad Said NDIAYE");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(530, 10, 130, 16);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Diaoula BAL");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(530, 40, 90, 16);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Elhadji Babacar DIALLO");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(530, 70, 160, 16);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 600, 710, 90);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Quitter");
        jPanel5.add(jButton1);
        jButton1.setBounds(130, 10, 100, 25);

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\ajouter.jpg")); // NOI18N
        jButton2.setText("Ajouter");
        jPanel5.add(jButton2);
        jButton2.setBounds(10, 10, 110, 25);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(90, 480, 250, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 710);
       
        pack();
         setLocationRelativeTo(null);
         
         jButton1.addActionListener(new Quitter());
         
          jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTexField4KeyReleased(evt);
            }
        });
         
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
                new AjouterPieces().setVisible(true);
            }
        });
    }
          class Quitter implements ActionListener {
           
            public void actionPerformed(ActionEvent e){
                
                setVisible(false);
                
                pageadmin dd = new pageadmin();
            }
       
       
       }
          
          
          class Ajouter implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                int verifi=0;
                
                if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty()){
                
                      JOptionPane.showMessageDialog(null, "Veuillez renseignez les champs vides", "GESTOCK", JOptionPane.ERROR_MESSAGE);
                }
                else{
                
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
               
                ResultSet b = a.executeQuery("SELECT * FROM Pieces WHERE bonneref='"+jTextField1.getText()+"'");
                
                b.first();
                
                verifi = b.getInt("bonneref");
            
         
            } catch (SQLException ex) {
                ex.printStackTrace();
          
            }
               if(verifi==0){
                     
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
               
                PreparedStatement a = c1.prepareStatement("INSERT INTO Pieces VALUES(?, ?, ?, ?, ?)");
                

                a.setString(1, jTextField1.getText());
                
                a.setString(2, jTextField2.getText());
                
                a.setString(3, jTextField3.getText());
                
                a.setString(4, jTextField4.getText());
                
                a.setString(5, jTextField5.getText());
                a.executeUpdate();

            
                JOptionPane.showMessageDialog(null,"Ajout bien effectuee", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
               
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
               jTextField4.setText("");
               jTextField5.setText("");
         
            } catch (SQLException ex) {
          ex.printStackTrace();
            }
                         
           }
               if(verifi!=0){
                   int aj=0;
                   
                   try {
                       aj=Integer.parseInt(jTextField4.getText());
                   } catch (Exception ep) {
                   }
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
               
                Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
     
                ResultSet b = a.executeQuery("SELECT * FROM Pieces WHERE bonneref='"+jTextField1.getText()+"'");
                
                b.first();
                
                int h = b.getInt("Quantite");
                
                int fin = h+aj;
                
                b.updateInt("Quantite", fin);
                
                b.updateRow();
                
               JOptionPane.showMessageDialog(null,"Ajout bien effectuee", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
               
                     
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
               jTextField4.setText("");
               jTextField5.setText("");
         

         
            } catch (SQLException ex) {
              ex.printStackTrace();
            }
               
               
               }
      
                
          }
       }
       
       
    }
     private void jTexField4KeyReleased (java.awt.event.KeyEvent evt) {                                        
        
                   if((evt.getKeyCode()==10 || evt.getKeyCode()==13) && (jTextField4.getText().isEmpty()==false)){
                       
                       Ajouter re = new Ajouter();
                       ActionEvent ActionEvent = null;
                       
                       re.actionPerformed(ActionEvent);
                   }
      }
      
    
}
