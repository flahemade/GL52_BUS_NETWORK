package environment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itinerary {
	
	private List<RoadSegment> segments;
	private BusStation start;
	private BusStation end;
	private Line  line;
	
	  public Itinerary(List<RoadSegment> se, BusStation s, BusStation e, Line l){
		  this.segments=se;
		  this.start=s;
		  this.end=e;
		  this.line=l;
	  }
	  
	  public Iterator<RoadSegment> loadIterator(){
		  return segments.iterator();
	  }

}