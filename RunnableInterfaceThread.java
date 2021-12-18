package multiThreading;

class MyThreadRunnable implements Runnable {
	public void run() {
		System.out.println("I am a Thread1");
		System.out.println("I am a Thread1");
		System.out.println("I am a Thread1");
		System.out.println("I am a Thread1");

	}
}

class MyThreadRunnable2 implements Runnable {
	public void run() {
		System.out.println("I am a Thread2");
		System.out.println("I am a Thread2");
		System.out.println("I am a Thread2");

	}
}

public class RunnableInterfaceThread {
	public static void main(String[] args) {
		MyThreadRunnable t1 = new MyThreadRunnable();
		Thread gun1 = new Thread(t1);
		MyThreadRunnable2 t2 = new MyThreadRunnable2();
		Thread gun2 = new Thread(t2);

		gun1.start();
		gun2.start();

	}
}
