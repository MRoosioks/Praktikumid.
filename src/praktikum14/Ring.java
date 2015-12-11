package praktikum14;

public class Ring {
	
	Punkt keskpunkt;
	double raadius;
	
	public Ring(Punkt keskpunkt, double raadius) {	
		this.keskpunkt = keskpunkt;
		this.raadius = raadius;
	}
	
	public double ymberm66t(){
		return 2 * Math.PI * raadius;
	}
	public double pindala(){
		return Math.PI * Math.pow(raadius, 2);
	}
	
	
}
