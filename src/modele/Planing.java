

package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import static modele.Enseignant.con;


public class Planing 
{

public static  Connexion con=new Connexion();
//------------------------------------------------------------------------------
public static  void ajouter(String numEnseignant,int numSalle,int numOrdinateur, int numProjecteur,int numClasse ,int numFormation,String date,String heure)
{
    	try
   	{
   	String r="insert into planing (numEnseignant,numSalle,numOrdinateur, numProjecteur ,numClasse, numFormation, date, heure) VALUES (?,?,?,?,?,?,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
        ps.setString(1, numEnseignant);
	ps.setInt(2, numSalle);
        ps.setInt(3, numOrdinateur);
        ps.setInt(4, numProjecteur);
        ps.setInt(5, numClasse);
        ps.setInt(6, numFormation);
        ps.setString(7, date);
        ps.setString(8, heure);
        ps.executeUpdate(); 
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
      
       String[] col={"numPlaning","numEnseignant","numSalle","numOrdinateur","numProjecteur","numClasse","numFormation","date","heure"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       
       String numEnseignant;
       int numSalle;
       int numOrdinateur;
       int numProjecteur;
       int numPlaning;
       int numClasse;
       int numFormation;
       String date;
       String heure;
       row=null;
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM planing ");
        while(r.next())
   	{
	numPlaning=r.getInt("numPlaning");
	numEnseignant=r.getString("numEnseignant");
        numClasse=r.getInt("numClasse");
        numOrdinateur = r.getInt("numOrdinateur");
        numProjecteur = r.getInt("numProjecteur");
        numSalle=r.getInt("numSalle");
        numFormation=r.getInt("numFormation");
        date=r.getString("date");
        heure=r.getString("heure");
        
        Object[] tab ={ numPlaning,numEnseignant,numSalle,numOrdinateur,numProjecteur, numClasse, numFormation, date, heure};
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
public static int nombrePlaning()
 {  
       ResultSet r;
        int nb=0;
        try
   	{
            r= con.getS().executeQuery("SELECT count(*) FROM planing");
            r.next();
            nb=r.getInt(1);
       } 
        
       catch(Exception e){ out.println(e);}
       return nb;
    } 
//------------------------------------------------------------------------------
public static void  supprimer(int numPlaning)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from planing  where numPlaning="+numPlaning+" ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'supprimer' !");
	    out.println(e);
	}
    }
//------------------------------------------------------------------------------
public static void   modifier(int numPlaning,String numEnseignant,int numSalle,int numOrdinateur,int numProjecteur,int numClasse ,int numFormation,String date,String heure)
{       Statement s;
        try
  	{ 
        String r="UPDATE planing SET numEnseignant='"+numEnseignant+"',    numSalle="+numSalle+",  numOrdinateur=" + numOrdinateur + ",numProjecteur=" + numProjecteur + ",   numClasse="+numClasse+",     numFormation="+numFormation+",   date='"+date+"', heure='"+heure+"'  WHERE numPlaning = "+numPlaning;
	s=con.getS();
        s.executeUpdate(r);
        }
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'modifier' !");
	    out.println(e);
	}
 }
 public static boolean reservationValide(String numEnseignant, int numSalle, int numOrdinateur, int numProjecteur, int numClasse, int numFormation, String date, String heure) 
 {
        ResultSet r;
        int nbEnseignant=0;
        int nbSalle = 0;
        int nbClasse = 0;
        int nbOrdinateur = 0;
        int nbProjecteur = 0; 
        
        String reqE = "select count(numPlaning) from planing where numEnseignant='" + numEnseignant + "' and date='" + date + "' and heure='" + heure + "'";
        String reqS = "select count(numPlaning) from planing where numSalle=" + numSalle + " and date='" + date + "' and heure='" + heure + "'";
        String reqC = "select count(numPlaning) from planing where numClasse=" + numClasse + " and date='" + date + "' and heure='" + heure + "'";
        JOptionPane jop = new JOptionPane();
        //  enseigant ----------------------------------------------------------
        
        try 
        {
         r = con.getS().executeQuery(reqE);r.next(); nbEnseignant=r.getInt(1);r.close();
         System.out.print("1111");  
         r = con.getS().executeQuery(reqS);r.next();nbSalle = r.getInt(1);r.close();
         r = con.getS().executeQuery(reqC);r.next(); nbClasse = r.getInt(1);r.close();
         
         
         if(nbEnseignant>0) 
         {
             jop.showMessageDialog(null, " Reservation refusée car l'enseignant " + Enseignant.informationEnseignant(numEnseignant)[1] + " " + Enseignant.informationEnseignant(numEnseignant)[2] + "est deja reservé dans cette date ");
         
         return false;
         }
         if (nbSalle > 0) 
         {
             jop.showMessageDialog(null, " Reservation refusée car la salle " + numSalle + "est deja reservé dans cette date ");
             return false;
         }
        if (nbClasse > 0) 
        {
            jop.showMessageDialog(null, " Reservation refusée car la classe " + numClasse + "est deja reservé dans cette date ");            
            return false;
        }
     
  } 
  catch (Exception e) 
   {
       System.out.print(e.getMessage());
   }
   return true;
   }

}
