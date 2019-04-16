package multiThreading;

public class ThreadPriority extends Thread {

	
	public void run() {
		
		System.out.println("Thread Priority Example");
	}
	
	
	
	public static void main(String... args) {
		
		
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		

		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(3);
		System.out.println(t1.getPriority()+"Thread1");
		System.out.println(t2.getPriority()+"Thread2");
		System.out.println(t3.getPriority()+"Thread3");
		
		
		
		
		
		 System.out.println("t1 thread priority : " + 
                 t1.getPriority());  //2 
System.out.println("t2 thread priority : " + 
                 t2.getPriority()); //5 
System.out.println("t3 thread priority : " + 
                 t3.getPriority());//8 

		
		
	}
}
	

