package multiThreading;

class Mythr2 extends Thread {
	public Mythr2(String name) {
		super(name);
	}

//	@Override
	public void run() {
//		int i = 0;
		while (true) {
			System.out.println("Thank You!!!" + this.getName());
		}

	}
}

public class ThreadPriorities {
	public static void main(String[] args) {
//	JVM Gets a readyQueue, for the threads!!
//	It maintains the readyQueue
		Mythr2 t1 = new Mythr2("Dhruv");
		Mythr2 t2 = new Mythr2("Khan!");
		Mythr2 t3 = new Mythr2("Cheemse!");
		Mythr2 t4 = new Mythr2("Noob!");
		t4.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
//		In Built setPriority() method!!
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
