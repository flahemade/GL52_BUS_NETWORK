package environment;

public class Simulator {

	public Simulator(){
	}
	
	public void tickTime() {
	}

	public void run(Network network){
		System.out.println("Run a cycle.");
		//For each bus. Progress ++
		for (Line line : network.lines ) {
			for(Itinerary itinerary : line.itineraries){
				for(Bus bus : itinerary.buses){
					itinerary.findNext(bus);
				}
			}
		}
	}

}