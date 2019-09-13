package gestock1;

import gestockDB.Annuler;
import gestockDB.AnnulerBon;
import java.awt.Button;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lalita
 */
public class DetailFacture extends JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4, jPanel5;
    private javax.swing.JScrollPane jScrollPane1, jScrollPane2;
    private javax.swing.JTable jTable1, jTable2;
    private JLabel jLabel2, jLabel3;
    DefaultTableModel d, d2;

    private Object idFacture;
    private Object facPrenom;
    private Object facNom;
    private String etafacture;
    private String libelle;
    private JTable jTable;

    public DetailFacture(String libelle, Object idFacture, Object facPrenom, Object facNom, String eta) {
        this.libelle = libelle;
        this.idFacture = idFacture;
        this.facPrenom = facPrenom;
        this.facNom = facNom;
        this.etafacture = eta;
        initComponents();
    }

    public DetailFacture(String libelle, JTable jTable, Object facPrenom, Object facNom, String eta) {
        this.libelle = libelle;
        this.jTable = jTable;
        this.facPrenom = facPrenom;
        this.facNom = facNom;
        this.etafacture = eta;
        initComponentResumes();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(true);
        setVisible(true);
        setTitle("GESTOCK : Résumer " + libelle);
        setPreferredSize(new Dimension(936, 590));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 20, 110, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\imprimer1.jpg")); // NOI18N
        jButton2.setText("Imprimer");
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 20, 130, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Détails " + libelle + " " + etafacture + " de " + facPrenom + " " + facNom);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(240, 20, 510, 22);

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
        jPanel4.setBounds(900, 50, 40, 450);

        jScrollPane1.setBounds(30, 50, 870, 450);
        jScrollPane1.setViewportView(jTable1);
        getContentPane().add(jScrollPane1);

        pack();

        jButton1.addActionListener(new Quitter());

        jButton2.addActionListener(new Imprimer());

        CreateColonne();

        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

        String dat = form.format(new Date());

        String et = "facture";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/gestion";

            String user = "root";

            String pass = "";

            Connection c1 = DriverManager.getConnection(url, user, pass);

            System.out.println("Connection bien etablie");

            Statement a = c1.createStatement();

            String[] types = {"ventegar", "ventepieces", "venteau"};
            double total = 0d;
            for (String type : types) {
                ResultSet b = a.executeQuery("SELECT * FROM " + type + "  WHERE IDr='" + this.idFacture + "' ORDER BY Date DESC");

                int reference, identifiant;

                String designation;

                int qte;

                double pu;

                double pt;

                String date;

                while (b.next()) {

                    identifiant = b.getInt("Identifiant");

                    designation = b.getString("Designation");

                    reference = b.getInt("bonneref");

                    pu = b.getDouble("Prix_unitaire");

                    pt = b.getDouble("Total");

                    qte = b.getInt("Quantite");

                    date = b.getString("Date");

                    total += pt;
                    ligne(identifiant, designation, reference, pu, qte, pt, date);
                }
            }

            ligne1("Total", total, "");
            total = 0d;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        setLocationRelativeTo(null);
    }

    private void initComponentResumes() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(true);
        setVisible(true);
        setTitle("GESTOCK : Résumer " + libelle);
        setPreferredSize(new Dimension(936, 590));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("pieces\\retour.jpg")); // NOI18N
        jButton1.setText("Fermer");
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 20, 110, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("pieces\\imprimer1.jpg")); // NOI18N
        jButton2.setText("Imprimer");
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 20, 130, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Détails " + libelle + " " + etafacture + " de " + facPrenom + " " + facNom);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(240, 20, 510, 22);

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
        jPanel4.setBounds(900, 50, 40, 450);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Détails " + libelle + " " + etafacture + " de " + facPrenom + " " + facNom);
        jPanel5.add(jLabel3);
        jLabel3.setBounds(240, 20, 510, 22);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setLayout(null);
        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 250, 940, 50);

        jScrollPane1.setBounds(30, 50, 870, 200);
        jScrollPane1.setViewportView(jTable1);
        getContentPane().add(jScrollPane1);

        jScrollPane2.setBounds(30, 300, 870, 200);
        jScrollPane2.setViewportView(jTable2);
        getContentPane().add(jScrollPane2);

        pack();

        jButton1.addActionListener(new Quitter());

        jButton2.addActionListener(new Imprimer());

        CreateColonne();

        CreateColonnePret();

        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

        String dat = form.format(new Date());

        String et = "facture";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/gestion";

            String user = "root";

            String pass = "";

            Connection c1 = DriverManager.getConnection(url, user, pass);

            System.out.println("Connection bien etablie");

            Statement a = c1.createStatement();
            Statement bpret = c1.createStatement();

            String[] types = {"ventegar", "ventepieces", "venteau"};
            String[] parents = {"facture", "bon"};
            int rowcount = this.jTable.getRowCount();
            double totalvente = 0d, totalpret = 0d;

            for (int i = 0; i < rowcount - 1; i++) {

                for (String parent : parents) {
                    ResultSet parentQuery = bpret.executeQuery("SELECT * FROM " + parent + "  WHERE Identifiant='" + this.jTable.getValueAt(i, 0) + "' ORDER BY Date DESC");
                    
                    parentQuery.first();
                    
                    String datePayer = parentQuery.getString("datePayer");

                    for (String type : types) {
                        ResultSet b = a.executeQuery("SELECT * FROM " + type + "  WHERE IDr='" + this.jTable.getValueAt(i, 0) + "' ORDER BY Date DESC");

                        int reference, identifiant;

                        String designation;
                        
                        int qte;

                        double pu;

                        double pt;

                        String date;

                        while (b.next()) {

                            identifiant = b.getInt("Identifiant");

                            designation = b.getString("Designation");

                            reference = b.getInt("bonneref");

                            pu = b.getDouble("Prix_unitaire");

                            pt = b.getDouble("Total");

                            qte = b.getInt("Quantite");

                            date = b.getString("Date");
                            if (datePayer!=null) {
                            totalpret += pt;
                            lignePret(identifiant, designation, reference, pu, qte, pt, date);
                            }else{
                            
                            totalvente += pt;
                            ligne(identifiant, designation, reference, pu, qte, pt, date);
                            }
                            
                            
                        }
                    }

                }
            }

            ligne1("Total", totalvente, "");
            ligne1Pret("Total", totalpret, "");
            totalvente = 0d; totalpret = 0d;

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailFacture("Facture", 1117, "amad Saïd ", "ndiaye", "non payée").setVisible(true);
            }
        });
    }

    public void CreateColonne() {

        d = (DefaultTableModel) jTable1.getModel();
        d.addColumn("Identifiant");
        d.addColumn("Désignation");
        d.addColumn("Référence");
        d.addColumn("Prix Unitaire");
        d.addColumn("Quantité");
        d.addColumn("Prix Total");
        d.addColumn("Date Pret");
    }

    public void CreateColonnePret() {

        d2 = (DefaultTableModel) jTable2.getModel();
        d2.addColumn("Identifiant");
        d2.addColumn("Désignation");
        d2.addColumn("Référence");
        d2.addColumn("Prix Unitaire");
        d2.addColumn("Quantité");
        d2.addColumn("Prix Total");
        d2.addColumn("Date Pret");
    }

    public void ligne(int identifiant, String designation, int reference, double prix_unit, int qte, double prix_total, String datePret) {

        Object[] line = {identifiant, designation, reference, prix_unit, qte, prix_total, datePret};

        d.addRow(line);
    }

        public void lignePret(int identifiant, String designation, int reference, double prix_unit, int qte, double prix_total, String datePret) {

        Object[] line = {identifiant, designation, reference, prix_unit, qte, prix_total, datePret};

        d2.addRow(line);
    }
    public void ligne1(String lm, double ln, String ll) {

        Object[] line = {lm, ln, ll};

        d.addRow(line);
    }

        public void ligne1Pret(String lm, double ln, String ll) {

        Object[] line = {lm, ln, ll};

        d2.addRow(line);
    }
    class Quitter implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            setVisible(false);
        }
    }

    class Imprimer implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            MessageFormat hed = new MessageFormat(libelle + " " + etafacture + " de " + facPrenom + " " + facNom);
            MessageFormat hed1 = new MessageFormat("Page{0, number, integer}");
            try {
                jTable1.print(JTable.PrintMode.FIT_WIDTH, hed, hed1);
            } catch (Exception l) {
                System.out.println(l.getMessage());
            }
        }
    }
}
