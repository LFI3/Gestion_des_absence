
package view.Administrateur;


import static control.Verification.verifNotVide;
import static control.Verification.verifNotVideEtInt;
import static control.Verification.verifNotVideEtString;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import modele.Planing;



public class GestionPlaning extends TemplateGestion
{

    public GestionPlaning(Rectangle r,String login1,String password1) 
    {
        super(r);
        setTitle("Gestion de Planing");
        titre.setText("Gestion de Planing");
        label1.setText("Numero");
        label2.setText("Enseignant");
        label3.setText("Salle");
        label4.setText("Ordinateur");
        label5.setText("Projecteur");
        label6.setText("Classe");
        label7.setText("Formation");
        label8.setText("Date");
        label9.setText("Haure");
        
        table.setModel(Planing.afficher());
        
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
        supprimer. addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            supprimer();
            annuler();
        }
        }); 
        modifier.addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            modifier();
            annuler();
        }
        }); 
        ajouter.setVisible(false);
        annuler.setVisible(false);
        supprimer.setBounds(ajouter.getBounds());
       
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
        t9.setText(table.getModel().getValueAt(i,8).toString());
    	}
    	catch(Exception e)
    	{
    	    System.out.println();
    	}
    }
   public void annuler()
    {   t1.setEnabled(true);
        t2.setEnabled(true);
        t3.setEnabled(true);
        t4.setEnabled(true);
        t5.setEnabled(true);
    	t6.setEnabled(true);
        t7.setEnabled(true);
        t8.setEnabled(true);
        t9.setEnabled(true);
        
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
    } 
   
    public void supprimer()
    {
        if(verifNotVideEtInt(t1.getText(), "Numero"))
        {
            Planing.supprimer(parseInt(t1.getText()));
            table.setModel(Planing.afficher());
        }
    } 
 
    public void modifier() 
    {
        if (verifNotVideEtInt(t1.getText(), "numPlaning")&&
            verifNotVideEtInt(t2.getText(), "numEnseignant")&& 
            verifNotVideEtInt(t1.getText(), "numSalle")&&
            verifNotVideEtInt(t2.getText(), "numOrdinateur")&&
            verifNotVideEtInt(t3.getText(), "numProjecteur") &&
            verifNotVideEtInt(t4.getText(), "numClasse") &&
            verifNotVideEtInt(t5.getText(), "numFormation") &&
            verifNotVideEtString(t6.getText(), "date") &&
            verifNotVide(t7.getText(), "heure") 
            
           ) 
           {
               int numPlaning = Integer.parseInt(t1.getText());
               String numEnseignant=t2.getText();
               int numSalle = Integer.parseInt(t3.getText());
               int numOrdinateur = Integer.parseInt(t4.getText());
               int numProjecteur= Integer.parseInt(t5.getText());
               int numClasse= Integer.parseInt(t6.getText());
               int numFormation= Integer.parseInt(t7.getText());
               String date= t8.getText();
               String heure=t9.getText();
               
            Planing.modifier( numPlaning,numEnseignant,numSalle,numOrdinateur,numProjecteur,numClasse,numFormation,date, heure);
            table.setModel(Planing.afficher());
          }

    }
}
