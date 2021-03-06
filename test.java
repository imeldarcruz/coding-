import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;


public class test extends JFrame{
	public JMenuBar createMenuBar() {
		//create a menu bar
		JMenuBar menuBar = new JMenuBar(); 
		
		//Build the color Menu
		JMenu menu = new JMenu ("Pick Colors");
		 //menu.setMnemonic(KeyEvent.VK_A);
	     menu.getAccessibleContext().setAccessibleDescription(
	                "The only menu in this program that has menu items");
	     menuBar.add(menu);
	     
	     
	     //add a color option to the menu -Yellow
	     JMenuItem Yellow = new JMenuItem ("Yellow");
	     Yellow.getAccessibleContext().setAccessibleDescription("Color1");
	     menu.add(Yellow);

	     //add a color option to the menu- Blue
	     JMenuItem Blue = new JMenuItem ("Blue");
	     Blue.getAccessibleContext().setAccessibleDescription("Color2");
	     menu.add(Blue);
	     
	     //add a color option to the menu - Green
	     JMenuItem Green = new JMenuItem ("Green");
	     Green.getAccessibleContext().setAccessibleDescription("Color3");
	     menu.add(Green);
	     

	     //Build second menu in the menu bar.
	     menu = new JMenu("Another Menu");
	     // menu.setMnemonic(KeyEvent.VK_N);
	     menu.getAccessibleContext().setAccessibleDescription("This menu does nothing");
	     menuBar.add(menu);
	          
	     return menuBar; 
	}


	private static void createAndShowGUI() {
		JFrame frame = new JFrame(); 
		test demo = new test(); 
		frame.setJMenuBar (demo.createMenuBar());
		//frame.setsetContentPane(demo.createContentPane());
		frame.setTitle("Assignment");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	} 
	
	
	
		public static void main (String[] args) {
			 javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                createAndShowGUI();
		            }
		        });	
		}	


}
	

	
	

