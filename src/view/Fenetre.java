
package view;

import control.Parametre;
import static control.Parametre.arrierePlan;
import static control.Parametre.fenetre;
import static control.Parametre.x;
import static control.Parametre.y;
import java.awt.Color;
import javax.swing.*;
import view.Administrateur.Gestion;



public class Fenetre extends JFrame  
{
    public JPanel contenu;
    
    public Fenetre()
    { 
      this.setVisible(true);
      this.setBounds(fenetre);
      this.setLayout(null);
      this.setResizable(true);
      this.setTitle("Fenetre");
      this.setResizable(false);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      contenu=new JPanel();
      contenu.setLayout(null);
      contenu.setSize(x, y);
      contenu.setBackground(arrierePlan);
      contenu.setVisible(true);
      add(contenu);
     
   }
   
   
}
