package environment;
import java.util.ArrayList;
import java.util.List;

public class RoadSegment {

	  public Position start;
	  public Position end;
	  public List<Bus> CurrentBus;
	  public Intersection interStart;
	  public Intersection interEnd;
	  public int id;
	  
	  public RoadSegment(Position s, Position e, Intersection iS,Intersection iE , int i){
		  	this.start = s;
		  	this.end = e;
	  		this.CurrentBus = new ArrayList<Bus>();
	  		this.interStart = iS;
	  		this.interEnd = iE;
	  		this.id=i;
	  }
}