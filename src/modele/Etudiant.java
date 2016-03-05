
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modele.Administrateur.con;
import static modele.Salle.con;

public class Etudiant 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(String nom,String prenom,String adresse,int numClasse,String login,String password)
{
    	try
   	{
   	String r="insert into etudiant (`nom`,`prenom`,`adresse`,`numClasse`,`login`,`password`) VALUES (?,?,?,?,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
	ps.setString(1, nom);
        ps.setString(2, prenom);
        ps.setString(3, adresse);
        ps.setInt(4, numClasse);
        ps.setString(5, login);
        ps.setString(6, password);
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
public static void   modifier(int numEtudiant,String nom,String prenom,String adresse,int numClasse,String login,String password)
{       PreparedStatement ps;
        try
  	{ 
        String r="Update etudiant set nom =? , prenom=? , adresse=? , numClasse=? , login=? , password=? where numEtudiant=? ;";
	ps=con.getC().prepareStatement(r);
        ps.setString(1, nom);
        ps.setString(2, prenom);
        ps.setString(3, adresse);
        ps.setInt(4, numClasse);
        ps.setString(5, login);
        ps.setString(6, password);
        ps.setInt(7, numEtudiant);
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
public static DefaultTableModel afficher()
{  
       
       String[] col={ "Numero Etudiant","Nom","Prenom","Adresse","Numero Classe","Login","Password"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       
        int numEtudiant,numClasse;
        String nom,prenom,adresse,login,password;
        row=null;
        m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM etudiant ");
        while(r.next())
   	{
	numEtudiant=r.getInt("numEtudiant");
        nom=r.getString("nom");
        prenom=r.getString("prenom");
        adresse=r.getString("adresse");
        login=r.getString("login");
        password=r.getString("password");
        numClasse=r.getInt("numClasse");
        
	Object[] tab ={numEtudiant,nom,prenom,adresse,numClasse,login,password};
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
//------------------------------------------------------------------------------  
public static boolean estEtudiant(String login,String password)
{
     try
     {
     String s="select count(*) from etudiant where login='"+login+"' and password='"+password+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
        {
           JOptionPane jop = new JOptionPane();
	        showMessageDialog(null,"Etudiant introuvable!");
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
public static boolean estNotEtudiant(String login,String password)
{
     try
     {
     String s="select count(*) from etudiant where login='"+login+"' and password='"+password+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
        {
            return true;
        }
     else     
        {
        JOptionPane jop = new JOptionPane();
	        showMessageDialog(null,"Etudiant existe déja!");
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
//------------------------------------------------------------------------------ 
public static String[] informationEtudiant(String login,String password)
{  
        ResultSet r;
        String[] tab=new String[7];
        try
   	{
            if(estEtudiant(login,password))
            {
                String s="select * from etudiant where login='"+login+"' and password='"+password+"'";
                r= con.getS().executeQuery(s);
                while(r.next())
                {
                        tab[0]=r.getString("numEtudiant");
                        tab[1]=r.getString("nom");
                        tab[2]=r.getString("prenom");
                        tab[3]=r.getString("adresse"); 
                        tab[4]=r.getString("numClasse");
                        tab[5]=r.getString("login");
                        tab[6]=r.getString("password");
                }
            }
        }
   	catch(Exception e)
        { 
        JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'informationEtudiant' !");
	    out.println(e); 
        }
       return tab;
} 
//------------------------------------------------------------------------------

   public static void  supprimer(int numEtudiant)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from etudiant  where numEtudiant="+numEtudiant+" ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'supprimer' !");
	    out.println(e);
	}
    }
}
