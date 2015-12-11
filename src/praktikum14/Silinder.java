package praktikum14;

public class Silinder extends Ring {
	

	double k6rgus;

	public Silinder(Ring alusring, double k6rgus) {
		super(alusring.keskpunkt, alusring.raadius);
		this.k6rgus = k6rgus;
	}
	
	private double kyljePindala(){
		return ymberm66t() * k6rgus;
	}
	
	public double pindala(){
		return kyljePindala() + 2 * super.pindala();
	}
	
	public double ruumala(){
		return super.pindala() * k6rgus;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Silindri pindala on " + pindala() + "\n"
				+ " ruumala on " + ruumala();
	}
	
}
