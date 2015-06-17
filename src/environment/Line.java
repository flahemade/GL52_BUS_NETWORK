package environment;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Line {


	private List<Itinerary> itineraries;
	private Color color;
	private int id;

    public Line(Color c, int i){
    	this.color=c;
    	this.id=i;
    	this.itineraries = new ArrayList<Itinerary>();
    }
    
    public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Itinerary> getItineraries() {
		return itineraries;
	}

	public void addItinerarie(Itinerary itinerary) {
		this.itineraries.add(itinerary);
	}


    
}