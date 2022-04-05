package BankAccount;

public class CheckBalance {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(12345, "Ahmad", 900.00);
//		System.out.println(myAccount.accountNumber);
//		System.out.println(myAccount.accountHolder);
//		System.out.println(myAccount.balance);
		myAccount.balanceInfo();
		myAccount.setBalance(200);
		myAccount.balanceInfo();
	}

}
