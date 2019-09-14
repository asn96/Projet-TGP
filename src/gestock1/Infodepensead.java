


package gestock1;

import gestockDB.Annuler;
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



public class Infodepensead extends JFrame{
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jComboBox1;

    DefaultTableModel d;
    
    public Infodepensead(){
        
        initComponents();
        
    }
    
      private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();


        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("GESTOCK");
        setPreferredSize(new Dimension(606, 435));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); 
        jButton1.setText("Fermer");
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 20, 110, 25);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\imprimer1.jpg")); 
        jButton3.setText("Imprimer");
        jPanel1.add(jButton3);
        jButton3.setBounds(180, 20, 130, 29);
        
        
        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("pieces\\actu.jpg")); 
        jButton4.setText("Annuler");
        jButton4.addActionListener(new supprimer());
        jPanel1.add(jButton4);
        jButton4.setBounds(350, 20, 150, 29);
        
        
        
        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
         
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        
        jPanel2.add(jComboBox1);
        
        jComboBox1.setBounds(420, 10, 150, 29);
        
        jComboBox1.addItem("Jour");
     
        jComboBox1.addItem("Mois");
        
        jComboBox1.addItem("Annee");
        
        jComboBox1.addItem("Tous");
        

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 350, 610, 70);

    
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 540, 300);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 610, 50);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(570, 50, 40, 300);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 50, 30, 300);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 90, 80, 100);

        pack();
        
        CreateColonne();
        
        jButton1.addActionListener(new Quitter());
        
        jButton3.addActionListener(new Imprimer());
        
        jComboBox1.addActionListener(new Afficher());
        
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        
        String dat= form.format(new Date());
        
     
        double fini1=0d;
        
           
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM depense WHERE Date='"+dat+"' ORDER BY Date DESC");
          
           double mon;
            int id; 
           String com;
           
          
          
        
            
       
            
            while(b.next()){
                
                id = b.getInt("Identifiant");
                
               mon=b.getDouble("Montant");
               
               com=b.getString("Commentaire");
               
               fini1=fini1+mon;
               
               ligne(id, mon, com, dat);
               
      }
              String to = "Total:"+Facturepayead.n2.format(fini1);
              
                 ligne1("", to, "", "");
        
            
         
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
                new Infodepensead().setVisible(true);
            }
        });
    }
     public void CreateColonne(){
        
        d=(DefaultTableModel) jTable1.getModel();
        
        d.addColumn("Identifiant");
        d.addColumn("Montant");
        d.addColumn("Commentaire");
        d.addColumn("Date");
        
   

    }
     
     public void ligne(int id, double a, String b, String c ){
        
                  Object[] line ={id, a, b, c};
                  
                  d.addRow(line);
     }
   
   public void ligne1(String a, String b, String c, String e){
        
                  Object[] line ={a, b, c, e};
                  
                  d.addRow(line);
     }
   
    class Quitter implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
            
                setVisible(false);
                
                pageadmin dd = new pageadmin();
            
            }
    
    
    }
     
     class Imprimer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                MessageFormat hed = new MessageFormat("Liste des depenses ");
                
                 MessageFormat hed1 = new MessageFormat("Page{0, number, integer}");
                try{
                    jTable1.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
                }
                catch(Exception l){
                    
                    System.out.println("Erreur d'impression");
                }
   
   
            }
   }
    class Afficher implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
              
            
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        
        SimpleDateFormat form1 = new SimpleDateFormat("yyyy");
        
        SimpleDateFormat form2 = new SimpleDateFormat("MM");
        
        SimpleDateFormat form3 = new SimpleDateFormat("dd");
        
        String dat= form.format(new Date());
        
        String datfr1= form1.format(new Date());
        
        String datfr2= form2.format(new Date());
        
        String datfr3= form3.format(new Date());
        
        
        //
        if(jComboBox1.getSelectedItem().equals("Tous")){
            
            for(int k=d.getRowCount()-1; k>=0; k--){
           
          d.removeRow(k);
      }
          
             
double fini=0d;
 
   try{
  Class.forName("com.mysql.jdbc.Driver");
    
  String url= "jdbc:mysql://localhost:3306/gestion";
  
  String user="root"; 
  
  String pass="";
  
  Connection c1 =DriverManager.getConnection(url, user, pass);
  
  System.out.println("Connection bien etablie");
  
  Statement a = c1.createStatement();
  
  ResultSet b = a.executeQuery("SELECT * FROM depense ORDER BY Date DESC");

  double mon;
  int id;
 
  String com;
  
  String df;
 

  while(b.next()){

      id = b.getInt("Identifiant");
     mon=b.getDouble("Montant");
     
     com=b.getString("Commentaire");
     
     df=b.getString("Date");
     
     fini=fini+mon;
     
     ligne(id, mon, com, df);
     
 }
    String to = "Total:"+Facturepayead.n2.format(fini);
    
       ligne1("", to, "", "");

  

}
catch(Exception ex){
  ex.printStackTrace();
}

              
   }
        
        //
                if(jComboBox1.getSelectedItem().equals("Jour")){
                    
                      for(int k=d.getRowCount()-1; k>=0; k--){
                     
                    d.removeRow(k);
                }
                    
                       
        double fini=0d;
           
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM depense  WHERE ( YEAR(Date)='"+datfr1+"' AND MONTH(Date)='"+datfr2+"' AND DAYOFMONTH(Date)='"+datfr3+"') ORDER BY Date DESC");
          
            double mon;
            int id;
           
            String com;
            
            String df;
           
          
            while(b.next()){
          
                id = b.getInt("Identifiant");
               mon=b.getDouble("Montant");
               
               com=b.getString("Commentaire");
               
               df=b.getString("Date");
               
               fini=fini+mon;
               
               ligne(id, mon, com, df);
               
           }
              String to = "Total:"+Facturepayead.n2.format(fini);
              
                 ligne1("", to, "", "");
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
                        
             }
                if(jComboBox1.getSelectedItem().equals("Mois")){
                    
                           
                      for(int k=d.getRowCount()-1; k>=0; k--){
                     
                    d.removeRow(k);
                }
                    
      
            double fini=0d;
           
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM depense  WHERE ( YEAR(Date)='"+datfr1+"' AND MONTH(Date)='"+datfr2+"') ORDER BY Date DESC");
          
            double mon;
           int id;
            String com;
            
            String df;
           
          
            while(b.next()){
          
                id = b.getInt("Identifiant");
               mon=b.getDouble("Montant");
               
               com=b.getString("Commentaire");
               
               df=b.getString("Date");
               
               fini=fini+mon;
               
               ligne(id, mon, com, df);
               
           }
              String to = "Total:"+Facturepayead.n2.format(fini);
              
                 ligne1("", to, "", "");
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
                       
                }
                  if(jComboBox1.getSelectedItem().equals("Annee")){
                    
                           
                      for(int k=d.getRowCount()-1; k>=0; k--){
                     
                    d.removeRow(k);
                }
                    
                       
        double fini=0d;
           
             
           
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM depense  WHERE ( YEAR(Date)='"+datfr1+"') ORDER BY Date DESC");
          
            double mon;
           int id;
            String com;
            
            String df;
           
          
            while(b.next()){
          
                id = b.getInt("Identifiant");
               mon=b.getDouble("Montant");
               
               com=b.getString("Commentaire");
               
               df = b.getString("Date");
               
               fini=fini+mon;
               
               ligne(id, mon, com, df);
               
           }
              String to = "Total:"+Facturepayead.n2.format(fini);
              
                 ligne1("", to, "", "");
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
                       
                }
            
            }
    
    
    }
    
    class supprimer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                int n = jTable1.getSelectedRow();
                
                Object ob = d.getValueAt(n, 0);
                
                Annuler a = new Annuler(ob);
                a.AnnuleDep();
                d.removeRow(n);
                JOptionPane.showMessageDialog(null,"La Dépense a été annulée avec succés","Confirmation",JOptionPane.INFORMATION_MESSAGE);
            
                }
            }
}