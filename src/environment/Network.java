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

}