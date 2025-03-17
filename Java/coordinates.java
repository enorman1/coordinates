import javax.swing.*;
import java.awt.*;

import java.io.IOException;

import javax.swing.filechooser.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

//import java.io.*;
import java.io.IOException;

import java.net.URL;

import java.awt.Color;
import java.awt.Font;


public class coordinates {

	private static final int FRAME_SIZE_X = 170;  // size x 
	private static final int FRAME_SIZE_Y = 410;   // size y 
	
	private static final int Label1_LOCATION_X = 10;  // location x 
	private static final int Label1_LOCATION_Y = 0;  // location y 
	private static final int Label1_SIZE_X = 100;      // size height
	private static final int Label1_SIZE_Y = 15;       // size width
	
	private static final int Label2_LOCATION_X = 10;  // location x 
	private static final int Label2_LOCATION_Y = 15;  // location y 
	private static final int Label2_SIZE_X = 100;      // size height
	private static final int Label2_SIZE_Y = 15;       // size width
	
	private static final int Label3_LOCATION_X = 10;  // location x 
	private static final int Label3_LOCATION_Y = 40;  // location y 
	private static final int Label3_SIZE_X = 100;      // size height
	private static final int Label3_SIZE_Y = 15;       // size width
	
	private static final int Label4_LOCATION_X = 10;  // location x 
	private static final int Label4_LOCATION_Y = 70;  // location y 
	private static final int Label4_SIZE_X = 100;      // size height
	private static final int Label4_SIZE_Y = 15;       // size width
	
	private static final int Label5_LOCATION_X = 10;  // location x 
	private static final int Label5_LOCATION_Y = 100;  // location y 
	private static final int Label5_SIZE_X = 100;      // size height
	private static final int Label5_SIZE_Y = 15;       // size width
	
	private static final int Label6_LOCATION_X = 10;  // location x 
	private static final int Label6_LOCATION_Y = 130;  // location y 
	private static final int Label6_SIZE_X = 100;      // size height
	private static final int Label6_SIZE_Y = 15;       // size width
	
	private static final int Label7_LOCATION_X = 10;  // location x 
	private static final int Label7_LOCATION_Y = 160;  // location y 
	private static final int Label7_SIZE_X = 100;      // size height
	private static final int Label7_SIZE_Y = 15;       // size width
	
	private static final int Label8_LOCATION_X = 10;  // location x 
	private static final int Label8_LOCATION_Y = 190;  // location y 
	private static final int Label8_SIZE_X = 100;      // size height
	private static final int Label8_SIZE_Y = 15;       // size width
	
	private static final int Label9_LOCATION_X = 10;  // location x 
	private static final int Label9_LOCATION_Y = 230;  // location y 
	private static final int Label9_SIZE_X = 100;      // size height
	private static final int Label9_SIZE_Y = 15;       // size width
	
	private static final int Label10_LOCATION_X = 10;  // location x 
	private static final int Label10_LOCATION_Y = 245;  // location y 
	private static final int Label10_SIZE_X = 100;      // size height
	private static final int Label10_SIZE_Y = 15;       // size width
	
	private static final int Label11_LOCATION_X = 10;  // location x 
	private static final int Label11_LOCATION_Y = 265;  // location y 
	private static final int Label11_SIZE_X = 100;      // size height
	private static final int Label11_SIZE_Y = 15;       // size width
	
	private static final int Label12_LOCATION_X = 10;  // location x 
	private static final int Label12_LOCATION_Y = 320;  // location y 
	private static final int Label12_SIZE_X = 100;      // size height
	private static final int Label12_SIZE_Y = 15;       // size width
	
	private static final int Label13_LOCATION_X = 10;  // location x 
	private static final int Label13_LOCATION_Y = 200;  // location y 
	private static final int Label13_SIZE_X = 100;      // size height
	private static final int Label13_SIZE_Y = 15;       // size width
	
	// Creer les boutons et objets de l'interface graphique
	private static JLabel label1;
	private static JLabel label2;
	private static JLabel label3;
	private static JLabel label4;
	private static JLabel label5;
	private static JLabel label6;
	private static JLabel label7;
	private static JLabel label8;
	private static JLabel label9;
	private static JLabel label10;
	private static JLabel label11;
	private static JLabel label12;
	private static JLabel label13;
	
	private static JTextField X1;
	private static JTextField Y1;
	
	public static void main(String[] args) {
		
		// Creer la fenetre principale
        JFrame frame = new JFrame("coordinates");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_SIZE_X, FRAME_SIZE_Y);
        frame.setLocation(0, 0);
        frame.setResizable(false); //Disable the Resize Button
        frame.setLayout(new BorderLayout());
        
        ImageIcon icon = new ImageIcon("coordinates_128.png");
		frame.setIconImage(icon.getImage());
		
		// Chargement de l'image depuis les ressources du JAR
        //URL iconUrl = AESFileCrypt.class.getClassLoader().getResource("AESFileCrypt.png");
		//frame.setIconImage(tk.getImage(iconUrl));
		//System.out.println(iconUrl);
		//Image icon = null;
		
		//try {
        //    // Assurez-vous que le chemin est correct par rapport a votre structure de projet
        //    URL iconURL = coordinates.class.getResource("coordinates_128.png");
        //    if (iconURL != null) {
        //        //Image icon = ImageIO.read(iconURL);
        //        icon = ImageIO.read(iconURL);
        //    } else {
        //        System.err.println("L'icone n'a pas pu \u00EAtre charg\u00E9e.");
        //    }
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
        //if (icon != null)
        //{
        //	frame.setIconImage(icon);
        //	trueIcon = new ImageIcon(icon);
		//}
		
        
        // Panneau principal
        //JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        //JPanel panel = new JPanel();
        //frame.add(panel, BorderLayout.CENTER);
		//frame.add(panel);
		
        // Label pour l'information
        JLabel Label1 = new JLabel("Coordonn\u00E9es");
        Label1.setBounds(Label1_LOCATION_X, Label1_LOCATION_Y, Label1_SIZE_X, Label1_SIZE_Y);
        frame.add(Label1);
        JLabel Label2 = new JLabel("Cart\u00E9siennes");
        Label2.setBounds(Label2_LOCATION_X, Label2_LOCATION_Y, Label2_SIZE_X, Label2_SIZE_Y);
        frame.add(Label2);
        JLabel Label3 = new JLabel("Origines");
        Label3.setBounds(Label3_LOCATION_X, Label3_LOCATION_Y, Label3_SIZE_X, Label3_SIZE_Y);
        frame.add(Label3);
        JLabel Label4 = new JLabel("X");
        Label4.setBounds(Label4_LOCATION_X, Label4_LOCATION_Y, Label4_SIZE_X, Label4_SIZE_Y);
        frame.add(Label4);
        JLabel Label5 = new JLabel("Y");
        Label5.setBounds(Label5_LOCATION_X, Label5_LOCATION_Y, Label5_SIZE_X, Label5_SIZE_Y);
        frame.add(Label5);
        JLabel Label6 = new JLabel("Fin");
        Label6.setBounds(Label6_LOCATION_X, Label6_LOCATION_Y, Label6_SIZE_X, Label6_SIZE_Y);
        frame.add(Label6);
        JLabel Label7 = new JLabel("X");
        Label7.setBounds(Label7_LOCATION_X, Label7_LOCATION_Y, Label7_SIZE_X, Label7_SIZE_Y);
        frame.add(Label7);
        JLabel Label8 = new JLabel("Y");
        Label8.setBounds(Label8_LOCATION_X, Label8_LOCATION_Y, Label8_SIZE_X, Label8_SIZE_Y);
        frame.add(Label8);
        JLabel Label9 = new JLabel("Coordonn\u00E9es");
        Label9.setBounds(Label9_LOCATION_X, Label9_LOCATION_Y, Label9_SIZE_X, Label9_SIZE_Y);
        frame.add(Label9);
        JLabel Label10 = new JLabel("polaires (en \u00B0)");
        Label10.setBounds(Label10_LOCATION_X, Label10_LOCATION_Y, Label10_SIZE_X, Label10_SIZE_Y);
        frame.add(Label10);
        
        JLabel Label11 = new JLabel("Angle");
        Label11.setBounds(Label11_LOCATION_X, Label11_LOCATION_Y, Label11_SIZE_X, Label11_SIZE_Y);
        frame.add(Label11);
        
        JLabel Label12 = new JLabel("Longueur");
        Label12.setBounds(Label12_LOCATION_X, Label12_LOCATION_Y, Label12_SIZE_X, Label12_SIZE_Y);
        frame.add(Label12);
        
        JLabel Label13 = new JLabel(" ");
        Label13.setBounds(Label13_LOCATION_X, Label13_LOCATION_Y, Label13_SIZE_X, Label13_SIZE_Y);
        frame.add(Label13);
        
        //Creer la zone de texte
		X1 = new JTextField();
		//X1.setBounds(Label4_LOCATION_X + 30, Label4_LOCATION_Y, Label4_SIZE_X, Label4_SIZE_Y);
		X1.setEditable(true);
		// Change text font size
		//X1.setFont(new Font("SansSerif",Font.PLAIN,14)); //(new Font("Serif",Font.BOLD,12));
		// Change text font color
		//X1.setBackground(Color.WHITE);
		//X1.setForeground(Color.BLACK);
		frame.add(X1);	//Ajouter la zone de texte
		
        //Creer la zone de texte
		Y1 = new JTextField();
		//Y1.setBounds(Label5_LOCATION_X + 30, Label5_LOCATION_Y, Label5_SIZE_X, Label5_SIZE_Y);
		Y1.setEditable(true);
		// Change text font size
		//Y1.setFont(new Font("SansSerif",Font.PLAIN,14)); //(new Font("Serif",Font.BOLD,12));
		// Change text font color
		//Y1.setBackground(Color.WHITE);
		//Y1.setForeground(Color.BLACK);
		//frame.add(Y1);	//Ajouter la zone de texte
		
        
        // Rendre la fenetre visible
        frame.setVisible(true);
    }
}

