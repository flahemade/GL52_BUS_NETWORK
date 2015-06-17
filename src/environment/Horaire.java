package environment;
import java.text.SimpleDateFormat;
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
	  
	  public Date getTime() {
		  return time;
	  }

	  public void setTime(Date time) {
		  this.time = time;
	  }

	  public Line getLine() {
		  return line;
	  }

	  public void setLine(Line line) {
		  this.line = line;
	  }

	  public BusPanel getPanel() {
		  return panel;
	  }

	  public void setPanel(BusPanel panel) {
			this.panel = panel;
	  }

	  public String changetimeforme(Date time) {  
		  String strtime = new SimpleDateFormat("HH:mm").format(time); 
		  return strtime;
	  }

}