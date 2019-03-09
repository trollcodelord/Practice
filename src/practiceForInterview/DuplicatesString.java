package practiceForInterview;

public class DuplicatesString {

	
	public static void main(String[] args)
	{
	String a = "BHUPENDER";
	
	char[] ch = a.toCharArray();
	
	for (int i=0;i<ch.length;i++)
	{
		for (int j=i+1;j<ch.length;j++) {
			
			if (ch[i]==ch[j]) {
				
				
				System.out.println("Duplicates Character :" +ch[j]);
			}
		}
	}
	
	}
	
	
}
