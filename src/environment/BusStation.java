package environment;
import java.util.List;

public class BusStation {

	public String name;
    public List<BusPanel>  panels;

    public BusStation(String n, List<BusPanel> p){
    	this.name=n;
    	this.panels=p;
    }
}