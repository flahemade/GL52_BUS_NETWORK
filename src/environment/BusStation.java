package environment;
import java.util.ArrayList;
import java.util.List;

public class BusStation {

	private String name;
	private List<BusPanel>  panels;
	private Position position;
	Line line;

    public BusStation(String n, Position p, Line l){
    	this.name=n;
    	this.position=p;
    	this.line = l;
    	
    	panels.add(new BusPanel(p, new ArrayList<Horaire>(), this, line.getItineraries().get(0)));
    	panels.add(new BusPanel(p, new ArrayList<Horaire>(), this, line.getItineraries().get(1)));
    	
    }
    
    public Position getPosition(){
    	return position;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BusPanel> getPanels() {
		return panels;
	}

	public void setPanels(List<BusPanel> panels) {
		this.panels = panels;
	}
	  
	public boolean addHoraire(BusPanel busPanel) {
		return panels.add(busPanel);
	}

	public boolean removeHoraire(BusPanel busPanel) {
		return panels.remove(busPanel);
	}
	
	//output the schedule of each line at a station 
	public void outputBusPanel(){ 
		System.out.println("Bus Station :" + getName()); 
		for (BusPanel buspanel: getPanels()) 
		{ 
		 System.out.println("Line " + buspanel.getItinerary().getLine() + " : " + buspanel.getPassages()); 
		}
    }

	@Override
	public String toString() {
		return name;
	}
	
}