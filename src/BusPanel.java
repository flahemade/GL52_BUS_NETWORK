import java.util.List;

public class BusPanel {

  public Position position;
  public List<Horaire> passages;
  public BusStation station;

  public BusPanel(Position po , List<Horaire> pa , BusStation s){
	  this.position=po;
	  this.passages=pa;
	  this.station=s;
  }
}