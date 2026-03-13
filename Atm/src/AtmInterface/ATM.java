package AtmInterface;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Welcome to the ATM Machine!-------");
		System.out.println("\nEnter your User Id: ");
		String userId = sc.next();
		System.out.println("Enter your PIN: ");
		String pin = sc.next();
		
		if(userId.equals("John123") && pin.equals("4321")) {
			ATMOperations op = new ATMOperationsImpl();
			while(true) {
				System.out.println("\n1.View Transaction History");
				System.out.println("\n2.Deposit");
				System.out.println("\n3.Withdraw");
				System.out.println("\n4.Transfer");
				System.out.println("\n5.Quit");
				System.out.println("\nEnter your choice: ");
				int choice = sc.nextInt();
				
				switch(choice) {
				  case 1:
					  op.viewTransactionHistory();
				  case 2: 
					  System.out.println("\nEnter amount to deposit: ");
					  double amount = sc.nextDouble();
				      op.deposit(amount);
				  case 3:
					  System.out.println("\nEnter amount to withdraw: ");
					  double amount1 = sc.nextDouble();
					  op.withdraw(amount1);
				  case 4:
					  System.out.println("\nEnter recipient name: ");
					  String recipient = sc.next();
					  System.out.println("\nEnter amount to transfer: ");
					  double amount2 = sc.nextDouble();
					  op.transfer(amount2, recipient);
				  case 5:
					  System.out.println("\n-------Thank you. Bye!-------");
					  System.exit(0);
				  default:
					  System.out.println("Invalid choice!");
				}
			}
		} else {
			System.out.println("Invalid User Id or PIN!");
		}
		sc.close();
	}
}
