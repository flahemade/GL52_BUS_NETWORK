import java.awt.Color;
import java.util.List;

public class Line {

	public Color color;
    public int id;
    public List<Itinerary> itineraries;

    public Line(Color c, int i, List<Itinerary> it){
    	this.color=c;
    	this.id=i;
    	this.itineraries=it;
    }
}