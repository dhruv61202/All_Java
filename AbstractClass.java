package abstractClassAndInterfaces;

abstract class Base2 {
	public Base2() {
		System.out.println("Base 2 Constructor!");
	}

	public void sayHello() {
		System.out.println("Hello!!!");
	}
	
	abstract public void greet();
}


class child2 extends Base2{
	@Override
	public void greet()
	{
		System.out.println("Good Morning!!");
	}
}

//class child3 extends Base2{
//	
//}


public class AbstractClass {
	public static void main(String[] args) {
		
		
	}

}
