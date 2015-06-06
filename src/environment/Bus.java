package environment;

public class Bus {

	  private int id;
	  private RoadSegment roadSegment;
	  private int itineraryPosition;
	  
	  public Bus(int i, RoadSegment r){
		  this.id=i;
		  this.roadSegment=r;
	  }
	  
	  //Getters and setters
	  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoadSegment getRoadSegment() {
		return roadSegment;
	}

	public void setRoadSegment(RoadSegment roadSegment) {
		this.roadSegment = roadSegment;
	}

	public int getItineraryPosition() {
		return itineraryPosition;
	}

	public void setItineraryPosition(int itineraryPosition) {
		this.itineraryPosition = itineraryPosition;
	}
}