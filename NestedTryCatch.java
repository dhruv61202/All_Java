package cwh_ExceptionHandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		int[] marks = new int[3];
		marks[0] = 7;
		marks[1] = 56;
		marks[2] = 12;

		try {
			System.out.println("Dhruv");

			try {
				System.out.println(marks[4]);
			} catch (Exception e) {
				System.out.println(e);
			} 

		}

		catch (Exception e) {
			System.out.println("Exception level 1");
			System.out.println(e);
		}
	}
}
