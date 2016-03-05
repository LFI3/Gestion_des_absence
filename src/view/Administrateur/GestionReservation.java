
package view.Administrateur;

import control.Verification;
import static control.Verification.verifNotVide;
import static control.Verification.verifNotVideEtInt;
import static control.Verification.verifNotVideEtString;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modele.Enseignant;
import modele.Etudiant;
import modele.Planing;
import modele.Reservation;
import static modele.Reservation.afficher;
import modele.Salle;


public class GestionReservation extends TemplateGestion
{

    public GestionReservation(Rectangle r,String login1,String password1) 
    {
        super(r);
        setTitle("Gestion de Reservation");
        titre.setText("Gestion de Reservation");
        label1.setText("Numero");
        label2.setText("Enseignant");
        label3.setText("Salle");
        label4.setText("Portable");
        label5.setText("Projecteur");
        label6.setText("Classe");
        label7.setText("Formation");
        label8.setText("Date");
        label9.setText("Heure");
        
        
        
        table.setModel(Reservation.afficher());
        
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
            t2.setEnabled(false);
            t3.setEnabled(false);
            t4.setEnabled(false);
            t5.setEnabled(false);
            t6.setEnabled(false);
            t7.setEnabled(false);
            t8.setEnabled(false);
            t9.setEnabled(false);
        }
         });
       annuler. addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            annuler();
        }
         });
       
       supprimer. addMouseListener(new java.awt.event.MouseAdapter() 
        {public void mouseClicked(java.awt.event.MouseEvent e) 
        {
            supprimer();
            annuler();
        }
        }); 
       modifier.setVisible(false);
       annuler.setBounds(supprimer.getBounds());
       supprimer.setBounds(modifier.getBounds());
       ajouter.setText("Accepter");
       ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
       public void mouseClicked(java.awt.event.MouseEvent e) {
                accepter();
                annuler();
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
        t9.setText(table.getModel().getValueAt(i,8).toString());
    	}
    	catch(Exception e)
    	{
    	    out.println();
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
            Reservation.supprimer(parseInt(t1.getText()));
            table.setModel(afficher());
        }
       
    } 
    public void accepter()
    {
        if(verifNotVideEtInt(t1.getText(), "Numero de Reservation")&&
           verifNotVideEtInt(t2.getText(), "Numero d'enseignant")&&
           verifNotVideEtInt(t3.getText(), "Numero de salle")&&
           verifNotVideEtInt(t4.getText(), "Numero d'ordinateur")&&
           verifNotVideEtInt(t5.getText(), "Numero de projecteur")&& 
           verifNotVideEtInt(t6.getText(), "Numero de classe")&&
           verifNotVideEtInt(t7.getText(), "Numero de formation")&&
           verifNotVideEtString(t8.getText(), "Date")&&
           verifNotVide(t9.getText(), "Heure")
          )
        {
         if(Planing.reservationValide(
                 t2.getText(),
                 parseInt(t3.getText()),
                 parseInt(t4.getText()),
                 parseInt(t5.getText()),
                 parseInt(t6.getText()),
                 parseInt(t7.getText()),
                 t8.getText(),
                 t9.getText()) 
           )
         {
                 Reservation.accepter(parseInt(t1.getText()),
                                  t2.getText(),
                                  parseInt(t3.getText()),
                                  parseInt(t4.getText()),
                                  parseInt(t5.getText()),
                                  parseInt(t6.getText()),
                                  parseInt(t7.getText()),
                                  t8.getText(),
                                  t9.getText()
                                  );
                                  table.setModel(afficher());
         }
         else
         {
             JOptionPane jop = new JOptionPane();
             jop.showMessageDialog(null, " Reservation non valide ");

         }
        }
       
    } 
}
