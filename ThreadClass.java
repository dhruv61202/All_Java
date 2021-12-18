package multiThreading;

class Mythr extends Thread {
	public Mythr(String name) {
		super(name);

	}

//	@Override
	public void run() {
		int i = 0;
		while (i < 4) {
			System.out.println("I am a thread!!");
			i++;
		}

	}
}

public class ThreadClass {
	public static void main(String[] args) {
		Mythr t = new Mythr("Dhruv");
		Mythr t2 = new Mythr("Khan!");
		t.start();

		System.out.println("The id of the thread t is-->" + t.getId());
		System.out.println("The name of the thread t is-->" + t.getName());
		t2.start();
		System.out.println("The id of the thread t is-->" + t2.getId());
		System.out.println("The name of the thread t is-->" + t2.getName());
	}
}
