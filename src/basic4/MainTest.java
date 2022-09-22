package basic4;

public class MainTest {

	public static void main(String[] args) {
		
	//	Student s;		// 변수만 선언 메모리는 안올라옴. 
		
		Student s = new Student(); // heap(메모리) 값 올라옴 //(객체)
				
		// 값지정 1 -setter
		s.setName("홍길동");
		s.setKor(100);
		s.setEng(30);
		s.setMath (55);
		
		// 값지정 2 - 생성자
		//Student s = new Student("홍길자", 99, 88, 77);
		
		s.calTotak();
		s.calAvg();
//		//s.total = 0;
		s.output();
		
		// 클래스 기본값 변경을 막기위해 private 입력시 메인메소드에서 에러
		// 값을 지정하기 위해 set함수 이용 
		
	
		
		

	}

}
