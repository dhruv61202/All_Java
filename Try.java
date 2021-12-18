package cwh_ExceptionHandling;

public class Try {
	public static void main(String[] args) {
		int a=6000;
		int b=0;
		try {
		int c=a/b;
		System.out.println("The Result is " + c);
		}
		catch(Exception e)
		{
			System.out.print("We Failed to Divide, Reason: ");
			System.out.print(e);
		}
		
		
	}

}
