package practiceForInterview;

public class RunVsStartMethod  extends Thread{
	
	
	public void run() {
			
		System.out.println("Current Thread"+ Thread.currentThread().getName());
		System.out.println("run() method calls");
	}
	
	
	

}
