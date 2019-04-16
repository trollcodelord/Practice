package multiThreading;

public class Test implements Runnable {

	public static ThreadCycle th1;
	public static Thread th;
	
	
	public static void main(String[] args) {
		
		 th1 = new ThreadCycle();
		 th = new Thread(th1);
		th.start();
		
		}
	
	public void run() {
		
		ThreadCycle t2 = new ThreadCycle();
		Thread th2 = new Thread(t2);
		
		th2.start();
		System.out.println(Thread.currentThread().getState());
		
		
		
	}
	
	
}
