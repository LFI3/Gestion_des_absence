
package view.Administrateur;

import control.Parametre;
import static control.Parametre.arrierePlan;
import static control.Parametre.cheminIcone;
import static control.Parametre.parti1;
import static control.Parametre.parti2;
import static control.Parametre.x;
import static control.Parametre.y;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.LEFT;
import view.ConnectionInscription;
import view.Fenetre;

public class Gestion extends Fenetre {

    
    public Gestion(Rectangle r,String login1,String password1)
     {
       
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
       
         
        
        
        retour = new javax.swing.JButton();
        deconnection = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        parametre = new javax.swing.JButton();
        planingClasse = new javax.swing.JButton();
        planingSalle = new javax.swing.JButton();
        planingEnseignant = new javax.swing.JButton();
        formation = new javax.swing.JButton();
        enseignant = new javax.swing.JButton();
        classe = new javax.swing.JButton();
        salle = new javax.swing.JButton();
        etudiant = new javax.swing.JButton();
        planing = new javax.swing.JButton();
        projecteur = new javax.swing.JButton();
        ordinateur = new javax.swing.JButton();
        reservation = new javax.swing.JButton();
        
        
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        titre= new javax.swing.JLabel();
        panel1=new javax.swing.JPanel();
        panel2=new javax.swing.JPanel();
        panel3=new javax.swing.JPanel();
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(r);
        setTitle("Gestion");
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        contenu.setBackground(arrierePlan);
        contenu.add(panel2);
        contenu.add(panel1);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------       
        panel2.setBackground(parti2);
        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel2.setBounds(10, 100, x-30, y-200);
        panel2.setLayout(null);
        panel2.add(panel3);
        panel2.add(planingClasse);
        panel2.add(jLabel2);
        panel2.add(jLabel3);
        panel2.add(planingSalle);
        panel2.add(planingEnseignant);
        panel2.add(jLabel9);
        panel2.add(planing);
        panel2.add(jLabel10);
        panel2.add(reservation);
        panel2.add(jLabel11);
        panel2.add(jLabel12);
        panel2.add(projecteur);
        panel2.add(ordinateur); 
        panel2.add(jLabel13);
        panel2.add(jLabel4); 
        panel2.add(formation);
        panel2.add(jLabel5);
        panel2.add(classe);
        panel2.add(jLabel6);
        panel2.add(enseignant);
        panel2.add(jLabel7);
        panel2.add(jLabel8);
        panel2.add(salle);
        panel2.add(etudiant);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        panel1.setBackground(parti2);
        panel1.setBounds(10, 10, Parametre.x - 30, 80);
        panel1.setLayout(null);
        panel1.add(retour);
        panel1.add(deconnection);
        panel1.add(parametre);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------        
        panel3.setBackground(parti1);
        panel3.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        panel3.setLayout(null);
        panel3.add(titre);
        panel3.setBounds(0, 0, x-30, 40);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------        
        titre.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        titre.setForeground(new java.awt.Color(255, 255, 255));
        titre.setHorizontalAlignment(CENTER);
        titre.setText("Gestion");
        titre.setBounds(0, 0, 200, 40);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        retour.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"retour.png"))); // NOI18N
        retour.setBorder(null);
        retour.setBounds(10, 10, 60, 60);
        retour.setEnabled(false);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        deconnection.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"deconnecter.png"))); // NOI18N
        deconnection.setBounds(80, 10, 60, 60);
        
 //------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        parametre.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"parametre.png"))); // NOI18N
        parametre.setBounds(150, 10, 60, 60); 
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        planingClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"planing.png"))); // NOI18N
        planingClasse.setBounds(20, 200, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(LEFT);
        jLabel2.setText("Planing de classe");
        jLabel2.setBounds(90, 200, 170, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(LEFT);
        jLabel3.setText("Planing de salle");
        jLabel3.setBounds(90, 340, 200, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        planingSalle.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"planing.png")));// NOI18N
        planingSalle.setBounds(20, 340, 60, 60);
//------------------------------------------------------------------------------        
//------------------------------------------------------------------------------
        planingEnseignant.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"planing.png"))); // NOI18N
        planingEnseignant.setBounds(20, 270, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(LEFT);
        jLabel4.setText("Planing d'enseignant");
        jLabel4.setBounds(90, 270, 200, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------        
        formation.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"formation.png"))); // NOI18N
        formation.setBounds(300, 130, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(LEFT);
        jLabel5.setText("Gestion de formation");
        jLabel5.setBounds(370, 130, 190, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        classe.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"classe.png"))); // NOI18N
        classe.setBounds(300, 200, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(LEFT);
        jLabel6.setText("Gestion de classe");
        jLabel6.setBounds(370, 200, 170, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        enseignant.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"enseignant.png"))); // NOI18N
        enseignant.setBounds(300, 270, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(LEFT);
        jLabel7.setText("Gestion d'enseignant");
        jLabel7.setBounds(370, 270, 200, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(LEFT);
        jLabel8.setText("Gestion de salle");
        jLabel8.setBounds(370, 340, 200, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        salle.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"salle.png"))); // NOI18N
        salle.setBounds(300, 340, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        etudiant.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"etudiant.png"))); // NOI18N
        etudiant.setBounds(590, 130, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(LEFT);
        jLabel9.setText("Gestion d'etudiant");
        jLabel9.setBounds(660, 130, 200, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        planing.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"planing.png"))); // NOI18N
        planing.setBounds(590, 200, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(LEFT);
        jLabel10.setText("Gestion de planing");
        jLabel10.setBounds(660, 200, 170, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        reservation.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"reservation.png")));// NOI18N
        reservation.setBounds(590, 270, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(LEFT);
        jLabel11.setText("Gestion de reservation");
        jLabel11.setBounds(660, 270, 200, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel12.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(LEFT);
        jLabel12.setText("Gestion de Projecteur");
        jLabel12.setBounds(660, 340, 200, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        projecteur.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"projecteur.png"))); // NOI18N
        projecteur.setBounds(590, 340, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        ordinateur.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"ordinateur.png"))); // NOI18N
        ordinateur.setBounds(20, 130, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel13.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(LEFT);
        jLabel13.setText("Gestion d'ordinateur");
        jLabel13.setBounds(90, 130, 200, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        planingClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
               setVisible(false);
               PlaningClasse pc=new PlaningClasse(getBounds(),login1,password1);
               pc.setVisible(true);
                
            }
        });
        planingEnseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
               setVisible(false);
               PlaningEnseignant pe=new PlaningEnseignant(getBounds(),login1,password1);
               pe.setVisible(true);
                
            }
        });
        planingSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
               setVisible(false);
               PlaningSalle pe=new PlaningSalle(getBounds(),login1,password1);
               pe.setVisible(true);
                
            }
        });
        deconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                ConnectionInscription pe=new ConnectionInscription(getBounds());
                pe.setVisible(true);
                
            }
        });
        salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionSalle e=new view.Administrateur.GestionSalle(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        });
        etudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionEtudiant e=new view.Administrateur.GestionEtudiant(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        }); 
        enseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionEnseignant e=new view.Administrateur.GestionEnseignant(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        });
        classe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionClasse e=new view.Administrateur.GestionClasse(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        });
        formation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionFormation e=new view.Administrateur.GestionFormation(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        }); 
        parametre.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.ParametreAdministrateur e=new view.Administrateur.ParametreAdministrateur(login1,password1);
                e.setVisible(true);
                
            }
        }); 
        projecteur.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionProjecteur e=new view.Administrateur.GestionProjecteur(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        });
        ordinateur.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionOrdinateur e=new view.Administrateur.GestionOrdinateur(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        });
        reservation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionReservation e=new view.Administrateur.GestionReservation(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        });
        planing.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                setVisible(false);
                view.Administrateur.GestionPlaning e=new view.Administrateur.GestionPlaning(getBounds(),login1,password1);
                e.setVisible(true);
                
            }
        });
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------        
     
     } 
   
 
    private javax.swing.JButton classe;
    private javax.swing.JButton deconnection;
    private javax.swing.JButton enseignant;
    private javax.swing.JButton etudiant;
    private javax.swing.JButton formation;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton ordinateur;
    private javax.swing.JButton parametre;
    private javax.swing.JButton planing;
    private javax.swing.JButton planingClasse;
    private javax.swing.JButton planingEnseignant;
    private javax.swing.JButton planingSalle;
    private javax.swing.JButton projecteur;
    private javax.swing.JButton reservation;
    private javax.swing.JButton retour;
    private javax.swing.JButton salle;
    
    
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel titre;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    
                  
}
