package BankAccount;
public class BankAccount {

	int accountNumber;
	String accountHolder;
	double balance;
	
	// constructor
	public BankAccount(int getAccountNumber, String getAccountHolder, double getBalance) {
		accountNumber = getAccountNumber;
		accountHolder = getAccountHolder;
		balance = getBalance;
	}
	// Start Getter
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	// End Getter
	// Start Setter
	public void setBalance(double changeBalance) {
		balance += changeBalance;
	}
	// End Setter
	
	public void balanceInfo() {
		
		System.out.println("Name: "+accountHolder+"\n"+"Balance: "+balance+"\n"+"Number: "+ accountNumber);
		if (balance < 1000 && balance >= 0) {
			System.out.println("Your balance is low"+"\n------------------");
		}else if (balance > 1000) {
			System.out.println("You have enough balance"+"\n------------------");
		}else if (balance < 0) {
			System.out.println("Your balance shows in minus!"+"\n------------------");
		}
		
	}

}
