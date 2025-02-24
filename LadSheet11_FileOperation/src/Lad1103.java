import java.util.*;

public class Lad1103 {
	private String accountNumber;
	private String password;
	
	public ATMData (String accountNumber, String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	public String getID() {
		return accountNumber;
	}
	
	public String getPass() {
		return password;
	}
}

class ATMChecking extends ATMData {
	private int money;
	
	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
	}
	
	public boolean checkBookBank() {
		return true;
	}
	
	public void show() {
		System.out.println("Account: " + getID());
		System.out.println("Avaliable Balance: " + money);
	}
}

public class ATMBanking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
	}
}
