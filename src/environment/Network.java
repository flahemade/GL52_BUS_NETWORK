package environment;
import java.util.List;

public class Network {
	
    private List<Line> lines;
    private List<Bus> bus;

	public Network(List<Line> l){
		this.lines=l;
	}
	
	public List<Line> getLines(){
		return lines;
	}
	
	public List<Bus> getBus(){
		return bus;
	}

}