package AccApp;

import AccApp.AccMgmt.*;

public class App {
	
	static Service service = new Service();
	static Account account;
	
	public static void main(String[] args) {
//		System.out.println("Hello world to the standard out");
		
		service.addAccount("1", new Account("Daniel", "Oguns", "12345"));
		
		Account account = service.getAccount("1");
		
		System.out.println("First Name is: " + account.getFirstName());
		System.out.println("Last Name is: " + account.getLastName());
		System.out.println("Account Number is: " + account.getAccountNumber());
	}
	
}
