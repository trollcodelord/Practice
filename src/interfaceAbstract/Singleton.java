package interfaceAbstract;

public class Singleton {


private Singleton() {
	
}


public void show() {
	System.out.println("TEST SINGELTON");
}


private static final Singleton single = new Singleton();

private static final Singleton single2 = new Singleton();

public static void main(String[] args) {
	
	single.show();
	single2.show();
	
}

}

