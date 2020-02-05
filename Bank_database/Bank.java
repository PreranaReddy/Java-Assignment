package Bank_database;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please give your account number: ");
		double acc_no = sc.nextDouble();
		System.out.println("Please enter your name: ");
		String name = sc.next();
		
		

		Customer customer = new Customer();
		System.out.println("The available balance before any transaction is: " +customer.balance_amt);
		customer.deposit(20000);
		customer.withdraw(5000);
		customer.print_bal();

	}

}
