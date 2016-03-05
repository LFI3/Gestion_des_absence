
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import static modele.Ordinateur.con;
import static modele.Salle.con;
import static modele.Salle.nombreSalle;


public class Formation 
{
  public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
   public static void ajouter(int numFormation,String nomFormation,String numResponsable)
    {
        PreparedStatement ps;
    	try
   	{
   	String sql1="insert into formation (numFormation,nomFormation,numResponsable) values (?,?,?);";
        ps = con.getC().prepareStatement(sql1);
	ps.setInt(1, numFormation);
        ps.setString(2, nomFormation);
        ps.setString(3, numResponsable);
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
   public static void modifier(int numFormation,String nomFormation,String numResponsable)
    { 
      Statement s=con.getS();
       try
  	{ 	
         s.executeUpdate("Update formation set  nomFormation='"+nomFormation+"',numResponsable='"+numResponsable+"'  where numFormation="+numFormation+" ;");
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
       String[] col={"Numero Formation","Nom Formation","Cin Responsable"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       int numFormation;
       String nomFormation;
       String numResponsable;
       row=null;
       m=new DefaultTableModel(row,col);
     
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM formation ");
        while(r.next())
   	{
	numFormation=r.getInt("numFormation");
	nomFormation=r.getString("nomFormation");
        numResponsable=r.getString("numResponsable");
	Object[] tab ={numFormation,nomFormation,numResponsable};
        m.addRow(tab);
   	} 
        }
   	catch(Exception e){ out.println(e);}
        return m;
}
//------------------------------------------------------------------------------  
 public static void  supprimer(int numFormation)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from formation  where numFormation="+numFormation+" ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'supprimer' !");
	    out.println(e);
	}
    }
    public static int nombreFormation() {

        ResultSet r;

        int nb = 0;
        try {
            r = con.getS().executeQuery("SELECT count(*) FROM formation");
            r.next();
            nb = r.getInt(1);
        } 
        catch (Exception e) 
        {
            out.println(e);
        }
        return nb;
    }
    public static String[] nomFormation() {

        ResultSet r;
        String nomClasse;
        String[] tab = new String[nombreFormation()];
        int indice = 0;
        try {
            r = con.getS().executeQuery("SELECT nomFormation FROM formation;");
            while (r.next()) {
                nomClasse = r.getString("nomFormation");
                tab[indice] = nomClasse;
                indice++;

            }
        } 
        catch (Exception e) 
        {
            out.println(e);
        }
        return tab;
    }
    public static int numFormation(String nomFormation) {

        ResultSet r;
        String nom;
        try {
            r = con.getS().executeQuery("SELECT numFormation,nomFormation FROM formation;");
            while (r.next()) {
                nom = r.getString("nomFormation");
                if (nom.equals(nomFormation)) {
                    return r.getInt("numFormation");
                }
            }
        } catch (Exception e) {
            out.println(e);
        }
        return 0;
    }
    
    public static String[] listeFormationDisponible(String login, String password) 
    {
        ResultSet r;
        String nomFormation;
        String[] tab = new String[nombreListeFormationDisponible( login, password ) ];
        int indice = 0;
        String cin=Enseignant.informationEnseignant(login, password)[0];
        try 
        {
        String req ="SELECT distinct nomFormation  FROM formation,affectation where formation.numFormation=affectation.numFormation and affectation.numEnseignant like '"+cin+"'  " ;
        r = con.getS().executeQuery(req);
        while (r.next()) 
        {
        nomFormation = r.getString("nomFormation");
        tab[indice] = nomFormation;
        indice++;
        }
        } 
        catch (Exception e) 
        {
        out.println(e);
        }
        return tab;
    }

    public static int nombreListeFormationDisponible(String login, String password) 
    {
        ResultSet r;
        int nb = 0;
        String cin = Enseignant.informationEnseignant(login, password)[0];
        try 
        {
            String req = "SELECT count(distinct nomFormation)  FROM formation,affectation where formation.numFormation=affectation.numFormation and affectation.numEnseignant like '" + cin + "'  ";
            r = con.getS().executeQuery(req);
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
