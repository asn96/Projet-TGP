package gestock1;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author KINGBOURY
 */
public class pageadmin extends javax.swing.JFrame implements Runnable{
    
    Frame[] fr;

    public javax.swing.JLabel jLabel1;
    public JMenu jMenu1;
    public JMenu jMenu10;
    public JMenu jMenu2;
    public JMenu jMenu3;
    public JMenu jMenu4;
    public JMenu jMenu5;
    public JMenu jMenu6;
    public JMenu jMenu7;
    public JMenu jMenu8;
    public JMenu jMenu9;
    public javax.swing.JMenuBar jMenuBar1;
    public JMenuItem jMenuItem1;
    public JMenuItem jMenuItem10;
  
    public JMenuItem jMenuItem12;
    public JMenuItem jMenuItem13;
    public JMenuItem jMenuItem14;
    public JMenuItem jMenuItem15;
    public JMenuItem jMenuItem16;
    
    public JMenuItem jMenuItem18;
    public JMenuItem jMenuItem19;
    public JMenuItem jMenuItem2;
    public JMenuItem jMenuItem20;
    public JMenuItem jMenuItem21;
    public JMenuItem jMenuItem22;
    public JMenuItem jMenu23;
    public JMenuItem jMenuItem24;
    public JMenuItem jMenuItem3;
    public JMenuItem jMenuItem4;
  
    public JMenuItem jMenuItem6;
    public JMenuItem jMenuItem7;
    public JMenuItem jMenuItem8;
    public JMenuItem jMenuItem9;
    public JMenu m10;
    public JMenuItem j10;
    public JMenu j11;
     public JMenuItem j12;
     public JMenuItem j13;
     public JMenuItem j14;
     public JMenuItem j15;
     public JMenuItem j16;
     public JMenu j90;
     public JMenuItem j17;
     public JMenuItem j18;
     public JMenuItem j19;
     public JMenuItem j20;
     public JMenuItem j30;
     public JMenuItem j40;
     public JMenuItem j50;
     public JMenuItem j60;
     public JMenu j70;
     public JMenuItem j100;
     public JMenuItem j800;
     public JMenuItem j1001;
     public JMenuItem j8001;
     public JMenuItem j1;
     public JMenuItem j2;
     public JMenuItem gdepadmin;
     public JMenuItem resumead;
     
      Thread tr=null;
     
     public pageadmin(){
         
         initComponents();
         
        
         
         if(tr==null){
             
             tr = new Thread(this);
             
             tr.start();
         }
     }


    public void initComponents() {
    
        jMenu4 = new JMenu();
        jMenu6 = new JMenu();
        jLabel1 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem24 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
       
        jMenu8 = new JMenu();
        jMenuItem7 = new JMenuItem();
        jMenuItem8 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenu3 = new JMenu();
        jMenuItem9 = new JMenuItem();
        jMenuItem10 = new JMenuItem();
       
        jMenu9 = new JMenu();
        jMenuItem13 = new JMenuItem();
        jMenuItem14 = new JMenuItem();
        jMenuItem12 = new JMenuItem();
        jMenu5 = new JMenu();
        jMenuItem15 = new JMenuItem();
        jMenuItem16 = new JMenuItem();
        j30 = new JMenuItem();
        j40 = new JMenuItem();
        j50 = new JMenuItem();
        j60 = new JMenuItem();
        gdepadmin = new JMenuItem();
        resumead = new JMenuItem();
        j70 = new JMenu();
       
        jMenu10 = new JMenu();
        jMenuItem19 = new JMenuItem();
        jMenuItem20 = new JMenuItem();
        jMenuItem18 = new JMenuItem();
        jMenu7 = new JMenu();
        jMenuItem21 = new JMenuItem();
        jMenuItem22 = new JMenuItem();
        jMenu23 = new JMenuItem();
        jMenu4.setText("jMenu4");
        jMenu6.setText("jMenu6");
        m10=new JMenu();
        j10=new JMenuItem();
        j12=new JMenuItem();
        j13=new JMenuItem();
        j14=new JMenuItem();
        j15=new JMenuItem();
        j16=new JMenuItem();
        j17=new JMenuItem();
        j18=new JMenuItem();
        j19=new JMenuItem();
        j20=new JMenuItem();
        j100=new JMenuItem();
        j90=new JMenu();
        j11= new JMenu();
        
        
        j800 = new JMenuItem();
        j8001 = new JMenuItem();
        j1001 = new JMenuItem();
        j1 = new JMenuItem();
        j2 = new JMenuItem();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setPreferredSize(new Dimension(600, 492));
        setResizable(false);
        setTitle("GESTOCK");
        setVisible(true);

        jLabel1.setIcon(new javax.swing.ImageIcon("pieces\\fond1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 460);

        jMenu1.setText("Compte");

        jMenuItem1.setText("Personnel");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Utilisateur");
        jMenu1.add(jMenuItem2);
        
        j100.setText("Utilisateur du jour");
        
        jMenu1.add(j100);
        
        j800.setText("Nettoyer-la-Base");
        
        jMenu1.add(j800);
        

        jMenuItem24.setIcon(new javax.swing.ImageIcon("pieces\\home.jpg")); // NOI18N
        jMenuItem24.setText("Déconnection");
        jMenu1.add(jMenuItem24);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pieces detachees");

        jMenuItem3.setText("Ajouter");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Supprimer");
      
        jMenu2.add(jMenuItem4);

        
        jMenu8.setText("Informations");

        jMenuItem7.setText("Quantite Vendu");
        jMenu8.add(jMenuItem7);

        jMenuItem8.setText("Stock disponible");
        jMenu8.add(jMenuItem8);

        jMenu2.add(jMenu8);

        jMenuItem6.setText("Vente");
        jMenu2.add(jMenuItem6);
        j30.setText("Pret");
        jMenu2.add(j30);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Garnitures");

        jMenuItem9.setText("Ajouter");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Supprimer");
        jMenu3.add(jMenuItem10);

        jMenu9.setText("Informations");

        jMenuItem13.setText("Quantite Vendu");
        jMenu9.add(jMenuItem13);

        jMenuItem14.setText("Stock disponible");
        jMenu9.add(jMenuItem14);

        jMenu3.add(jMenu9);

        jMenuItem12.setText("Vente");
        jMenu3.add(jMenuItem12);
        j40.setText("Pret");
        jMenu3.add(j40);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Autres");

        jMenuItem15.setText("Ajouter");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Supprimer");
        jMenu5.add(jMenuItem16);


        jMenu10.setText("Informations");

        jMenuItem19.setText("Quantite Vendu");
        jMenu10.add(jMenuItem19);

        jMenuItem20.setText("Stock disponible");
        jMenu10.add(jMenuItem20);

        jMenu5.add(jMenu10);

        jMenuItem18.setText("Vente");
        jMenu5.add(jMenuItem18);
        j50.setText("Pret");
        jMenu5.add(j50);

        jMenuBar1.add(jMenu5);
        
        m10.setText("Partenaires");
        j10.setText("Ajouter");
        m10.add(j10);
        j1001.setText("Payé");
        j11.add(j1001);
        j8001.setText("Non payé");
        j11.add(j8001);
        j11.setText("Bon");
        m10.add(j11);
        jMenuBar1.add(m10);

        jMenu7.setText("Comptabilité");

        jMenuItem21.setText("Facture payée");
        jMenu7.add(jMenuItem21);
        j60.setText("Facture non payée");
        jMenu7.add(j60);
        
        j1.setText("Payé");
        j70.add(j1);
        j2.setText("Non payé");
        gdepadmin.setText("Depense");
        jMenu7.add(gdepadmin);
        j70.add(j2);
        
        j70.setText("Bon");
        
        
        jMenu7.add(j70);
     
        jMenu23.setText("solde");
        jMenu7.add(jMenu23);
        
        resumead.setText("Résumé");
        jMenu7.add(resumead);
        resumead.addActionListener(new resumeadmin());

        jMenuBar1.add(jMenu7);
       
        setJMenuBar(jMenuBar1);

        pack();
        
        setLocationRelativeTo(null);
        
        j100.addActionListener(new util());
        
        jMenuItem1.addActionListener(new perso());
        
        jMenuItem2.addActionListener(new uti());
        
        jMenuItem4.addActionListener(new supp1());
        
        jMenuItem10.addActionListener(new supp2());
        
        jMenuItem16.addActionListener(new supp3());
        
        jMenuItem24.addActionListener(new retour());
        
        jMenuItem3.addActionListener(new ajou1());
          
        jMenuItem9.addActionListener(new ajou2());
          
        jMenuItem15.addActionListener(new ajou3());
        
        jMenuItem8.addActionListener(new dispo1());
        
        jMenuItem14.addActionListener(new dispo2());
        
        jMenuItem20.addActionListener(new dispo3());
        
        jMenuItem7.addActionListener(new ven1());

        jMenuItem13.addActionListener(new ven2());

        jMenuItem19.addActionListener(new ven3());
        
        j10.addActionListener(new parte());
        
        j1001.addActionListener(new payeb());
        
        j8001.addActionListener(new payenb());
        
        j1.addActionListener(new payeb());
        
        j2.addActionListener(new payenb());
        
        jMenuItem21.addActionListener(new facpa());
        
        j60.addActionListener(new facnpa());
        
        jMenu23.addActionListener(new sol());
        
        j800.addActionListener(new Nettoyer());
        
        jMenuItem6.addActionListener(new ventepi());
        
        j30.addActionListener(new Pretpi());
        
        jMenuItem12.addActionListener(new ventega());
        
        j40.addActionListener(new Pretga());
        
        jMenuItem18.addActionListener(new venteau());
        
        j50.addActionListener(new Pretau());
        
        gdepadmin.addActionListener(new gdepfinadmin());
        
        

   
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
                new pageadmin().setVisible(true);
            }
        });
    }

    @Override
    public void run() {
        
         double x1;
         
         double y1;
         
         double x2;
         
         double y2;
         

         while(true){
             
         fr = pageadmin.getFrames();
             
         PointerInfo pointer = MouseInfo.getPointerInfo();
                
         Point location = pointer.getLocation();
         
           x1 = location.getX();
         
           y1 = location.getY();
         
             try {
                 
                 Thread.sleep(300000);
                 
             } catch (Exception e) {
             }
         PointerInfo po = MouseInfo.getPointerInfo();
                
         Point loc = po.getLocation();
         
         x2 = loc.getX();
         
         y2 = loc.getY();
         
      
         
         if((x1==x2) && (y1==y2) &&(this.isVisible()==true)){
            
              break;
       
         }
            
         }
        for(int i=0; i<fr.length; i++){
            
            fr[i].setVisible(false);
        }
            
            Authentification vbn = new Authentification();
        

    }
           class supp1 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                JOptionPane ti = new JOptionPane();
                 String hosp = ti.showInputDialog(null, "Veuillez Entrer la bonne reference!", "Information !",JOptionPane.QUESTION_MESSAGE);
               
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
               
                ResultSet b = a.executeQuery("SELECT * FROM Pieces WHERE bonneref='"+hosp+"'");
                
                b.first();
                
                vr= b.getInt("bonneref");
            
         
            } catch (SQLException ex) {
                ex.printStackTrace();
          
            }
                 if(vr==0){
                 
                     JOptionPane.showMessageDialog(null,"La reference que vous avez saisie n'existe pas","GESTOCK", JOptionPane.ERROR_MESSAGE);
                 
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
            
            a.executeUpdate("DELETE FROM Pieces WHERE bonneref='"+hosp+"'");
            
           }
            catch(Exception ko){}
            
            
                    JOptionPane jop1 = new JOptionPane();
                    jop1.showMessageDialog(null, "Suppression effectuee", "GESTOCK",JOptionPane.INFORMATION_MESSAGE);
                    jop1.setVisible(true);  
            
            
  }
            }         
           
 }

}
           
           
           class supp2 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                JOptionPane ti = new JOptionPane();
                 String hosp = ti.showInputDialog(null, "Veuillez la bonne reference!", "Information !",JOptionPane.QUESTION_MESSAGE);
               
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
               
                ResultSet b = a.executeQuery("SELECT * FROM Garnitures WHERE bonneref='"+hosp+"'");
                
                b.first();
                
                vr= b.getInt("bonneref");
            
         
            } catch (SQLException ex) {
                ex.printStackTrace();
          
            }
                 if(vr==0){
                 
                     JOptionPane.showMessageDialog(null,"La reference que vous avez saisie n'existe pas","GESTOCK", JOptionPane.ERROR_MESSAGE);
                 
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
            
            a.executeUpdate("DELETE FROM Garnitures WHERE bonneref='"+hosp+"'");
            
           }
            catch(Exception ko){}
            
            
                    JOptionPane jop1 = new JOptionPane();
                    jop1.showMessageDialog(null, "Suppression effectuee", "GESTOCK",JOptionPane.INFORMATION_MESSAGE);
                    jop1.setVisible(true);  
            
            
  }
            }         
           
 }

}
           
     
           class supp3 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                JOptionPane ti = new JOptionPane();
                 String hosp = ti.showInputDialog(null, "Veuillez la bonne reference!", "Information !",JOptionPane.QUESTION_MESSAGE);
               
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
               
                ResultSet b = a.executeQuery("SELECT * FROM Autres WHERE bonneref='"+hosp+"'");
                
                b.first();
                
                vr= b.getInt("bonneref");
            
         
            } catch (SQLException ex) {
                ex.printStackTrace();
          
            }
                 if(vr==0){
                 
                     JOptionPane.showMessageDialog(null,"La reference que vous avez saisie n'existe pas","GESTOCK", JOptionPane.ERROR_MESSAGE);
                 
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
            
            a.executeUpdate("DELETE FROM Autres WHERE bonneref='"+hosp+"'");
            
           }
            catch(Exception ko){}
            
            
                    JOptionPane jop1 = new JOptionPane();
                    jop1.showMessageDialog(null, "Suppression effectuee", "GESTOCK",JOptionPane.INFORMATION_MESSAGE);
                    jop1.setVisible(true);  
            
            
  }
            }         
           
 }

}
            class retour implements ActionListener {

            public void actionPerformed(ActionEvent e){
                 
                 int op = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment vous deconnecter?","GESTOCK", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
              
              if(op==JOptionPane.OK_OPTION){
                  
                   
                    
              
                    setVisible(false);
                    
                    Authentification gtre = new Authentification();
              
              }
              else{
                  
                  
              }
                
            }
            
         }
            
         
            class ajou1 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                AjouterPieces pi = new AjouterPieces();
                
                setVisible(false);
                
            }
            
         }
            
        
            class ajou2 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             AjouterGarnitures pi = new AjouterGarnitures();
             setVisible(false);

                
            }
            
         }
            
            
       
            class ajou3 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                
              AjouterAutres pi = new AjouterAutres();
              
              setVisible(false);

            }
            
         }
            
          class dispo1 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                
            StockDisponiblePieces dis = new StockDisponiblePieces();

            setVisible(false);
            }
            
         }
          
           class dispo2 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                
             StockDisponibleGar dis2 = new StockDisponibleGar();
             
             setVisible(false);
            }
            
         }
           
          class dispo3 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                
             StockDisponiblesAutres dis3 = new StockDisponiblesAutres();
             
             setVisible(false);
            }
            
         }
          
         class ven1 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                QuantiteVenduPieces ve1 = new QuantiteVenduPieces();
                
                setVisible(false);

            }
            
         }
    
    
        class ven2 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                
                  QuantiteVenduGar ve2 = new QuantiteVenduGar();
                  
                  setVisible(false);

            }
            
         }
   
       class ven3 implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                QuantiteVenduAu ve3 = new QuantiteVenduAu();
                
                setVisible(false);
                
                
            }
            
         }
       
       class perso implements ActionListener {

            public void actionPerformed(ActionEvent e){
                

                   Personnel el = new Personnel();
                   
                   setVisible(false);
                
            }
            
         }
       
       class uti implements ActionListener {

            public void actionPerformed(ActionEvent e){
                

                 Utilisateur reu = new Utilisateur();
                 
                 setVisible(false);
                
            }
            
         }
       class parte implements ActionListener {

            public void actionPerformed(ActionEvent e){
                

                InfoPart pr = new InfoPart();
                
                setVisible(false);
            }
            
         }
       
      class util implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
                UtilisateurConnecter recrer = new UtilisateurConnecter();
                
                setVisible(false);

                
            }
            
         }
     class payeb implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
              Infobonpayé nbhj = new Infobonpayé();
              
           
                
            }
            
         }
     
       class payenb implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
              Infobononpayé nbhj = new Infobononpayé();
              
            
                
            }
            
         }
      class facpa implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
              Facturepayead hdg = new Facturepayead();
              
              setVisible(false);
                
            }
            
         }
     class facnpa implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
              Facturenonpayead hgdg = new Facturenonpayead();
              
              setVisible(false);
                
            }
            
         }
    class sol implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             
                solde gnoi = new solde();
                
                setVisible(false);
            }
            
    }
      class Nettoyer implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             String hosp = JOptionPane.showInputDialog(null, "Veuillez entrer votre mot de passe!", "Information !",JOptionPane.QUESTION_MESSAGE);
             
                  
             String mot="";
              
                              try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
            
            ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Password='"+hosp+"'");
            
            b.first();
            
            mot=b.getString("Password");
            
             }catch(Exception exe){
                 
                 exe.printStackTrace();
                 
            }
             if(mot.equals("")){
                 
                 JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "GESTOCK", JOptionPane.ERROR_MESSAGE);
             }
             
             else{
             
             

                
             int op = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment nettoyer la base?","GESTOCK", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
              
             if(op==JOptionPane.OK_OPTION){
                 
                 
              
                    
                                    try{
            Class.forName("com.mysql.jdbc.Driver");
              
            String url= "jdbc:mysql://localhost:3306/gestion";
            
            String user="root"; 
            
            String pass="";
            
            Connection c1 =DriverManager.getConnection(url, user, pass);
            
            System.out.println("Connection bien etablie");
            
            Statement a = c1.createStatement();
           
            a.executeUpdate("DELETE FROM ventepieces");
            
            a.executeUpdate("DELETE FROM ventegar");
            
            a.executeUpdate("DELETE FROM venteau");
            
            a.executeUpdate("DELETE FROM utiljour");
            
            a.executeUpdate("DELETE FROM solde");
            
            a.executeUpdate("DELETE FROM facture WHERE Etat='"+1+"'");
            
            a.executeUpdate("DELETE FROM depense");
            
            a.executeUpdate("DELETE FROM bon WHERE Etat='"+1+"'");
            
            JOptionPane.showMessageDialog(null, "Nettoyage effectuée", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
            
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
            }
              else{
                  
              }
            
         }
             
            }
}
      
       class ventepi implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             Infoventadpi vn = new Infoventadpi();
             
             setVisible(false);
                
            }
            
         }
       
       class Pretpi implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             Infopreadpi gj = new Infopreadpi();
             
             setVisible(false);
                
            }
            
         }
       
        class ventega implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             Infoventeadga vnh = new Infoventeadga();
             
             setVisible(false);
                
            }
            
         }
       
       class Pretga implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             Infopreadga gscj = new Infopreadga();
             
             setVisible(false);
                
            }
            
         }
       
       class venteau implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             Infoventeau vnh = new Infoventeau();
             
             setVisible(false);
                
            }
            
         }
       
       class Pretau implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             Infopreadau gscj = new Infopreadau();
             
             setVisible(false);
                
            }
            
         }
       
        class gdepfinadmin implements ActionListener {

            public void actionPerformed(ActionEvent e){
                
             Infodepensead lokuuuuu = new Infodepensead();
             
             setVisible(false);
                
            }
            
         }
        
        
        class resumeadmin implements ActionListener 
        {

            public void actionPerformed(ActionEvent e)
            {
                adminresume ad = new adminresume();
              
                ad.setVisible(true);
                setVisible(false);
            }
        }
}