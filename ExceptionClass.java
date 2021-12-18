package cwh_ExceptionHandling;

import java.util.Scanner;

class MyException extends Exception {
	@Override
	public String toString() {
		return "I am toString()";
	}

	@Override
	public String getMessage() {
		return "I am getMessage()";
	}
}

public class ExceptionClass {
	public static void main(String[] args) {
//		int a = 8;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a < 99) {
			try {

				throw new MyException();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
				System.out.println("idusnvsidfvj");
			}

		}
	}
}
