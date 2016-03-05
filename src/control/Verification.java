
package control;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

public class Verification

{
 //------------------------------------------------------
  public static boolean estVide(String  ch)
  {
   if( ch.length()==0) return true;return false;
    
 }  
 //------------------------------------------------------
  public static boolean estInt(String  ch)
  {
    for(int i=0;i<ch.length();i++)
    {
      if(ch.charAt(i)<'0'|| ch.charAt(i)>'9') 
          return false;
    }
    return true;
 }
 //------------------------------------------------------
 public static boolean estString(String  ch)
  {
    for(int i=0;i<ch.length();i++)
    {
      if(ch.charAt(i)>='0'&&ch.charAt(i)<='9') 
          return false;
    }
    return true;
 }  
 //------------------------------------------------------ 
  
  public static boolean verifNotVideEtString(String j,String titre)
       {
          if(estVide(j))
          {
                  JOptionPane jop = new JOptionPane();
                  showMessageDialog( null," Le Champ de texte '"+titre+"' est vide");
                  return false;
          }
          else
          {
               if(estString(j))
              {
                 return true;
	      }
              else
              {  
                 JOptionPane jop = new JOptionPane();
                 showMessageDialog( null," Le Champ de texte '"+titre+"' est incorrecte");
                 return false;
              } 
          }
           
       }
 //------------------------------------------------------ 
  
  public static boolean verifNotVideEtInt(String j,String titre)
       {
          if(estVide(j))
          {
                  JOptionPane jop = new JOptionPane();
                  showMessageDialog( null," Le Champ de texte '"+titre+"' est vide");
                  return false;
          }
          else
          {
               if(estInt(j))
              {
                 return true;
	      }
              else
              {  
                 JOptionPane jop = new JOptionPane();
                 showMessageDialog( null," Le Champ de texte '"+titre+"' est incorrecte");
                 return false;
              } 
          }
           
       }
 //------------------------------------------------------ 
   public static boolean verifNotVide(String j,String titre)
       {
          if(estVide(j))
          {
                  JOptionPane jop = new JOptionPane();
                  showMessageDialog( null," Le Champ de texte '"+titre+"' est vide");
                  return false;
          }
          else
          {
             return true; 
          }
       }
//------------------------------------------------------
  public static boolean comboBoxSelectionner(int i,String titre)
       {
          if(i==-1)
          {
                  JOptionPane jop = new JOptionPane();
                  showMessageDialog( null," Selectionner votre "+titre);
                  return false;
          }
          else
          {
              return true;
          }
           
       }
 //------------------------------------------------------
    public static String[] DonnerHeure(String[] tab)
    {
        String[] heure=new String[]{"08:00--10:00","10:00--12:00","14:00--16:00","16:00--18:00"};
        String[] retour = new String[4-tab.length];
        int j=0;
        for(int i=0;i<4;i++)
        {
            if(!inArray(heure[i], tab)) {retour[j]=heure[i];j++;}
        }
       return retour;
    }
  //------------------------------------------------------
    public static boolean inArray(String ch,String[] tab) 
    {
        
        for (int i = 0; i < tab.length; i++) 
        {
           if(ch.equals(tab[i]))
           { return true;}
           
        }
            return false;
    }
    //------------------------------------------------------
}
