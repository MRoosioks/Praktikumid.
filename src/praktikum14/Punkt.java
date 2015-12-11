package praktikum14;

public class Punkt {
	
	private double x, y;
	
	public Punkt(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Punkt (" + x + ", " + y + ")";
	}
}
