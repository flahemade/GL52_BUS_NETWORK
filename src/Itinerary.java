import java.util.List;

public class Itinerary {
	
	  public List<RoadSegment> segments;
	  public BusStation start;
	  public BusStation end;
	  public Line  line;
	
	  public Itinerary(List<RoadSegment> se, BusStation s, BusStation e, Line l){
		  this.segments=se;
		  this.start=s;
		  this.end=e;
		  this.line=l;
	  }
	  
	  public void runBus() {
	  }

}