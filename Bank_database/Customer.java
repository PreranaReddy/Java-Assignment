package Bank_database;

public class Customer {
	int account_no;
	String cust_name;
	double balance_amt = 10000;

	/*public Customer(int acc_no, String name) {
		this.account_no = acc_no;
		this.cust_name = name;
		//this.balance_amt = bal;
	}*/

	public double deposit(double deposit_amt) {
		balance_amt = balance_amt + deposit_amt;
		System.out.println("The amount deposited is: " + deposit_amt);
		return balance_amt;

	}

	public double withdraw(double withdraw_amt) {
		balance_amt = balance_amt - withdraw_amt;
		System.out.println("The amount deposited is: " + withdraw_amt);
		return balance_amt;

	}

	public void print_bal() {
		System.out.println("Balance is: " + balance_amt);

	}

}
