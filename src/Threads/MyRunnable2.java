package Threads;

public class MyRunnable2 implements Runnable {

	@Override
	public void run() {

		// Fetching info from another website 30
		for (int i = 10; i > 0; i--) {
			System.out.println("Thread 2 " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
