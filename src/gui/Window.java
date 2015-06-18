package gui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import environment.Bus;
import environment.BusStation;
import environment.Itinerary;
import environment.Line;
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
	
	private JButton but1,but2,but3,but4,but5,imageButton;
	private JPanel pan;
	private Map m;
	private Network n;
	private boolean segmentSource;
	private boolean busStop;
	private Position currentSource;
	private ArrayList<RoadSegment> currentSegments;
	private BusStation dep;
	private BusStation arr;
	private Line currentLine;

	public Window(Map m,Network n)
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
        
        but1=new JButton("Add an itinerary");
        pan.add(but1);      
        but2=new JButton("Add a stop");
        pan.add(but2);
        but5=new JButton("Add a line");
        pan.add(but5);
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

	public boolean draw(ArrayList<RoadSegment> rs){
		Graphics g = pan.getGraphics();
		for (RoadSegment r : rs) {
			g.setColor(r.getColor());
			Graphics2D g2=(Graphics2D)g;
		    g2.setStroke(new BasicStroke(3));
			g2.drawLine(
					r.getEnd().getX(), 
					r.getEnd().getY(),
					r.getStart().getX(), 
					r.getStart().getY()
					);
		}
		for (BusStation b : m.getStations()){
			g.drawOval(b.getPosition().getX(), b.getPosition().getY(), 10, 10);
		}
		if(n!=null){
			for (Bus b : n.getBus()){
			g.drawRect(
					b.getRoadSegment().getStart().getX(), 
					b.getRoadSegment().getStart().getY(), 
					10, 
					5);
			}
		}
		return true;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object source = e.getSource();
		if(source == but1){
			if(!segmentSource){
				segmentSource = true;
				currentSource.setX(-999);
				String name = JOptionPane.showInputDialog(this,
		                "To which line does this itinerary belong ?", null);
				currentLine = new Line(Color.BLUE,Integer.parseInt(name));
			}
		}else if(source == but2){
			if(!busStop){
				busStop=true;
			}
		}else if(source == but3){
			//run();
		}else if(source == but4){
			
			if(segmentSource){
				String name = JOptionPane.showInputDialog(this,
                        "Name the last stop.", null);
				arr = new BusStation(name,new Position(e.getX(),e.getY()),currentLine);
				Itinerary i = new Itinerary(currentSegments,dep,arr,currentLine);
				segmentSource=false;
			}
			if(busStop)busStop=false;
		}else if(source == imageButton){
			if(segmentSource){
				if(currentSource.getX()==-999){
					String name = JOptionPane.showInputDialog(this,
	                        "Name the first stop.", null);
					dep = new BusStation(name,new Position(e.getX(),e.getY()),currentLine);
					currentSource.setX(e.getX());
					currentSource.setY(e.getY());
				}else{
					m.addRoadSegment(new Position(currentSource.getX(),currentSource.getY()),new Position(e.getX(),e.getY()),currentLine.getColor());
					currentSource.setX(e.getX());
					currentSource.setY(e.getY());
				}
			}else if(busStop){
				String name = JOptionPane.showInputDialog(this,
                        "Name of the stop.", null);
				m.addBusStation(name,new Position(e.getX(),e.getY()),currentLine);
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