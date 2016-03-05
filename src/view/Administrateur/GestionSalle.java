
package view.Administrateur;

import control.Verification;
import static control.Verification.verifNotVideEtInt;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modele.Salle;
import static modele.Salle.afficher;


public class GestionSalle extends TemplateGestion
{

    public GestionSalle(Rectangle r,String login1,String password1) 
    {
        super(r);
        titre.setText("Gestion de Salle");
        label1.setText("Numero");
        label2.setText("Capacite");
        
        pan3.setVisible(false);t3.setVisible(false);
        pan4.setVisible(false);t4.setVisible(false);
        pan5.setVisible(false);t5.setVisible(false);
        pan6.setVisible(false);t6.setVisible(false);
        pan7.setVisible(false);t7.setVisible(false);
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
        ajouter. addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            ajouter();
        }
        });
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
    	}
    	catch(Exception e)
    	{
    	    out.println();
    	}
    }
   public void annuler()
    {
    	t1.setText("");
        t1.setEnabled(true);
        t2.setText("");
    } 
    public void modifier()
    {
        if(verifNotVideEtInt(t2.getText(), "capacite"))
        {
            Salle.modifier(parseInt(t1.getText()),parseInt(t2.getText()));
            table.setModel(afficher());
        }
       
    } 
    public void ajouter()
    {
        if(verifNotVideEtInt(t2.getText(), "capacite"))
        {
            Salle.ajouter(parseInt(t1.getText()),parseInt(t2.getText()));
            table.setModel(afficher());
        }
       
    } 
    public void supprimer()
    {
        if(verifNotVideEtInt(t2.getText(), "capacite"))
        {
            Salle.supprimer(parseInt(t1.getText()));
            table.setModel(afficher());
        }
       
    } 
}
