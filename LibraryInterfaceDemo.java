package W5A3;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		LibraryUser kidA = new KidUser(10, "Kids");
		LibraryUser kidB = new KidUser(18, "Fiction");
		
		System.out.println("Register account for kid A.  " + kidA.registerAccount());
		System.out.println("Register account for kid B.  " + kidB.registerAccount());
		
		System.out.println("Request book for kid A.  " + kidA.requestBook());
		System.out.println("Request book for kid B.  " + kidB.requestBook());
		
		LibraryUser adultA = new AdultUser(5, "Kids");
		LibraryUser adultB = new AdultUser(23, "Fiction");
		
		System.out.println("Register account for adult A.  " + adultA.registerAccount());
		System.out.println("Register account for adult B.  " + adultB.registerAccount());
		
		System.out.println("Request book for adult A.  " + adultA.requestBook());
		System.out.println("Request book for adult B.  " + adultB.requestBook());
	}

}
