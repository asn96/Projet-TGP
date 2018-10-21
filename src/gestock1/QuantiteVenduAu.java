package gestock1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class QuantiteVenduAu extends JFrame{
    
     private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
   
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    DefaultTableModel d;
    
    public QuantiteVenduAu(){
        initComponents();
        
    } 
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setVisible(true);
        setTitle("GESTOCK");
        setResizable(false);
        setPreferredSize(new Dimension(730, 640));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(830, 320, 100, 100);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantite vendue dans");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 200, 150, 16);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        
      
        
        jComboBox1.addItem("le Jour");
        //jComboBox1.addItem("la Semaine");
        jComboBox1.addItem("le Mois");
        jComboBox1.addItem("l'Annee");
        
        jPanel5.add(jComboBox1);
        jComboBox1.setBounds(180, 200, 140, 22);
        

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
        jSeparator1.setBounds(0, 102, 730, 10);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 730, 260);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\rechercher.jpg")); // NOI18N
        jButton1.setText("Rechercher");
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 50, 140, 27);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); 
        jButton2.setText("Fermer");
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 50, 120, 25);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\imprimer1.jpg")); // NOI18N
        jButton3.setText("Imprimer");
        jPanel1.add(jButton3);
        jButton3.setBounds(350, 50, 130, 29);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Derniere mise a jour 24 avril 2018");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(20, 10, 230, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Technologie: JAVA");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(20, 50, 140, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Version1.0");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(20, 80, 80, 20);

       

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 500, 730, 260);

     
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 680, 245);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(700, 260, 30, 300);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 260, 20, 300);
        
        jComboBox1.addActionListener(new Afficher());


        pack();
        
        setLocationRelativeTo(null);
        
        jButton1.addActionListener(new Rechercher());
        
        jButton2.addActionListener(new Quitter());
        
        jButton3.addActionListener(new Imprimer());
        
        CreateColonne();
        
         
         SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        
         String dat= form.format(new Date());
        
        
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT bonneref,coderef, Designation,  Quantite,  Date, SUM(Quantite)  FROM venteau WHERE Date='"+dat+"' GROUP BY bonneref ");
          
            int h;
           
           int g; 
           
           String k;
           
           String p;
           
           String fi;
           
        
            
       
            
            while(b.next()){
                    
          h=b.getInt("bonneref");
          
          g=b.getInt("coderef");
          
          k=b.getString("Designation");
          
          p=b.getString("SUM(Quantite)");
          
          fi=b.getString("Date");
          
         
          ligne(h, g, k, p ,fi);
                
                
               
    
            
      }
        
            
         
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuantiteVenduAu().setVisible(true);
            }
        });
    }
       public void CreateColonne(){
        
        d=(DefaultTableModel) jTable1.getModel();
        
        
        d.addColumn("Bonne Reference");
        d.addColumn("Reference Code");
        d.addColumn("Designation");
        d.addColumn("Quantite");
        d.addColumn("Date");
   
      

  
       
        
    }
       public void ligne(int a,  int b, String c, String j, String e  ){
        
                  Object[] line ={a, b, c, j, e};
                  
                  d.addRow(line);
     }
       
        class Afficher implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                if(jComboBox1.getSelectedItem().equals("le Jour")){
                     SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        
                     String dat= form.format(new Date());
        
                
                  int limit=d.getRowCount();
                      for (int i = limit-1; i >=0; --i) {
                   d.removeRow(i);
                  }
                      
                         try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT bonneref,coderef, Designation,  Quantite,  Date, SUM(Quantite)  FROM venteau WHERE Date='"+dat+"' GROUP BY bonneref ");
          
            int h;
           
           int g; 
           
           String k;
           
           String p;
           
           String fi;
           
        
            
       
            
            while(b.next()){
                    
          h=b.getInt("bonneref");
          
          g=b.getInt("coderef");
          
          k=b.getString("Designation");
          
          p=b.getString("SUM(Quantite)");
          
          fi=b.getString("Date");
          
         
          ligne(h, g, k, p ,fi);
                
                
               
    
            
      }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
                                     
     }
                if(jComboBox1.getSelectedItem().equals("le Mois")){
                    
                      int limit=d.getRowCount();
                      for (int i = limit-1; i >=0; --i) {
                   d.removeRow(i);
                  }
                    
                     SimpleDateFormat form1 = new SimpleDateFormat("MM");
        
                     String datm= form1.format(new Date());
                     
                     SimpleDateFormat form5 = new SimpleDateFormat("yyyy");
        
                     String datm1= form5.format(new Date());
                     
                     
               
                                    try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "j"
            		+ "bc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT bonneref,coderef, Designation,  Quantite,  Date, SUM(Quantite)  FROM venteau WHERE (YEAR(Date)='"+datm1+"' AND MONTH(Date)='"+datm+"') GROUP BY bonneref ");
          
            int h;
           
           int g; 
           
           String k;
           
           String p;
           
           String fi;
           
        
            
       
            
            while(b.next()){
                    
          h=b.getInt("bonneref");
          
          g=b.getInt("coderef");
          
          k=b.getString("Designation");
          
          p=b.getString("SUM(Quantite)");
          
          fi=b.getString("Date");
          
         
          ligne(h, g, k, p ,"le mois");
                
                
               
    
            
      }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
                                     
                
                }
                if(jComboBox1.getSelectedItem().equals("l'Annee")){
                    
                      
                      int limit=d.getRowCount();
                      for (int i = limit-1; i >=0; --i) {
                   d.removeRow(i);
                  }
                        SimpleDateFormat form2 = new SimpleDateFormat("yyyy");
        
                        String datA= form2.format(new Date());
                
                
                    
                                    try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT bonneref,coderef, Designation,  Quantite,  Date, SUM(Quantite)  FROM venteau WHERE YEAR(Date)='"+datA+"' GROUP BY bonneref ");
          
            int h;
           
           int g; 
           
           String k;
           
           String p;
           
           String fi;
           
        
            
       
            
            while(b.next()){
                    
          h=b.getInt("bonneref");
          
          g=b.getInt("coderef");
          
          k=b.getString("Designation");
          
          p=b.getString("SUM(Quantite)");
          
          fi=b.getString("Date");
          
         
          ligne(h, g, k, p ,"l'annee");
                
                
               
    
            
      }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
                }
             /* if(jComboBox1.getSelectedItem().equals("la Semaine")){
                    
                      int limit=d.getRowCount();
                      for (int i = limit-1; i >=0; --i) {
                   d.removeRow(i);
                  }
                
                        SimpleDateFormat form2 = new SimpleDateFormat("dd");
        
                        String dats= form2.format(new Date());
                        
                        SimpleDateFormat form1 = new SimpleDateFormat("MM");
        
                        String datm= form1.format(new Date());
                     
                        SimpleDateFormat form5 = new SimpleDateFormat("yyyy");
        
                        String datm1= form5.format(new Date());
                        
                        int sem=0;
                        try {
                            
                            sem=Integer.parseInt(dats);
                        
                    } catch (Exception he) {
                    }
                        if(sem%7==0){
                            
                            int res=sem-6;
                            
                                      
                                    try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT bonneref,coderef, Designation,  Quantite,  Date, SUM(Quantite)  FROM venteau WHERE ((DAYOFMONTH(Date) BETWEEN '"+res+"' AND '"+sem+"') AND (YEAR(Date)='"+datm1+"' AND MONTH(Date)='"+datm+"')) GROUP BY bonneref ");
          
            int h;
           
           int g; 
           
           String k;
           
           String p;
           
           String fi;
           
        
            
       
            
            while(b.next()){
                    
          h=b.getInt("bonneref");
          
          g=b.getInt("coderef");
          
          k=b.getString("Designation");
          
          p=b.getString("SUM(Quantite)");
          
          fi=b.getString("Date");
          
         
          ligne(h, g, k, p ,"la Semaine");
                
                
               
    
            
      }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
                        
                        
                        
                        
                        }
                        else{
                            
                        int res=sem-(sem%7)+1;
                            
                                      
                                    try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT bonneref,coderef, Designation,  Quantite,  Date, SUM(Quantite)  FROM venteau WHERE ((DAYOFMONTH(Date) BETWEEN '"+res+"' AND '"+sem+"') AND (YEAR(Date)='"+datm1+"' AND MONTH(Date)='"+datm+"')) GROUP BY bonneref ");
          
            int h;
           
           int g; 
           
           String k;
           
           String p;
           
           String fi;
           
        
            
       
            
            while(b.next()){
                    
          h=b.getInt("bonneref");
          
          g=b.getInt("coderef");
          
          k=b.getString("Designation");
          
          p=b.getString("SUM(Quantite)");
          
          fi=b.getString("Date");
          
         
          ligne(h, g, k, p ,"la Semaine");
                
                
               
    
            
      }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
                        
                        
                        
                        
                        
                        }
                
                }*/
            
            
            }
        
        
        
        }
        
       class Quitter implements ActionListener {
           
            public void actionPerformed(ActionEvent e){
                
                setVisible(false);
                
                pageadmin p = new pageadmin();
            }
       
       
       }
          
      class Rechercher implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                int id=0;
                
               int id2=0;
               
               String st="";
               
               int qt=0;
            
                 JOptionPane ti = new JOptionPane();
                 String hosp = ti.showInputDialog(null, "Veuillez Entrer la bonne reference!", "Information !",JOptionPane.QUESTION_MESSAGE);
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
            
            ResultSet b = a.executeQuery("SELECT bonneref,coderef, Designation,  Quantite,  Date, SUM(Quantite) FROM venteau WHERE bonneref='"+fp+"'");
            
            b.first();
            
            id=b.getInt("bonneref");
            
            id2=b.getInt("coderef");
            
            st = b.getString("Designation");
            
            qt = b.getInt("SUM(Quantite)");
            
            
                     }catch(Exception ex){
                     
                         ex.printStackTrace();
                     }
            
                     if(id==0){
                       JOptionPane jop1 = new JOptionPane();
                       jop1.showMessageDialog(null,"Aucune information", "GESTOCK",JOptionPane.INFORMATION_MESSAGE);
                     
                     }
                     else{
                       JOptionPane jop1 = new JOptionPane();
                       jop1.showMessageDialog(null,"bonne reference:\t\t"+id+"\n"+"code reference:\t\t"+id2+"\n"+"Designation:\t\t"+st+"\n"+"Quantite:\t\t"+qt+"\n", "Information",JOptionPane.INFORMATION_MESSAGE);
                     
                       id=0;
                     }
                     
            }
            
            
      }
      
      class Imprimer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                MessageFormat hed = new MessageFormat("Liste des Pieces detachees vendues");
                
                 MessageFormat hed1 = new MessageFormat("Page{0, number, integer}");
                try{
                    jTable1.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
                }
                catch(Exception l){
                    
                    System.out.println("Erreur d'impression");
                }
   
   
            }
   }
     
}

