package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {

	private ConcurrentLinkedQueue<Task> taskQueue;
	
	public Worker(ConcurrentLinkedQueue<Task> taskQueue) {
		this.taskQueue = taskQueue;
	}
	public void run() {
		while(taskQueue.isEmpty()==false) {
			Task t = taskQueue.remove();
			t.perform();
		}
		
	}


}
