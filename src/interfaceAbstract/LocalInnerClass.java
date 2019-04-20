package interfaceAbstract;

public class LocalInnerClass {

	
	
	public void inner() {
		
		
		int sum = 20;
		
		class Inner {
			
			
			public int divisor;
			public int remainder;
			
			
			public Inner() {
			
				divisor = 4;
				remainder = sum%divisor;
				
			}
			
			private int getDivisor()
			{
				return divisor;
			}
			
			private int getRemainder() {
				return sum%divisor;
			}
			
			private int getQuotient() {
				return sum /divisor;
			}
			
			
			
		}
		
		Inner in = new Inner();
		System.out.println(in.getQuotient());
		System.out.println(in.getDivisor());
		System.out.println(in.getRemainder());
		
	}
	
	
	public static void main(String[] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.inner();
	}
}
