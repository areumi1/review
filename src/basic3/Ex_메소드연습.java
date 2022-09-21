package basic3;

import java.util.Scanner;

public class Ex_메소드연습 {

	public static void main(String[] args) {
//		(문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 
//		함수명 : checkLower
//		인자 : char
//		리턴(반환) : boolean
		
		Scanner input = new Scanner(System.in);
		System.out.println("영문자를 입력하세요>>");

		String str = input.next();
		char eng = str.charAt(0);
		boolean a = checkLower(eng);
		System.out.println(a);

	}
	
	static boolean checkLower(char eng) {
		if('a'<= eng && eng<='z') return true;
		else return false;
			
	}

}
