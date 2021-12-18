package cwh_ExceptionHandling;

public class ThrowsDemo {
	
	static class NegativeRadiusException extends Exception{
		@Override
		public static String toString()
		{
			return "Radius cannot be Negative";
		}
	}
	
	public static double area(int r) throws NegativeRadiusException, ArrayIndexOutOfBoundsException, NullPointerException
	{
		if(r<0)
		{
			throw new NegativeRadiusException();
		}
		
		double result = Math.PI * r * r;
		return result;
	}
	
	public static int divide (int a, int b) throws ArithmeticException{
		int result = a / b;
		return result;

	}

	public static void main(String[] args) {
		try {
		int c = divide(6, 0);
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Exception");
		} 
		try {
		double ar = area(-6);
		System.out.println(ar);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
