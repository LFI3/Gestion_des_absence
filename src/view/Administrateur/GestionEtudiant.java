
package view.Administrateur;

import control.Verification;
import static control.Verification.verifNotVideEtInt;
import static control.Verification.verifNotVideEtString;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modele.Enseignant;
import modele.Etudiant;
import static modele.Etudiant.afficher;
import modele.Salle;


public class GestionEtudiant extends TemplateGestion
{

    public GestionEtudiant(Rectangle r,String login1,String password1) 
    {
        super(r);
        setTitle("Gestion d'Etudiant");
        titre.setText("Gestion d'Etudiant");
        label1.setText("Numero");
        label2.setText("Nom");
        label3.setText("Prenom");
        label4.setText("Adresse");
        label5.setText("NumClasse");
        label6.setText("Login");
        label7.setText("password");
        
        pan8.setVisible(false);t8.setVisible(false);
        pan9.setVisible(false);t9.setVisible(false); 
        table.setModel(afficher());
        
        retour.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) 
        {
           setVisible(false);
           view.Administrateur.Gestion g=new view.Administrateur.Gestion(getBounds(),login1,password1);
           g.setVisible(true);
           
        }
        });
        deconnecter.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) 
        {
           setVisible(false);
           view.ConnectionInscription g=new view.ConnectionInscription(getBounds());
           g.setVisible(true);
           
        }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            deplacer(table.getSelectedRow());
            t1.setEnabled(false);
            t6.setEnabled(false);
            t7.setEnabled(false);
        }
         });
       annuler. addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            annuler();
        }
         });
       modifier. addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            modifier();
        }
         });
        ajouter.setEnabled(false);
        supprimer. addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            supprimer();
        }
        }); 
    }
    
   public void deplacer(int i)
    {
    	try
    	{
    	t1.setText(table.getModel().getValueAt(i,0).toString());
    	t2.setText(table.getModel().getValueAt(i,1).toString());
        t3.setText(table.getModel().getValueAt(i,2).toString());
        t4.setText(table.getModel().getValueAt(i,3).toString());
        t5.setText(table.getModel().getValueAt(i,4).toString());
        t6.setText(table.getModel().getValueAt(i,5).toString());
        t7.setText(table.getModel().getValueAt(i,6).toString());
        t8.setText(table.getModel().getValueAt(i,7).toString());
    	}
    	catch(Exception e)
    	{
    	    out.println();
    	}
    }
   public void annuler()
    {   t1.setEnabled(true);
    	t6.setEnabled(true);
        t7.setEnabled(true);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
       
    } 
    public void modifier()
    {
        if(verifNotVideEtString(t2.getText(), "Nom")&&
           verifNotVideEtString(t3.getText(), "Prenom")&&
           verifNotVideEtString(t4.getText(), "Adresse")&&
           verifNotVideEtInt(t5.getText(), "Classe")
          )
        {
            Etudiant.modifier(parseInt(t1.getText()),
                                t2.getText(),
                                t3.getText(), 
                                t4.getText(),
                                parseInt(t5.getText()),
                                t6.getText(), 
                                t7.getText()
                             );
            table.setModel(afficher());
        }
       
    } 
   
    public void supprimer()
    {
        if(verifNotVideEtInt(t1.getText(), "Numero"))
        {
            Etudiant.supprimer(parseInt(t1.getText()));
            table.setModel(afficher());
        }
       
    } 
}
