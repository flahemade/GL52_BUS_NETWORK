package main;

import java.util.ArrayList;

import environment.Map;
import environment.Network;
import environment.RoadSegment;
import environment.Simulator;
import gui.Window;

public class Main {
	
	static boolean run = false;
	

		public static Simulator simulator;
		
	  public static void main(String[] args) throws InterruptedException{
	    
	    Map m = new Map();
	    Network n = new Network();
	    Window window = new Window(m,n);
	    
	    simulator = new Simulator(n);
	    
	    for(int i=0;i<10000000;i++){
	    	if(run) {
	    		simulator.run();
	    	}
	    	i--;
	    	Thread.sleep(500);
	    	window.draw((ArrayList<RoadSegment>)m.getRoads());
	    }
	    
	    window.dispose();
	    
	  }      
	  
	  public static boolean generateMap() {
		return true;
	  }
		public boolean isRun() {
			return run;
		}

		public static void setRun(boolean r) {
			run = r;
		}
}
