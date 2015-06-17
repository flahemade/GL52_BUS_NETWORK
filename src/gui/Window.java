package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import environment.Bus;
import environment.RoadSegment;

public class Window extends JFrame implements ActionListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7446192599263749847L;
	
	private JButton but1,but2,but3,imageButton;
	JPanel pan;
	ArrayList<RoadSegment> rs;
	ArrayList<Bus> bl;

	public Window()
    {
        super("GL52 | Bus Network");                 
        setSize(new Dimension(800,680));    
        
        pan=new JPanel();
        BoxLayout bl=new BoxLayout(pan,BoxLayout.Y_AXIS);
        pan.setLayout(bl);       



		ImageIcon image = new ImageIcon("res/output.png");
		imageButton = new JButton("",image);
        pan.add( imageButton, BorderLayout.CENTER );   

        imageButton.addActionListener(this);

        JPanel  pan2=new   JPanel(); 
        bl=new BoxLayout(pan2,BoxLayout.X_AXIS); 
        pan2.setLayout(bl);       
        
        but1=new JButton("Add a line");
        pan.add(but1);      
        but2=new JButton("Add a stop");
        pan.add(but2);
        but3=new JButton("Run");
        pan.add(but3);  

        //Listeners
        
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        
        setContentPane(pan);        
        setVisible(true);    
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == but1){
			System.out.println("Click sur le bouton \"Add a line\"");
		}else if(source == but2){
			System.out.println("Click sur le bouton \"Add a stop\"");
			//setStop=true;
		}else if(source == but3){
			System.out.println("Click sur le bouton \"Run\"");
			//run();
		}else if(source == imageButton){
			System.out.println("Click sur l'image.");
		}
	}  
	
	public void draw(ArrayList<RoadSegment> rs, ArrayList<Bus> bl){
		Graphics g = pan.getGraphics();
		for (RoadSegment r : rs) {
			g.drawLine(r.getStart().getX(), r.getStart().getY(), r.getEnd().getX(), r.getEnd().getX());
		}
		for (Bus b : bl){
		}
	}

}