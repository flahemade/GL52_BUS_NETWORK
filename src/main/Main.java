package main;

import java.util.ArrayList;

import environment.Bus;
import environment.RoadSegment;
import environment.Simulator;
import gui.Window;

public class Main {
		public static Simulator simulator;
		
	  public static void main(String[] args) throws InterruptedException{
	    Window window = new Window();
	    
	    generateMap();
	    
	    for(int i=0;i<10000000;i++){
	    	//simulator.run();
	    	i--;
	    	window.draw(new ArrayList<RoadSegment>(),new ArrayList<Bus>());
	    }
	    
	    window.dispose();
	    
	  }      
	  
	  public static boolean generateMap() {
		return true;
	  }
}
