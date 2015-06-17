package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import environment.BusPanel;
import environment.Map;
import environment.Network;
import environment.Position;
import environment.RoadSegment;

public class Window extends JFrame implements MouseListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7446192599263749847L;
	
	private JButton but1,but2,but3,but4,imageButton;
	private JPanel pan;
	private Map m;
	private Network n;
	private boolean segmentSource;
	private boolean busStop;
	private Position currentSource;

	public Window(Map m)
    {
        super("GL52 | Bus Network");                 
        setSize(new Dimension(800,680));    
        this.m = m;
        pan=new JPanel();
        BoxLayout bl=new BoxLayout(pan,BoxLayout.Y_AXIS);
        pan.setLayout(bl);       

        segmentSource=false;
        busStop=false;
        currentSource=new Position();
        
		ImageIcon image = new ImageIcon("res/output.png");
		imageButton = new JButton("",image);
        pan.add( imageButton, BorderLayout.CENTER );   

        imageButton.addMouseListener(this);

        JPanel  pan2=new   JPanel(); 
        bl=new BoxLayout(pan2,BoxLayout.X_AXIS); 
        pan2.setLayout(bl);       
        
        but1=new JButton("Add a line");
        pan.add(but1);      
        but2=new JButton("Add a stop");
        pan.add(but2);
        but4=new JButton("Finish");
        pan.add(but4);  
        but3=new JButton("Run");
        pan.add(but3);  

        //Listeners
        
        but1.addMouseListener(this);
        but2.addMouseListener(this);
        but3.addMouseListener(this);
        but4.addMouseListener(this);
        
        setContentPane(pan);        
        setVisible(true);    
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	public void draw(ArrayList<RoadSegment> rs){
		Graphics g = pan.getGraphics();
		for (RoadSegment r : rs) {
			g.drawLine(
					r.getStart().getX(), 
					r.getStart().getY(), 
					r.getEnd().getX(), 
					r.getEnd().getX()
					);
		}
		/*for (Bus b : n.getBus()){
			
			g.drawRect(
					b.getRoadSegment().getStart().getX(), 
					b.getRoadSegment().getStart().getY(), 
					10, 
					5);
		}*/
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object source = e.getSource();
		if(source == but1){
			if(!segmentSource){
				segmentSource = true;
				currentSource.setX(-999);
			}
			System.out.println(currentSource.getX()+":"+currentSource.getY());
		}else if(source == but2){
			if(!busStop){
				busStop=true;
			}
		}else if(source == but3){
			System.out.println("Click sur le bouton \"Run\"");
			//run();
		}else if(source == but4){
			System.out.println("Click sur le bouton \"Finish\"");
			if(segmentSource)segmentSource=false;
			if(busStop)busStop=false;
		}else if(source == imageButton){
			if(segmentSource){
				System.out.println("Click sur la map : "+e.getX()+"/"+e.getY());
				if(currentSource.getX()==-999){
					currentSource.setX(e.getX());
					currentSource.setY(e.getY());
					System.out.println(currentSource.getX()+":"+currentSource.getY());
				}else{
					m.addRoadSegment(currentSource,new Position(e.getX(),e.getY()));
				}
			}else if(busStop){
				//m.addBusStation(Position p, String name);
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}