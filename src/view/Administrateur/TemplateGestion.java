package view.Administrateur;

import control.Parametre;
import static control.Parametre.cheminIcone;
import static control.Parametre.parti1;
import static control.Parametre.parti2;
import java.awt.Color;
import static java.awt.Color.white;
import static java.awt.Cursor.DEFAULT_CURSOR;
import java.awt.Rectangle;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import view.Fenetre;


public class TemplateGestion extends  Fenetre
{
    public TemplateGestion(Rectangle r) 
    {
        label9=new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        pan8 = new javax.swing.JPanel();
        pan9 = new javax.swing.JPanel();
        label8 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        pan2 = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        pan3 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        pan4 = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        pan5 = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        pan6 = new javax.swing.JPanel();
        label6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        pan7 = new javax.swing.JPanel();
        label7 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        pan1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panel1 = new javax.swing.JPanel();
        deconnecter = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        pan = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        titre = new javax.swing.JLabel();
//------------------------------------------------------------------------------
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(r);
        setTitle("Template de Gestion");
        contenu.add(panel3);
        contenu.add(jScrollPane1);
        contenu.add(panel1);
        contenu.add(pan);
        contenu.add(panel2);
//------------------------------------------------------------------------------
        panel3.setBackground(parti2);
        panel3.setLayout(null);
        panel3.add(t4);
        panel3.add(pan5);
        panel3.add(t5);
        panel3.add(pan6);
        panel3.add(t6);
        panel3.add(pan7);
        panel3.add(t7); 
        panel3.add(pan1);
        panel3.add(t1);
        panel3.setBounds(10, 150, 380, 370); 
        panel3.add(pan4);
        panel3.add(pan8);
        panel3.add(pan9);
        panel3.add(t8);
        panel3.add(t9);
        panel3.add(pan2);
        panel3.add(t2); 
        panel3.add(pan3);
        panel3.add(t3);
 //------------------------------------------------------------------------------
        panel2.setBackground(parti1);
        panel2.setForeground(new java.awt.Color(255, 102, 0));
        panel2.setLayout(null); 
        panel2.add(titre);
        panel2.setBounds(10, 100, 380, 50);
//------------------------------------------------------------------------------
        panel1.setBackground(parti2);
        panel1.setLayout(null);
        panel1.setBounds(10, 10, 990, 80);
        panel1.add(deconnecter);
        panel1.add(retour);
//------------------------------------------------------------------------------
        pan.add(supprimer);
        pan.setBounds(10, 530, 990, 80);
        pan.add(annuler); 
        pan.add(modifier);
        pan.add(ajouter); 
        pan.setBackground(new java.awt.Color(255, 255, 255));
        pan.setBorder(createLineBorder(new java.awt.Color(0, 0, 0)));
        pan.add(jButton2);
        pan.setLayout(null);
        pan8.setBackground(new java.awt.Color(255, 255, 255));
        pan8.setForeground(new java.awt.Color(255, 102, 0));
        pan8.setLayout(null);
        pan8.add(label8);
        pan8.setBounds(10, 290, 170, 30);
        
        pan9.setBackground(new java.awt.Color(255, 255, 255));
        pan9.setForeground(new java.awt.Color(255, 102, 0));
        pan9.setLayout(null);
        pan9.add(label9);
        pan9.setBounds(10, 330 , 170, 30);
        
        pan2.setBackground(new java.awt.Color(255, 255, 255));
        pan2.setForeground(new java.awt.Color(255, 102, 0));
        pan2.setLayout(null);
        pan2.add(label2);
        pan2.setBounds(10, 50, 170, 30);
        pan3.setBackground(new java.awt.Color(255, 255, 255));
        pan3.setForeground(new java.awt.Color(255, 102, 0));
        pan3.setLayout(null); 
        pan3.add(label3);
        pan3.setBounds(10, 90, 170, 30);
        pan4.setBackground(new java.awt.Color(255, 255, 255));
        pan4.setForeground(new java.awt.Color(255, 102, 0));
        pan4.setLayout(null);
        pan4.setBounds(10, 130, 170, 30); 
        pan4.add(label4);
        pan5.setBackground(new java.awt.Color(255, 255, 255));
        pan5.setForeground(new java.awt.Color(255, 102, 0));
        pan5.setLayout(null); 
        pan5.add(label5);
        pan5.setBounds(10, 170, 170, 30);
        pan6.setBackground(new java.awt.Color(255, 255, 255));
        pan6.setForeground(new java.awt.Color(255, 102, 0));
        pan6.setLayout(null); 
        pan6.add(label6);
        pan6.setBounds(10, 210, 170, 30);
        pan7.setBackground(new java.awt.Color(255, 255, 255));
        pan7.setForeground(new java.awt.Color(255, 102, 0));
        pan7.setLayout(null);
        pan7.setBounds(10, 250, 170, 30);
        pan7.add(label7);
        pan1.setBackground(new java.awt.Color(255, 255, 255));
        pan1.setForeground(new java.awt.Color(255, 102, 0));
        pan1.setLayout(null);
        pan1.setBounds(10, 10, 170, 30); 
        pan1.add(label1);
//------------------------------------------------------------------------------
        label1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label1.setText("L1");
        label1.setBounds(0, 0, 170, 30);
        label2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label2.setText("L2");
        label2.setBounds(0, 0, 170, 30);
        label3.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label3.setText("L3");
        label3.setBounds(0, 0, 170, 30);
        label4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label4.setText("L4");
        label4.setBounds(0, 0, 170, 30);
        label5.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label5.setText("L5");
        label5.setBounds(0, 0, 170, 30);
        label6.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label6.setText("L6");
        label6.setBounds(0, 0, 170, 30);
        label7.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label7.setText("L7");
        label7.setBounds(0, 0, 170, 30);
        label8.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label8.setText("L8");
        label8.setBounds(0, 0, 170, 30);
        label9.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        label9.setText("L9");
        label9.setBounds(0, 0, 170, 30);
//------------------------------------------------------------------------------
        t1.setBounds(200, 10, 170, 30);
        t2.setBounds(200, 50, 170, 30);
        t3.setBounds(200, 90, 170, 30);
        t4.setBounds(200, 130, 170, 30);
        t5.setBounds(200, 170, 170, 30);
        t6.setBounds(200, 210, 170, 30);
        t7.setBounds(200, 250, 170, 30);
        t8.setBounds(200, 290, 170, 30);
        t9.setBounds(200, 330, 170, 30);
//------------------------------------------------------------------------------
        t1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        t2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        t3.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        t4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        t5.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        t6.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        t7.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        t8.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        t9.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
//------------------------------------------------------------------------------
        table.setBackground(new java.awt.Color(0, 0, 0));
        table.setBorder(createLineBorder(new java.awt.Color(255, 255, 255)));
        table.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        colonne=new String[]{"col1","col2","col3"};
        row=new Object[][]{ {null,null,null},{null,null,null},};
        table.setModel(new javax.swing.table.DefaultTableModel(row,colonne));
        table.setCursor(new java.awt.Cursor(DEFAULT_CURSOR));
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(40);
        table.setFont(new java.awt.Font("Yu Gothic Light", 1, 18));
        table.setRowMargin(2);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.setSelectionForeground(new java.awt.Color(0, 0, 0));
//------------------------------------------------------------------------------
        jScrollPane1.setViewportView(table);
        jScrollPane1.setBounds(400, 100, 600, 420);
//------------------------------------------------------------------------------
        deconnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"deconnecter.png"))); // NOI18N
        deconnecter.setBounds(80, 10, 60, 60);
//------------------------------------------------------------------------------
        retour.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"retour.png"))); // NOI18N
        retour.setBounds(10, 10, 60, 60);       
//------------------------------------------------------------------------------
        supprimer.setBackground(new java.awt.Color(204, 204, 255));
        supprimer.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"inscrire.png"))); // NOI18N
        supprimer.setText("Supprimer");
        supprimer.setBorder(createTitledBorder(""));
        supprimer.setBounds(370, 10, 200, 60);
//------------------------------------------------------------------------------
        ajouter.setBackground(new java.awt.Color(204, 204, 255));
        ajouter.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"inscrire.png"))); // NOI18N
        ajouter.setText("Ajouter");
        ajouter.setBorder(createTitledBorder(""));
        ajouter.setBounds(10, 10, 170, 60);
//------------------------------------------------------------------------------
        annuler.setBackground(new java.awt.Color(204, 204, 255));
        annuler.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"inscrire.png"))); // NOI18N
        annuler.setText("Annuler");
        annuler.setBorder(createTitledBorder(""));
        annuler.setBounds(580, 10, 170, 60);
//------------------------------------------------------------------------------
        modifier.setBackground(new java.awt.Color(204, 204, 255));
        modifier.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource(cheminIcone+"inscrire.png"))); // NOI18N
        modifier.setText("Modifier");
        modifier.setBorder(createTitledBorder(""));
        modifier.setBounds(190, 10, 170, 60);
//------------------------------------------------------------------------------
        titre.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        titre.setText("L1");
        titre.setBounds(10, 10, 300, 30);
        titre.setForeground(white);
//------------------------------------------------------------------------------
}
        
    protected javax.swing.JButton ajouter;
    protected javax.swing.JButton annuler;
    protected javax.swing.JButton deconnecter;
    protected javax.swing.JButton jButton2;
    protected javax.swing.JPanel pan6;
    protected javax.swing.JPanel pan7;
    protected javax.swing.JPanel pan1;
    protected javax.swing.JPanel pan;
    protected javax.swing.JPanel pan8;
    protected javax.swing.JPanel pan9;
    protected javax.swing.JPanel pan2;
    protected javax.swing.JPanel pan3;
    protected javax.swing.JPanel pan4;
    protected javax.swing.JPanel pan5;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JLabel label1;
    protected javax.swing.JLabel label2;
    protected javax.swing.JLabel label3;
    protected javax.swing.JLabel label4;
    protected javax.swing.JLabel label5;
    protected javax.swing.JLabel label6;
    protected javax.swing.JLabel label7;
    protected javax.swing.JLabel label8;
    protected javax.swing.JLabel label9;
    protected javax.swing.JButton modifier;
    protected javax.swing.JPanel panel1;
    protected javax.swing.JPanel panel2;
    protected javax.swing.JPanel panel3;
    protected javax.swing.JButton retour;
    protected javax.swing.JButton supprimer;
    protected javax.swing.JTextField t1;
    protected javax.swing.JTextField t2;
    protected javax.swing.JTextField t3;
    protected javax.swing.JTextField t4;
    protected javax.swing.JTextField t5;
    protected javax.swing.JTextField t6;
    protected javax.swing.JTextField t7;
    protected javax.swing.JTextField t8;
    protected javax.swing.JTextField t9;
    protected javax.swing.JTable table;
    protected javax.swing.JLabel titre;
    String[] colonne;
    Object[][] row;
    // End of variables declaration                   
}
