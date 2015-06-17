package environment;


public class Simulator {
	
	Network network;
	
	long time;
	long previousTime;

	public Simulator(){
	}
	
	public void tickTime() {
		previousTime = time;
		time = System.nanoTime();
		
		float delta = (float) time - previousTime;
		
		//For each bus, we update the position
		for (Bus bus : network.getBus() ) {
			bus.update(delta);
		}
	}

	public void run(Network n){
		time = System.nanoTime();
		
		this.network = n;
		System.out.println("Run a cycle.");
		this.tickTime();
	}

}