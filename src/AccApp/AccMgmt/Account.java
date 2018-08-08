package AccApp.AccMgmt;

public class Account {

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber + "]";
	}

	private String firstName;
	private String lastName;
	private String accountNumber;

	public Account(String firstName, String lastName, String accountNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.setAccountNumber(accountNumber);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
