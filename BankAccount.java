package Student;

public class BankAccount {
	int AccountNumber;
	int balance;
	static String bankName="State Bank";
	
	public static void main(String[] args) {
		BankAccount bank1= new BankAccount();
		bank1.AccountNumber=123;
		bank1.balance=100000;
		BankAccount bank2= new BankAccount();
		bank2.AccountNumber=456;
		bank2.balance=200000;
		System.out.println("AccountNumbr: "+bank1.AccountNumber+" Bank Balance: "+bank1.balance+" Bank Name: "+bankName);
		System.out.println("AccountNumbr: "+bank2.AccountNumber+" Bank Balance: "+bank2.balance+" Bank Name: "+bankName);
		
	}

}
