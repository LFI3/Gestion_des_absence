
package modele;

import static java.lang.Class.forName;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion 
{
    private Connection c=null;
    private Statement  s=null;
	
	public Connexion()
	{
		    //*********************************//
		    try
		    {
			   forName("com.mysql.jdbc.Driver");
		    }
		    //*********************************//
	            catch(ClassNotFoundException e) 
		    {
			   out.println(e);
		    }
		    //*********************************//
	            try
	            {
	        	c=getConnection("jdbc:mysql://localhost:3306/reservationsalle","root","") ;
	        	s = c.createStatement();
	            }
	            //*********************************//
	            catch(SQLException e1)
	            {
	        	 out.println(e1);
	            }
			//*********************************//   
	}
	
	public Connection getC(){return c;}
	public Statement getS(){return s;}
	
}
