
package view.Enseignant;

import control.Parametre;
import static control.Parametre.fenetre;
import static control.Parametre.parti1;
import static control.Parametre.parti2;
import static control.Parametre.theme1;
import static control.Parametre.theme11;
import static control.Parametre.theme2;
import static control.Parametre.theme22;
import static control.Parametre.theme3;
import static control.Parametre.theme33;
import static control.Parametre.theme4;
import static control.Parametre.theme44;
import static control.Verification.estVide;
import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.SwingConstants.CENTER;
import modele.Enseignant;
import static modele.Enseignant.informationEnseignant;
import static modele.Enseignant.modifier;
import modele.Theme;
import static modele.Theme.modifier;
import static view.Enseignant.PlaningEnseignant.info;

public class ParametreEnseignant extends javax.swing.JFrame 
{

    public  String[] info=new String[8];
    public String login1;
    public String password1;
    public ParametreEnseignant(Rectangle r,String login1,String password1)
    
    {
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        diplome = new javax.swing.JLabel();
        cin = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        newPassword = new javax.swing.JPasswordField();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        oldPassword = new javax.swing.JPasswordField();
        validerPassword = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        validerTheme = new javax.swing.JButton();
        combo = new javax.swing.JComboBox();
        info=informationEnseignant(login1, password1);
        this.login1=login1;
        this.password1=password1;
//------------------------------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(panel1);
        setBounds(200,100,798,490);
        setResizable(false);
//------------------------------------------------------------------------------
        panel1.setBackground(WHITE);
        panel1.setBounds(0, 0, 780, 460);
        panel1.setLayout(null); 
        panel1.add(panel2);
        panel1.add(jPanel1);
        panel1.add(jPanel3);
        panel1.add(jPanel5);
//------------------------------------------------------------------------------
        panel2.setBackground(BLACK);
        panel2.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 780, 40);
        panel2.add(jLabel1);
//------------------------------------------------------------------------------
        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(CENTER);
        jLabel1.setText("Parametre");
        jLabel1.setBounds(240, 0, 230, 40);
//------------------------------------------------------------------------------        
        jPanel1.setBackground(parti2);
        jPanel1.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);
        jPanel1.add(jPanel2);
//------------------------------------------------------------------------------
        jPanel2.setBackground(parti1);
        jPanel2.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(51, 51, 0));
        jPanel2.setLayout(null);
        jPanel2.add(jLabel4);
        jPanel2.setBounds(0, 0, 320, 40);
//------------------------------------------------------------------------------
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(CENTER);
        jLabel4.setText("Profile");
        jLabel4.setBounds(20, 0, 230, 40);
//------------------------------------------------------------------------------
        jPanel12.setBounds(10, 250, 160, 50);
        jPanel12.add(jLabel10);
        jPanel12.setLayout(null);
//------------------------------------------------------------------------------
        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(CENTER);
        jLabel10.setText("Adresse");
        jLabel10.setBounds(0, 0, 140, 50);
//------------------------------------------------------------------------------
        jPanel1.add(jPanel12);
        jPanel1.add(jPanel16);
        jPanel1.add(jPanel17);
//------------------------------------------------------------------------------       
        jPanel16.setBounds(10, 320, 160, 50);
        jPanel16.add(jLabel11);
        jPanel16.setLayout(null);
//------------------------------------------------------------------------------
        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(CENTER);
        jLabel11.setText("Diplome");
        jLabel11.setBounds(0, 0, 140, 50);
//------------------------------------------------------------------------------
        jPanel17.setLayout(null);
        jPanel17.add(jLabel16);
        jPanel17.setBounds(10, 70, 160, 50);
//------------------------------------------------------------------------------
        jLabel16.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(CENTER);
        jLabel16.setText("Cin");
        jLabel16.setBounds(0, 0, 80, 50);
//------------------------------------------------------------------------------
        jPanel18.setLayout(null);
        jPanel18.add(jLabel17);
        jPanel18.setBounds(10, 130, 160, 50);
//------------------------------------------------------------------------------
        jLabel17.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(CENTER);
        jLabel17.setText("Prenom");
        jLabel17.setBounds(0, 0, 130, 50);
//------------------------------------------------------------------------------
        jPanel1.add(jPanel18);
        jPanel1.add(jPanel19);
        jPanel1.add(diplome); 
        jPanel1.add(cin); 
        jPanel1.add(prenom);
        jPanel1.add(nom);
        jPanel1.add(adresse); 
        jPanel1.setBounds(0, 50, 320, 400);
//------------------------------------------------------------------------------
        jPanel19.setLayout(null);
        jPanel19.add(jLabel18);
        jPanel19.setBounds(10, 190, 160, 50);
//------------------------------------------------------------------------------
        jLabel18.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(CENTER);
        jLabel18.setText("Nom");
        jLabel18.setBounds(0, 0, 90, 50);
//------------------------------------------------------------------------------
        diplome.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        diplome.setHorizontalAlignment(CENTER);
        diplome.setBounds(170, 320, 140, 50);
        diplome.setText(info[3]);
//------------------------------------------------------------------------------
        cin.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        cin.setHorizontalAlignment(CENTER);
        cin.setBounds(170, 70, 140, 50);
        cin.setText(info[0]);
//------------------------------------------------------------------------------
        prenom.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        prenom.setHorizontalAlignment(CENTER);
        prenom.setBounds(170, 130, 140, 50);
        prenom.setText(info[2]);
//------------------------------------------------------------------------------
        nom.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        nom.setHorizontalAlignment(CENTER);
        nom.setBounds(170, 190, 140, 50);
        nom.setText(info[1]);
//------------------------------------------------------------------------------
        adresse.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        adresse.setHorizontalAlignment(CENTER);
        adresse.setBounds(170, 250, 140, 50);
        adresse.setText(info[4]);
//------------------------------------------------------------------------------
        jPanel3.setBackground(parti2);
        jPanel3.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null); 
        jPanel3.add(jPanel4);
        jPanel3.add(jPanel8);
        jPanel3.add(jPanel9);
        jPanel3.add(login);
        jPanel3.add(newPassword); 
        jPanel3.add(jPanel10);
        jPanel3.add(oldPassword);
        jPanel3.add(validerPassword); 
        jPanel3.setBounds(330, 50, 450, 230);
//------------------------------------------------------------------------------
        jPanel4.setBackground(parti1);
        jPanel4.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);      
        jPanel4.add(jLabel6);
        jPanel4.setBounds(0, 0, 450, 40);
//------------------------------------------------------------------------------
        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(CENTER);
        jLabel6.setText("Changer password ");
        jLabel6.setBounds(0, 0, 400, 40);
//------------------------------------------------------------------------------
        jPanel8.setBounds(20, 50, 200, 30);
        jPanel8.add(jLabel7);
        jPanel8.setLayout(null);
//------------------------------------------------------------------------------
        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(CENTER);
        jLabel7.setText("Login");
        jLabel7.setBounds(0, 0, 90, 30);
//------------------------------------------------------------------------------
        jPanel9.setLayout(null);
        jPanel9.add(jLabel8);
        jPanel9.setBounds(20, 130, 200, 30);
//------------------------------------------------------------------------------
        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(CENTER);
        jLabel8.setText("New Password");
        jLabel8.setBounds(0, 0, 170, 30);
//------------------------------------------------------------------------------
        login.setBounds(250, 50, 150, 30);
        oldPassword.setBounds(250, 90, 150, 30);
        newPassword.setBounds(250, 130, 150, 30);
//------------------------------------------------------------------------------
        jPanel10.setLayout(null);
        jPanel10.setBounds(20, 90, 200, 30);
        jPanel10.add(jLabel9);
//------------------------------------------------------------------------------
        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(CENTER);
        jLabel9.setText("Old Password");
        jLabel9.setBounds(0, 0, 170, 30);
//------------------------------------------------------------------------------
        validerPassword.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        validerPassword.setText("Valider");
        validerPassword.setBorder(null);
        validerPassword.setBounds(110, 170, 220, 40);
//------------------------------------------------------------------------------
        jPanel5.setBackground(parti2);
        jPanel5.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);
        jPanel5.add(validerTheme);
        jPanel5.add(combo);
        jPanel5.setBounds(330, 290, 450, 160); 
        jPanel5.add(jPanel6);
//------------------------------------------------------------------------------
        jPanel6.setBackground(parti1);
        jPanel6.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null); 
        jPanel6.add(jLabel5);
        jPanel6.setBounds(0, 0, 450, 40);
//------------------------------------------------------------------------------
        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(CENTER);
        jLabel5.setText("Choisir votre Theme ");
        jLabel5.setBounds(80, 0, 250, 40);
//------------------------------------------------------------------------------
        validerTheme.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        validerTheme.setText("Valider");
        validerTheme.setBorder(null);
        validerTheme.setBounds(100, 110, 220, 40);
//------------------------------------------------------------------------------
        combo.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "theme 1 classique", "theme 2 classique", "theme 3 classique", "theme 4 classique" ,"theme 1 moderne", "theme 2 moderne", "theme 3 moderne", "theme 4 moderne"}));
        combo.setBounds(100, 60, 220, 40);
//------------------------------------------------------------------------------
        validerTheme.addActionListener(new ActionListener() 
        {  public void actionPerformed(ActionEvent e) 
            {
               if(combo.getSelectedIndex()==-1)
                {
                  JOptionPane jop = new JOptionPane();
                    showMessageDialog( null,"Choisir votre theme !");
                }
               else
                {
                    switch(combo.getSelectedIndex())
                    {
                       case 0:theme1();modifier("theme1");break;
                        case 1:theme2();modifier("theme2");break;
                        case 2:theme3();modifier("theme3");break;
                        case 3:theme4();modifier("theme4");break;
                        case 4:theme11();modifier("theme11");break;
                        case 5:theme22();modifier("theme22");break;
                        case 6:theme33();modifier("theme33");break;
                        case 7:theme44();modifier("theme44");break;
                    }
                   ouvrirGestion(password1);
                } 
            }
        });
//------------------------------------------------------------------------------        
        validerPassword.addActionListener(new ActionListener() 
        {@SuppressWarnings("UnusedAssignment")
  public void actionPerformed(ActionEvent e) 
            {
              if(estVide(login.getText())) 
              {JOptionPane jop = new JOptionPane();showMessageDialog( null,"Login est vide!");}
              
              else if(estVide(oldPassword.getText())) 
               {JOptionPane jop = new JOptionPane();showMessageDialog( null,"old Password est vide!");}
              
              else if(estVide(newPassword.getText())) 
              {JOptionPane jop = new JOptionPane();showMessageDialog( null,"new Password est vide!");}
              
              else if(!login.getText().equals(info[6])) 
              {JOptionPane jop = new JOptionPane();showMessageDialog( null,"Login est incorrecte!");}
              
              else if(!oldPassword.getText().equals(info[7])) 
              {JOptionPane jop = new JOptionPane();showMessageDialog( null,"old Password est incorrecte!");}
              
              else
              {
                  
                    modifier(info[0], info[1], info[2], info[3], info[4], info[5], info[6],newPassword.getText() );
                  ouvrirGestion(newPassword.getText());
              }
            }
        });
       
}
public void ouvrirGestion(String password)
{ 
   setVisible(false);
   view.Enseignant.Gestion g=new view.Enseignant.Gestion(fenetre,login1,password);
   g.setVisible(true);
}
    
    
    private javax.swing.JLabel adresse;
    private javax.swing.JLabel cin;
    private javax.swing.JComboBox combo;
    private javax.swing.JLabel diplome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JLabel nom;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel prenom;
    private javax.swing.JButton validerPassword;
    private javax.swing.JButton validerTheme;
    // End of variables declaration                   
}
