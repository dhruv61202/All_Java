package cwh_ExceptionHandling;
import java.util.Scanner;
public class SpecExc {
	
	public static void main(String[] args) {
		try {
			int [] marks = new int[3];
			marks[0] = 7;
			marks[1] = 56;
			marks[2] = 12;
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter the array Index");
			int ind = sc.nextInt();
			
			System.out.println("Enter the number you want to divide the value with");
			int number = sc.nextInt();
			
			try {
				System.out.println("The value of array index entered is: "+marks[ind]);
				System.out.println("The value of array-value/number is " + marks[ind]/number);
				
			}
			catch(ArithmeticException e){
//				System.out.println("Some exception occoured!!");
				System.out.println(e);
				}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			
		}
		finally
		{
//			System.out.println("Dhruv!");
		}
	}

}
