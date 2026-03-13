package AtmInterface;

import java.util.ArrayList;
import java.util.List;

public class ATMOperationsImpl implements ATMOperations {
	private double balance = 10000.0;
	private List<String> transactionHistory = new ArrayList<>();
	
	@Override
	public void viewTransactionHistory() {
		if(transactionHistory.isEmpty()) {
			System.out.println("No transactions yet.");
		} else {
			System.out.println("Transaction History: ");
			for (String txn : transactionHistory) {
				System.out.println(txn);
			}
		}
	}
	
	@Override
	public void deposit(double amount) {
		balance += amount;
		transactionHistory.add("Deposited: Rs. " + amount);
		System.out.println("Deposited successfully!");
		System.out.println("Current Balnce: Rs. " + balance);
	}
	
	@Override
	public void withdraw(double amount1) {
		if(balance >= amount1) {
			balance -= amount1;
			transactionHistory.add("Withdrawn: Rs. " + amount1);
			System.out.println("Withdrawal successful!");
			System.out.println("Current balance: Rs. " + balance);
		} else {
			System.out.println("Insufficient balance!");
		}
	}
	
	@Override
	public void transfer(double amount2, String recipient) {
		if(balance >= amount2) {
			balance -= amount2;
			transactionHistory.add("Transferred Rs. " + amount2 + " to " + recipient);
			System.out.println("Transferred to " + recipient + " successfully!");
			System.out.println("Current balance: Rs. " + balance);
		} else {
			System.out.println("Insufficient balance for transfer!");
		}
	}
}
