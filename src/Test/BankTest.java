package Test;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {

		Bank bank = new Bank();

		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요>>");
		String name = input.nextLine();
		System.out.println("계좌번호를 입력해 주세요>>");
		String accountNumber = input.nextLine();
		System.out.println(accountNumber);
		bank.balance = 1000;
		
		bank.setName(name);
		bank.setAccountNumber(accountNumber);
		
		System.out.println("출금할 금액을 입력해 주세요>>");
		int withdrawal = input.nextInt();
		bank.withdrawal(withdrawal);
		System.out.println("입금할 금액을 입력해 주세요>>");
		int deposit = input.nextInt();
		bank.deposit(deposit);
		
		System.out.println(bank.toString());
		
		
		

	}

}
