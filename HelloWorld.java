package edurekaAll;

public class HelloWorld {
	 Integer instanceVariable=11;
	 static Integer staticVariable = 30;
//	This is instance variable
	private synchronized void nonStaticTest()
	{
		Integer localVariable = 20;
		System.out.println("Non Static Method");
	}
	static void staticTest()
	{
		System.out.println("Static Method");
		
	}
	
	public static void main(String[] args)
	{
		HelloWorld hell1 = new HelloWorld();
		hell1.instanceVariable = 100;
		System.out.println(hell1.instanceVariable);
//		HelloWorld.staticVariable = 2000;
//		System.out.println(HelloWorld.staticVariable);
		HelloWorld hell2 = new HelloWorld();
		hell2.instanceVariable=200;
		System.out.println(hell2.instanceVariable);
		
	}

}
