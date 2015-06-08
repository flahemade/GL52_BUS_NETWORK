package environment;
import java.util.List;

public class BusStation {

	public String name;
	public List<BusPanel>  panels;

    public BusStation(String n, List<BusPanel> p){
    	this.name=n;
    	this.panels=p;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BusPanel> getPanels() {
		return panels;
	}

	public void setPanels(List<BusPanel> panels) {
		this.panels = panels;
	}
}