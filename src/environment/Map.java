package environment;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Map {

	private List<RoadSegment> roads;
	private List<BusStation> stations;
	
	public Map() {
		roads = new ArrayList<RoadSegment>();
		stations = new ArrayList<BusStation>();
	}
	
	public RoadSegment addRoadSegment(Position start, Position end, Color color){
		RoadSegment rs = new RoadSegment(start,end,null,null,roads.size(), color);
		roads.add(rs);
		return rs ;
	}
	
	public List<RoadSegment> getRoads(){
		return roads;
	}
	
	public boolean addBusStation(String name, Position p, Line l){
		boolean taken = false;
		for(BusStation s: stations){
			if(name.equals(s.getName())){
				taken = true;
			}
		}
		if(taken == true)
		{
			return false;
		}
		else{

			stations.add(new BusStation(name,p,l));
			return true;
		}
	}
	
	public List<BusStation> getStations(){
		return stations;
	}
	
}
