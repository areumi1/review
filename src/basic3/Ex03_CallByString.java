package basic3;

public class Ex03_CallByString {


	public static void main(String[] args) {

		String a = new String("안녕");		
		String b = new String("하이");		
		
									
		add(a,b);					
		System.out.println("A="+ a +", B="+b);	
	}
	
	static void add(String a, String b) {
		
		a += b;
		System.out.println("A="+ a +", B="+b);				// 	a = 안녕하이
	}

}
// String 클래스의 특성 (기본자료형이아니라 참조자료형이다. 별종)
// String 은 내용이 변경되면 heap 영역에 메모리를 새로 잡음(새로운 주소로 값이저장) 
// 새로 저장된 주소로  stack에 저장된 변수의 주소를 변경함.