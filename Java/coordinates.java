// UI Generated with the help of GuiGenie (developed by Mario Awad).
//

import java.awt.*;
import java.awt.KeyboardFocusManager;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.Font;

import java.text.DecimalFormat;  //import  package

import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;

public class coordinates extends JPanel implements ActionListener {
    private static final int FRAME_SIZE_X = 170;  // size x 
	private static final int FRAME_SIZE_Y = 410;   // size y 
	
	private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    private JTextField text5;
    private JTextField text6;
    private JCheckBox ckBox1;
    private JCheckBox ckBox2;
    private JCheckBox ckBox3;
    private JLabel label13;

    public coordinates() {
        //construct components
        label1 = new JLabel ("Coordonn\u00E9es");
        label2 = new JLabel ("cart\u00E9siennes");
        label3 = new JLabel ("Origine");
        label4 = new JLabel ("X");
        label5 = new JLabel ("Y");
        label6 = new JLabel ("Fin");
        label7 = new JLabel ("X");
        label8 = new JLabel ("Y");
        label9 = new JLabel ("Coordonn\u00E9es");
        label10 = new JLabel ("polaires (en \u00B0)");
        label11 = new JLabel ("Angle");
        label12 = new JLabel ("Longueur");
        text1 = new JTextField (0);
        text2 = new JTextField (0);
        text3 = new JTextField (0);
        text4 = new JTextField (0);
        text5 = new JTextField (0);
        text6 = new JTextField (0);
        ckBox1 = new JCheckBox ("fig\u00E9");
        ckBox2 = new JCheckBox ("fig\u00E9");
        ckBox3 = new JCheckBox ("fig\u00E9");
        label13 = new JLabel ("------------------------------");

        //adjust size and set layout
        setPreferredSize (new Dimension (170, 349));
        setLayout (null);

        //add components
        add (label1);
        add (label2);
        add (label3);
        add (label4);
        add (label5);
        add (label6);
        add (label7);
        add (label8);
        add (label9);
        add (label10);
        add (label11);
        add (label12);
        add (text1);
        add (text2);
        add (text3);
        add (text4);
        add (text5);
        add (text6);
        add (ckBox1);
        add (ckBox2);
        add (ckBox3);
        add (label13);

        //set component bounds (only needed by Absolute Positioning)
        label1.setBounds (10, 0, 100, 25);
        label2.setBounds (10, 15, 100, 25);
        label3.setBounds (10, 35, 60, 25);
        label4.setBounds (10, 60, 15, 25);
        label5.setBounds (10, 90, 15, 25);
        label6.setBounds (10, 115, 60, 25);
        label7.setBounds (10, 140, 15, 25);
        label8.setBounds (10, 170, 15, 25);
        label9.setBounds (10, 205, 100, 25);
        label10.setBounds (10, 220, 100, 25);
        label11.setBounds (10, 245, 70, 25);
        label12.setBounds (10, 290, 70, 25);
        text1.setBounds (25, 60, 135, 25);
        text2.setBounds (25, 90, 135, 25);
        text3.setBounds (25, 140, 135, 25);
        text4.setBounds (25, 170, 135, 25);
        text5.setBounds (25, 270, 135, 25);
        text6.setBounds (25, 315, 135, 25);
        ckBox1.setBounds (110, 35, 55, 25);
        ckBox2.setBounds (110, 115, 55, 25);
        ckBox3.setBounds (110, 245, 55, 25);
        label13.setBounds (8, 195, 155, 17);
        
        // Change text font size
		text1.setFont(new Font("SansSerif",Font.PLAIN,14)); //(new Font("Serif",Font.BOLD,12));
        text2.setFont(new Font("SansSerif",Font.PLAIN,14)); //(new Font("Serif",Font.BOLD,12));
        text3.setFont(new Font("SansSerif",Font.PLAIN,14)); //(new Font("Serif",Font.BOLD,12));
        text4.setFont(new Font("SansSerif",Font.PLAIN,14)); //(new Font("Serif",Font.BOLD,12));
        text5.setFont(new Font("SansSerif",Font.PLAIN,14)); //(new Font("Serif",Font.BOLD,12));
        text6.setFont(new Font("SansSerif",Font.PLAIN,14)); //(new Font("Serif",Font.BOLD,12));
        
        // initiate the 0
        text1.setText ("0");
        text2.setText ("0");
        text3.setText ("0");
        text4.setText ("0");
        text5.setText ("0");
        text6.setText ("0");
        
        ckBox1.setFocusable(false);
        ckBox2.setFocusable(false);
        ckBox3.setFocusable(false);
        
        //Add a change listener to this JTextField:
        // url: https://www.codejava.net/java-se/swing/jtextfield-basic-tutorial-and-examples
    	// URL: http://www.java2s.com/Code/Java/Swing-JFC/ValidateavalueonthelostFocusevent.htm
		// URL: https://docs.oracle.com/javase/tutorial/uiswing/events/focuslistener.html
		// URL: http://www.java2s.com/Code/Java/Swing-JFC/NumericTextField.htm
		// ULR: http://www.java2s.com/Tutorial/Java/0260__Swing-Event/Movingfocusto{extcomponentfocusNextComponent.htm
		// URL: https://javapointers.com/java/java-se/actionlistener/
        text1.addActionListener(this);
		text2.addActionListener(this);
		text3.addActionListener(this);
		text4.addActionListener(this);
		text5.addActionListener(this);
		text6.addActionListener(this);
		
		text1.addFocusListener(new FocusListener() {
			//@Override
			public void focusGained(FocusEvent event) {
				 //displayMessage("Focus gained", event);
				 text1.selectAll();
			}
			public void focusLost(FocusEvent event) {
				//displayMessage("Focus lost", event);
				text1.setText(text1.getText().replace(',', '.'));
				if (isNumeric(text1.getText())) { UpdateCoord("text1");}
				else { text1.setText("0");}
			}
		});
		text2.addFocusListener(new FocusListener() {
			//@Override
			public void focusGained(FocusEvent event) {
				 //displayMessage("Focus gained", event);
				 text2.selectAll();
			}
			public void focusLost(FocusEvent event) {
				//displayMessage("Focus lost", event);
				text2.setText(text2.getText().replace(',', '.'));
				if (isNumeric(text2.getText())) { UpdateCoord("text2");}
				else { text2.setText("0");}
			}
		});
		text3.addFocusListener(new FocusListener() {
			//@Override
			public void focusGained(FocusEvent event) {
				 //displayMessage("Focus gained", event);
				 text3.selectAll();
			}
			public void focusLost(FocusEvent event) {
				//displayMessage("Focus lost", event);
				text3.setText(text3.getText().replace(',', '.'));
				if (isNumeric(text3.getText())) { UpdateCoord("text3");}
				else { text3.setText("0");}
			}
		});
		text4.addFocusListener(new FocusListener() {
			//@Override
			public void focusGained(FocusEvent event) {
				 //displayMessage("Focus gained", event);
				 text4.selectAll();
			}
			public void focusLost(FocusEvent event) {
				//displayMessage("Focus lost", event);
				text4.setText(text4.getText().replace(',', '.'));
				if (isNumeric(text4.getText())) { UpdateCoord("text4");}
				else { text4.setText("0");}
			}
		});
		text5.addFocusListener(new FocusListener() {
			//@Override
			public void focusGained(FocusEvent event) {
				 //displayMessage("Focus gained", event);
				 text5.selectAll();
			}
			public void focusLost(FocusEvent event) {
				//displayMessage("Focus lost", event);
				text5.setText(text5.getText().replace(',', '.'));
				if (isNumeric(text5.getText())) { UpdateCoord("text5");}
				else { text5.setText("0");}
			}
		});
		text6.addFocusListener(new FocusListener() {
			//@Override
			public void focusGained(FocusEvent event) {
				 //displayMessage("Focus gained", event);
				 text6.selectAll();
			}
			public void focusLost(FocusEvent event) {
				//displayMessage("Focus lost", event);
				text6.setText(text6.getText().replace(',', '.'));
				if (isNumeric(text6.getText())) { UpdateCoord("text6");}
				else { text6.setText("0");}
			}
		});
		
		
	}
	
    @Override
    public void actionPerformed(ActionEvent e) {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    	manager.focusNextComponent();
    }
    
    private boolean isNumeric(String text) {
    	boolean ret = true;
    	// URL: https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
    	if (text == null || text.trim().equals("")) {
		    ret = false;
		}
		else {
			try {Double.parseDouble(text);}
			catch(NumberFormatException e){  
				ret = false;  
			}  
		}
		return ret;
	}
    
    private double CosDegree(double angle) {
		final double Pi = 3.1415926535897932384626433832795;
		final double SqRt2 = 1.4142135623730950488016887242097;
		final double SqRt3 = 1.7320508075688772935274463415059;
		
		if (angle >= 360) {
		 angle = angle - (360 * Math.floor(angle / 360.0));}
		if (angle <= -360) {
		 angle = angle + (360 * Math.floor(angle / -360.0));}
		if (angle < 0) { angle = angle + 360;}

		// Valeurs remarquables du cosinus
		if (angle == 0.) { return 1;}
		else if (angle == 30.0) { return SqRt3 / 2.;}
		else if (angle == 45.0) { return SqRt2 / 2.;}
		else if (angle == 60.0) { return 0.5;}
		else if (angle == 90.0) { return 0;}
		else if (angle == 120.0) { return -0.5;}
		else if (angle == 135.0) { return -SqRt2 / 2.;}
		else if (angle == 150.0) { return -SqRt3 / 2.;}
		else if (angle == 180.0) { return -1;}
		else if (angle == 210.0) { return -SqRt3 / 2.;}
		else if (angle == 225.0) { return -SqRt2 / 2.;}
		else if (angle == 240.0) { return -0.5;}
		else if (angle == 270.0) { return 0;}
		else if (angle == 300.0) { return 0.5;}
		else if (angle == 315.0) { return SqRt2 / 2.;}
		else if (angle == 330.0) { return SqRt3 / 2.;}
		else if (angle == 360.0) { return 1;}
		else { return Math.cos(angle * Pi / 180.);}
	}

	private double SinDegree(double angle) {
		final double Pi = 3.1415926535897932384626433832795;
		final double SqRt2 = 1.4142135623730950488016887242097;
		final double SqRt3 = 1.7320508075688772935274463415059;
		
		if (angle >= 360) {
		angle = angle - (360 * Math.floor(angle / 360.0));}
		if (angle <= -360) {
		angle = angle + (360 * Math.floor(angle / -360.0));}
		if (angle < 0) { angle = angle + 360;}

		// Valeurs remarquables du sinus
		if (angle == 0.) { return 0;}
		else if (angle == 30.0) { return 0.5;}
		else if (angle == 45.0) { return SqRt2 / 2.;}
		else if (angle == 60.0) { return SqRt3 / 2.;}
		else if (angle == 90.0) { return 1;}
		else if (angle == 120.0) { return SqRt3 / 2.;}
		else if (angle == 135.0) { return SqRt2 / 2.;}
		else if (angle == 150.0) { return 0.5;}
		else if (angle == 180.0) { return 0;}
		else if (angle == 210.0) { return -0.5;}
		else if (angle == 225.0) { return -SqRt2 / 2.;}
		else if (angle == 240.0) { return -SqRt3 / 2.;}
		else if (angle == 270.0) { return -1;}
		else if (angle == 300.0) { return -SqRt3 / 2.;}
		else if (angle == 315.0) { return -SqRt2 / 2.;}
		else if (angle == 330.0) { return -0.5;}
		else if (angle == 360.0) { return 0;}
		else { return Math.sin(angle * Pi / 180.);}
	}
    
    
	public void UpdateCoord(String source) {
		double X1;
		double Y1;
		double X2;
		double Y2;
		double angle;
		double uLength;
		final double Pi = 3.1415926535897932384626433832795;
		
		X1 = Double.parseDouble(text1.getText());
		Y1 = Double.parseDouble(text2.getText());
		X2 = Double.parseDouble(text3.getText());
		Y2 = Double.parseDouble(text4.getText());
		angle = Double.parseDouble(text5.getText());
		uLength = Double.parseDouble(text6.getText());
  
		if (source.equals("text1") ) {
			//System.out.println("1");
			if (ckBox1.isSelected()) {
			  if (ckBox2.isSelected()) {
				if (ckBox3.isSelected()) {
				  X1 = X2 - (uLength * CosDegree(angle));
				  Y1 = Y2 - (uLength * Math.sin(angle * Pi / 180.));
				}
				else {
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			  else {
				if (ckBox3.isSelected()) {
				  X2 = X1 + (uLength * CosDegree(angle));
				  Y2 = Y1 + (uLength * Math.sin(angle * Pi / 180.));
				}
				else {
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			}
			else {
			  if (ckBox2.isSelected()) {
				if (ckBox3.isSelected()) {
				  X1 = X2 - (uLength * CosDegree(angle));
				  Y1 = Y2 - (uLength * Math.sin(angle * Pi / 180.));
				}
				else {
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			  else {
				if (ckBox3.isSelected()) {
				  X2 = X1 + (uLength * CosDegree(angle));
				  Y2 = Y1 + (uLength * Math.sin(angle * Pi / 180.));
				}
				else {
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			}
		}
		else if (source.equals("text2") ) {
			//System.out.println("2");
			if (ckBox1.isSelected()) {
			  if (ckBox2.isSelected()) {
			  	if (ckBox3.isSelected()) {
				  X1 = X2 - (uLength * CosDegree(angle));
				  Y1 = Y2 - (uLength * Math.sin(angle * Pi / 180.));
				}
				else
				{
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			  else
			  {
				if (ckBox3.isSelected()) {
				  X2 = X1 + (uLength * CosDegree(angle));
				  Y2 = Y1 + (uLength * Math.sin(angle * Pi / 180.));
				}
				else
				{
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			}
			else {
				if (ckBox2.isSelected()) {
					if (ckBox3.isSelected()) {
						X1 = X2 - (uLength * CosDegree(angle));
						Y1 = Y2 - (uLength * Math.sin(angle * Pi / 180.));
					}
					else {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
				}
				else {
					if (ckBox3.isSelected()) {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * Math.sin(angle * Pi / 180.));
					}
					else {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
				}
			}
		}
		else if (source.equals("text3") ) {
			//System.out.println("3");
			if (ckBox2.isSelected()) {
				if (ckBox1.isSelected()) {
					if (ckBox3.isSelected()) {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * Math.sin(angle * Pi / 180.));
					}
					else
					{
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
				}
			  else
			  {
				if (ckBox3.isSelected()) {
				  X1 = X2 - (uLength * CosDegree(angle));
				  Y1 = Y2 - (uLength * Math.sin(angle * Pi / 180.));
				}
				else
				{
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			}
			else
			{
			  if (ckBox1.isSelected()) {
			  	if (ckBox3.isSelected()) {
				  X2 = X1 + (uLength * CosDegree(angle));
				  Y2 = Y1 + (uLength * Math.sin(angle * Pi / 180.));
				}
				else
				{
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			  else
			  {
				if (ckBox3.isSelected()) {
				  X1 = X2 - (uLength * CosDegree(angle));
				  Y1 = Y2 - (uLength * Math.sin(angle * Pi / 180.));
				}
				else
				{
				  uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
				  angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
			  }
			}
		}
		else if (source.equals("text4") ) {
			//System.out.println("4");
			if (ckBox2.isSelected()) {
				if (ckBox1.isSelected()) {
					if (ckBox3.isSelected()) {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * Math.sin(angle * Pi / 180.));
					}
					else {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
				}
				else {
					if (ckBox3.isSelected()) {
						X1 = X2 - (uLength * CosDegree(angle));
						Y1 = Y2 - (uLength * Math.sin(angle * Pi / 180.));
					}
					else {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
				}
			}
			else {
				if (ckBox1.isSelected()) {
					if (ckBox3.isSelected()) {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * Math.sin(angle * Pi / 180.));
					}
					else {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
				}
				else {
					if (ckBox3.isSelected()) {
						X1 = X2 - (uLength * CosDegree(angle));
						Y1 = Y2 - (uLength * SinDegree(angle));
					}
					else {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
				}
			}
		}
		else if (source.equals("text5") ) {
			//System.out.println("5");
			if (ckBox3.isSelected()) {
				if (ckBox1.isSelected()) {
					if (ckBox2.isSelected()) {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
					else {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * SinDegree(angle));
					}
				}
				else {
					if (ckBox2.isSelected()) {
						X1 = X2 - (uLength * CosDegree(angle));
						Y1 = Y2 - (uLength * SinDegree(angle));
					}
					else {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * SinDegree(angle));
					}
				}
			}
			else
			{
				if (ckBox1.isSelected()) {
					if (ckBox2.isSelected()) {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
					else {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * SinDegree(angle));
					}
				}
				else
					{
					if (ckBox2.isSelected()) {
						X1 = X2 - (uLength * CosDegree(angle));
						Y1 = Y2 - (uLength * SinDegree(angle));
					}
					else {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * SinDegree(angle));
					}
				}
			}
		}
		else if (source.equals("text6") ) {
			//System.out.println("6");
			if (ckBox3.isSelected()) {
				if (ckBox1.isSelected()) {
					if (ckBox2.isSelected()) {
					uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
					angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
				}
				else {
					X2 = X1 + (uLength * CosDegree(angle));
					Y2 = Y1 + (uLength * SinDegree(angle));
					}
				}
				else {
					if (ckBox2.isSelected()) {
					X1 = X2 - (uLength * CosDegree(angle));
					Y1 = Y2 - (uLength * SinDegree(angle));
				}
				else {
					X2 = X1 + (uLength * CosDegree(angle));
					Y2 = Y1 + (uLength * SinDegree(angle));
					}
				}
			}
			else {
				if (ckBox1.isSelected()) {
					if (ckBox2.isSelected()) {
						uLength = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
						angle = Math.atan2((Y2-Y1), (X2-X1)) * 180. / Pi;  //returns degrees
					}
					else {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * SinDegree(angle));
					}
				}
				else {
					if (ckBox2.isSelected()) {
						X1 = X2 - (uLength * CosDegree(angle));
						Y1 = Y2 - (uLength * SinDegree(angle));
					}
					else {
						X2 = X1 + (uLength * CosDegree(angle));
						Y2 = Y1 + (uLength * SinDegree(angle));
					}
				}
			}
		}
		
		DecimalFormat df=new DecimalFormat("#.##########");
		text1.setText(df.format(X1));
		text2.setText(df.format(Y1));
		text3.setText(df.format(X2));
		text4.setText(df.format(Y2));
		text5.setText(df.format(angle));
		text6.setText(df.format(uLength));
		
		//text1.setText(Double.toString(X1)); //Origin_X
		//text2.setText(Double.toString(Y1)); //Origin_Y
		//text3.setText(Double.toString(X2)); //}_X
		//text4.setText(Double.toString(Y2)); //}_Y
		//text5.setText(Double.toString(angle)); //Angle
		//text6.setText(Double.toString(uLength)); //Length
		
		//text1.setText(String.format("%.0f",X1)); //Origin_X
		//text2.setText(String.format("%.0f",Y1)); //Origin_Y
		//text3.setText(String.format("%.0f",X2)); //}_X
		//text4.setText(String.format("%.0f",Y2)); //}_Y
		//text5.setText(String.format("%.0f",angle)); //Angle
		//text6.setText(String.format("%.0f",uLength)); //Length
		
		text1.setCaretPosition(0);
		text2.setCaretPosition(0);
		text3.setCaretPosition(0);
		text4.setCaretPosition(0);
		text5.setCaretPosition(0);
		text6.setCaretPosition(0);
		
	}
    
    void displayMessage(String prefix, FocusEvent e) {
        System.out.println(prefix
                       + (e.isTemporary() ? " (temporary):" : ":")
                       +  e.getComponent().getClass().getName()
                       + "; Opposite component: " 
                       + (e.getOppositeComponent() != null ?
                          e.getOppositeComponent().getClass().getName() : "null")
                       ); 
    }
    
    public static void main (String[] args) {
    	Image icon = null;
		ImageIcon trueIcon = null;
    	
        JFrame frame = new JFrame ("Coordinates");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        //frame.setSize(FRAME_SIZE_X, FRAME_SIZE_Y);
        frame.setLocation(0, 0);
        frame.setResizable(false); //Disable the Resize Button
        
        // Chargement de l'icone depuis le fichier image
        //ImageIcon icon = new ImageIcon("coordinates_128.png");
		//frame.setIconImage(icon.getImage());
		
		// Chargement de l'image depuis les ressources du JAR
        //URL iconUrl = coordinates.class.getClassLoader().getResource("coordinates_128.png");
		//frame.setIconImage(tk.getImage(iconUrl));
		//System.out.println(iconUrl);
		//Image icon = null;
		
		// Chargement de l'image depuis les ressources du JAR
        try {
            // Assurez-vous que le chemin est correct par rapport a votre structure de projet
            URL iconURL = coordinates.class.getResource("coordinates_128.png");
            if (iconURL != null) {
                //Image icon = ImageIO.read(iconURL);
                icon = ImageIO.read(iconURL);
            } else {
                System.err.println("L'icone n'a pas pu \u00EAtre charg\u00E9e.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (icon != null)
        {
        	frame.setIconImage(icon);
        	trueIcon = new ImageIcon(icon);
		}
		
        frame.getContentPane().add (new coordinates());
        frame.pack();
        frame.setVisible (true);
    }
}



