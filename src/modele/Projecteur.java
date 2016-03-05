
package modele;


import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class Projecteur 
{
  public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
  public static void ajouter(int numProjecteur,String marque,String modele)
    {   
        PreparedStatement ps;
    	try
   	{
   	String r="insert into projecteur (numProjecteur,marque,modele) values (?,?,?)";
	ps = con.getC().prepareStatement(r);
	ps.setInt(1, numProjecteur);
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
   public static void  modifier(int numProjecteur,String marque,String modele)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("Update projecteur set marque='"+marque+"',modele='"+modele+"' where numProjecteur="+numProjecteur+" ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'modifier' !");
	    out.println(e);
	}
    }
//------------------------------------------------------------------------------

   public static void  supprimer(int numProjecteur)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from projecteur  where numProjecteur="+numProjecteur+" ;");
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
      
       String[] col={"numProjecteur","marque","modele"};
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
   	r= con.getS().executeQuery("SELECT * FROM projecteur");
        while(r.next())
   	{
	numProjecteur=r.getInt("numProjecteur");
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
public static int nombreProjecteur()
    {  
        ResultSet r;
        int nb=0;
        try
   	{
            r= con.getS().executeQuery("SELECT count(*) FROM projecteur");
            r.next();
            nb=r.getInt(1);
       } 
        
       catch(Exception e){ out.println(e);}
       return nb;
    } 
//------------------------------------------------------------------------------

    public static String[] nomProjecteur() {

        ResultSet r;
        String nomProjecteur;
        String[] tab = new String[nombreProjecteur()+1];
        tab[0] = "----select----";
        int indice = 1;
        try {
            r = con.getS().executeQuery("SELECT marque ,modele FROM projecteur;");
            while (r.next()) {
                nomProjecteur = r.getString("marque")+" "+r.getString("modele");
                tab[indice] = nomProjecteur;
                indice++;

            }
        } catch (Exception e) {
            out.println(e);
        }
        return tab;
    }
    
    public static int numProjecteur(String marqueModele) 
    {

        ResultSet r;
        String nomProjecteur;
        try {
            r = con.getS().executeQuery("SELECT numProjecteur,marque,modele FROM projecteur;");
            while (r.next()) {
                nomProjecteur = r.getString("marque") + " " + r.getString("modele");
                if (marqueModele.equals(nomProjecteur)) {
                    return r.getInt("numProjecteur");
                }
            }
        } catch (Exception e) {
            out.println(e);
        }
        return 0;
    }
}
