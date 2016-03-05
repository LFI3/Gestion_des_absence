
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.ConnectionInscription;

public class Administrateur 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(String login,String password)
{
    	try
   	{
   	String r="insert into administrateur (login,password) VALUES (?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
	
        ps.setString(1, login);
        ps.setString(2, password);
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
public static void   modifier(String login1,String password1)
{ 
        try
  	{ 
        String r="Update administrateur set password=? where login=?  ;";
	PreparedStatement ps=con.getC().prepareStatement(r);
        ps.setString(1, password1);
        ps.setString(2, login1);
        ps.executeUpdate();
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'modifier' !");
	    out.println(e);
	}
 }
//------------------------------------------------------------------------------  
public static boolean estAdministrateur(String login,String password)
{
     try
     {
     String s="select count(*) from administrateur where login='"+login+"' and password='"+password+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
        {
           JOptionPane jop = new JOptionPane();
	        showMessageDialog(null,"Administrateur introuvable!");
         
            return false;
        }
     else     
        {
        
        return true;
        }
     }
     catch(Exception e)
     {
        JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'estEtudiant' !");
	    out.println(e); 
     }
     return false;
}
//------------------------------------------------------------------------------ 
public static boolean estNotAdministrateur(String login,String password)
{
     try
     {
     String s="select count(*) from administrateur where login='"+login+"' and password='"+password+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
        {
            return true;
        }
     else     
        {
        JOptionPane jop = new JOptionPane();
	        showMessageDialog(null,"Administrateur existe déja!");
        
        return false;
        }
     }
     catch(Exception e)
     {
        JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'estEtudiant' !");
	    out.println(e); 
     }
     return false;
}
}
