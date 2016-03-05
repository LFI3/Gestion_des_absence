
package modele;

import control.Planing;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modele.Projecteur.con;
import static modele.Projecteur.nombreProjecteur;
import static modele.Salle.con;
import static modele.Salle.nombreSalle;

public class Ordinateur 
{
  public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
  public static void ajouter(int numOrdinateur,String marque,String modele)
    {   
        PreparedStatement ps;
    	try
   	{
   	String r="insert into ordinateur (numOrdinateur,marque,modele) values (?,?,?)";
	ps = con.getC().prepareStatement(r);
	ps.setInt(1, numOrdinateur);
        ps.setString(2, marque);
        ps.setString(3, modele);
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
   public static void  modifier(int numOrdinateur,String marque,String modele)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("Update ordinateur set marque='"+marque+"',modele='"+modele+"' where numOrdinateur="+numOrdinateur+" ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'modifier' !");
	    out.println(e);
	}
    }
//------------------------------------------------------------------------------

   public static void  supprimer(int numOrdinateur)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from ordinateur  where numOrdinateur="+numOrdinateur+" ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'modifier' !");
	    out.println(e);
	}
    }
//------------------------------------------------------------------------------  
 public static DefaultTableModel afficher()
    {  
      
       String[] col={"numOrdinateur","marque","modele"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       
       int numProjecteur;
       String marque;
       String modele;
       
       row=null;
       m=new DefaultTableModel(row,col);
       
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM ordinateur");
        while(r.next())
   	{
	numProjecteur=r.getInt("numOrdinateur");
	marque=r.getString("marque");
        modele=r.getString("modele");
	Object[] tab ={numProjecteur,marque,modele};
        m.addRow(tab);
   	
        } 
        
        }
   	catch(Exception e){ out.println(e);}
        return m;
}
//------------------------------------------------------------------------------  
public static int nombreOrdinateur()
    {  
        ResultSet r;
        int nb=0;
        try
   	{
            r= con.getS().executeQuery("SELECT count(*) FROM ordinateur");
            r.next();
            nb=r.getInt(1);
       } 
        
       catch(Exception e){ out.println(e);}
       return nb;
    } 
//------------------------------------------------------------------------------

    public static String[] nomOrdinateur() 
    {

        ResultSet r;
        String nomProjecteur;
        String[] tab = new String[nombreOrdinateur()+1];
        tab[0]="----select----";
        int indice = 1;
        try {
            r = con.getS().executeQuery("SELECT marque ,modele FROM ordinateur;");
            while (r.next()) {
                nomProjecteur = r.getString("marque") + " " + r.getString("modele");
                tab[indice] = nomProjecteur;
                indice++;

            }
        } catch (Exception e) {
            out.println(e);
        }
        return tab;
    }
    public static int numOrdinateur(String marqueModele) 
    {

        ResultSet r;
        String nomProjecteur;
        try {
            r = con.getS().executeQuery("SELECT numOrdinateur,marque,modele FROM ordinateur;");
            while (r.next()) 
            {
                nomProjecteur = r.getString("marque") + " " + r.getString("modele");
                if(marqueModele.equals(nomProjecteur))
                    return r.getInt("numOrdinateur");
            }
        } catch (Exception e) {
            out.println(e);
        }
        
        return 0;
    }
    public static String[] listeOrdinateurDisponible(String date, String heure) {
        ResultSet r;
        String nomOrdinateur;
        String[] tab = new String[nombreListeOrdinateurDisponible(date, heure)+1];
        tab[0]="----select----";
        int indice = 1;
        try {
             r = con.getS().executeQuery("SELECT distinct(numOrdinateur),marque,modele FROM ordinateur where numOrdinateur not in  (select numOrdinateur from planing where  date LIKE '" + date + "' and heure LIKE '" + heure + "');");
            while (r.next()) {
                nomOrdinateur = r.getString("marque")+" "+r.getString("modele");
                tab[indice] = nomOrdinateur;
                indice++;

            }
        } catch (Exception e) {
            out.println(e);
        }
        return tab;
    }

    public static int nombreListeOrdinateurDisponible(String date, String heure) 
    {
        ResultSet r;
        String nomOrdinateur;
        int nb = 0;
        try 
        {
            r = con.getS().executeQuery("SELECT count(distinct numOrdinateur) FROM ordinateur where numOrdinateur not in  (select numOrdinateur from planing where  date LIKE '" + date + "' and heure LIKE '" + heure + "');");
            r.next();
            nb = r.getInt(1);
       }
       catch (Exception e) 
       {
            System.out.println(e);
        }
        return nb;  
    }
    
}
