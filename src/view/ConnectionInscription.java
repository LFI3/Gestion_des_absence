
package view;


import static control.Parametre.arrierePlan;
import static control.Parametre.cheminIcone;
import static control.Parametre.parti1;
import static control.Parametre.parti2;
import static control.Parametre.theme;
import static control.Verification.comboBoxSelectionner;
import static control.Verification.verifNotVide;
import static control.Verification.verifNotVideEtInt;
import static control.Verification.verifNotVideEtString;
import static java.awt.Color.LIGHT_GRAY;
import static java.awt.Color.WHITE;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.LEFT;
import static modele.Administrateur.ajouter;
import static modele.Administrateur.estAdministrateur;
import static modele.Administrateur.estNotAdministrateur;
import static modele.Classe.getNumero;
import static modele.Classe.nomClasse;
import static modele.Enseignant.ajouter;
import static modele.Enseignant.estEnseignant;
import static modele.Enseignant.estNotEnseignant;
import static modele.Etudiant.ajouter;
import static modele.Etudiant.estEtudiant;
import static modele.Etudiant.estNotEtudiant;



public class ConnectionInscription extends Fenetre 
{

    public ConnectionInscription(Rectangle r) 
    {
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        panelInscription = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        nomClasse = new javax.swing.JComboBox();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        login2 = new javax.swing.JTextField();
        password2 = new javax.swing.JPasswordField();
        nom2 = new javax.swing.JTextField();
        prenom2 = new javax.swing.JTextField();
        adresse2 = new javax.swing.JTextField();
        diplome2 = new javax.swing.JTextField();
        etudiant2 = new javax.swing.JRadioButton();
        enseignant2 = new javax.swing.JRadioButton();
        administrateur2 = new javax.swing.JRadioButton();
        inscrire = new javax.swing.JButton();
        cin2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        annuler2 = new javax.swing.JButton();
        panelConnection = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        login1 = new javax.swing.JTextField();
        password1 = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        enseignant1 = new javax.swing.JRadioButton();
        etudiant1 = new javax.swing.JRadioButton();
        administrateur1 = new javax.swing.JRadioButton();
        connecter = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        annuler1 = new javax.swing.JButton();
//------------------------------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        theme();
        setBounds(r);
        setTitle("Connection**Inscription");
//------------------------------------------------------------------------------        
        contenu.setBackground(arrierePlan);
        contenu.add(panelConnection);
        contenu.add(panelInscription);
 //------------------------------------------------------------------------------
        panelInscription.setBackground(parti2);
        panelInscription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelInscription.setBounds(270, 10, 730, 580);
        panelInscription.setLayout(null);
        panelInscription.add(jPanel3);
        panelInscription.add(jPanel8);
        panelInscription.add(jLabel7);
        panelInscription.add(jLabel11);
        panelInscription.add(annuler2);
        panelInscription.add(jPanel10);
        panelInscription.add(jPanel11);
        panelInscription.add(jPanel12);
        panelInscription.add(nomClasse);
        panelInscription.add(administrateur2);
        panelInscription.add(inscrire);
        panelInscription.add(cin2);
        panelInscription.add(jLabel2);
        panelInscription.add(jPanel14);
        panelInscription.add(jPanel15);
        panelInscription.add(jPanel16);
        panelInscription.add(prenom2);
        panelInscription.add(adresse2); 
        panelInscription.add(diplome2);
        panelInscription.add(etudiant2);
        panelInscription.add(enseignant2);
        panelInscription.add(jPanel17); 
        panelInscription.add(login2);
        panelInscription.add(password2);
        panelInscription.add(nom2);
        
//------------------------------------------------------------------------------
        panelConnection.setBackground(parti2);
        panelConnection.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        panelConnection.setBounds(10, 10, 250, 580);
        panelConnection.setLayout(null);
        panelConnection.add(jPanel6);
        panelConnection.add(login1);
        panelConnection.add(password1);
        panelConnection.add(jPanel2);
        panelConnection.add(connecter);
        panelConnection.add(jLabel16);
        panelConnection.add(annuler1);
        panelConnection.add(jPanel7);
        panelConnection.add(jLabel9);
        panelConnection.add(jLabel10);
        panelConnection.add(jPanel5);
//------------------------------------------------------------------------------        
        jPanel3.setBackground(parti1);
        jPanel3.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);
        jPanel3.add(jLabel3);
        jPanel3.setBounds(0, 0, 730, 40);
//------------------------------------------------------------------------------
        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(CENTER);
        jLabel3.setText("Inscription");
        jLabel3.setBounds(0, 0, 200, 40);
//------------------------------------------------------------------------------
         jPanel8.add(jLabel1);
         jPanel8.setBounds(20, 190, 220, 30);
         jPanel8.setLayout(null);
//------------------------------------------------------------------------------
        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("  Cin");
        jLabel1.setBounds(0, 0, 220, 30);
//------------------------------------------------------------------------------
        jPanel10.add(jLabel19);
        jPanel10.setBounds(20, 230, 220, 30);
        jPanel10.setLayout(null);
//------------------------------------------------------------------------------
        jLabel19.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(LEFT);
        jLabel19.setText("  Nom");
        jLabel19.setBounds(0, 0, 220, 30);
//------------------------------------------------------------------------------
        jPanel11.setBounds(20, 310, 220, 30);
        jPanel11.add(jLabel15);
        jPanel11.setLayout(null);
//------------------------------------------------------------------------------
        jLabel15.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(LEFT);
        jLabel15.setText("  Adresse");
        jLabel15.setBounds(0, 0, 220, 30);
//------------------------------------------------------------------------------
        jPanel12.add(jLabel21);
        jPanel12.setLayout(null); 
        jPanel12.setBounds(20, 470, 220, 30);
//------------------------------------------------------------------------------
        jLabel21.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(LEFT);
        jLabel21.setText("  Password");
        jLabel21.setBounds(0, 0, 220, 30);
//------------------------------------------------------------------------------
        nomClasse.setModel(new javax.swing.DefaultComboBoxModel(nomClasse()  ));
        nomClasse.setBounds(250, 390, 190, 30);
        nomClasse.setFont(new java.awt.Font("Yu Gothic Light", 1, 20));
        nomClasse.setMaximumRowCount(3);
        //nomClasse.setSelectedIndex(1);
//------------------------------------------------------------------------------
        jPanel14.setLayout(null);
        jPanel14.add(jLabel13);
        jPanel14.setBounds(20, 350, 220, 30);
//------------------------------------------------------------------------------        
        jLabel13.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(LEFT);
        jLabel13.setText("  Diplome");
        jLabel13.setBounds(0, 0, 220, 30);
//------------------------------------------------------------------------------
        jPanel15.add(jLabel20);
        jPanel15.setLayout(null);
        jPanel15.setBounds(20, 430, 220, 30);
//------------------------------------------------------------------------------        
        jLabel20.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(LEFT);
        jLabel20.setText("  Login");
        jLabel20.setBounds(0, 0, 220, 30);
//------------------------------------------------------------------------------
        jPanel16.setBounds(20, 270, 220, 30);  
        jPanel16.add(jLabel14);
        jPanel16.setLayout(null);
//------------------------------------------------------------------------------
        jLabel14.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(LEFT);
        jLabel14.setText("  Prenom");
        jLabel14.setBounds(0, 0, 220, 30);
//------------------------------------------------------------------------------
        jPanel17.setLayout(null);
        jPanel17.add(jLabel17);
        jPanel17.setBounds(20, 390, 220, 30);
//------------------------------------------------------------------------------
        jLabel17.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(LEFT);
        jLabel17.setText("  Nom de classe");
        jLabel17.setBounds(0, 0, 220, 30);
//------------------------------------------------------------------------------
        login2.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        login2.setHorizontalAlignment(CENTER);
        login2.setBounds(250, 430, 190, 30);
//------------------------------------------------------------------------------
        password2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password2.setHorizontalAlignment(CENTER);
        password2.setBounds(250, 470, 190, 30);
//------------------------------------------------------------------------------
        nom2.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        nom2.setHorizontalAlignment(CENTER);
        nom2.setBounds(250, 230, 190, 30);
//------------------------------------------------------------------------------
        prenom2.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        prenom2.setHorizontalAlignment(CENTER);
        prenom2.setBounds(250, 270, 190, 30);
//------------------------------------------------------------------------------
        adresse2.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        adresse2.setHorizontalAlignment(CENTER);
        adresse2.setBounds(250, 310, 190, 30);
//------------------------------------------------------------------------------
        diplome2.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        diplome2.setHorizontalAlignment(CENTER);
        diplome2.setBounds(250, 350, 190, 30);
//------------------------------------------------------------------------------
        etudiant2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        etudiant2.setText("Etudiant");
        etudiant2.setBounds(20, 140, 130, 40);
//------------------------------------------------------------------------------
        enseignant2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        enseignant2.setText("Enseignant");
        enseignant2.setBounds(160, 140, 150, 40);
//------------------------------------------------------------------------------
        administrateur2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        administrateur2.setText("Administrateur");
        administrateur2.setBounds(320, 140, 190, 40);
//------------------------------------------------------------------------------
        inscrire.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        inscrire.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"inscrire.png"))); // NOI18N
        inscrire.setBounds(20, 510, 60, 60);
//------------------------------------------------------------------------------
        cin2.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        cin2.setHorizontalAlignment(CENTER);
        cin2.setBounds(250, 190, 190, 30);
//------------------------------------------------------------------------------
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"adminX.png"))); // NOI18N
        jLabel2.setBounds(370, 50, 80, 80);
//------------------------------------------------------------------------------
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"etudiantX.png"))); // NOI18N
        jLabel7.setBounds(40, 50, 90, 80);
//------------------------------------------------------------------------------
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"enseignantX.png"))); // NOI18N
        jLabel11.setBounds(200, 50, 80, 80);
//------------------------------------------------------------------------------
        annuler2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        annuler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"annuler.png"))); // NOI18N
        annuler2.setBounds(100, 510, 60, 60);
//------------------------------------------------------------------------------
        jPanel6.setLayout(null);
        jPanel6.add(jLabel4);
        jPanel6.setBounds(60, 180, 180, 50);
//------------------------------------------------------------------------------
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(CENTER);
        jLabel4.setText("Password");
        jLabel4.setBounds(0, 0, 180, 50);
//------------------------------------------------------------------------------
        login1.setBounds(10, 120, 230, 50);
        login1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login1.setHorizontalAlignment(CENTER);
//------------------------------------------------------------------------------
        password1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password1.setHorizontalAlignment(CENTER);
        password1.setBounds(10, 240, 230, 50);
//------------------------------------------------------------------------------
        jPanel7.setLayout(null);
        jPanel7.setBounds(60, 60, 180, 50); 
        jPanel7.add(jLabel8);
//------------------------------------------------------------------------------
        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(CENTER);
        jLabel8.setText("Login");
        jLabel8.setBounds(0, 0, 180, 50);        
//------------------------------------------------------------------------------
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"login.png"))); // NOI18N
        jLabel10.setBounds(10, 60, 50, 50);
//------------------------------------------------------------------------------
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"password.png"))); // NOI18N
        jLabel9.setBounds(10, 180, 50, 50);
//------------------------------------------------------------------------------
        jPanel5.setBackground(parti1);
        jPanel5.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);
//------------------------------------------------------------------------------
        jLabel18.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(CENTER);
        jLabel18.setText("Connection");
        jLabel18.setBounds(0, 0, 210, 40);
//------------------------------------------------------------------------------
        jPanel5.add(jLabel18);
        jPanel5.setBounds(0, 0, 250, 40);
//------------------------------------------------------------------------------
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(enseignant1);
        jPanel2.add(etudiant1);
        jPanel2.add(administrateur1);
        jPanel2.setBounds(10, 340, 230, 160);
//------------------------------------------------------------------------------
        enseignant1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        enseignant1.setText("Enseignant");
        enseignant1.setBounds(20, 60, 190, 40);
//------------------------------------------------------------------------------
        etudiant1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        etudiant1.setText("Etudiant");
        etudiant1.setBounds(20, 10, 190, 40);
//------------------------------------------------------------------------------
        administrateur1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        administrateur1.setText("Administrateur");
        administrateur1.setBounds(20, 110, 189, 40);
//------------------------------------------------------------------------------
        connecter.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        connecter.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"connecter.png"))); // NOI18N
        connecter.setBounds(10, 510, 60, 60);
//------------------------------------------------------------------------------
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"annuler.png"))); // NOI18N
        jLabel16.setBounds(260, 560, 50, 80);
//------------------------------------------------------------------------------
        annuler1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        annuler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"annuler.png"))); // NOI18N
        annuler1.setBounds(90, 510, 60, 60);
//------------------------------------------------------------------------------
        buttonGroup11.add(administrateur1);
        buttonGroup11.add(enseignant1);
        buttonGroup11.add(etudiant1);
//------------------------------------------------------------------------------
        buttonGroup22.add(administrateur2);
        buttonGroup22.add(enseignant2);
        buttonGroup22.add(etudiant2);
//------------------------------------------------------------------------------
        annuler2tout();
//------------------------------------------------------------------------------
        administrateur2.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e) 
            {
                 annuler2();
                cin2.setEnabled(false);cin2.setBackground(LIGHT_GRAY);
                nom2.setEnabled(false);nom2.setBackground(LIGHT_GRAY);
                prenom2.setEnabled(false);prenom2.setBackground(LIGHT_GRAY);
                adresse2.setEnabled(false);adresse2.setBackground(LIGHT_GRAY);
                diplome2.setEnabled(false);diplome2.setBackground(LIGHT_GRAY);
                nomClasse.setEnabled(false);nomClasse.setBackground(LIGHT_GRAY);
                
                login2.setEnabled(true);login2.setBackground(WHITE);
                password2.setEnabled(true);password2.setBackground(WHITE);
           }
        });
//------------------------------------------------------------------------------
        enseignant2.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e) 
            {   
                 annuler2();
                cin2.setEnabled(true);cin2.setBackground(WHITE);
                nom2.setEnabled(true);nom2.setBackground(WHITE);
                prenom2.setEnabled(true);prenom2.setBackground(WHITE);
                adresse2.setEnabled(true);adresse2.setBackground(WHITE);
                diplome2.setEnabled(true);diplome2.setBackground(WHITE);
                login2.setEnabled(true);login2.setBackground(WHITE);
                password2.setEnabled(true);password2.setBackground(WHITE);
                
                nomClasse.setEnabled(false);nomClasse.setBackground(LIGHT_GRAY);
           }
        });       
//------------------------------------------------------------------------------
        etudiant2.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e) 
            {
                annuler2();
                nom2.setEnabled(true);nom2.setBackground(WHITE);
                prenom2.setEnabled(true);prenom2.setBackground(WHITE);
                adresse2.setEnabled(true);adresse2.setBackground(WHITE);
                nomClasse.setEnabled(true);nomClasse.setBackground(WHITE);
                login2.setEnabled(true);login2.setBackground(WHITE);
                password2.setEnabled(true);password2.setBackground(WHITE);
                diplome2.setEnabled(false);diplome2.setBackground(LIGHT_GRAY);
                cin2.setEnabled(false);cin2.setBackground(LIGHT_GRAY);
                
           }
        }); 
//------------------------------------------------------------------------------
        annuler1.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e) 
            {
                annuler1();
                buttonGroup11.clearSelection();
           }
        });     
//------------------------------------------------------------------------------
        annuler2.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e) 
            {
               annuler2();
              
            }
        }); 
//------------------------------------------------------------------------------
        inscrire.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e) 
            {
               if(etudiant2.isSelected()){AjouterEtudiant();}
               else if(enseignant2.isSelected()){AjouterEnseignant();}
               else if(administrateur2.isSelected()){AjouterAdministrateur();}    
               
            }
        }); 
//------------------------------------------------------------------------------
        connecter.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e) 
            {
               if(login1.getText().length()==0)
               {
                  JOptionPane jop = new JOptionPane();
                    showMessageDialog( null,"Le champ 'Login' est vide");
               }      
               else if(password1.getText().length()==0)
               {
                  JOptionPane jop = new JOptionPane();
                    showMessageDialog( null,"Le champ 'password' est vide");
               }
               else if(!etudiant1.isSelected()&& !enseignant1.isSelected()&&!administrateur1.isSelected())
               {
                  JOptionPane jop = new JOptionPane();
                    showMessageDialog( null,"Choisir votre responsabilite !");
               } 
               else if(etudiant1.isSelected()){connecterEtudiant();}
               else if(enseignant1.isSelected()){connecterEnseignant();}
               else if(administrateur1.isSelected()){connecterAministrateur();}
               
            }
        });
}
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
public  void annuler2()
{
                cin2.setText("");
                nom2.setText("");
                prenom2.setText("");
                adresse2.setText("");
                login2.setText("");
                nomClasse.setSelectedIndex(0);
                password2.setText("");
                diplome2.setText("");
    }
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
public void annuler1()
{
                login1.setText("");
                password1.setText("");
}
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
public void annuler2tout()
{
                cin2.setEnabled(false);cin2.setBackground(LIGHT_GRAY);
                nom2.setEnabled(false);nom2.setBackground(LIGHT_GRAY);
                prenom2.setEnabled(false);prenom2.setBackground(LIGHT_GRAY);
                adresse2.setEnabled(false);adresse2.setBackground(LIGHT_GRAY);
                diplome2.setEnabled(false);diplome2.setBackground(LIGHT_GRAY);
                nomClasse.setEnabled(false);nomClasse.setBackground(LIGHT_GRAY);
                login2.setEnabled(false);login2.setBackground(LIGHT_GRAY);
                password2.setEnabled(false);password2.setBackground(LIGHT_GRAY);
                 buttonGroup22.clearSelection();
}
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
public void AjouterEtudiant()
{
          if(verifNotVideEtString(nom2.getText(),"Nom")&&
             verifNotVideEtString(prenom2.getText(),"Prenom")&&
             verifNotVideEtString(adresse2.getText(),"Adresse")&&
             comboBoxSelectionner(nomClasse.getSelectedIndex(), "Classe")&&
             verifNotVide(login2.getText(),"Login")&&
             verifNotVide(password2.getText(),"Password")
            )
            {
             if(estNotEtudiant(login2.getText(), password2.getText()))
              {
                ajouter(nom2.getText(), prenom2.getText(), adresse2.getText(), getNumero((String)nomClasse.getSelectedItem()), login2.getText(), password2.getText());
              setVisible(false);
              view.Etudiant.Etudiant e= new view.Etudiant.Etudiant(getBounds(),login1.getText(), password1.getText());
              }
             else
             {
               annuler2tout();
             }
            }
}
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
public void AjouterEnseignant()
{
          if(verifNotVideEtInt(cin2.getText(),"Cin")&&
             verifNotVideEtString(nom2.getText(),"Nom")&&
             verifNotVideEtString(prenom2.getText(),"Prenom")&&
             verifNotVideEtString(adresse2.getText(),"Adresse")&&
             verifNotVideEtString(diplome2.getText(),"Diplome")&&     
             verifNotVide(login2.getText(),"Login")&&
             verifNotVide(password1.toString(),"Password")
             
            )
            {
             if(estNotEnseignant(login2.getText(), password2.getText()))
              {   
                
              ajouter(cin2.getText(),nom2.getText(), prenom2.getText(), adresse2.getText(), diplome2.getText(),"non" ,login2.getText(), password2.getText());
              setVisible(false);
              view.Enseignant.Gestion e= new view.Enseignant.Gestion (getBounds(),login2.getText(),password2.getText());
               }
             else
             {
               annuler2tout();
             }
            }
}              
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
public void AjouterAdministrateur()
{
          if(     
             verifNotVide(login2.getText(),"Login")&&
             verifNotVide(password2.toString(),"Password")
             )
           
          {
            if(estNotAdministrateur(login2.getText(), password2.getText()))
              {
                ajouter(login2.getText(), password2.getText());
              setVisible(false);
              view.Administrateur.Gestion e= new view.Administrateur.Gestion(getBounds(),login2.getText(),password2.getText());
              }
            else
             {
               annuler2tout();
             }
          }
}              
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------              
public void connecterEtudiant()
{
      if(estEtudiant(login1.getText(), password1.getText()))
       {
              setVisible(false);
              view.Etudiant.Etudiant e= new view.Etudiant.Etudiant(getBounds(),login1.getText(), password1.getText());
              e.setVisible(true);
       }
      
}              
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
public void connecterEnseignant()
{
     if(estEnseignant(login1.getText(), password1.getText()))
       {
              setVisible(false);
              view.Enseignant.Gestion e= new view.Enseignant.Gestion(getBounds(),login1.getText(), password1.getText());
              e.setVisible(true);
       }
       
  
}              
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
public void connecterAministrateur()
{
     if(estAdministrateur(login1.getText(), password1.getText()))
       {
              setVisible(false);
              view.Administrateur.Gestion e= new view.Administrateur.Gestion(getBounds(),login1.getText(),password1.getText());
              e.setVisible(true);
       }
      
}              
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
       
    private javax.swing.JRadioButton administrateur1;
    private javax.swing.JRadioButton administrateur2;
    private javax.swing.JRadioButton enseignant1;
    private javax.swing.JRadioButton enseignant2;
    private javax.swing.JRadioButton etudiant1;
    private javax.swing.JRadioButton etudiant2;
    
    private javax.swing.JTextField adresse2;
    private javax.swing.JTextField diplome2;
    private javax.swing.JTextField prenom2;
    private javax.swing.JTextField login1;
    private javax.swing.JTextField login2;
    private javax.swing.JTextField nom2;
    private javax.swing.JTextField cin2;
    
    private javax.swing.JButton annuler1;
    private javax.swing.JButton annuler2;
    private javax.swing.JButton connecter;
    private javax.swing.JButton inscrire;
    
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup22;
    
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel panelConnection;
    private javax.swing.JPanel panelInscription;
    private javax.swing.JComboBox nomClasse;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    
    // End of variables declaration                   
}
