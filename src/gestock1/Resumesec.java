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
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lalita
 */
public class Resumesec extends JFrame{
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    DefaultTableModel d1;
    DefaultTableModel d2;
    double fini=0d;
    double fini1=0d;
    
    public Resumesec(){
        
        initComponents();
        
    }
      private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("GESTOCK");
        setPreferredSize(new Dimension(936, 630));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
       
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 50, 150, 25);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Solde du jour ");
        jPanel8.add(jLabel5);
        jLabel5.setBounds(10, 50, 90, 14);
        jPanel8.add(jTextField1);
        jTextField1.setBounds(100, 50, 130, 25);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Total");
        jPanel8.add(jButton2);
        jButton2.setBounds(110, 10, 90, 23);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(300, 10, 300, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 500, 940, 100);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        String f = datejour();
        jLabel1.setText("Resumé du "+f);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(320, 40, 400, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 100);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 100, 30, 400);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(900, 100, 40, 400);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
       
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 380, 360);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(null);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(0, 58, 120, 10);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(0, 370, 120, 10);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(410, 100, 120, 400);

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
       
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(532, 142, 370, 360);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Depense dans la Journée");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(104, 10, 180, 17);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(530, 100, 370, 40);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Recettes de la Journée");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(80, 10, 220, 17);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(30, 100, 380, 40);
        
        jButton1.addActionListener(new Quitter());
        
        jButton2.addActionListener(new Solde());

        pack();
        
        setLocationRelativeTo(null);
        
        CreateColonne1();
        
        CreateColonne2();
        
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        
        SimpleDateFormat form1 = new SimpleDateFormat("yyyy");
        
        SimpleDateFormat form2 = new SimpleDateFormat("MM");
        
        SimpleDateFormat form3 = new SimpleDateFormat("dd");
        
        String dat= form.format(new Date());
        
        String datfr1= form1.format(new Date());
        
        String datfr2= form2.format(new Date());
        
        String datfr3= form3.format(new Date());
        
       
     
        
       
           fini = 0d;
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(Date)='"+datfr1+"' AND MONTH(Date)='"+datfr2+"' AND DAYOFMONTH(Date)='"+datfr3+"' AND Etat='"+1+"')");
          
            int refp;
            
            double mon;
           
       
            while(b.next()){
                
               refp=b.getInt("Identifiant");
          
               mon=b.getDouble("Montant");
               
               fini=fini+mon;
          
               ligne(refp, mon, dat);
               
      }
                
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
             
             
               try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM bon WHERE (Date='"+dat+"' AND Etat='"+1+"')");
          
            int bonn;
           
            double mont;
           
            String datet;
           
           
       
            
            while(b.next()){
          
                bonn = b.getInt("Identifiant");
               
                
                mont = b.getDouble("Montant");
                
                datet = b.getString("Date");
                
                fini=fini+mont;
                
                ligne(bonn, mont, datet);
                
                
             }
            
         ligne1("Total", fini, "");
         
         
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
       fini1=0d;
       try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM depense WHERE Date='"+dat+"'");
          
            double mon;
           
            String com;
           
          
          
        
            
       
            
            while(b.next()){
          
               mon=b.getDouble("Montant");
               
               com=b.getString("Commentaire");
               
               fini1=fini1+mon;
               
               ligne2(mon, com, dat);
               
      }
              String to = "Total:"+fini1;
              
                 ligne3(to, "", "");
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
             
      
        
        
        
        
       
        
        
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
                new Resumesec().setVisible(true);
            }
        });
    }
      public void CreateColonne1(){
        
        d1=(DefaultTableModel) jTable1.getModel();
        
        
        d1.addColumn("Identifiant");
        d1.addColumn("Montant");
        d1.addColumn("Date");
       
   

    }
    public void CreateColonne2(){
        
        d2=(DefaultTableModel) jTable2.getModel();
        
        
        d2.addColumn("Montant");
        d2.addColumn("Commentaire");
        d2.addColumn("Date");
       
   

    }
  public void ligne(int a, double b, String c ){
        
                  Object[] line ={a, b, c};
                  
                  d1.addRow(line);
     }
  
     
  public void ligne1(String lm, double ln, String ll ){
        
                  Object[] line ={lm, ln, ll};
                  
                  d1.addRow(line);
  }
 public void ligne2(double a, String b, String c ){
        
                  Object[] line ={a, b, c};
                  
                  d2.addRow(line);
     }
  
     
  public void ligne3(String lm, String ln, String ll ){
        
                  Object[] line ={lm, ln, ll};
                  
                  d2.addRow(line);
  }
   
    class Quitter implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
            
                setVisible(false);
                
                pagesec er = new pagesec();
            
            }
    
    
    }
     
     class Solde implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                SimpleDateFormat form25 = new SimpleDateFormat("yyyy-MM-dd");
                
                String dat2 = form25.format(new Date());
                
                int ids=0;
        
                
             
                             try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM solde WHERE Date='"+dat2+"'");
            
            b.first();
         
            ids=b.getInt("Identifiant");
           
            }catch(Exception ex){
            
            }
            if(ids!=0){
                
                                   try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM solde WHERE Date='"+dat2+"'");
            
            b.first();
         
            b.updateDouble("Montant", (fini-fini1));
            
            String totalj=""+(fini-fini1);
            
            jTextField1.setText(totalj);
            
            b.updateRow();
            
            JOptionPane.showMessageDialog(null, "Le solde de la journée est enregistré", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
           
            }catch(Exception ex){
            
            }
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
            
            a.executeUpdate("INSERT INTO solde(Montant, Date) VALUES('"+(fini-fini1)+"', '"+dat2+"')");
            
            String totalj=""+(fini-fini1);
            
            jTextField1.setText(totalj);
            
            JOptionPane.showMessageDialog(null, "Le solde de la journée est enregistré", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
           
            }catch(Exception ex){
            
            }
                
            }
   
            }
   }
     public String datejour(){
         
         
                java.text.SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
                java.text.SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
                java.text.SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy");
                String deb =sdf3.format(new Date());
                String sui = sdf4.format(new Date());
                
                String str = sdf1.format(new Date());
                java.text.SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
                java.text.SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
                 java.util.Date dte = null, dt1 = null;
                try {
                    dte = sdf.parse(str);
                    
                    dt1 = sdf2.parse(str);
                } catch (ParseException ex) {
                    Logger.getLogger(GESTOCK.class.getName()).log(Level.SEVERE, null, ex);
                }
                sdf = new SimpleDateFormat("EEEE"); 
                sdf2 = new SimpleDateFormat("MMMM");
                String fina = sdf.format(dte)+" "+deb+" "+sdf2.format(dt1)+" "+sui;
                
                
                return fina;
     }
     
    
}
