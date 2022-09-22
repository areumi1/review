package basic4;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CalculatorExpr  calculatorexpr= new CalculatorExpr();
		
		do {
		System.out.println("숫자를 입력해주세요");
		int num1 = input.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int num2 = input.nextInt();
	
		
		calculatorexpr.setNum1(num1);
		calculatorexpr.setNum2(num2);
		
		System.out.println("덧셈 : "+calculatorexpr.getAddition());
		System.out.println("뺄셈 : "+calculatorexpr.getSubtraction());
		System.out.println("곱셈 : "+calculatorexpr.getMultiplication());
		System.out.println("나눗셈 : "+calculatorexpr.getDivision());
		
		
		System.out.println("종료하시겠습니까?(Y/N)");
		input.nextLine();
		String answer = input.nextLine();
		
		if (answer.equalsIgnoreCase("Y")) { 
			System.out.println("종료되었습니다.");
			break;
		}
		
		}while(true);
	
		input.close();
		
	}
	

}
