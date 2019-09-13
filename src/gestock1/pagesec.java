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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author KINGBOURY
 */
public class pagesec extends JFrame {

    public JLabel jLabel5;
    public JMenu jMenu1;
    public JMenu jMenu2;
    public JMenu jMenu3;
    public JMenu jMenu4;
    public JMenu jMenu5;
    public JMenu jMenu6;
    public javax.swing.JMenuBar jMenuBar1;
    public JMenuItem jMenuItem1;
    public JMenuItem jMenuItem10;
    public JMenuItem jMenuItem2;
    public JMenuItem jMenuItem3;
    public JMenuItem jMenuItem4;
    public JMenuItem jMenuItem5;
    public JMenuItem jMenuItem6;
    public JMenuItem jMenuItem7;
    public JMenuItem jMenuItem8;
    public JMenu jMenuItem9;
    public JMenuItem jMenuItem11;
    public JMenuItem jMenuItem12;
    public JMenuItem jMenuItem13;
    public JMenuItem jb1;
    public JMenuItem jb2;

    public pagesec() {

        jLabel5 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu5 = new JMenu();
        jMenu6 = new JMenu();
        jMenuItem10 = new JMenuItem();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu4 = new JMenu();
        jMenuItem8 = new JMenuItem();
        jMenuItem9 = new JMenu();
        jMenu3 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();
        jMenuItem11 = new JMenuItem();
        jMenuItem12 = new JMenuItem();
        jMenuItem13 = new JMenuItem();
        jb1 = new JMenuItem();
        jb2 = new JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setVisible(true);
        setResizable(false);
        setPreferredSize(new Dimension(652, 603));
        setTitle("GESTOCK");

        jLabel5.setIcon(new javax.swing.ImageIcon("pieces\\fond.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 650, 580);

        jMenu5.setText("Compte");

        jMenuItem10.setText("Deconnection");
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Vente");

        jMenuItem1.setText("Nouveau");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Informations");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Depense");

        jMenuItem3.setText("Nouveau");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Informations");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Bon");

        jMenuItem8.setText("Nouveau");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Informations");

        jb1.setText("Payé");

        jMenuItem9.add(jb1);

        jb2.setText("Non Payé");

        jMenuItem9.add(jb2);

        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Pret");

        jMenuItem11.setText("Nouveau");

        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("Informations");

        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        jMenu3.setText("Inventaire");

        jMenuItem5.setText("Facture paye");

        jMenu3.add(jMenuItem5);

        jMenuItem13.setText("Facture non paye");

        jMenu3.add(jMenuItem13);

        jMenuItem6.setText("Depense");

        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Resume");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();

        jMenuItem10.addActionListener(new deconnect());

        jMenuItem1.addActionListener(new Nouv());

        jMenuItem3.addActionListener(new Nouv1());

        jMenuItem11.addActionListener(new Nouv2());

        jMenuItem2.addActionListener(new info());

        jMenuItem4.addActionListener(new info1());

        jMenuItem12.addActionListener(new info2());

        jMenuItem5.addActionListener(new facp());

        jMenuItem13.addActionListener(new facnp());

        jMenuItem6.addActionListener(new depj());

        jMenuItem7.addActionListener(new resme());

        jb1.addActionListener(new bonpa());

        jb2.addActionListener(new bononpa());

        jMenuItem8.addActionListener(new Nouvbon());

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
            java.util.logging.Logger.getLogger(pageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagesec().setVisible(true);
            }
        });
    }

    class Nouv implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            vente vert = new vente();

            setVisible(false);

        }

    }

    class Nouv2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Ajoupre pre = new Ajoupre();

            setVisible(false);

        }

    }

    class Nouv1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            depense dep = new depense();

            setVisible(false);

        }

    }

    class info implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Infoventsec vi = new Infoventsec();

            setVisible(false);

        }

    }

    class info1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Infodepensesec vil = new Infodepensesec();

            setVisible(false);

        }

    }

    class info2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Infopreesc c = new Infopreesc();

            setVisible(false);

        }

    }

    class facp implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Facturepayesec hj = new Facturepayesec();

            setVisible(false);

        }

    }

    class facnp implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Facturenonpayeesc hjn = new Facturenonpayeesc();

            setVisible(false);

        }

    }

    class depj implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Infodepensesec fg = new Infodepensesec();

            setVisible(false);

        }

    }

    class resme implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            adminresume ad = new adminresume();

            ad.setVisible(true);

            setVisible(false);

        }

    }

    class deconnect implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int op = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment vous deconnecter?", "GESTOCK", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (op == JOptionPane.OK_OPTION) {

                SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

                String bf0 = form.format(new Date());

                String bf1 = "2018/05/08 14:55:00";

                try {

                    Class.forName("com.mysql.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/gestion";

                    String user = "root";

                    String pass = "";

                    Connection c1 = DriverManager.getConnection(url, user, pass);

                    System.out.println("Connection bien etablie");

                    Statement a = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

                    ResultSet b = a.executeQuery("SELECT * FROM utiljour WHERE Date_Sorti='" + bf1 + "'");

                    b.first();

                    b.updateString("Date_Sorti", bf0);

                    b.updateRow();

                } catch (Exception ex) {

                }

                setVisible(false);

                Authentification aut = new Authentification();
            } else {

            }

        }

    }

    class bonpa implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Infobonpayé jhhyu = new Infobonpayé();

        }

    }

    class bononpa implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Infobononpayé jophhyu = new Infobononpayé();

        }

    }

    class Nouvbon implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Bon fghj = new Bon();

            setVisible(false);

        }

    }

}
