package environment;


public class Simulator {
	
	private Network network;
	
	private long time;
	private long previousTime;

	public Simulator(Network n){

		this.network = n;
		time = System.nanoTime();
		
		for(Line l: n.getLines()){
			for(Itinerary i: l.getItineraries()){
				n.addBus(i);
			}
		}
	}
	

	public void run(){

		previousTime = time;
		time = System.nanoTime();
		
		//delta is expressed in milliseconds
		float delta = (float) ((time - previousTime) * Math.pow(10,-6));
		
		//For each bus, we update the position
		for (Bus bus : network.getBus() ) {
			bus.update(delta);
			if(bus.isArrived()){
				network.removeBus(bus);
			}
		}

		//System.out.println("Run a cycle.");
	}

}