package practiceForInterview;

public class runnable {

	public static void main(String[] args) {
	int n =12;
	for(int i=0; i<n ;i++) {
		
		Thread object = new Thread(new Mutlithreadingrunnable());
		object.start();
		
	}
	
	}
}

