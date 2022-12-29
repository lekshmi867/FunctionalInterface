package Threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		
		//Database operation which takes 20 seconds
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 1 " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}