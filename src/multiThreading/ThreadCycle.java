package multiThreading;

public class ThreadCycle implements Runnable {
	
	
	public void run() {
		
		try {
			Thread.sleep(1500);
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("State of thread");
		Thread.currentThread().getState();
		System.out.println(Thread.currentThread().getState());
	}

}
