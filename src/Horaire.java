import java.util.Date;

public class Horaire {
	
	  public Date time;
	  public Line line;
	  public BusPanel  panel;
	  
	  public Horaire(Date t, Line l, BusPanel p){
		  this.time=t;
		  this.line=l;
		  this.panel=p;
	  }

}