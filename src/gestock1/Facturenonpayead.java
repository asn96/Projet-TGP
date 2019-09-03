package gestock1;

import gestockDB.Annuler;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lalita
 */
public class Facturenonpayead extends JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public JButton payb, detailb;
    private JLabel jLabel2;
    private javax.swing.JComboBox<String> combo1;

    DefaultTableModel d;

    public Facturenonpayead() {

        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        combo1 = new javax.swing.JComboBox<>();
        payb = new JButton();
        detailb = new JButton();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("GESTOCK");
        setPreferredSize(new Dimension(736, 590));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 20, 90, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\imprimer1.jpg")); // NOI18N
        jButton2.setText("Imprimer");
        jPanel1.add(jButton2);
        jButton2.setBounds(150, 20, 110, 29);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\actu.jpg")); // NOI18N
        jButton3.setText("Annuler");
        jButton3.addActionListener(new supprimer());
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 20, 100, 29);
        
        payb.setBackground(new java.awt.Color(255, 255, 255));
        payb.setFont(new java.awt.Font("Tahoma", 1, 11));
        payb.setText("Payer");
        jPanel1.add(payb);
        payb.setBounds(400, 20, 90, 29);

        
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Information sur les factures non payées ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 20, 510, 22);
        
        //detail
        detailb.setBackground(new java.awt.Color(255, 255, 255));
        detailb.setFont(new java.awt.Font("Tahoma", 1, 11));
        detailb.setText("Détails");
        jPanel1.add(detailb);
        detailb.setBounds(510, 20, 90, 29);

       

        combo1.addItem("Jour");

        combo1.addItem("Mois");

        combo1.addItem("Annee");

        combo1.addItem("Tous");

        combo1.setBackground(new java.awt.Color(255, 255, 255));

        combo1.setFont(new java.awt.Font("Tahoma", 1, 11));

        jPanel2.add(combo1);

        combo1.setBounds(550, 10, 150, 29);

        jButton1.addActionListener(new Quitter());

        jButton2.addActionListener(new Imprimer());

        combo1.addActionListener(new Afficher());
        
        detailb.addActionListener(new detail());

        

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 500, 940, 60);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 50);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 50, 30, 450);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(700, 50, 40, 450);

        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 670, 450);

        payb.addActionListener(new Payer());

        pack();

        CreateColonne();

        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat form1 = new SimpleDateFormat("yyyy");

        SimpleDateFormat form2 = new SimpleDateFormat("MM");

        SimpleDateFormat form3 = new SimpleDateFormat("dd");

        String dat = form.format(new Date());

        String datfr1 = form1.format(new Date());

        String datfr2 = form2.format(new Date());

        String datfr3 = form3.format(new Date());

        double fini = 0d;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/gestion";

            String user = "root";

            String pass = "";

            Connection c1 = DriverManager.getConnection(url, user, pass);

            System.out.println("Connection bien etablie");

            Statement a = c1.createStatement();

            ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(Date)='" + datfr1 + "' AND MONTH(Date)='" + datfr2 + "' AND DAYOFMONTH(Date)='" + datfr3 + "' AND Etat='" + 0 + "') ORDER BY Date DESC");

            int refp;

            double mon;

            String nomp;

            String prenomp;

            while (b.next()) {

                refp = b.getInt("Identifiant");

                mon = b.getDouble("Montant");

                nomp = b.getString("Nom");

                prenomp = b.getString("Prenom");

                fini = fini + mon;

                ligne(refp, mon, dat, nomp, prenomp);

            }
            ligne1("Total", fini, "");

            fini = 0d;

        } catch (Exception ex) {
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
                new Facturenonpayead().setVisible(true);
            }
        });
    }

    public void CreateColonne() {

        d = (DefaultTableModel) jTable1.getModel();

        d.addColumn("Reference");
        d.addColumn("Montant");
        d.addColumn("Date Pret");
        d.addColumn("Nom");
        d.addColumn("Prenom");

    }

    public void ligne(int a, double b, String c, String nom, String prenom) {

        Object[] line = {a, b, c, nom, prenom};

        d.addRow(line);
    }

    public void ligne1(String lm, double ln, String ll) {

        Object[] line = {lm, ln, ll};

        d.addRow(line);
    }

    class Quitter implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            setVisible(false);

            pageadmin dd = new pageadmin();

        }

    }

    class Imprimer implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            MessageFormat hed = new MessageFormat("Liste des factures non payées");

            MessageFormat hed1 = new MessageFormat("Page{0, number, integer}");
            try {
                jTable1.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
            } catch (Exception l) {

                System.out.println("Erreur d'impression");
            }

        }
    }

    class Afficher implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

            SimpleDateFormat form1 = new SimpleDateFormat("yyyy");

            SimpleDateFormat form2 = new SimpleDateFormat("MM");

            SimpleDateFormat form3 = new SimpleDateFormat("dd");

            String dat = form.format(new Date());

            String datfr1 = form1.format(new Date());

            String datfr2 = form2.format(new Date());

            String datfr3 = form3.format(new Date());

            //
            if (combo1.getSelectedItem().equals("Tous")) {

                for (int k = d.getRowCount() - 1; k >= 0; k--) {

                    d.removeRow(k);
                }

                double fini = 0d;

                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/gestion";

                    String user = "root";

                    String pass = "";

                    Connection c1 = DriverManager.getConnection(url, user, pass);

                    System.out.println("Connection bien etablie");

                    Statement a = c1.createStatement();

                    ResultSet b = a.executeQuery("SELECT * FROM facture WHERE Etat='" + 0 + "' ORDER BY Date DESC");

                    int refp;

                    double mon;

                    String nomp;

                    String prenomp, df;

                    while (b.next()) {

                        refp = b.getInt("Identifiant");

                        mon = b.getDouble("Montant");

                        nomp = b.getString("Nom");

                        df = b.getString("Date");

                        prenomp = b.getString("Prenom");

                        fini = fini + mon;

                        ligne(refp, mon, df, nomp, prenomp);

                    }
                    ligne1("Total", fini, "");

                    fini = 0d;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

            //
            if (combo1.getSelectedItem().equals("Jour")) {

                for (int k = d.getRowCount() - 1; k >= 0; k--) {

                    d.removeRow(k);
                }

                double fini = 0d;

                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/gestion";

                    String user = "root";

                    String pass = "";

                    Connection c1 = DriverManager.getConnection(url, user, pass);

                    System.out.println("Connection bien etablie");

                    Statement a = c1.createStatement();

                    ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(Date)='" + datfr1 + "' AND MONTH(Date)='" + datfr2 + "' AND DAYOFMONTH(Date)='" + datfr3 + "' AND Etat='" + 0 + "') ORDER BY Date DESC");

                    int refp;

                    double mon;

                    String nomp;

                    String prenomp;

                    while (b.next()) {

                        refp = b.getInt("Identifiant");

                        mon = b.getDouble("Montant");

                        nomp = b.getString("Nom");

                        prenomp = b.getString("Prenom");

                        fini = fini + mon;

                        ligne(refp, mon, dat, nomp, prenomp);

                    }
                    ligne1("Total", fini, "");

                    fini = 0d;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
            if (combo1.getSelectedItem().equals("Mois")) {

                for (int k = d.getRowCount() - 1; k >= 0; k--) {

                    d.removeRow(k);
                }

                double fini = 0d;

                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/gestion";

                    String user = "root";

                    String pass = "";

                    Connection c1 = DriverManager.getConnection(url, user, pass);

                    System.out.println("Connection bien etablie");

                    Statement a = c1.createStatement();

                    ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(Date)='" + datfr1 + "' AND MONTH(Date)='" + datfr2 + "' AND Etat='" + 0 + "') ORDER BY Date DESC");

                    int refp;

                    double mon;

                    String nomp;

                    String prenomp;

                    String df;

                    while (b.next()) {

                        refp = b.getInt("Identifiant");

                        mon = b.getDouble("Montant");

                        nomp = b.getString("Nom");

                        prenomp = b.getString("Prenom");

                        df = b.getString("Date");

                        fini = fini + mon;

                        ligne(refp, mon, df, nomp, prenomp);

                    }
                    ligne1("Total", fini, "");

                    fini = 0d;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
            if (combo1.getSelectedItem().equals("Annee")) {

                for (int k = d.getRowCount() - 1; k >= 0; k--) {

                    d.removeRow(k);
                }

                double fini = 0d;

                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/gestion";

                    String user = "root";

                    String pass = "";

                    Connection c1 = DriverManager.getConnection(url, user, pass);

                    System.out.println("Connection bien etablie");

                    Statement a = c1.createStatement();

                    ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(Date)='" + datfr1 + "'  AND Etat='" + 0 + "') ORDER BY Date DESC");

                    int refp;

                    double mon;

                    String nomp;

                    String prenomp;

                    String df;

                    while (b.next()) {

                        refp = b.getInt("Identifiant");

                        mon = b.getDouble("Montant");

                        nomp = b.getString("Nom");

                        prenomp = b.getString("Prenom");

                        df = b.getString("Date");

                        fini = fini + mon;

                        ligne(refp, mon, df, nomp, prenomp);

                    }
                    ligne1("Total", fini, "");

                    fini = 0d;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

        }

    }

    class Payer implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            SimpleDateFormat for1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String dat2 = for1.format(new Date());

            int n = jTable1.getSelectedRow();

            Object ob1 = d.getValueAt(n, 0);
            String f = "facture";

            try {
                Class.forName("com.mysql.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/gestion";

                String user = "root";

                String pass = "";

                Connection c1 = DriverManager.getConnection(url, user, pass);

                System.out.println("Connection bien etablie");

                Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

                ResultSet b = a.executeQuery("SELECT * FROM facture WHERE Identifiant='" + ob1 + "'");

                b.first();

                b.updateInt("Etat", 1);

                //b.updateString("Date", dat2);
                b.updateString("datePayer", dat2);

                b.updateRow();

                d.removeRow(n);

            } catch (Exception oui) {

            }

            //
            try {
                Class.forName("com.mysql.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/gestion";

                String user = "root";

                String pass = "";

                Connection c1 = DriverManager.getConnection(url, user, pass);

                System.out.println("Connection bien etablie");

                Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

                ResultSet b = a.executeQuery("SELECT * FROM ventegar WHERE IDr='" + ob1 + "'");

                while (b.next()) {
                    b.updateString("Etat", f);

                    b.updateString("Date", dat2);

                    b.updateRow();
                }

                d.removeRow(n);
            } catch (Exception oui) {

            }

            //
            try {
                Class.forName("com.mysql.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/gestion";

                String user = "root";

                String pass = "";

                Connection c1 = DriverManager.getConnection(url, user, pass);

                System.out.println("Connection bien etablie");

                Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

                ResultSet b = a.executeQuery("SELECT * FROM ventepieces WHERE Identifiant='" + ob1 + "'");

                b.first();

                b.updateString("Etat", f);

                b.updateString("Date", dat2);

                b.updateRow();

                d.removeRow(n);

            } catch (Exception oui) {

            }

            //
            try {
                Class.forName("com.mysql.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/gestion";

                String user = "root";

                String pass = "";

                Connection c1 = DriverManager.getConnection(url, user, pass);

                System.out.println("Connection bien etablie");

                Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

                ResultSet b = a.executeQuery("SELECT * FROM venteau WHERE Identifiant='" + ob1 + "'");

                b.first();

                b.updateString("Etat", f);

                b.updateString("Date", dat2);

                b.updateRow();

                d.removeRow(n);

            } catch (Exception oui) {

            }

            //
            JOptionPane.showMessageDialog(null, "Paiement effectué", "GESTOCK", JOptionPane.INFORMATION_MESSAGE);
            //
        }

    }

    class supprimer implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int n = jTable1.getSelectedRow();

            Object ob = d.getValueAt(n, 0);

            Annuler a = new Annuler(ob);
            a.AnnuleGar();
            a.AnnulePiece();
            a.AnnuleAutre();
            d.removeRow(n);
            JOptionPane.showMessageDialog(null, "La Facture a été annulée avec succés", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

        }
    }
    class detail implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          
            if(jTable1.getSelectedRow() != -1) {
                int n = jTable1.getSelectedRow();
            Object facId = d.getValueAt(n, 0);
            Object facPrenom = d.getValueAt(n, 4);
            Object facNom = d.getValueAt(n, 3);
            
            DetailFacture detailFacture = new DetailFacture("Facture", facId, facPrenom, facNom, "non payée");

            }else{
                JOptionPane.showMessageDialog(null, " Veuillez Sélectionner une ligne D'abord !", " Attention !", JOptionPane.INFORMATION_MESSAGE);
            }
                        /*
            /*
            
            
            *
             int ROWS = 3;
             Object[][] data = { { "A", "B", "Snowboarding", new Integer(5) },
        { "C", "D", "Pool", new Integer(10) } };
    Object[] columnNames = { "firstname", "lastname", "age" };
    final JTable table = new JTable(data, columnNames) {
      @Override
      public Dimension getPreferredScrollableViewportSize() {
        Dimension d = getPreferredSize();
        int n = getRowHeight();
        return new Dimension(d.width, (n * ROWS));
      }
    };
    
    final JTable table1 = new JTable(data, columnNames) {
      @Override
      public Dimension getPreferredScrollableViewportSize() {
        Dimension d = getPreferredSize();
        int n = getRowHeight();
        return new Dimension(d.width, (n * ROWS));
      }
    };
           JPanel jPanel = new JPanel();
           jPanel.setLayout(new GridLayout());
           JScrollPane sp = new JScrollPane(table);
           JScrollPane sp1 = new JScrollPane(table1);
           jPanel.add(sp);
           jPanel.add(sp1);
           JDialog jdialog = new JDialog();
            jdialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jdialog.setContentPane(jPanel);

            jdialog.pack();
            jdialog.setVisible(true);
           
                    
                    /*JOptionPane jOptionPane = new JOptionPane();
            jOptionPane.showInputDialog("je suis là");
            /
        */            
        }
        
    }
}
