/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author KINGBOURY
 */
public class vente extends JFrame{
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane jScrollPane2;
    DefaultTableModel d;
    JLabel la ;
    JLabel le;
    JTextField fa;
    JTextField fe;



    public vente(){
        
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
        jPanel8 = new JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        la = new JLabel();
        le = new JLabel();
        fa = new JTextField();
        fe = new JTextField();



        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setTitle("GESTOCK");
        setVisible(true);
        setResizable(false);
        setPreferredSize(new Dimension(1256, 700));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(830, 320, 10, 10);
        
         
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(550, 119, 640, 550);
      

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vente");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(240, 170, 90, 30);

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
        jSeparator1.setBounds(0, 100, 620, 10);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton2.setText("Fermer");
       
        jPanel5.add(jButton2);
        jButton2.setBounds(90, 600, 120, 25);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\ajouter.jpg")); // NOI18N
        jButton1.setText("Ajouter");
        jPanel5.add(jButton1);
        jButton1.setBounds(240, 600, 140, 25);
        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\Imprimer1.jpg"));
        jButton3.setText("Enregistrer");
        jPanel5.add(jButton3);
        jButton3.setBounds(400, 600, 140, 30);
       

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reference:");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(50, 40, 80, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prix:");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(90, 130, 40, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantite:");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(60, 180, 70, 16);
        jPanel7.add(jTextField1);
        jTextField1.setBounds(140, 40, 160, 22);
        jPanel7.add(jTextField2);
        jTextField2.setBounds(140, 130, 160, 22);
        jPanel7.add(jTextField3);
        jTextField3.setBounds(140, 180, 160, 22);
        la.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        la.setForeground(new java.awt.Color(255, 255, 255));
        la.setText("Nom:");
        jPanel7.add(la);
        la.setBounds(90, 220, 40, 16);
        jPanel7.add(fa);
        fa.setBounds(140, 220, 160, 22);
        le.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        le.setForeground(new java.awt.Color(255, 255, 255));
        le.setText("Prenom:");
        jPanel7.add(le);
        le.setBounds(50, 270, 80, 16);
        jPanel7.add(fe);
        fe.setBounds(140, 270, 160, 22);
        

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Categorie:");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(50, 90, 80, 16);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel7.add(jComboBox1);
        jComboBox1.setBounds(140, 90, 160, 22);
        
        jComboBox1.addItem("Piece detachee");
        
        jComboBox1.addItem("Garniture");
        
        jComboBox1.addItem("Autre");

        jPanel5.add(jPanel7);
        jPanel7.setBounds(80, 260, 420, 300);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 550, 690);

      

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 690, 1260, 60);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(1190, 119, 70, 560);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        jPanel4.add(jSeparator3);
        jSeparator3.setBounds(70, 100, 700, 10);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(480, 0, 780, 120);
        
        
       
        pack();
        
        CreateColonne();
        
           setLocationRelativeTo(null);
           
          jButton1.addActionListener(new Ajouter());
          
          jButton2.addActionListener(new Quitter());
          
          jButton3.addActionListener(new Imprimer());
          
          jButton3.setEnabled(false);
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
                new vente().setVisible(true);
            }
        });
    }
    double pr1=0d;
    int q1=0;
    int vr1=0;
    int fa1=0;
    int id1=0;
    int id2=0;
    String des1="";
    int code1=0;
    
    double tot1=0d;
    double tout=0d;
      class Ajouter implements ActionListener {

            public void actionPerformed(ActionEvent e){
                if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()){
                  
                    JOptionPane.showMessageDialog(null, "Veuillez Renseigner les champs vides ", "GESTOCK", JOptionPane.ERROR_MESSAGE);
                
                }
                else{
                 String etat="facture";
                
                try {
                    pr1=Double.parseDouble(jTextField2.getText());
                    q1=Integer.parseInt(jTextField3.getText());
                } catch (Exception vfe) {
                }
                      tot1=q1*pr1;
                      SimpleDateFormat for1 = new SimpleDateFormat("yyyy-MM-dd");
                      String dat2 = for1.format(new Date());
                
                if(jComboBox1.getSelectedItem().equals("Piece detachee")){
                
                   try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM pieces WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
            
            id1=b.getInt("bonneref");
            
            
            }catch(Exception ex){
            
            }
             if(id1==0){
                 JOptionPane.showMessageDialog(null, "La reference saisie n'existe pas", "GESTOCK", JOptionPane.ERROR_MESSAGE);
             
             }
             else{
                 
                 id1=0;
             
                      try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM pieces WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
         
            vr1=b.getInt("Quantite");
            
            
            }catch(Exception ex){
            
            }
             
             if((vr1-q1)<0){
             
                 JOptionPane.showMessageDialog(null, "La quantite saisie est superieur au stock disponible", "GESTOCK", JOptionPane.ERROR_MESSAGE);
             
             }
             else{
                 
                 
                    try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM pieces WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
         
            code1=b.getInt("coderef");
            
            des1=b.getString("Designation");
            
            
            
            b.updateInt("Quantite", (vr1-q1));
            
            b.updateRow();
            
            }catch(Exception ex){
            
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
               
            
                PreparedStatement a = c1.prepareStatement("INSERT INTO ventepieces VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                

                a.setInt(1, 0);
                
                a.setString(2, jTextField1.getText());
                
                a.setInt(3, code1);
                
                a.setString(4, des1);
                
                a.setDouble(5, pr1);
                
                a.setInt(6, q1);
                
                a.setDouble(7, tot1);
                
                
                
                
                
                
                
                
                a.setInt(8, 0);
                
                a.setString(9, dat2);
                
                a.setString(10, etat);
                
                a.executeUpdate();
                

                ligne(code1, des1, pr1, q1, tot1);
               
               tout=tout+tot1;
               
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
               jButton3.setEnabled(true);
               
            } catch (SQLException ex) {
          ex.printStackTrace();
            }
             
              
             
             }
             
             }
                
          }
            if(jComboBox1.getSelectedItem().equals("Garniture")){
                
                         try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM garnitures WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
            
            id2=b.getInt("bonneref");
            
            
            }catch(Exception ex){
            
            }
             if(id2==0){
                 JOptionPane.showMessageDialog(null, "La reference saisie n'existe pas", "GESTOCK", JOptionPane.ERROR_MESSAGE);
             
             }
             else{
              id2=0;
                      try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM garnitures WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
         
            vr1=b.getInt("Quantite");
            
            
            }catch(Exception ex){
            
            }
             
             if((vr1-q1)<0){
             
                 JOptionPane.showMessageDialog(null, "La quantite saisie est superieur au stock disponible", "GESTOCK", JOptionPane.ERROR_MESSAGE);
             
             }
             else{
                 
                    try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM garnitures WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
         
            code1=b.getInt("coderef");
            
            des1=b.getString("Designation");
            
            
            
            b.updateInt("Quantite", (vr1-q1));
            
            b.updateRow();
            
            }catch(Exception ex){
            
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
               
                PreparedStatement a = c1.prepareStatement("INSERT INTO ventegar VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                

                a.setInt(1, 0);
                
                a.setString(2, jTextField1.getText());
                
                a.setInt(3, code1);
                
                a.setString(4, des1);
                
                a.setDouble(5, pr1);
                
                a.setInt(6, q1);
                
                a.setDouble(7, tot1);
                
                a.setInt(8, 0);
                
                a.setString(9, dat2);
                
                a.setString(10, etat);

                a.executeUpdate();
                
               
               ligne(code1, des1, pr1, q1, tot1);
               
               tout=tout+tot1;
               
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
                jButton3.setEnabled(true);
               
            } catch (SQLException ex) {
          ex.printStackTrace();
            }
             
              
             
             }
             
             }
                
            
            
            }
              if(jComboBox1.getSelectedItem().equals("Autre")){
              
                                 try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion?useUnicode=true&characterEncoding=UTF-8";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM autres WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
            
            id2=b.getInt("bonneref");
            
            
            }catch(Exception ex){
            
            }
             if(id2==0){
                 JOptionPane.showMessageDialog(null, "La reference saisie n'existe pas", "GESTOCK", JOptionPane.ERROR_MESSAGE);
             
             }
             else{
              id2=0;
                      try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM autres WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
         
            vr1=b.getInt("Quantite");
            
            
            }catch(Exception ex){
            
            }
             
             if((vr1-q1)<0){
             
                 JOptionPane.showMessageDialog(null, "La quantite saisie est superieur au stock disponible", "GESTOCK", JOptionPane.ERROR_MESSAGE);
             
             }
             else{
                 
                    try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM autres WHERE bonneref='"+jTextField1.getText()+"'");
            
            b.first();
         
            code1=b.getInt("coderef");
            
            des1=b.getString("Designation");
            
            
            
            b.updateInt("Quantite", (vr1-q1));
            
            b.updateRow();
            
            }catch(Exception ex){
            
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
               
              
                PreparedStatement a = c1.prepareStatement("INSERT INTO venteau VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                

                a.setInt(1, 0);
                
                a.setString(2, jTextField1.getText());
                
                a.setInt(3, code1);
                
                a.setString(4, des1);
                
                a.setDouble(5, pr1);
                
                a.setInt(6, q1);
                
                a.setDouble(7, tot1);
                
                a.setInt(8, 0);
                
                a.setString(9, dat2);
                
                a.setString(10, etat);

                a.executeUpdate();
               
               ligne(code1, des1, pr1, q1, tot1);
               
               tout=tout+tot1;
               
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
                jButton3.setEnabled(true);
               
            } catch (SQLException ex) {
          ex.printStackTrace();
            }
             
              
             
             }
             
             }
              
              }
                
               
         }  
            
            
            }
      
      
      
      }
       class Imprimer implements ActionListener {
                  
        public void actionPerformed(ActionEvent e){
            
            SimpleDateFormat for1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            String dat2 = for1.format(new Date());
            
              int op = JOptionPane.showConfirmDialog(null, "OUI(Pour enregistrer et sortir une facture) Non(Pour enregistrer seulement) ","GESTOCK", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
              
               
              if(op==JOptionPane.OK_OPTION){
            
            int idf=0;
        
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
               
                a.executeUpdate("INSERT INTO facture(Montant, Date, Etat, Nom, Prenom) VALUES('"+tout+"', '"+dat2+"', '"+1+"', '"+fa.getText()+"', '"+fe.getText()+"')");
            
               
               
               
            } catch (SQLException ex) {
                  ex.printStackTrace();
            }
                 try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM Facture WHERE Date='"+dat2+"'");
            
            b.first();
         
            idf=b.getInt("Identifiant");
            
            
          
            }catch(Exception ex){
            
            }
                 try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM ventepieces WHERE IDr='"+0+"'");
            
            while(b.next()){
            
                b.updateInt("IDr", idf);
                
                b.updateRow();
            
            }         
            
            
          
            }catch(Exception ex){
             ex.printStackTrace();
            }
                 
              try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM ventegar WHERE IDr='"+0+"'");
            
            while(b.next()){
            
                b.updateInt("IDr", idf);
                
                b.updateRow();
            
            }         
            
            
          
            }catch(Exception ex){
            ex.printStackTrace();
            }
                               try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM venteau WHERE IDr='"+0+"'");
            
            while(b.next()){
            
                b.updateInt("IDr", idf);
                
                b.updateRow();
            
            }         
            
            
          
            }catch(Exception ex){
             ex.printStackTrace();
            }
            fin("", "", "", "Total", tout);
               
            
                 String s="Identifiant: "+idf+" \nDate: "+dat2;
            
                 MessageFormat hed = new MessageFormat(s);
                
                 MessageFormat hed1 = new MessageFormat("Page{0, number, integer}"+"date; "+dat2);
                try{
                    jTable1.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
                    
                }
                catch(Exception l){
                    
                    System.out.println("Erreur d'impression");
                }
            
            
            
                int limit=d.getRowCount();
                for (int i = limit-1; i >=0; --i) {
                   d.removeRow(i);
                }
                
                tout=0d;
                
              }
              
              if(op==JOptionPane.NO_OPTION){
                    int idf=0;
        
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
               
                a.executeUpdate("INSERT INTO facture(Montant, Date, Etat, Nom, Prenom) VALUES('"+tout+"', '"+dat2+"', '"+1+"', '"+fa.getText()+"', '"+fe.getText()+"')");
            
               
               
               
            } catch (SQLException ex) {
                  ex.printStackTrace();
            }
                 try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM Facture WHERE Date='"+dat2+"'");
            
            b.first();
         
            idf=b.getInt("Identifiant");
            
            
          
            }catch(Exception ex){
            
            }
                 try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM ventepieces WHERE IDr='"+0+"'");
            
            while(b.next()){
            
                b.updateInt("IDr", idf);
                
                b.updateRow();
            
            }         
            
            
          
            }catch(Exception ex){
             ex.printStackTrace();
            }
                 
              try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM ventegar WHERE IDr='"+0+"'");
            
            while(b.next()){
            
                b.updateInt("IDr", idf);
                
                b.updateRow();
            
            }         
            
            
          
            }catch(Exception ex){
            ex.printStackTrace();
            }
                               try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM venteau WHERE IDr='"+0+"'");
            
            while(b.next()){
            
                b.updateInt("IDr", idf);
                
                b.updateRow();
            
            }         
            
            
          
            }catch(Exception ex){
             ex.printStackTrace();
            }
            fin("", "", "", "Total", tout);
                  
                   int limit=d.getRowCount();
                for (int i = limit-1; i >=0; --i) {
                   d.removeRow(i);
                }
                tout=0d;
              }
              
                 
              
               jButton3.setEnabled(false);
               
               fa.setText("");
               fe.setText("");
        }
      
       
       }
       
         class Quitter implements ActionListener {
                  
        public void actionPerformed(ActionEvent e){
        
            setVisible(false);
            
            pagesec er = new pagesec();
        }
      
       
       }
         public void CreateColonne(){
        
        d=(DefaultTableModel) jTable1.getModel();
        
        
        d.addColumn("Reference");
        d.addColumn("Designation");
        d.addColumn("Prix");
        d.addColumn("Quantite");
        d.addColumn("Total");


       

        
    }
           public void ligne(int a, String b, double c, int j, double e  ){
        
                  Object[] line ={a, b, c, j, e};
                  
                  d.addRow(line);
                  
         
        
          }
          public void fin(String gh, String gi, String gj, String gk, double fit){
        
                  Object[] line ={gh, gi, gj, gk, fit };
                  
                  d.addRow(line);
                  
         
        
          }

    
}
