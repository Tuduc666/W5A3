package W5A3;

public class AdultUser implements LibraryUser {
	protected int age;
	protected String bookType;
	
	// constructor
	public AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	 
	public String registerAccount() {
		if (age >= 12) return("You have successfully registered under an Adult Account");
		else return("Sorry, Age must be greater than or equal to 12 to register as an adult");
	}
	
	public String requestBook() {
		if (bookType.equals("Fiction")) return("Book Issued successfully, please return the book within 7 days");
		else return("Oops, you are allowed to take only adult Fiction books");
	}
}