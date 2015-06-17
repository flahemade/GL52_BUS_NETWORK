package environment;

import java.util.Iterator;

public class Bus {

	  private int id;
	  private RoadSegment roadSegment;
	  private Iterator<RoadSegment> itinerary;
	  
	  public Bus(int id, Itinerary i){
		  this.id=id;
		  this.itinerary = i.loadIterator();
		  this.roadSegment=itinerary.next();
	  }
	  
	  //Getters and setters
	  
	public int getId() {
		return id;
	}


	public RoadSegment getRoadSegment() {
		return roadSegment;
	}

	public void setRoadSegment(RoadSegment roadSegment) {
		this.roadSegment = roadSegment;
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

}