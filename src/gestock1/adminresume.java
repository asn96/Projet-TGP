/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Papa NDIAYE
 */
public class adminresume extends javax.swing.JFrame{
    
    DefaultTableModel d1;
    
    DefaultTableModel d2;
    
    double fini=0d;
    double fini1=0d;

    /**
     * Creates new form adminresume
     */
    public adminresume() {
        
        
        setResizable(false);
    
        initComponents();
        
        CreateColonne1();
        
        CreateColonne2();
        
        jButton1.addActionListener(new Solde1() );
        
        jButton2.addActionListener(new Quitter());
        
        setLocationRelativeTo(null);
        
         SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        
        SimpleDateFormat form1 = new SimpleDateFormat("yyyy");
        
        SimpleDateFormat form2 = new SimpleDateFormat("MM");
        
        SimpleDateFormat form3 = new SimpleDateFormat("dd");
        
        String dat= form.format(new Date());
        
        String datfr1= form1.format(new Date());
        
        String datfr2= form2.format(new Date());
        
        String datfr3= form3.format(new Date());
        
        
        String hgy = datejour();
        
        jLabel2.setText("Resume du "+hgy);
       
     
        
       
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recherche");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rechettes de la Journée");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Solde du Jour");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dépense dans la Journée");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable2);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Retour");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
 
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
        if(jTextField1.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Veuillez renseigner la date", "GESTOCK", JOptionPane.ERROR_MESSAGE);
        }
        else{
        if(evt.getKeyCode()==10 || evt.getKeyCode()==13){
            
            
            if(jTextField1.getText().length()<10){
                
                
            }
            
            else{
                
                jButton1.setEnabled(true);
            
            for(int h=d1.getRowCount()-1; h>=0;--h){
                
                  d1.removeRow(h);
            }
            
            for(int h=d2.getRowCount()-1; h>=0;--h){
                
                  d2.removeRow(h);
            }
            
            fini=0d;
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM facture WHERE (Date LIKE '"+jTextField1.getText()+"%"+"' AND Etat='"+1+"')");
          
            int bonn1;
           
            double mont2;
           
            String datet2;
           
                
       
            
            while(b.next()){
          
                bonn1 = b.getInt("Identifiant");
               
                mont2 = b.getDouble("Montant");
                
                datet2 = b.getString("Date");
                
                fini=fini+mont2;
                
                ligne(bonn1, mont2, datet2);
                
                
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
            
            ResultSet b = a.executeQuery("SELECT * FROM bon WHERE (Date LIKE '"+jTextField1.getText()+"%"+"' AND Etat='"+1+"')");
          
            int bonn1;
           
            double mont2;
           
            String datet2;
           
                
       
            
            while(b.next()){
          
                bonn1 = b.getInt("Identifiant");
               
                mont2 = b.getDouble("Montant");
                
                datet2 = b.getString("Date");
                
                fini=fini+mont2;
                
                ligne(bonn1, mont2, datet2);
                
                
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
            
            ResultSet b = a.executeQuery("SELECT * FROM depense WHERE Date ='"+jTextField1.getText()+"'");
          
            double mon;
           
            String com;
           
          
            
            while(b.next()){
          
               mon=b.getDouble("Montant");
               
               com=b.getString("Commentaire");
               
               fini1=fini1+mon;
               
               ligne2(mon, com, jTextField1.getText());
               
      }
              String to = "Total:"+fini1;
              
                 ligne3(to, "", "");
        
                 jButton1.setEnabled(true);
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
              
        }
        
     
        } 
    }//GEN-LAST:event_jTextField1KeyReleased
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
                
                pageadmin er = new pageadmin();
            
            }
    
    
    }
     
     class Solde1 implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                SimpleDateFormat form25 = new SimpleDateFormat("yyyy-MM-dd");
               
               String totalj=""+(fini-fini1);
            
               jFormattedTextField1.setText(totalj);
   
               fini=0;
       
               fini1=0;
               
               jButton1.setEnabled(false);
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
                String fina = sdf.format(dte)+" le "+deb+" "+sdf2.format(dt1)+" "+sui;
                
                
                return fina;
     }
      
      
      
      /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminresume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminresume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminresume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminresume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminresume().setVisible(true);
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
