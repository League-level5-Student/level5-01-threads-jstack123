package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
	 // Write a program that creates a thread (Thread 1) that creates another
	// thread (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.

	/* HINT: You will most likely need to do this with recursion */

	static Thread t = new Thread(() -> {
		System.out.println("Hello from Thread <50>");
		Thread[] t2 = new Thread[50];
		for (int i = 49; i > 0; i--) {
			int num = i;
		//	System.out.println(num);
			t2[i] = new Thread(() -> {
				System.out.println("Hello from Thread <" + num + ">");
			});
		t2[i].start();
		}
		
		
		
	});


	public static void main(String[] args) {
		
		t.start();

	}
}
