package interfaceAbstract;

public class InterfaceMember {

	
	interface Yes{
		void show();
	}
}

class Testing implements InterfaceMember.Yes{
	
	public void show() {
		
		System.out.println("Nested Interface");
	}
	
}


class Test{
	
	public static void main(String[] args) {
	InterfaceMember.Yes obj;
	Testing t = new Testing();
	obj = t ;
	obj.show();

	
	}	
}