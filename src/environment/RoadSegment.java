package environment;
import java.util.ArrayList;
import java.util.List;

public class RoadSegment {

	  public Position start;
	  public Position end;
	  public List<Bus> currentBus;
	  public Intersection interStart;
	  public Intersection interEnd;
	  public int id;
	  
	  public RoadSegment(Position s, Position e, Intersection iS,Intersection iE , int i){
		  	this.start = s;
		  	this.end = e;
	  		this.currentBus = new ArrayList<Bus>();
	  		this.interStart = iS;
	  		this.interEnd = iE;
	  		this.id=i;
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