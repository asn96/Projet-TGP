



package gestock1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class solde extends JFrame{
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jComboBox1;
    public JButton but4;

    DefaultTableModel d;
    
    public solde(){
        
        initComponents();
        
    }
    
      private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        but4 = new JButton();


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
        
        but4.setBackground(new java.awt.Color(255, 255, 255));
        but4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        but4.setIcon(new javax.swing.ImageIcon("pieces\\rechercher.jpg")); 
        but4.setText("Rechercher");
        jPanel1.add(but4);
        but4.setBounds(340, 20, 130, 29);
        
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
        jButton1.addActionListener(new Quitter());
        
        jButton3.addActionListener(new Imprimer());
        
        but4.addActionListener(new Rechercher());

        pack();
        
        CreateColonne();
        
        
             try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM solde");
          
           double mon;
           
           String com;
           
          
          
            while(b.next()){
          
               mon=b.getDouble("Montant");
               
               com=b.getString("Date");
              
               ligne(mon, com);
               
      }
             
            
         
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
                new solde().setVisible(true);
            }
        });
    }
   public void CreateColonne(){
        
        d=(DefaultTableModel) jTable1.getModel();
        
        
        d.addColumn("Montant");
       
        d.addColumn("Date");
        
   

    }
   public void ligne(double a, String b){
        
                  Object[] line ={a, b};
                  
                  d.addRow(line);
     }
   
  
   
    class Quitter implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
            
                setVisible(false);
                
                pageadmin p = new pageadmin();
            
            }
    
    
    }
     
     class Imprimer implements ActionListener {
            
       
            public void actionPerformed(ActionEvent e){
                
                MessageFormat hed = new MessageFormat("Liste des soldes");
                
                 MessageFormat hed1 = new MessageFormat("Page{0, number, integer}");
                try{
                    jTable1.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
                }
                catch(Exception l){
                    
                    System.out.println("Erreur d'impression");
                }
   
   
            }
   }
     
       class Rechercher implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             
                 double sol=0d;
                 
                 String df ="";
            
                 JOptionPane ti = new JOptionPane();
                 
                 String hosp = ti.showInputDialog(null, "Veuillez Entrer la date!", "Information !",JOptionPane.QUESTION_MESSAGE);
               
               
                     try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM solde WHERE Date='"+hosp+"'");
            
            b.first();
            
            df = b.getString("Date");
            
            sol = b.getDouble("Montant");
            
            
                     }catch(Exception ex){}
            
                     if(df==""){
                       JOptionPane jop1 = new JOptionPane();
                       jop1.showMessageDialog(null,"Aucune information", "GESTOCK",JOptionPane.INFORMATION_MESSAGE);
                     
                     }
                     else{
                       JOptionPane jop1 = new JOptionPane();
                       jop1.showMessageDialog(null,"Solde: "+sol+"\nDate: "+df, "Information",JOptionPane.INFORMATION_MESSAGE);
                     
                      
                     }
                     
            }
            
            
      }
     
     
}