package stringMethodsCWH;

import java.awt.print.Printable;

//package stringMethodsCWH;



//Creating the custom wrapper class  
class Javatpoint{
	private int i;

	Javatpoint() {
	}

	Javatpoint(int i) {
		this.i = i;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
}

//Testing the custom wrapper class  
public class CustomWrapperClass {
	public static void main(String[] args) {
		try {
			System.out.println("DhruvVbg");
			System.out.println("DhruvVbg");
			System.out.println("DhruvVbg");
//			System.out.println("DhruvVbg");
//			System.out.println("DhruvVbg");
		}
		catch(Exception e) {
			System.out.println("Exc occ");
//			return
		}
		finally {
			System.out.println("djfiusdf");
		}
		Javatpoint j = new Javatpoint(10);
		System.out.println(j);
	}
}
