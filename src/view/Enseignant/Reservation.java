package view.Enseignant;

import control.Parametre;
import java.awt.Rectangle;
import modele.Classe;
import modele.Enseignant;
import modele.Formation;
import modele.Ordinateur;
import modele.Projecteur;
import modele.Salle;
import view.Fenetre;

;


public class Reservation extends Fenetre 
{

    public Reservation(Rectangle r,String login,String password) 
    {
        
        panel1 = new javax.swing.JPanel();;;
        deconnecter = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
       
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
//------------------------------------------------------------------------------
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        contenu.add(panel3);
        contenu.add(panel1);
//------------------------------------------------------------------------------
        panel1.setBackground(Parametre.parti2);
        panel1.setLayout(null); 
        panel1.setBounds(10, 10, 150, 80); 
        panel1.add(deconnecter); 
        panel1.add(retour);
//------------------------------------------------------------------------------
        deconnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "deconnecter.png"))); // NOI18N
        deconnecter.setBounds(80, 10, 60, 60);
//------------------------------------------------------------------------------
        retour.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone+"retour.png"))); // NOI18N
        retour.setBounds(10, 10, 60, 60);
//------------------------------------------------------------------------------
        panel2.setBackground(Parametre.parti1);
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 1000, 60);
        panel2.add(jLabel10);
 //------------------------------------------------------------------------------
        panel3.setBackground(Parametre.parti2);
        panel3.setLayout(null);
        panel3.add(jPanel1); 
        panel3.add(partie2);
        panel3.add(partie1);
        panel3.add(panel2);
        panel3.setBounds(10, 100, Parametre.x - 30, Parametre.y - 200);
//------------------------------------------------------------------------------
        partie2.add(jPanel10);
        partie2.add(jPanel6);
        partie2.add(comboProjecteur);
        partie2.add(jPanel5);
        partie2.setBounds(10, 90, 510, 340);
        partie2.add(reserver);
        partie2.add(jPanel11);
        partie2.add(comboOrdinateur);
        partie2.add(comboSalle);
        partie2.add(comboClasse);
        partie2.add(comboFormation);
        partie2.add(jPanel7);
        partie2.setBackground(new java.awt.Color(255, 255, 255));
        partie2.setLayout(null);
        partie2.setVisible(false);
//------------------------------------------------------------------------------        
        partie1.setBackground(new java.awt.Color(255, 255, 255));
        partie1.setLayout(null);
        partie1.add(jPanel9);
        partie1.add(jPanel8);
        partie1.add(jPanel4);
        partie1.add(comboDate);
        partie1.add(comboHeure);
        partie1.setBounds(10, 90, 510, 340);
        partie1.add(chercher);
//------------------------------------------------------------------------------        
        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Nom de Classe");
        jLabel1.setBounds(0, 0, 190, 40);
        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel2.setText("Numero de Salle");
        jLabel2.setBounds(0, 0, 210, 40);
        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel3.setText("Nom de Formation");
        jLabel3.setBounds(0, 0, 210, 40);
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel4.setText("Date");
        jLabel4.setBounds(0, 0, 110, 40);
        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel5.setText("Heure");
        jLabel5.setBounds(0, 0, 90, 40);
        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel6.setText("Choisir la date et l'heure");
        jLabel6.setBounds(0, 0, 280, 50);
        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel7.setText("Numero de Projecteur");
        jLabel7.setBounds(0, 0, 250, 40);
        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel8.setText("Numero d'ordinateur");
        jLabel8.setBounds(0, 0, 250, 40);
        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Resevation");
        jLabel10.setBounds(20, 10, 230, 40);
//------------------------------------------------------------------------------
        
        
        comboDate.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"}));
        comboHeure.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"08:00--10:00", "10:00--12:00", "14:00--16:00", "16:00--18:00"}));
        comboOrdinateur.setBounds(280, 180, 170, 40);
        comboFormation.setBounds(280, 130, 170, 40);
        comboSalle.setBounds(280, 30, 170, 40);
        comboClasse.setBounds(280, 80, 170, 40);
        comboProjecteur.setBounds(280, 230, 170, 40);
        comboDate.setBounds(140, 70, 180, 40);
        comboHeure.setBounds(140, 120, 180, 40);
        comboHeure.setVisible(false);
//------------------------------------------------------------------------------
        jPanel4.setBounds(10, 120, 120, 40);
        jPanel4.add(jLabel5);
        jPanel4.setLayout(null);
        jPanel5.setLayout(null);
        jPanel5.add(jLabel7);
        jPanel5.setBounds(20, 230, 250, 40);
        jPanel6.add(jLabel2);
        jPanel6.setBounds(20, 30, 250, 40);
        jPanel6.setLayout(null);
        jPanel7.setLayout(null);
        jPanel7.add(jLabel8);
        jPanel7.setBounds(20, 180, 250, 40);
        jPanel8.setLayout(null);
        jPanel8.add(jLabel4);
        jPanel8.setBounds(10, 70, 120, 40);
        jPanel9.setLayout(null);
        jPanel9.add(jLabel6);
        jPanel9.setBounds(10, 10, 310, 50);
        jPanel10.setLayout(null);
        jPanel10.add(jLabel1);
        jPanel10.setBounds(20, 80, 250, 40);
        jPanel11.setLayout(null);
        jPanel11.setBounds(20, 130, 250, 40);
        jPanel11.add(jLabel3);
//------------------------------------------------------------------------------
        reserver.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        reserver.setText("Reserver");
        reserver.setBounds(20, 280, 170, 50);
//------------------------------------------------------------------------------
        chercher.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        chercher.setText("Chercher");
        chercher.setBounds(10, 170, 170, 50);
//------------------------------------------------------------------------------        
        chercher.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        if(comboHeure.getSelectedIndex()!=-1 && comboDate.getSelectedIndex() != -1)
        {
        partie2.setVisible(true);
        partie1.setVisible(false);
        
        heure = comboHeure.getSelectedItem().toString();
        comboOrdinateur.setModel(new javax.swing.DefaultComboBoxModel(Ordinateur.listeOrdinateurDisponible(date, heure)));
        comboFormation.setModel(new javax.swing.DefaultComboBoxModel(Formation.listeFormationDisponible(login, password)));
        comboSalle.setModel(new javax.swing.DefaultComboBoxModel(Salle.listeSalleDisponible(date, heure)));
        comboClasse.setModel(new javax.swing.DefaultComboBoxModel(Classe.listeClasseDisponible(date, heure)));
        comboProjecteur.setModel(new javax.swing.DefaultComboBoxModel(Projecteur.nomProjecteur()));
        
        
        }
        }
        });
//------------------------------------------------------------------------------
        reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                    formation = comboFormation.getSelectedItem().toString();
                    classe = comboClasse.getSelectedItem().toString();
                    salle = Integer.parseInt(comboSalle.getSelectedItem().toString());
                    projecteur =comboProjecteur.getSelectedItem().toString();
                    ordinateur = comboOrdinateur.getSelectedItem().toString();
                    modele.Reservation.ajouter(Enseignant.informationEnseignant(login, password)[0], salle,Ordinateur.numOrdinateur(ordinateur), Projecteur.numProjecteur(projecteur), Classe.getNumero(classe), Formation.numFormation(formation), date, heure);
                    partie2.setVisible(false);
                    partie1.setVisible(true);
                    comboHeure.setVisible(false);
            }
        });
//------------------------------------------------------------------------------        
        retour.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) 
        {
                setVisible(false);
                view.Enseignant.Gestion g = new view.Enseignant.Gestion(getBounds(),login,password);
                g.setVisible(true);

        }
        });
//------------------------------------------------------------------------------        
        deconnecter.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) 
        {
                setVisible(false);
                view.ConnectionInscription g = new view.ConnectionInscription(getBounds());
                g.setVisible(true);

        }
        });
        comboDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            date = comboDate.getSelectedItem().toString();
            comboHeure.setVisible(true);
            comboHeure.setModel(new javax.swing.DefaultComboBoxModel(Enseignant.listeHeureDisponible( login ,  password,  date  ) ));   

            }
        });
        
         
       
    
}

   
               
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private String date;
    private String heure;
    private String classe;
    private int salle;
    private String ordinateur;
    private String projecteur;
    private String formation;
    // End of variables declaration                   
}
