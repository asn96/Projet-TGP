package gestock1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class StockDisponiblesAutres extends JFrame implements Runnable{
     private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    DefaultTableModel d;
    
    public StockDisponiblesAutres(){
        
        initComponents();
        
        Thread tr = null;
        
        if(tr==null){
            
            tr = new Thread(this);
            
            tr.start();
        }
        
        
    }
     private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setTitle("GESTOCK");
        setVisible(true);
        setResizable(false);
        setPreferredSize(new Dimension(813, 670));
      

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setBackground(new Color(0, 153, 153));
       
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 770, 330);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("pieces\\logo.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GESTOCK");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 10, 130, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Application de Gestion de Stock");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 60, 300, 22);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 110, 830, 2);

     

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 170);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 170, 20, 670);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(810, 170, 20, 670);

        jPanel8.setBackground(new java.awt.Color(0, 51, 51));
        jPanel8.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        
        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel9.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel9.add(jButton1);
        jButton1.setBounds(10, 20, 110, 25);

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\rechercher.jpg")); // NOI18N
        jButton2.setText("Rechercher");
        jPanel9.add(jButton2);
        jButton2.setBounds(140, 20, 150, 27);

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\actu.jpg")); // NOI18N
        jButton3.setText("Actualiser");
        jPanel9.add(jButton3);
        jButton3.setBounds(320, 20, 140, 30);

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Modifier");
        jPanel9.add(jButton4);
        jButton4.setBounds(490, 20, 110, 30);

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon("pieces\\imprimer1.jpg")); // NOI18N
        jButton5.setText("Imprimer");
        jPanel9.add(jButton5);
        jButton5.setBounds(640, 20, 120, 29);

        jPanel8.add(jPanel9);
        jPanel9.setBounds(0, 20, 770, 70);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(20, 500, 790, 240);

        jPanel10.setBackground(new java.awt.Color(0, 51, 51));
        jPanel10.setLayout(null);
        getContentPane().add(jPanel10);
        jPanel10.setBounds(790, 170, 20, 430);

        pack();
         setLocationRelativeTo(null);
       
         
         CreateColonne();
                try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM Autres ORDER BY bonneref");
          
           int h;
           
           int g; 
           
           String k;
           
           int p;
           
        
            
       
            
            while(b.next()){
                    
          h=b.getInt("bonneref");
          
          g=b.getInt("coderef");
          
          k=b.getString("Designation");
          
          p=b.getInt("Quantite");
          
         
          ligne(h, g, k, p);
                
                
               
    
            
      }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
         jButton1.addActionListener(new Quitter());
         jButton2.addActionListener(new Rechercher());
         jButton3.addActionListener(new actu());
         jButton5.addActionListener(new Imprimer());
         jButton4.addActionListener(new Modifier());
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
                new StockDisponiblesAutres().setVisible(true);
            }
        });
    }
         public void CreateColonne(){
        
        d=(DefaultTableModel) jTable1.getModel();
        
        
        d.addColumn("Bonne Reference");
        d.addColumn("Reference Code");
        d.addColumn("Designation");
        d.addColumn("Quantite");
   
      

  
       
        
    }
      public void ligne(int e , int f , String g , int k){
        
         Object[] line ={e, f, g, k};
        
         d.addRow(line);
    }
      
       @Override
    public void run() {
        
              try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM autres ORDER BY bonneref");
          
           
           int p = 0;
           
           int[] tab = new int[jTable1.getRowCount()];
           
           String[] tab1 = new String[jTable1.getRowCount()];
        
           int i=0;
           
            while(b.next()){
                    
                tab[i] = b.getInt("Quantite");
                
                tab1[i] = b.getString("bonneref");
                
                i=i+1;
     
             }
            i=0;
            while(true){
                
                if(tab[i]<=4){
                    
                    JOptionPane pa = new JOptionPane();
                    
                    pa.setBackground(Color.red);
                    
                    pa.showMessageDialog(null, "La quantite de la  reference "+tab1[i]+" est inferieur a 4 ", "GESTOCK", HEIGHT);
                    
                    
                }
                i=i+1;
                
                try {
                    
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
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
            
            ResultSet b = a.executeQuery("SELECT * FROM Autres WHERE bonneref='"+fp+"'");
            
            b.first();
            
            id=b.getInt("bonneref");
            
            id2=b.getInt("coderef");
            
            st = b.getString("Designation");
            
            qt = b.getInt("Quantite");
            
            
                     }catch(Exception ex){}
            
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
        class actu implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
              int n=d.getRowCount();
                for (int i = n-1; i >=0; --i) {
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
            
            ResultSet b = a.executeQuery("SELECT * FROM Autres ORDER BY bonneref");
        
            int i1;
            
            int i2;
            
            String i3;
            
            int i4;
           
            while(b.next()){
                    
          i1=b.getInt("bonneref");
          
          i2=b.getInt("coderef");
          
          i3=b.getString("Designation");
          
          i4=b.getInt("Quantite");
          
           
          ligne(i1, i2, i3, i4);
                
                
               
       
            
      }
        
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    
}            
    
       
 
  }
       
     class Imprimer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                MessageFormat hed = new MessageFormat("Liste des autres elements disponibles");
                
                 MessageFormat hed1 = new MessageFormat("Page{0, number, integer}");
                try{
                    jTable1.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
                }
                catch(Exception l){
                    
                    System.out.println("Erreur d'impression");
                }
   
   
            }
   }
    class Modifier implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                int n = jTable1.getSelectedRow();
                
                Object ob = d.getValueAt(n, 0);
                
                Object ob1 = d.getValueAt(n, 3);
                
                Object ob2 = d.getValueAt(n, 2);
                
                      try{
                
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet b = a.executeQuery("SELECT * FROM autres WHERE bonneref='"+ob+"'");
            
            b.first();
         
            b.updateObject("Quantite", ob1);
            
            b.updateObject("Designation", ob2);
            
            b.updateRow();
            
            JOptionPane.showMessageDialog(null, "Modification effcetuée", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
            
           
            
            }catch(Exception ex){
            
            }
                     
   
            }
   }
    
}
