package main;

import gui.Window;
import javax.swing.JFrame;

public class Main {
	
	  public static void main(String[] args) throws InterruptedException{
	    JFrame window = new Window();
	    
	    for(int i=0;i<1000000;i++){
	    	System.out.println("Running");
	    }
	    window.dispose();
	    
	  }      
}
