package cwh_ExceptionHandling;

public class FinallyDemo {

	public static int greet() {
		try {
			int a = 60;
			int b = 0;
			int c = a / b;
			return c;
		} catch (Exception e) {
			System.out.println(e);
			return 1;
		} finally {
			System.out.println("This is the end of the function");

		}
//		return -1;
		

	}

	public static void main(String[] args) {
		greet();

	}

}
