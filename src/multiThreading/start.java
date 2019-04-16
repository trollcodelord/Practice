package multiThreading;

public class start {
	
	public static void main(String[] args) {
		
		int n =10;
		for(int i =0; i<n;i++) {
			RunVsStartMethod t = new RunVsStartMethod();
			t.start();
			
		}
	}

}
