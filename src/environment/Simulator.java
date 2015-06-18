package environment;


public class Simulator {
	
	private Network network;
	
	private long time;
	private long previousTime;

	public Simulator(Network n){

		this.network = n;
		time = System.nanoTime();
	}
	

	public void run(float delta){

		
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