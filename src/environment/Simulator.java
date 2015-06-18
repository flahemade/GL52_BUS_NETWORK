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
		}

		for(int i = 0; i< network.getBus().size();i++){
			if(network.getBus().get(i).isArrived()){
				network.removeBus(network.getBus().get(i));
			}
		}

		//System.out.println("Run a cycle.");
	}

}