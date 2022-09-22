package basic5;

public class Book {

	private static int count=0;			
	
	 public Book() {	
		count++;
	}
	 
	public static int getCount() { 
		return count;
	}

}


/*
 * static
 * 
 *  - 객체의 공유!! 
 *  	- heap영역이 아닌 static영역에 값을 저장 및 출력
 *  	- 변수 앞에 static -> 객체화(객체생성) 없이 호출가능
 *  
 *  
 *  - 메소드명 앞에 static -> 클래스 접근
 *  	- 객체생성보다 먼저 실행하기 때문에 클래스명 접근
 *  	- 객체 생성없이 호출가능
 *  String -> int	=  Integer.parselnt()   Integer.parselnt 이라는 클래스에 static 이 붙어있기 때문에 객체생성없이 메소드 출력 가능
 *  Math.random();	random 이라는 클래스에 static 이 붙어있기 때문에 객체생성없이 메소드 출력 가능
 *  
 *  
 *  
 */
 