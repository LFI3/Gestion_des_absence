
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
import static modele.Ordinateur.con;
import static modele.Salle.con;

public class Classe 
{
  public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
   public static  void ajouter(int num,String nom)
    {
    	try
   	{
   	String sql1="insert into classe (numClasse,nomClasse) values (?,?);";
	PreparedStatement ps = con.getC().prepareStatement(sql1);
	ps.setInt(1, num);
        ps.setString(2, nom);
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
   public static void   modifier(int numClasse,String nomClasse)
    { 
      Statement s=con.getS();
       try
  	{ 	
         s.executeUpdate("Update classe set nomClasse='"+nomClasse+"' where numClasse='"+numClasse+"' ;");
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
       String[] col={"numClasse","nomClasse"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       int numClasse;
       String nomClasse;
       row=null;
       m=new DefaultTableModel(row,col);
     
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM classe ");
        while(r.next())
   	{
	numClasse=r.getInt("numClasse");
	nomClasse=r.getString("nomClasse");
	Object[] tab ={numClasse,nomClasse};
        m.addRow(tab);
   	
        } 
        }
   	catch(Exception e){ out.println(e);}
        return m;
}
//------------------------------------------------------------------------------  
  public static String[][] afficherEnseignant(int numClasse)
    {  
       
        String[][] tab=new String[4][6]; 
        ResultSet r;
        String nom;
        String prenom;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT nom,prenom,date,heure FROM planing,enseignant where numEnseignant=cin and numClasse="+numClasse+"");
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
 public static String[][] afficherSalle(int numClasse)
    {  
        String[][] tab=new String[4][6]; 
        ResultSet r;
        int numSalle;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT numSalle,date,heure FROM planing where numClasse="+numClasse+"");
            while(r.next())
            {
            numSalle=r.getInt("numSalle");
            jour=r.getString("date").trim();
            heure=r.getString("heure").trim();
            if( indiceDeSeance(heure)!=-1 &&indiceDeJour(jour) !=-1 )
               tab[indiceDeSeance(heure)][indiceDeJour(jour) ]=" "+numSalle+" ";           
            } 
        }
   	catch(Exception e){ out.println(e);}
        return tab;
    }
//------------------------------------------------------------------------------ 
 public static String[][] afficherFormation(int numClasse)
    {  
        
        String[][] tab=new String[4][6]; 
        ResultSet r;
        String  nomFormation;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT nomFormation,date,heure FROM planing,formation where formation.numFormation=planing.numFormation and numClasse="+numClasse+"");
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
  public static int getNumero(String nomClasse)
    {  
       
        ResultSet r;
        int num=0;
        try
   	{
            r= con.getS().executeQuery("SELECT numClasse FROM classe where nomClasse ='"+nomClasse+"'");
            while(r.next())
            {
            num=r.getInt("numClasse");
            return num;        
            } 
        }
   	catch(Exception e){ out.println(e);}
       return num;
    } 
//------------------------------------------------------------------------------  
public static void afficherTAB(String[][] tab)  
{   for(int i=0;i<=3;i++)
    {
      for(int j=0;j<=5;j++)
        {
                out.println(tab[i][j]);
        }
     }
}
//------------------------------------------------------------------------------
public static String[] nomClasse()
    {  
       
        ResultSet r;
        String nomClasse;
        String[] tab=new String[nombreClasse()];
        int indice=0;
        try
   	{
            r= con.getS().executeQuery("SELECT nomClasse FROM classe;");
            while(r.next())
            {
            nomClasse=r.getString("nomClasse");
            tab[indice]=nomClasse;
            indice++;
                 
            } 
        }
   	catch(Exception e){ out.println(e);}
       return tab;
    } 
public static int nombreClasse()
    {  
       
        ResultSet r;
        
        int nb=0;
        try
   	{
            r= con.getS().executeQuery("SELECT count(*) FROM classe");
            r.next();
            nb=r.getInt(1);
       } 
        
       catch(Exception e){ out.println(e);}
       return nb;
    } 
  //------------------------------------------------------------------------------

   public static void  supprimer(int numClasse)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from classe  where numClasse='"+numClasse+"' ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'supprimer' !");
	    out.println(e);
	}
    }
   
    public static String[] listeClasseDisponible(String date, String heure) {
        ResultSet r;
        String nomClasse;
        String[] tab = new String[nombreListeClasseDisponible(date, heure)];
        int indice = 0;
        try {
            r = con.getS().executeQuery("SELECT distinct nomClasse FROM classe where numClasse not in  (select numClasse from planing where  date LIKE '" + date + "' and heure LIKE '" + heure + "');");
            while (r.next()) {
                nomClasse = r.getString("nomClasse");
                tab[indice] = nomClasse;
                indice++;

            }
        } catch (Exception e) {
            out.println(e);
        }
        return tab;
    }

    public static int nombreListeClasseDisponible(String date, String heure) {
        ResultSet r;
        int nb = 0;
        try {
            r = con.getS().executeQuery("SELECT count(distinct nomClasse )FROM classe where numClasse not in  (select numClasse from planing where  date LIKE '" + date + "' and heure LIKE '" + heure + "');");
            r.next();
            nb = r.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return nb;
    }
}
