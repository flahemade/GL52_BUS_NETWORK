package environment;

import java.util.Iterator;

public class Bus {

	  private int id;
	  private boolean arrived = false;
	  private RoadSegment roadSegment;
	  private Iterator<RoadSegment> itinerary;
	  //portion of the roadSegment it already went trough
	  private float portion = 0;
	  private float speed = 20;
	  
	  public Bus(int id, Itinerary i){
		  this.id=id;
		  this.itinerary = i.loadIterator();
		  if (itinerary.hasNext()){
			  this.roadSegment=itinerary.next();
		  }
		  else{
		  	arrived = true;
		  }
			  
	  }
	  
	  //Getters and setters
	  
	public int getId() {
		return id;
	}

	public boolean isArrived(){
		return arrived;
	}
	
	public RoadSegment getRoadSegment() {
		return roadSegment;
	}

	

	public void update(float delta) {
		float dist = speed * delta/1000;
		
		float p = portion + (dist/(roadSegment.getLength()));
		
		if (p<1){
			//we are still in the roadSegment
			portion = p;
		}
		else{
			//We are out of the segment
			 if (itinerary.hasNext()){
				//We take away the distance to the end of the roadsegment
				dist= dist - (portion*roadSegment.getLength());
				
				//we change roadsegment, following the itinerary
				roadSegment = itinerary.next();
				
				//we compute the portion of the new segment
				portion = (dist/(roadSegment.getLength()));
			 }
			 else{
				 //We reached the terminus
				 arrived = true;
			 }
		}
	}

}