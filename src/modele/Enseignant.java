
package modele;

import static control.Planing.indiceDeJour;
import static control.Planing.indiceDeSeance;
import control.Verification;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modele.Administrateur.con;
import static modele.Classe.con;
import static modele.Etudiant.con;
import static modele.Salle.con;
import static modele.Salle.nombreListeSalleDisponible;
import static modele.Salle.nombreSalle;

public class Enseignant 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(String cin,String nom,String prenom,String adresse,String diplome,String responsable,String login,String password)
{
    	try
   	{
   	String r="insert into enseignant (`cin`,`nom`,`prenom`,`adresse`,`diplome`,`responsable`,`login`,`password`) VALUES (?,?,?,?,?,?,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
        ps.setString(1, cin);
	ps.setString(2, nom);
        ps.setString(3, prenom);
        ps.setString(4, adresse);
        ps.setString(5, diplome);
        ps.setString(6, responsable);
        ps.setString(7, login);
        ps.setString(8, password);
        ps.executeUpdate(); 
   	}
   	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'Ajouter' !");
	    System.out.println(e);
	}
}
//------------------------------------------------------------------------------
public static void   modifier(String cin,String nom,String prenom,String adresse,String diplome,String responsable,String login,String password)
{       Statement s;
        try
  	{ 
        String r="UPDATE `enseignant` SET `nom`='"+nom+"',`prenom`='"+prenom+"',`adresse`='"+adresse+"',`diplome`='"+diplome+"',`responsable`='"+responsable+"',`login`='"+login+"',`password`='"+password+"' WHERE `cin` = '"+cin+"'";
	
            out.println("cin"+cin);
            out.println("cin"+nom);
            out.println("cin"+prenom);
            out.println("cin"+adresse);
            out.println("cin"+diplome);
            out.println("cin"+responsable);
            out.println("cin"+login);
            out.println("cin"+password);
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
    public static void setResponsable(String cin) 
    {
        Statement s;
        try {
            String r = "UPDATE enseignant SET `responsable`='oui' WHERE cin = '" + cin + "'";
            s = con.getS();
            s.executeUpdate(r);
            String nom=Enseignant.informationEnseignant(cin)[1];
            String prenom = Enseignant.informationEnseignant(cin)[2];
            JOptionPane jop = new JOptionPane();
            showMessageDialog(null, " l'enseignant "+nom+" "+prenom+" est devient reponsable ");

        } catch (Exception e) 
        {
            JOptionPane jop = new JOptionPane();
            showMessageDialog(null, " ERROR 'modifier' !");
            
        }
    }
//------------------------------------------------------------------------------  
public static DefaultTableModel afficher()
{  
      
       String[] col={ "Cin","Nom","Prenom","Adresse","Diplome","Responsable","Login","Password"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       String cin,nom,prenom,adresse,login,password,diplome,responsable;
       row=null;
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM enseignant ");
        while(r.next())
   	{
	cin=r.getString("cin");
        nom=r.getString("nom");
        prenom=r.getString("prenom");
        diplome=r.getString("diplome");
        adresse=r.getString("adresse");
        responsable=r.getString("responsable");
        login=r.getString("login");
        password=r.getString("password");
        Object[] tab ={cin,nom,prenom,adresse,diplome,responsable,login,password};
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
public static boolean estEnseignant(String login,String password)
{
     try
     {
     String s="select count(*) from enseignant where login='"+login+"' and password='"+password+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
        {
           JOptionPane jop = new JOptionPane();
	        showMessageDialog(null,"Enseignant introuvable!");
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
	    showMessageDialog( null," ERROR 'estEnseignant' !");
	    out.println(e); 
     }
     return false;
}
//------------------------------------------------------------------------------ 
public static boolean estNotEnseignant(String login,String password)
{
     try
     {
     String s="select count(*) from enseignant where login='"+login+"' and password='"+password+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
        {
            return true;
        }
     else     
        {
        JOptionPane jop = new JOptionPane();
	        showMessageDialog(null,"Enseignant existe déja!");
        return false;
        }
     }
     catch(Exception e)
     {
        JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'estEnseignant' !");
	    out.println(e); 
     }
     return false;
}
public static boolean estEnseignant(String cin)
{
     try
     {
     String s="select count(*) from enseignant where cin='"+cin+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
        {
            JOptionPane jop = new JOptionPane();
	        showMessageDialog( null," Enseignant introuvable!");
            return false;
        }
     else     
        {return true;}
     }
     catch(Exception e)
     {
        
	    out.println(e); 
     }
     return false;
}
public static boolean estResponsable(String cin)
{
     try
     {
     String s="select responsable from enseignant where cin='"+cin+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     
     if(r.getString(1).equals("oui"))
        {
            return true;
        }
     else     
        {
            return true;
        }
     }
     catch(Exception e)
     {
        
	    out.println(e); 
     }
     return false;
}
//------------------------------------------------------------------------------ 
public static String[] informationEnseignant(String login,String password)
{  
        ResultSet r;
        String[] tab=new String[8];
        try
   	{
            if(estEnseignant(login,password))
            {
                String s="select * from enseignant where login='"+login+"' and password='"+password+"'";
                r= con.getS().executeQuery(s);
                while(r.next())
                {
                        tab[0]=r.getString("cin");
                        tab[1]=r.getString("nom");
                        tab[2]=r.getString("prenom");
                        tab[3]=r.getString("diplome");
                        tab[4]=r.getString("adresse");
                        tab[5]=r.getString("responsable");
                        tab[6]=r.getString("login");
                        tab[7]=r.getString("password");
                }
            }
        }
   	catch(Exception e)
        { 
        JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'information Enseignant' !");
	    out.println(e); 
        }
       return tab;
} 
//------------------------------------------------------------------------------
public static String[] informationEnseignant(String cin) 
{
        ResultSet r;
        String[] tab = new String[8];
        try {
            if (estEnseignant(cin)) 
            {
                String s = "select * from enseignant where cin='" + cin + "'";
                r = con.getS().executeQuery(s);
                while (r.next()) {
                    tab[0] = r.getString("cin");
                    tab[1] = r.getString("nom");
                    tab[2] = r.getString("prenom");
                    tab[3] = r.getString("diplome");
                    tab[4] = r.getString("adresse");
                    tab[5] = r.getString("responsable");
                    tab[6] = r.getString("login");
                    tab[7] = r.getString("password");
                }
            }
        } catch (Exception e) {
            JOptionPane jop = new JOptionPane();
            showMessageDialog(null, " ERROR 'information Enseignant' !");
            out.println(e);
        }
        return tab;
    }
//------------------------------------------------------------------------------
public static String[] cinNomPrenomEnseignant()
    {  
       
        ResultSet r;
        String cin,nom,prenom;
        String[] tab=new String[nombreEnseignant()];
        int indice=0;
        try
   	{
            r= con.getS().executeQuery("SELECT cin,nom,prenom FROM enseignant;");
            while(r.next())
            {
            cin=r.getString("cin");
            nom=r.getString("nom");
            prenom=r.getString("prenom");
            tab[indice]=cin+" "+nom+" "+prenom;
            indice++;
                 
            } 
        }
   	catch(Exception e){ out.println(e);}
       return tab;
    }
//------------------------------------------------------------------------------
public static int nombreEnseignant()
    {  
       ResultSet r;
        int nb=0;
        try
   	{
            r= con.getS().executeQuery("SELECT count(*) FROM enseignant");
            r.next();
            nb=r.getInt(1);
       } 
        
       catch(Exception e){ out.println(e);}
       return nb;
    } 
//------------------------------------------------------------------------------
 public static String[][] afficherClasse(String cin)
    {  
       
        String[][] tab=new String[4][6]; 
        ResultSet r;
        String nomClasse;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT nomClasse,date,heure FROM planing,classe where planing.numClasse=classe.numClasse and numEnseignant="+cin+"");
            while(r.next())
            {
            nomClasse=r.getString("nomClasse").trim();
            jour=r.getString("date").trim();
            heure=r.getString("heure").trim();
            if( indiceDeSeance(heure)!=-1 &&indiceDeJour(jour) !=-1 )
            tab[indiceDeSeance(heure)][indiceDeJour(jour)]=nomClasse;           
            } 
        }
   	catch(Exception e){ out.println(e);}
        return tab;
    } 
//------------------------------------------------------------------------------ 
 public static String[][] afficherSalle(String cin)
    {  
        String[][] tab=new String[4][6]; 
        ResultSet r;
        int numSalle;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT numSalle,date,heure FROM planing where numEnseignant="+cin+"");
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
 public static String[][] afficherFormation(String cin)
    {  
        
        String[][] tab=new String[4][6]; 
        ResultSet r;
        String  nomFormation;
        String jour;
        String heure;
        try
   	{
            r= con.getS().executeQuery("SELECT nomFormation,date,heure FROM planing,formation where formation.numFormation=planing.numFormation and numEnseignant="+cin+"");
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
public static void  supprimer(String cin)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from enseignant  where cin="+cin+" ;");
  	}
  	catch(Exception e)
    	{ 
   	JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'supprimer' !");
	    out.println(e);
	}
    }
    public static String[] listeHeureDisponible(String login, String password, String date) 
    {
        ResultSet r;
        String numEnseignant=informationEnseignant(login, password)[0];
        String h;
        String[] tab = new String[nombreListeHeureDisponible( login,  password,  date)];
        int indice = 0;
        try 
        {
            r = con.getS().executeQuery("SELECT distinct heure FROM planing where numEnseignant like '"+numEnseignant+"' and date like '" + date + "'");
            
            while (r.next()) {
                h = r.getString("heure");
                tab[indice] = h;
                indice++;

            }
        } catch (Exception e)
        {
            out.println(e);
        }
        
        return Verification.DonnerHeure(tab);
    }
    public static int nombreListeHeureDisponible(String login, String password, String date) 
    {
        ResultSet r;
        String numEnseignant = informationEnseignant(login, password)[0];
        String h;
        int nb=0;
        try{
        r = con.getS().executeQuery("SELECT count(distinct heure) FROM planing where numEnseignant like '" + numEnseignant + "' and date like '" + date + "'");
        r.next();
        nb = r.getInt(1);
        }
        catch (Exception e) 
        {
            out.println(e);
        }

        return nb;
    }
}
