package main;

import gui.Window;
import environment.Simulator;
import javax.swing.JFrame;

public class Main {
		public static Simulator simulator;
		
	  public static void main(String[] args) throws InterruptedException{
	    JFrame window = new Window();
	    
	    generateMap();
	    
	    for(int i=0;i<10000000;i++){
	    	//simulator.run();
	    	i--;
	    }
	    
	    window.dispose();
	    
	  }      
	  
	  public static boolean generateMap() {
		return true;
	  }
}
