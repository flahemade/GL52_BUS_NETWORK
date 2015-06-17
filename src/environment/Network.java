package environment;
import java.util.List;

public class Network {
	
    private List<Line> lines;
    private List<Bus> bus;

	public Network(){
	}
	
	public void addLine(Line l){
		lines.add(l);
	}
	
	public List<Line> getLines(){
		return lines;
	}
	
	public List<Bus> getBus(){
		return bus;
	}
	
	public void addBus(Itinerary i){
		int id = 0;
		int currentBusID = bus.get(id).getId();
		while(currentBusID == id && id<bus.size()){
			id++;
			currentBusID = bus.get(id).getId();
		}
		

		if(id<bus.size()){
			//an index was free: we give it to the new bus
			bus.add(id,new Bus(id, i));
		}
		else{
			//no index was free: we create a new one
			bus.add(new Bus(id, i));
		}
		
	}
	
	public void removeBus(Bus b){
		bus.remove(b);
	}

}