package praktikum14;

public class Joon {

	public static void main(String[] args) {

	}

	Punkt algusPunkt, l6ppPunkt;

	public Joon(Punkt algusPunkt, Punkt l6ppPunkt) {
		this.algusPunkt = algusPunkt;
		this.l6ppPunkt = l6ppPunkt;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Joon (" + algusPunkt + ", " + l6ppPunkt + ")";
	}

	public double pikkus(){
		double a = l6ppPunkt.getX() - algusPunkt.getY();
		double b = l6ppPunkt.getY() - algusPunkt.getX();
		double h = Math.sqrt(Math.pow(a, 2) + Math.pow (b, 2));
		return h;
	}

}
