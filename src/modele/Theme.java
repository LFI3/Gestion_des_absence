
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

public class Theme 
{
  public static  Connexion con=new Connexion();
  

   public static void  modifier(String nomTheme)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("Update theme set nomTheme='"+nomTheme+"'");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'modifier' !");
	    out.println(e);
	}
    }
 
  public static String  monTheme()
     { 
        Statement s=con.getS();
        try
  	{ 	
          ResultSet r=s.executeQuery("select nomTheme from theme ;");
          r.next();
         return  r.getString("nomTheme");
        }
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'modifier' !");
	    out.println(e);
	}
        return "theme3";
    }
 
 
}
