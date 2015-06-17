package environment;
import java.util.List;

public class BusPanel {

	private Position position;
	private List<Horaire> passages;
	private BusStation station;
	private Line line;

  public BusPanel(Position po , List<Horaire> pa , BusStation s , Line l){
	  this.position=po;
	  this.passages=pa;
	  this.station=s;
	  this.line=l;
  }

  public Position getPosition() {
	  return position;
  }

  public void setPosition(Position position) {
	  this.position = position;
  }

  public List<Horaire> getPassages() {
	  return passages;
  }

  public void setPassages(List<Horaire> passages) {
	  this.passages = passages;
  }

  public BusStation getStation() {
	  return station;
  }

  public void setStation(BusStation station) {
	  this.station = station;
  }

  public Line getLine() {
	  return line;
  }

  public void setLine(Line line) {
	  this.line = line;
  }

  public boolean addHoraire(Horaire horaire) {
	  return passages.add(horaire);
  }

  public boolean removeHoraire(Horaire horaire) {
	  return passages.remove(horaire);
  }
 
}