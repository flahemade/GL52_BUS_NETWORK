package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7446192599263749847L;
	
		private JPanel panel = new JPanel();
		private JButton bouton = new JButton("First Button");


		public Window(){
		    this.setTitle("GL52 | BusNetwork");
		    this.setSize(300, 150);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    panel.add(bouton);
		    this.setContentPane(panel);
		    this.setVisible(true);
		}  
}
