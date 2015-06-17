package environment;

import java.util.List;

public class Map {

	private List<RoadSegment> roads;
	private List<BusStation> stations;
	
	public Map() {
	}
	
	public void addRoadSegment(Position start, Position end){
		int id = 0;
		int currentListID = roads.get(id).getId();
		while(currentListID == id && id<roads.size()){
			id++;
			currentListID = roads.get(id).getId();
		}
		
		if(id<roads.size()){
			//an index was free: we give it to the new bus
			roads.add(id,new RoadSegment(start,end,null,null,id));
		}
		else{
			//no index was free: we create a new one
			roads.add(new RoadSegment(start,end,null,null,id));
		}
	}
	
	public List<RoadSegment> getRoads(){
		return roads;
	}
}
