package poly;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
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

public class MyPoly extends JFrame{
	
		//create two buttons 
		JButton jbtplus = new JButton ("+1"); //increase polygon sides by 1
		JButton jbtmin = new JButton ("-1"); // decrease polygon sides by 1
		polyPanel canvas = new polyPanel();
	
		
		
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
	     
	     //create yellowAction
	 	 ColorAction yellowAction = new ColorAction(Color.YELLOW);		
	 	 //associate actions with buttons
		 Yellow.addActionListener(yellowAction);	     
	     
		 //add Yellow to menu
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
	public MyPoly() {
		//panel to hold buttons 
		JPanel panel = new JPanel();
		panel.add(jbtplus); //add increase button to panel
		panel.add(jbtmin); // add decrease button to panel 
		
		jbtplus.addActionListener(new EnlargeListener());
		jbtmin.addActionListener(new DecreaseListener());
		

		 
		// jbtEnlarge.addActionListener(new EnlargeListener());
		this.add(panel, BorderLayout.SOUTH); //place panel on bottom of page 
		this.add(canvas, BorderLayout.CENTER); //place canvas in center of page
	}
	

	private static void createAndShowGUI() {
		JFrame frame = new MyPoly(); 
		MyPoly demo = new MyPoly(); 
		frame.setJMenuBar (demo.createMenuBar());
		frame.setTitle("Assignment");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	} 
	
	
	
		public static void main (String[] args) {
			 javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	//display GUI 
		                createAndShowGUI();
		            }
		        });	
		}	


		class polyPanel extends JPanel 
		{
			private int radius = 5; 
			
			public void enlarge() {
				radius ++; 
				repaint();
			}
			
			public void decrease() {
				radius --;
				repaint();
			}
			
			protected void paintComponent (Graphics g) {
				super.paintComponent(g);
				g.drawOval(getWidth()/2 - radius, getHeight()/2 - radius, radius *2, radius *2);
				
			}
		}

		class EnlargeListener implements ActionListener {
			public void actionPerformed (ActionEvent e) {
				canvas.enlarge();
			}
		}
		
		class DecreaseListener implements ActionListener {
			public void actionPerformed (ActionEvent e) {
				canvas.decrease();
			}
		}
		
		private class ColorAction implements ActionListener{
			private Color backgroundColor;
			
			public ColorAction (Color c)
			{
				backgroundColor = c;
			}
			
			public void actionPerformed (ActionEvent event) 
			{
				canvas.setBackground(backgroundColor);
			}
		}
	
}



	
