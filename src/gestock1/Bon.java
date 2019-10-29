/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock1;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Bon extends JFrame{
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    
      public Bon(){
          
          initComponents();
      }
      
       private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("GESTOCK");
        setPreferredSize(new Dimension(798, 554));

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 0, 0, 0);

        jButton6.setText("jButton6");
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 0, 0, 0);

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));
        jPanel6.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 60, 25, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ville");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 110, 23, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Region");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 160, 39, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero Voiture");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 210, 90, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Identifiant");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 260, 90, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SOCIETE");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 10, 70, 17);
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(140, 60, 140, 20);
        
      
        String soc="";
        
                 try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM partenaires");
            
           while(b.next()){
               
               soc = b.getString("Nom");
               
               
               jComboBox2.addItem(soc);
           }
            
            
            
            }catch(Exception ex){
            
            }
        
        
        jPanel2.add(jTextField2);
        jTextField2.setBounds(140, 110, 140, 20);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(140, 160, 140, 20);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(140, 210, 140, 20);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(140, 260, 140, 20);

        jPanel8.add(jPanel2);
        jPanel2.setBounds(20, 50, 320, 310);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRODUIT");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(130, 10, 110, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Reference");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 60, 70, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Categorie");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 110, 70, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Prix");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 160, 40, 14);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantite");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 210, 49, 14);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(140, 60, 140, 20);
       
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(140, 110, 160, 22);
        
        jComboBox1.addItem("Piece detachee");
        
        jComboBox1.addItem("Garniture");
        
        jComboBox1.addItem("Autre");
        jPanel1.add(jTextField8);
        jTextField8.setBounds(140, 160, 140, 20);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(140, 210, 140, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Ajouter");
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 270, 110, 23);

        jPanel8.add(jPanel1);
        jPanel1.setBounds(380, 50, 330, 310);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(30, 70, 740, 400);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Fermer");
        jPanel6.add(jButton2);
        jButton2.setBounds(30, 490, 90, 23);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Enregistrer");

        jPanel6.add(jButton3);
        jButton3.setBounds(160, 490, 140, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NOUVEAU BON");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(320, 20, 160, 22);
        
        jComboBox2.setSelectedItem(null);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 800, 530);
        
        jButton1.addActionListener(new Ajouter());
        
        jButton3.addActionListener(new Ajout());
        
        jButton2.addActionListener(new Fermer());
        
        jComboBox2.addActionListener(new selection());
        
        jButton3.setEnabled(false);
        
        

        pack();
        
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
                new Bon().setVisible(true);
            }
        });
    }
      double tout=0d;
         
      class Ajouter implements ActionListener {
          
            int ref=0;
            
            int id1=0;
            
            
            
            int code=0;
            
            String des="";
            
            double pr1=0d;
            
            double tot1=0d;
            
            String etat="pret";
            
            int id2=0;
            
            public void actionPerformed(ActionEvent e){
                
                //
                SimpleDateFormat for1 = new SimpleDateFormat("yyyy-MM-dd");
                              
                  String dat2 = for1.format(new Date());
                
                int veri=0;
               
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
              
                Statement a1 = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

                ResultSet b1 = a1.executeQuery("SELECT * FROM bon WHERE (Identifiant= '"+jTextField5.getText()+"' AND Nom = '"+jComboBox2.getSelectedItem()+"' )");

                b1.first();

                veri = b1.getInt("Identifiant");    
                
                    }catch(Exception nn){
                        
                    }
                    
                    
                   
                
                
        
                if(veri == 0)
                {
           
               //
                
                if(jComboBox2.getSelectedItem()==null || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField8.getText().isEmpty() || jTextField9.getText().isEmpty()){
                    
                     JOptionPane.showMessageDialog(null,"Veuillez renseigner les champs vides", "GESTOCK", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    
                    int vr1=0;
            
                    int q1=0;
                    
                      /*SimpleDateFormat for1 = new SimpleDateFormat("yyyy-MM-dd");
                              
                      String dat2 = for1.format(new Date());*/
                    
                    try {
                        
                        q1 = Integer.parseInt(jTextField9.getText());
                        
                        pr1 = Double.parseDouble(jTextField8.getText());
                        
                    } catch (Exception ce) {
                    }
                    
                    tot1=q1*pr1;
           
           
                      if(jComboBox1.getSelectedItem().equals("Piece detachee")){
                
                                try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM pieces WHERE bonneref='"+jTextField6.getText()+"'");
            
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
                          
                      System.out.println(id1);
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM pieces WHERE bonneref='"+jTextField6.getText()+"'");
            
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
            
            ResultSet b = a.executeQuery("SELECT * FROM pieces WHERE bonneref='"+jTextField6.getText()+"'");
            
            b.first();
         
            code=b.getInt("coderef");
            
            des=b.getString("Designation");
            
            
            
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
                
                a.setString(2, jTextField6.getText());
                
                a.setInt(3, code);
                
                a.setString(4, des);
                
                a.setDouble(5, pr1);
                
                a.setInt(6, q1);
                
                a.setDouble(7, tot1);
                
                a.setString(8, jTextField5.getText());
                
                a.setString(9, dat2);
                
                a.setString(10, etat);

                a.executeUpdate();
                
               
              
               tout=tout+tot1;
               
               jTextField6.setText("");
               jTextField8.setText("");
               jTextField9.setText("");
               
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
            
            ResultSet b = a.executeQuery("SELECT * FROM garnitures WHERE bonneref='"+jTextField6.getText()+"'");
            
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
            
            ResultSet b = a.executeQuery("SELECT * FROM garnitures WHERE bonneref='"+jTextField6.getText()+"'");
            
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
            
            ResultSet b = a.executeQuery("SELECT * FROM garnitures WHERE bonneref='"+jTextField6.getText()+"'");
            
            b.first();
         
            code=b.getInt("coderef");
            
            des=b.getString("Designation");
            
            
            
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
                
                a.setString(2, jTextField6.getText());
                
                a.setInt(3, code);
                
                a.setString(4, des);
                
                a.setDouble(5, pr1);
                
                a.setInt(6, q1);
                
                a.setDouble(7, tot1);
                
                a.setString(8, jTextField5.getText());
                
                a.setString(9, dat2);
                
                a.setString(10, etat);

                a.executeUpdate();
                
               
              
               tout=tout+tot1;
               
               jTextField6.setText("");
               jTextField8.setText("");
               jTextField9.setText("");
               
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
            
            ResultSet b = a.executeQuery("SELECT * FROM autres WHERE bonneref='"+jTextField6.getText()+"'");
            
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
            
            ResultSet b = a.executeQuery("SELECT * FROM autres WHERE bonneref='"+jTextField6.getText()+"'");
            
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
            
            ResultSet b = a.executeQuery("SELECT * FROM autres WHERE bonneref='"+jTextField6.getText()+"'");
            
            b.first();
         
            code=b.getInt("coderef");
            
            des=b.getString("Designation");
            
            
            
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
                
                a.setString(2, jTextField6.getText());
                
                a.setInt(3, code);
                
                a.setString(4, des);
                
                a.setDouble(5, pr1);
                
                a.setInt(6, q1);
                
                a.setDouble(7, tot1);
                
                a.setString(8,jTextField5.getText() );
                
                a.setString(9, dat2);
                
                a.setString(10, etat);

                a.executeUpdate();
             
               
               tout=tout+tot1;
               
               jTextField6.setText("");
               jTextField8.setText("");
               jTextField9.setText("");
               
               jButton3.setEnabled(true);
               
            } catch (SQLException ex) {
          ex.printStackTrace();
            }
             
              
             
             }
             
             }
              
              }
            
            
            }
                
                }else{
                    JOptionPane.showMessageDialog(null, "Cet Identifiant existe déjà", "GESTOCK", JOptionPane.ERROR_MESSAGE);
                    
                    jButton3.setEnabled(false);
                }
            }
      
      
      
      }
      
   

      class Ajout implements ActionListener {
          

            public void actionPerformed(ActionEvent e){
            
                  SimpleDateFormat for1 = new SimpleDateFormat("yyyy-MM-dd");
                              
                  String dat2 = for1.format(new Date());
                                try {
            
                       try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               
           }
                
                String url= "jdbc:mysql://localhost:3306/gestion?useUnicode=true&characterEncoding=UTF-8";
            
                String user="root"; 
            
                String pass1="";
                
                java.sql.Connection c1=DriverManager.getConnection(url, user, pass1);
                    
                PreparedStatement a = c1.prepareStatement("INSERT INTO bon VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                
                a.setString(1, jTextField5.getText());
                
                a.setObject(2, jComboBox2.getSelectedItem());
                
                a.setString(3, jTextField2.getText());
                
                a.setString(4, jTextField3.getText());
                
                a.setString(5, jTextField4.getText());
                
                a.setDouble(6, tout);
                
                a.setString(7, dat2);
                
                a.setInt(8, 0);
                
                a.setString(9, null);
                
                a.executeUpdate();
                
                tout=0d;
           
             
               jTextField2.setText("");
               jTextField3.setText("");
               jTextField4.setText("");
               jTextField5.setText("");
               jTextField6.setText("");
               jTextField7.setText("");
               jTextField8.setText("");
               jTextField9.setText("");
               
               jButton3.setEnabled(false);
               
               JOptionPane.showMessageDialog(null, "le bon est enregistré avec succés", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
               
                 } catch (SQLException ex) {
                     
                  ex.printStackTrace();
                  
                 }
          
             
            
            }
      
      
      
      } 
      class Fermer implements ActionListener {
          
         

            public void actionPerformed(ActionEvent e){
            
                setVisible(false);
                
                pagesec er = new pagesec();
            
            }
      
      
      
      }
      
       class selection implements ActionListener {
          
         

            public void actionPerformed(ActionEvent e){
          
                   try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM partenaires WHERE Nom='"+jComboBox2.getSelectedItem()+"'");
            
            b.first();
            
            String vl;
            
            String regi;
             
            vl = b.getString("Ville");
               
            regi = b.getString("Region");
               
            jTextField2.setText(vl);
            
            jTextField3.setText(regi);
            
            }catch(Exception ex){
            
            }
            
            }
      
      
      
      }
  
    
}
