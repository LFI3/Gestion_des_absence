

package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class Reservation 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(String numEnseignant,int numSalle,int numPortable,int numProjecteur,int numClasse,int numFormation,String date,String heure)
{
    	try
   	{
   	String r="insert into reservation (numEnseignant,numSalle,numPortable,numProjecteur,numClasse,numFormation,date,heure) VALUES (?,?,?,?,?,?,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
        ps.setString(1, numEnseignant);
	ps.setInt(2, numSalle);
        ps.setInt(3, numPortable);
        ps.setInt(4, numProjecteur);
        ps.setInt(5, numClasse);
        ps.setInt(6, numFormation);
        ps.setString(7, date);
        ps.setString(8, heure);
        ps.executeUpdate();
        JOptionPane jop = new JOptionPane();
        showMessageDialog(null, "Reservation ajoutée");
        
   	}
   	catch(Exception e)
    	{ 
   	    JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'Ajouter' !");
	    out.println(e);
	}
}
//------------------------------------------------------------------------------
public static DefaultTableModel afficher()
{  
      
       String[] col={"numReservation","numEnseignant","numSalle","numPortable","numProjecteur","numClasse","numFormation","date","heure"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       
       String numEnseignant;
       int numReservation;
       int numSalle;
       int numPortable;
       int numProjecteur;
       int numClasse;
       int numFormation;
       String date;
       String heure;
       row=null;
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM reservation ");
        while(r.next())
   	{
        numReservation = r.getInt("numReservation");
	numEnseignant=r.getString("numEnseignant");
	numSalle=r.getInt("numSalle");
        numPortable=r.getInt("numPortable");
        numProjecteur=r.getInt("numProjecteur");
        numClasse=r.getInt("numClasse");
        numFormation=r.getInt("numFormation");
        date=r.getString("date");
        heure=r.getString("heure");
       
        Object[] tab ={numReservation,numEnseignant,numSalle,numPortable,numProjecteur,numClasse,numFormation,date,heure};
        m.addRow(tab);
   	} 
        }
   	catch(Exception e)
        { 
        JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'affiche JTable' !");
	    out.println(e);
        }
        return m;
}
//------------------------------------------------------------------------------
public static int nombreReservation()
    {  
       ResultSet r;
        int nb=0;
        try
   	{
            r= con.getS().executeQuery("SELECT count(*) FROM reservation");
            r.next();
            nb=r.getInt(1);
       } 
        
       catch(Exception e){ out.println(e);}
       return nb;
    } 
//------------------------------------------------------------------------------
public static void  supprimer(int numReservation)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from reservation  where numReservation="+numReservation+" ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'supprimer' !");
	    out.println(e);
	}
    }
//------------------------------------------------------------------------------
public static void  accepter(int numReservation,String numEnseignant,int numSalle,int numOrdinateur, int numProjecteur,int numClasse,int numFormation,String date,String heure)
     { 
       
        Planing.ajouter(numEnseignant,numSalle,numOrdinateur, numProjecteur ,numClasse, numFormation, date, heure); 
        supprimer(numReservation);
    }
}
