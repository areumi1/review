package basic3;

public class Ex03_CallByRef {

	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("안녕");		//변수 a 는 스택에 저장 new 로만들면 객체 heap에 저장
		StringBuffer b = new StringBuffer("하이");		//변수 b 는 스택에 저장 new 로만들면 객체 heap에 저장
		
									// 참조형은 stack 에 변수가 저장 값은 heap에 저장 
									// heap값에 주소가 저장되기 때문에 값 변경시 변경된 값으로 원본에 저장
		add(a,b);					// 인자에 참조형을 보내면 레퍼런스 주소가 참조되기때문에 원본값이 변경 되어 a = 안녕하이 출력됨
		System.out.println("A="+ a +", B="+b);	
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);				// heap 값에 변경된 주소를 저장
		System.out.println("A="+ a +", B="+b);				// 	a = 안녕하이
	}

}
/*
 *  문자열처리 클래스
 *  
 *  - String
 *  
 *  - StringBuffer / StringBuilder
 *  
 *  
 */
