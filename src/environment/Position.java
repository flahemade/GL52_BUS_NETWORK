package environment;

public class Position {
	  public int x;
	  public int y;
	
	  public Position(int x, int y){
		  this.x=x;
		  this.y=y;
	  }
	  
	  public Position(){
		  this.x=-999;
		  this.y=-999;
	  }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Position add(Position p){
		return new Position(this.x + p.x, this.y + p.y);
	}
	  
	  

}