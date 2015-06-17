package environment;

public class Simulator {

	public Simulator(){
	}
	
	public void tickTime() {
	}

	public void run(Network network){
		System.out.println("Run a cycle.");
		//For each bus. Progress ++
		for (Bus bus : network.getBus() ) {
			bus.update();
		}
	}

}