package environment;
import java.util.List;

public class BusPanel {

	private Position position;
	private List<Horaire> passages;
	private BusStation station;
	private Itinerary itinerary;

  public BusPanel(Position po , List<Horaire> pa , BusStation s , Itinerary i){
	  this.position=po;
	  this.passages=pa;
	  this.station=s;
	  this.itinerary=i;
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

  public Itinerary getItinerary() {
	  return itinerary;
  }


  public boolean addHoraire(Horaire horaire) {
	  return passages.add(horaire);
  }

  public boolean removeHoraire(Horaire horaire) {
	  return passages.remove(horaire);
  }
 
}