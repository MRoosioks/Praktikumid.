package praktikum14;

public class Katsetused {
	
	public static void main(String[] args) {
		
		Punkt minuPunkt = new Punkt(100, 200);
		
		Punkt veelYksPunkt = new Punkt(200, 200);
		
		System.out.println(minuPunkt);
		System.out.println(veelYksPunkt);
		
		Joon minuJoon = new Joon(minuPunkt,veelYksPunkt);
		System.out.println("Joone pikkus on " + minuJoon.pikkus());
		
		Ring minuRing = new Ring(minuPunkt, 100);
		System.out.println("Ringi ümbermõõt on " + minuRing.ymberm66t());
		System.out.println("Ringi pindala on " + minuRing.pindala());
		
		Silinder minuSilinder = new Silinder(Ring, 200); // rida vale

	}

}
