package control;


import java.awt.Color;
import static java.awt.Color.DARK_GRAY;
import static java.awt.Color.GREEN;
import static java.awt.Color.ORANGE;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import static java.awt.Color.magenta;
import static java.awt.Color.white;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import modele.Theme;
import static modele.Theme.monTheme;



public class Parametre 
{
  public static int x=1017;
  public static int y=650;
  public static Color arrierePlan;
  public static Color parti1;
  public static Color parti2;
  public static String cheminIcone;
  public static Rectangle fenetre=new Rectangle(337, 50, x, y);
  public static Font font1=new Font("Calibri Light", 20, 22);

  
   
 public static JPanel champ (String nom,int x,int y)
 {
     JPanel p=new JPanel();
     JLabel l=new JLabel();
     p.setBounds(x, y, 150, 30);
     p.setBackground(white);
     p.add(l);
     l.setBackground(black);
     l.setBounds(x, y, x, y);
     l.setText(nom+" :");
     l.setFont(font1);
     
     return p;
 }
 
 
 public static void theme()
 {
        switch (monTheme()) {
            case "theme1":
                theme1 ();
                break;
            case "theme2":
                theme2 ();
                break;
            case "theme3":
                theme3 ();
                break;
            case "theme4":
                theme4 ();
                break;
            case "theme11":
                theme11 ();
                break;
            case "theme22":
                theme22 ();
                break;
            case "theme33":
                theme33 ();
                break;
            case "theme44":
                theme44 ();
                break;
        }
   
 }
 
 public static void theme1 ()
 {
   arrierePlan =black;
   parti1 =DARK_GRAY;
   parti2 =gray;
   cheminIcone="/image/img3/";         
 }
  public static void theme2 ()
 {
   arrierePlan =white;
   parti1 =magenta.darker();
   parti2 =magenta;
   cheminIcone="/image/img3/";         
 }
 
  public static void theme3 ()
 {
   arrierePlan =white;
   parti1 =GREEN.darker();
   parti2 =black;
   cheminIcone="/image/img3/";         
 }
  
 public static void theme4 ()
 {
   arrierePlan =white;
   parti1 =black;
   parti2 =ORANGE;
   cheminIcone="/image/img3/";         
 }
 public static void theme11 ()
 {
   arrierePlan =black;
   parti1 =DARK_GRAY;
   parti2 =gray;
   cheminIcone="/image/img1/";         
 }
  public static void theme22 ()
 {
   arrierePlan =white;
   parti1 =magenta.darker();
   parti2 =magenta;
   cheminIcone="/image/img1/";         
 }
 
  public static void theme33 ()
 {
   arrierePlan =white;
   parti1 =GREEN.darker();
   parti2 =black;
   cheminIcone="/image/img1/";         
 }
  
 public static void theme44 ()
 {
   arrierePlan =white;
   parti1 =black;
   parti2 =ORANGE;
   cheminIcone="/image/img1/";         
 }
}
