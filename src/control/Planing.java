
package control;

public class Planing 
{
    
    public static String[] jour=new String[]{"lundi","mardi","mercredi","jeudi","vendredi","samedi",} ; 
    public static String[] seance=new String[]{"08:00--10:00","10:00--12:00","14:00--16:00","16:00--18:00"} ; 
  //------------------------------------------------------------------------------  
  public static int indiceDeJour(String ch)
  {
    for(int i=0;i<jour.length;i++)
    {
       if(jour[i].equals(ch))
           return i;
    }  
    return -1;
  } 
  //------------------------------------------------------------------------------  
  public static int indiceDeSeance(String ch)
  {
    for(int i=0;i<seance.length;i++)
    {
       if(seance[i].equals(ch))
           return i;
    }  
    return -1;
  } 
}
