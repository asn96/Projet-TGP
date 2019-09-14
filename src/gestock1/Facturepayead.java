package gestock1;

import gestockDB.Annuler;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lalita
 */
public class Facturepayead extends JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3, detailb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private JLabel jLabel2;
    private javax.swing.JComboBox<String> jComboBox1;
    static final NumberFormat n2 = NumberFormat.getInstance(Locale.FRANCE);

    DefaultTableModel d;

    public Facturepayead() {

        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        detailb = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
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

        jButton2.setBounds(150, 20, 110, 29);
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("pieces\\actu.jpg")); // NOI18N
        jButton3.setText("Annuler");
        jButton3.setBounds(280, 20, 100, 29);
        jPanel1.add(jButton3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Information sur les factures payées ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 20, 510, 22);

        //detail
        detailb.setBackground(new java.awt.Color(255, 255, 255));
        detailb.setFont(new java.awt.Font("Tahoma", 1, 11));
        detailb.setText("Détails");
        jPanel1.add(detailb);
        detailb.setBounds(400, 20, 90, 29);

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11));

        jPanel2.add(jComboBox1);

        jComboBox1.setBounds(550, 18, 150, 29);

        jComboBox1.addItem("Jour");

        jComboBox1.addItem("Mois");

        jComboBox1.addItem("Annee");

        jComboBox1.addItem("Tous");

        jButton1.addActionListener(new Quitter());

        jButton2.addActionListener(new Imprimer());

        jButton3.addActionListener(new supprimer());

        detailb.addActionListener(new detail());

        jComboBox1.addActionListener(new Afficher());

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

            ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(datePayer)='" + datfr1 + "' AND MONTH(datePayer)='" + datfr2 + "' AND DAYOFMONTH(datePayer)='" + datfr3 + "' AND Etat='" + 1 + "') ORDER BY datePayer DESC");

            int refp;

            double mon;

            String nomp;

            String prenomp;

            String datePayer, datePret;

            while (b.next()) {

                refp = b.getInt("Identifiant");

                mon = b.getDouble("Montant");

                nomp = b.getString("Nom");

                prenomp = b.getString("Prenom");

                datePayer = b.getString("datePayer");

                datePret = b.getString("Date");

                fini = fini + mon;

                ligne(refp, mon, datePret, datePayer, nomp, prenomp);

            }
            ligne1("Total", n2.format(fini), "");

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
                new Facturepayead().setVisible(true);
            }
        });
    }

    public void CreateColonne() {

        d = (DefaultTableModel) jTable1.getModel();

        d.addColumn("Reference");
        d.addColumn("Montant");
        d.addColumn("Date Pret");
        d.addColumn("Date Paiement");
        d.addColumn("Nom");
        d.addColumn("Prenom");

    }

    public void ligne(int a, double b, String c, String datePayer, String nom, String prenom) {

        Object[] line = {a, b, c, datePayer, nom, prenom};

        d.addRow(line);
    }

    public void ligne1(String lm, String ln, String ll) {

        Object[] line = {lm, ln, ll};

        d.addRow(line);
    }

    public class detail implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (jTable1.getSelectedRow() != -1) {
                int n = jTable1.getSelectedRow();
                Object facId = d.getValueAt(n, 0);
                Object facPrenom = d.getValueAt(n, 5);
                Object facNom = d.getValueAt(n, 4);

                DetailFacture detailFacture = new DetailFacture("Facture", facId, facPrenom, facNom, "payée");

            } else {
                JOptionPane.showMessageDialog(null, " Veuillez Sélectionner une ligne D'abord !", " Attention !", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }

    class Quitter implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            setVisible(false);

            pageadmin dd = new pageadmin();

        }

    }

    class Imprimer implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            MessageFormat hed = new MessageFormat("Liste des factures payées");

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
            if (jComboBox1.getSelectedItem().equals("Tous")) {

                for (int k = d.getRowCount() - 1; k >= 0; k--) {

                    d.removeRow(k);
                }

                Double fini = 0d;

                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/gestion";

                    String user = "root";

                    String pass = "";

                    Connection c1 = DriverManager.getConnection(url, user, pass);

                    System.out.println("Connection bien etablie");

                    Statement a = c1.createStatement();

                    ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE Etat='" + 1 + "' ORDER BY Date DESC");

                    int refp;

                    double mon;

                    String nomp;

                    String prenomp, dt, datePayer;

                    while (b.next()) {

                        refp = b.getInt("Identifiant");

                        mon = b.getDouble("Montant");

                        nomp = b.getString("Nom");

                        dt = b.getString("Date");

                        prenomp = b.getString("Prenom");

                        datePayer = b.getString("datePayer");

                        fini = fini + mon;

                        ligne(refp, mon, dt, datePayer, nomp, prenomp);

                    }
                    ligne1("Total", n2.format(fini), "");
                   // System.out.println(BigDecimal.valueOf(fini));

                    fini = 0d;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

            //
            if (jComboBox1.getSelectedItem().equals("Jour")) {

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

                    ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(datePayer)='" + datfr1 + "' AND MONTH(datePayer)='" + datfr2 + "' AND DAYOFMONTH(datePayer)='" + datfr3 + "' AND Etat='" + 1 + "') ORDER BY datePayer DESC");

                    int refp;

                    double mon;

                    String nomp;

                    String prenomp;

                    String datePayer;

                    while (b.next()) {

                        refp = b.getInt("Identifiant");

                        mon = b.getDouble("Montant");

                        nomp = b.getString("Nom");

                        prenomp = b.getString("Prenom");

                        datePayer = b.getString("datePayer");

                        fini = fini + mon;

                        ligne(refp, mon, dat, datePayer, nomp, prenomp);

                    }
                    ligne1("Total", n2.format(fini), "");

                    fini = 0d;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
            if (jComboBox1.getSelectedItem().equals("Mois")) {

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

                    ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(datePayer)='" + datfr1 + "' AND MONTH(datePayer)='" + datfr2 + "' AND Etat='" + 1 + "') ORDER BY datePayer DESC");

                    int refp;

                    double mon;

                    String nomp;

                    String prenomp;

                    String df, datePayer;

                    while (b.next()) {

                        refp = b.getInt("Identifiant");

                        mon = b.getDouble("Montant");

                        nomp = b.getString("Nom");

                        prenomp = b.getString("Prenom");

                        df = b.getString("Date");

                        datePayer = b.getString("datePayer");

                        fini = fini + mon;

                        ligne(refp, mon, df, datePayer, nomp, prenomp);

                    }
                    ligne1("Total", n2.format(fini), "");

                    fini = 0d;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
            if (jComboBox1.getSelectedItem().equals("Annee")) {

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

                    ResultSet b = a.executeQuery("SELECT * FROM facture  WHERE ( YEAR(datePayer)='" + datfr1 + "'  AND Etat='" + 1 + "') ORDER BY datePayer DESC");

                    int refp;

                    double mon;

                    String nomp;

                    String prenomp;

                    String df, datePayer;

                    while (b.next()) {

                        refp = b.getInt("Identifiant");

                        mon = b.getDouble("Montant");

                        nomp = b.getString("Nom");

                        prenomp = b.getString("Prenom");

                        df = b.getString("Date");

                        datePayer = b.getString("datePayer");

                        fini = fini + mon;

                        ligne(refp, mon, df, datePayer, nomp, prenomp);

                    }
                    ligne1("Total", n2.format(fini), "");

                    fini = 0d;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

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
}
