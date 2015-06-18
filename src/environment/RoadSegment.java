package environment;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

public class RoadSegment {

	private Position start;
	private Position end;
	private List<Bus> currentBus;
	private Intersection interStart;
	private Intersection interEnd;
	private int id;
	Color color;
	  
	  public RoadSegment(Position s, Position e, Intersection iS,Intersection iE , int i, Color c){
		  	this.start = s;
		  	this.end = e;
	  		this.currentBus = new ArrayList<Bus>();
	  		this.interStart = iS;
	  		this.interEnd = iE;
	  		this.id=i;
	  		this.color = c;
	  }
	  
	  public int getId(){
		  return id;
	  }
	  
	  public Color getColor(){
		  return color;
	  }
	  
	  public Position getStart(){
		  return start;
	  }
	  
	  public Position getEnd(){
		  return end;
	  }
	  
	  public void enterRoad(Bus b){
		  currentBus.add(b);
	  }
	  
	  public void leaveRoad(Bus b){
		  currentBus.remove(b);
	  }
	  
	  public float getLength(){
		  int X = (end.getX() - start.getX());
		  int Y = (end.getY() - start.getY());
		  
		  return (float) Math.sqrt(Math.pow(X,2) + Math.pow(Y, 2));
		  
	  }
}