package cwh_ExceptionHandling;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int a = 100;
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("The value of c is-->" + c);
		} catch (ArithmeticException e) {
			System.out.println("Haha");
		} catch (Exception e) {
			System.out.println("Hehe");
		}
	}
}
