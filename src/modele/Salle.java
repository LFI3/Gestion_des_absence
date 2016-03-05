
package modele;

import control.Planing;
import static control.Planing.indiceDeJour;
import static control.Planing.indiceDeSeance;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Salle 
{
  public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
  public static void ajouter(int numSalle,int capacite)
    {   
        PreparedStatement ps;
    	try
   	{
   	String r="insert into salle (numSalle,capacite) values (?,?)";
	ps = con.getC().prepareStatement(r);
	ps.setInt(1, numSalle);
        ps.setInt(2, capacite);
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
   public static void  modifier(int numSalle,int capacite)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("Update salle set capacite='"+capacite+"' where numSalle='"+numSalle+"' ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'modifier' !");
	    out.println(e);
	}
    }
//------------------------------------------------------------------------------
  public static void  supprimer(int numSalle)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from salle  where numSalle='"+numSalle+"' ;");
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
       JTable table;
       String[] col={"Numero Salle","Capacite"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       int numClasse;
       String nomClasse;
       
       
       table=new JTable();
       row=null;
       m=new DefaultTableModel(row,col);
       table.setModel(m); 
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM salle");
        while(r.next())
   	{
	numClasse=r.getInt("numSalle");
	nomClasse=r.getString("capacite");
	Object[] tab ={numClasse,nomClasse};
        m.addRow(tab);
   	
        } 
        table.setModel(m);
        }
   	catch(Exception e){ out.println(e);}
        return m;
}
//------------------------------------------------------------------------------  
  public static String[][] afficherEnseignant(int numSalle)
    {  
        String[][] tab=new String[4][6]; 
        ResultSet r;
        String nom;
        String prenom;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT nom,prenom,date,heure FROM planing,enseignant where numEnseignant=cin and numSalle="+numSalle+"");
            while(r.next())
            {
            nom=r.getString("nom").trim();
            prenom=r.getString("prenom").trim();
            jour=r.getString("date").trim();
            heure=r.getString("heure").trim();
            if( indiceDeSeance(heure)!=-1 &&indiceDeJour(jour) !=-1 )
            tab[indiceDeSeance(heure)][indiceDeJour(jour)]=nom+" "+prenom;           
            } 
        }
   	catch(Exception e){ out.println(e);}
        return tab;
    } 
//------------------------------------------------------------------------------ 
 public static String[][] afficherClasse(int numSalle)
    {  
        String[][] tab=new String[4][6]; 
        ResultSet r;
        String nomClasse;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT nomClasse,date,heure FROM planing,classe  where   planing.numClasse=classe.numClasse and numSalle="+numSalle+"");
            while(r.next())
            {
            nomClasse=r.getString("nomClasse");
            jour=r.getString("date").trim();
            heure=r.getString("heure").trim();
            if( indiceDeSeance(heure)!=-1 &&indiceDeJour(jour) !=-1 )
                tab[indiceDeSeance(heure)][indiceDeJour(jour) ]=" "+nomClasse+" ";           
            } 
        }
   	catch(Exception e){ out.println(e);}
        return tab;
    }
//------------------------------------------------------------------------------ 
 public static String[][] afficherFormation(int numSalle)
    {  
        String[][] tab=new String[4][6]; 
        ResultSet r;
        String  nomFormation;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT nomFormation,date,heure FROM planing,formation where formation.numFormation=planing.numFormation and numSalle="+numSalle+"");
            while(r.next())
            {
            nomFormation=r.getString("nomFormation");
            jour=r.getString("date").trim();
            heure=r.getString("heure").trim();
            if( indiceDeSeance(heure)!=-1 &&indiceDeJour(jour) !=-1 )
               tab[indiceDeSeance(heure)][indiceDeJour(jour) ]=nomFormation;           
            } 
        }
   	catch(Exception e){ out.println(e);}
        return tab;
    }
//------------------------------------------------------------------------------
public static String[] listeSalle()
{  
        ResultSet r;
        String nomClasse;
        String[] tab=new String[nombreSalle()];
        int indice=0;
        try
   	{
            r= con.getS().executeQuery("SELECT numSalle FROM salle;");
            while(r.next())
            {
            nomClasse=r.getString("numSalle");
            tab[indice]=nomClasse;
            indice++;
                 
            } 
        }
   	catch(Exception e){ out.println(e);}
       return tab;
}
//------------------------------------------------------------------------------
public static int nombreSalle()
    {  
        ResultSet r;
        int nb=0;
        try
   	{
            r= con.getS().executeQuery("SELECT count(*) FROM salle");
            r.next();
            nb=r.getInt(1);
       } 
        
       catch(Exception e){ out.println(e);}
       return nb;
    } 
//------------------------------------------------------------------------------
public static String[] listeSalleDisponible(String date,String heure) 
{
    ResultSet r;
    String numSalle;
    String[] tab = new String[nombreListeSalleDisponible(date,heure)];
    int indice = 0;
    try {
        r = con.getS().executeQuery("SELECT distinct numSalle FROM salle where numSalle not in  (select numSalle from planing where  date LIKE '"+date+"' and heure LIKE '" + heure + "');");
        while (r.next()) 
        {
            numSalle = r.getString("salle.numSalle");
            tab[indice] = numSalle;
            indice++;

        }
    } 
    catch (Exception e) 
    {
        out.println(e);
    }
    return tab;
}
public static int nombreListeSalleDisponible(String date, String heure) 
{
        ResultSet r;
        String nomClasse;
        String[] tab = new String[nombreSalle()];
        int nb = 0;
        try 
        {
        r = con.getS().executeQuery("SELECT count(numSalle) FROM salle where numSalle not in  (select numSalle from planing where  date LIKE '" + date + "' and heure LIKE '" + heure + "');");
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


