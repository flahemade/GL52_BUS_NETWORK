package environment;
import java.util.ArrayList;
import java.util.List;

public class Itinerary {
	
	  public List<RoadSegment> segments;
	  public List<Bus> buses;
	  public BusStation start;
	  public BusStation end;
	  public Line  line;
	
	  public Itinerary(List<RoadSegment> se, BusStation s, BusStation e, Line l){
		  this.segments=se;
		  this.buses=new ArrayList<Bus>();
		  this.start=s;
		  this.end=e;
		  this.line=l;
	  }
	  
	  public RoadSegment findNext(Bus b){
		  return b.getRoadSegment() + 1;
	  }

}