package Threads;

public class ExampleThreadMain {
	public static void main(String...args) {
		
		
		
		  System.out.println(Thread.currentThread().getName());
		  
			/*
			 * System.out.println(Thread.currentThread().getPriority());
			 * 
			 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		 
		
		MyRunnable runnable=new MyRunnable();
		MyRunnable2 runnable2=new MyRunnable2();
		//Instantiate a thread clas
		Thread thread=new Thread(runnable);
		Thread thread2=new Thread(runnable2);
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		thread2.start();
		System.out.println("This is line 27:" +Thread.currentThread().getName());
		
		for (int i = 1; i < 5; i++) {
			
			System.out.println("Main Thread: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
//		MyThreadExample2 mt2= new MyThreadExample2();
//		
//		mt2.start();
	}
}
