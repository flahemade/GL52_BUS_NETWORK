package environment;


public class Simulator {
	
	private Network network;
	
	private long time;
	private long previousTime;

	public Simulator(){
	}
	
	public void tickTime() {
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
	}

	public void run(Network n){
		time = System.nanoTime();
		
		this.network = n;
		System.out.println("Run a cycle.");
		this.tickTime();
	}

}