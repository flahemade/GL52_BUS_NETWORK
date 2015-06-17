package main;

import java.util.ArrayList;

import environment.Map;
import environment.RoadSegment;
import environment.Simulator;
import gui.Window;

public class Main {
		public static Simulator simulator;
		
	  public static void main(String[] args) throws InterruptedException{
	    
	    Map m = new Map();
	    Window window = new Window(m);
	    
	    for(int i=0;i<10000000;i++){
	    	//simulator.run();
	    	i--;
	    	window.draw(new ArrayList<RoadSegment>());
	    }
	    
	    window.dispose();
	    
	  }      
	  
	  public static boolean generateMap() {
		return true;
	  }
}
