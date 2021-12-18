package multiThreading;

class Mythrreaddd extends Thread {

	public void run() {
//		int i = 0;
		while (true) {
			System.out.println("I am a thread!!" + " 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO AutoXj-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class Mythrreaddd2 extends Thread {

	public void run() {
		int i = 0;

		System.out.println("I am a thread!!" + "  2");
		i++;

	}
}

public class MethodsThreads {
	public static void main(String[] args) {
		Mythrreaddd t1 = new Mythrreaddd();
		Mythrreaddd2 t2 = new Mythrreaddd2();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
//		try {
//			t1.join();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		t2.start();

	}

}
