package AtmInterface;

public interface ATMOperations {
	void viewTransactionHistory();
	void deposit(double amount);
	void withdraw(double amount1);
	void transfer(double amount2, String recipient);
}
