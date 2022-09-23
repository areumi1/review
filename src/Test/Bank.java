package Test;

public class Bank {

	private String name;
	private String accountNumber;
	int balance;
	
	void withdrawal(int withdrawal) {
		if(balance - withdrawal >= 0) {
			balance -= withdrawal;
			System.out.println("출금액 : "+ withdrawal);
		}else System.out.println("잔액이 부족합니다.");
	}
	
	void deposit(int deposit) {
		balance += deposit;
		System.out.println("입금액 : "+deposit);
	}
	
	@Override
	public String toString() {
		return "예금주 : "+name+", 계좌번호 : "+accountNumber+", 잔액 : "+balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
		


}


