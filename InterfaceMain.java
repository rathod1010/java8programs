package java8project;

public class InterfaceMain {

	public static void main(String[] args) {
		
		//using anonymous class
		
	/*	MyInterface myInterface = new MyInterface()
				{

					@Override
					public void m1() {
						System.out.println("m1 implemeneytation");
						
					}
			
				};
				myInterface.m1();
				*/
		
		//using lambda
		
		MyInterface myInterface = ()->System.out.println("M1 implemenatation");
		myInterface.m1();
		

	}

}
