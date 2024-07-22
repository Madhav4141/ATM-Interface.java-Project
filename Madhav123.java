package Adii;

import java.util.Scanner;

class Madhav12 {
	private double balance;
	
	public Madhav12(double initialize) {
		this.balance = getbalance();
	}

	public double getbalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		System.out.println( "Depoist succesful. New balance: + balance");
		}else {
			System.out.println( "Invalid  amount for deposit.");
		} 
	  }

	public void withdrawa(double amount) {
		if(amount >0 && amount <= balance) {
			balance -=amount;
			System.out.println("Withdrawal successful. New balance:"+balance);
		}else {
			System.out.println("Insufficient funds or invalid amount for withdrawal.");
		}
		
		
	}
}

class ATM{
	private Madhav12 account;
	private Scanner scanner;
	
	public ATM(Madhav12 account) {
		this.account = account;
		this.scanner= new Scanner(System.in);
	}
	
	public void showMenu() {
		System.out.println( "ATM Menu:");
		System.out.println( "1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw") ;
		System.out.println("4.Exit");
	}
	
	public void run() {
				int choice;
				do {
				showMenu();
				System.out.println( "Enter your choice:");
				choice = scanner.nextInt();
				switch( choice) {
				
				
		case 1:
			checkBalnce();
			break;
		case 2:	
			deosit();
			break;
		case 3:
			withdraw();
			break;
		case 4:
			System.out.println( "Thank you for using the ATM!");
			break;
			default:
			
				System.out.println( "Invalid choice. Please select a valid option.");
	
		}
	} while(choice != 4);
	
}
	private void checkBalnce() {
		System.out.println( "Your current balance is:"+ account.getbalance());
	}
	private void deosit() {
		System.out.println("Enter the amount to deposit:");
		double Amount = scanner.nextDouble();
		account.deposit(Amount);
	}
	private void withdraw() {
		System.out.println("Enter the amount to withdraw:");
		double amount = scanner.nextDouble();
		account.withdrawa(amount);
		
	}
}

public class Madhav123{
	public static void main(String[] args) {
		System.out.println("Welcome to the ATM!");
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter your four Digit PIN:");
		int enteredPin = sc.nextInt();
		
		Madhav12 userAccount = new Madhav12(1000.0);// Initial balance
		ATM atm = new ATM (userAccount);
		atm.run();
		
	}
}

