package abstractClassAndInterfaces;

interface Bicycle {
	static int a = 45;

	void applyBrake(int decrement);

	void SpeedUp(int increment);
}

interface HornBicycle {
	void Blowhorn();
	void BlowHornK3G();

	void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
	public void Blowhorn() {
		System.out.println("Pee Pee Pee Pee");
	}

	public void applyBrake(int decrement) {
		System.out.println("Applying Brake!!");
	}

	public void SpeedUp(int increment) {
		System.out.println("Incresing Speed!!");
	}

	public void BlowHornK3G() {
		System.out.println("Kabhi Khush Kabhi Gham");
	}

	public void blowHornmhn() {
		System.out.println("Main Hoon Naa!");
	}
}

public class InterFaces {

	public static void main(String[] args) {
		AvonCycle c1 = new AvonCycle();
		c1.applyBrake(2);
//		You can create Properties in Interfaces!
//		System.out.println(c1.a);
//		You cannot modify the properties in interfaces as they are Final!
//		c1.a = 2000;-->Illegal!
//		System.out.println(c1.a);
		c1.Blowhorn();
		c1.blowHornmhn();

	}
}
