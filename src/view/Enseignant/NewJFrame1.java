/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Enseignant;

/**
 *
 * @author Hachem
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        deconnecter = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        partie2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboOrdinateur = new javax.swing.JComboBox();
        comboFormation = new javax.swing.JComboBox();
        comboSalle = new javax.swing.JComboBox();
        comboClasse = new javax.swing.JComboBox();
        comboProjecteur = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        reserver = new javax.swing.JButton();
        partie1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comboDate = new javax.swing.JComboBox();
        comboHeure = new javax.swing.JComboBox();
        chercher = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(0, 204, 204));
        panel1.setLayout(null);

        deconnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img1/deconnecter.png"))); // NOI18N
        panel1.add(deconnecter);
        deconnecter.setBounds(80, 10, 60, 60);

        retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img1/retour.png"))); // NOI18N
        panel1.add(retour);
        retour.setBounds(10, 10, 60, 60);

        getContentPane().add(panel1);
        panel1.setBounds(10, 10, 150, 80);

        panel3.setBackground(new java.awt.Color(204, 204, 255));
        panel3.setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel3.add(jPanel1);
        jPanel1.setBounds(0, -50, 860, 50);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Resevation");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 0, 200, 40);

        panel3.add(jPanel3);
        jPanel3.setBounds(0, 0, 860, 40);

        partie2.setBackground(new java.awt.Color(255, 255, 255));
        partie2.setLayout(null);

        jPanel7.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel8.setText("Numero d'ordinateur");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(0, 0, 250, 40);

        partie2.add(jPanel7);
        jPanel7.setBounds(20, 180, 250, 40);

        jPanel6.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel2.setText("Numero de Salle");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(0, 0, 210, 40);

        partie2.add(jPanel6);
        jPanel6.setBounds(20, 30, 250, 40);

        jPanel10.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Nom de Classe");
        jPanel10.add(jLabel1);
        jLabel1.setBounds(0, 0, 190, 40);

        partie2.add(jPanel10);
        jPanel10.setBounds(20, 80, 250, 40);

        jPanel11.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel3.setText("Nom de Formation");
        jPanel11.add(jLabel3);
        jLabel3.setBounds(0, 0, 210, 40);

        partie2.add(jPanel11);
        jPanel11.setBounds(20, 130, 250, 40);

        comboOrdinateur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        partie2.add(comboOrdinateur);
        comboOrdinateur.setBounds(280, 180, 170, 40);

        comboFormation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        partie2.add(comboFormation);
        comboFormation.setBounds(280, 130, 170, 40);

        comboSalle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        partie2.add(comboSalle);
        comboSalle.setBounds(280, 30, 170, 40);

        comboClasse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        partie2.add(comboClasse);
        comboClasse.setBounds(280, 80, 170, 40);

        comboProjecteur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        partie2.add(comboProjecteur);
        comboProjecteur.setBounds(280, 230, 170, 40);

        jPanel5.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel7.setText("Numero de Projecteur");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(0, 0, 250, 40);

        partie2.add(jPanel5);
        jPanel5.setBounds(20, 230, 250, 40);

        reserver.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        reserver.setText("Reserver");
        partie2.add(reserver);
        reserver.setBounds(20, 280, 170, 50);

        panel3.add(partie2);
        partie2.setBounds(350, 90, 510, 340);

        partie1.setBackground(new java.awt.Color(255, 255, 255));
        partie1.setLayout(null);

        jPanel9.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel6.setText("Choisir la date et l'heure");
        jPanel9.add(jLabel6);
        jLabel6.setBounds(0, 0, 280, 50);

        partie1.add(jPanel9);
        jPanel9.setBounds(10, 10, 310, 50);

        jPanel8.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel4.setText("Date");
        jPanel8.add(jLabel4);
        jLabel4.setBounds(0, 0, 110, 40);

        partie1.add(jPanel8);
        jPanel8.setBounds(10, 70, 120, 40);

        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel5.setText("Heure");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(0, 0, 90, 40);

        partie1.add(jPanel4);
        jPanel4.setBounds(10, 120, 120, 40);

        comboDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi" }));
        partie1.add(comboDate);
        comboDate.setBounds(140, 70, 180, 40);

        comboHeure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:00--10:00", "10:00--12:00", "14:00--16:00", "16:00--18:00" }));
        partie1.add(comboHeure);
        comboHeure.setBounds(140, 120, 180, 40);

        chercher.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        chercher.setText("Chercher");
        partie1.add(chercher);
        chercher.setBounds(10, 170, 170, 50);

        panel3.add(partie1);
        partie1.setBounds(10, 90, 330, 240);

        panel2.setBackground(new java.awt.Color(0, 51, 0));
        panel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Resevation");
        panel2.add(jLabel10);
        jLabel10.setBounds(20, 10, 230, 40);

        panel3.add(panel2);
        panel2.setBounds(0, 0, 870, 60);

        getContentPane().add(panel3);
        panel3.setBounds(10, 100, 870, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chercher;
    private javax.swing.JComboBox comboClasse;
    private javax.swing.JComboBox comboDate;
    private javax.swing.JComboBox comboFormation;
    private javax.swing.JComboBox comboHeure;
    private javax.swing.JComboBox comboOrdinateur;
    private javax.swing.JComboBox comboProjecteur;
    private javax.swing.JComboBox comboSalle;
    private javax.swing.JButton deconnecter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel partie1;
    private javax.swing.JPanel partie2;
    private javax.swing.JButton reserver;
    private javax.swing.JButton retour;
    // End of variables declaration//GEN-END:variables
}
