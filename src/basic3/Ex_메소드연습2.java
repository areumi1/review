package basic3;

import java.util.Scanner;

public class Ex_메소드연습2 {

//	(문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
//	함수명 : checkUpper
//	인자 : char
//	리턴(반환) : char

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("영문자를 입력해주세요>>>");
		
		String st = input.next();
		char eng = st.charAt(0);
		
		char ch = checkUpper(eng);
		System.out.println(ch);

	}
	
	static char checkUpper(char eng) {
		if (eng>='a'&& eng<='z') {
			eng = (char)('a'-32);
			return eng;
		}else if (eng>='A'&& eng<='Z'){
			eng = (char)('A'+32);
			return eng;
		}
		return eng;
		
		
		
	}

}
