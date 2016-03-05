
package view.Enseignant;




import control.Parametre;
import static control.Parametre.arrierePlan;
import static control.Parametre.cheminIcone;
import static control.Parametre.parti1;
import static control.Parametre.parti2;
import java.awt.Rectangle;
import static javax.swing.BorderFactory.createEtchedBorder;
import static javax.swing.SwingConstants.CENTER;
import static modele.Enseignant.afficherClasse;
import static modele.Enseignant.afficherFormation;
import static modele.Enseignant.afficherSalle;
import static modele.Enseignant.informationEnseignant;
import view.ConnectionInscription;
import view.Fenetre;

public class PlaningEnseignant extends Fenetre 

{   public static String[] info=new String[8];
    
    public PlaningEnseignant(Rectangle r,String login, String password) 
    {
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nomEnseignant = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox();
        tp = new view.TemplatePlaning();
        deconnection = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        info=informationEnseignant(login, password);
        
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------        
          contenu.add(jPanel1);
        contenu.add(jPanel3);
        contenu.add(tp);
        contenu.add(panel);
        contenu.setBackground(arrierePlan);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
          setTitle("Planing d'enseignant");
          setBounds(r);
          
                  panel.setBackground(parti2);
        panel.setBounds(10, 10, Parametre.x - 30, 80);
        panel.setLayout(null);
        panel.add(retour);
        panel.add(deconnection);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jPanel1.setBackground(parti2);
        jPanel1.setBorder(createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(null);
        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(CENTER);
        jLabel1.setText("Nom de enseignant");
        jPanel1.add(jLabel1);
        jPanel1.add(nomEnseignant);
        jPanel1.setBounds((Parametre.x - 850) / 2, 100, 420, 130);
        jLabel1.setBounds(10, 50, 170, 40);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        nomEnseignant.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        nomEnseignant.setBounds(190, 50, 220, 40);
        nomEnseignant.setText(info[0]+" "+info[1]+" "+info[2]);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jPanel3.setBackground(parti2);
        jPanel3.setBorder(createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(null);
        jPanel3.add(jLabel4);
        jPanel3.add(combo2); 
        jPanel3.setBounds((Parametre.x - 850) / 2 + 430, 100, 420, 130);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(CENTER);
        jLabel4.setText("Contenu");
        jLabel4.setBounds(10, 50, 130, 40);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        combo2.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        combo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"classe", "formation", "salle" }));
        combo2.setBounds(160, 50, 220, 40);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        tp.setBackground(new java.awt.Color(255, 255, 255));
        tp.setBounds((Parametre.x - 850) / 2, 240, 850, 270);
        tp.changer(parti1, parti2);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        deconnection.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"deconnecter.png"))); // NOI18N
        deconnection.setBounds(80, 10, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        retour.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"retour.png"))); // NOI18N
        retour.setBounds(10, 10, 60, 60);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------   
     deconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                ConnectionInscription pe=new ConnectionInscription(getBounds());
                pe.setVisible(true);
            }
        });   
    combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficher();
            }
        }); 
   retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                view.Enseignant.Gestion g=new view.Enseignant.Gestion(getBounds(),login,password);
                g.setVisible(true);
            }
        }); 
   
   
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------        
    
    }
  
  
    private void afficher()
    {                                       
        String cin=info[0];
        if(combo2.getSelectedItem().toString().equals("classe"))
        {
           tp.remplire(afficherClasse(cin));
        }
        if(combo2.getSelectedItem().toString().equals("salle"))
        {
           tp.remplire(afficherSalle(cin));
        }
        if(combo2.getSelectedItem().toString().equals("formation"))
        {
            tp.remplire(afficherFormation(cin));
        }
    }                                      
                                       


   
    private javax.swing.JComboBox combo2;
    private javax.swing.JButton deconnection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton retour;
    private javax.swing.JPanel panel;
    private view.TemplatePlaning tp;
    private javax.swing.JLabel nomEnseignant;
    // End of variables declaration                   
}
