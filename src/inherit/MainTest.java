package inherit;

public class MainTest {

	public static void main(String[] args) {
		
		
//		Umma u = new Umma();
//		u.job();
//		u.gene();
		
//		Ddal d = new Ddal();
//		d.study();
//		d.job();
//		d.gene();
		
		// 자식변수에 부모객체 생성 불가능
		//Ddal d = new Umma();
		
		// * 부모변수에 자식객체 생성이 가능 
		// 부모변수만 접근 가능하나 오버라이딩 된 값은 오버라이딩된 값으로 접근
		// 
//		Umma u = new Ddal();
//		u.gene();
//		u.job();
//		//u.stuty();  오류
		
		// * 형변환 : ( casting)
		// 1> 기본형끼리만 가능
		// 2> 참조형에서 상속관계에 있는 경우만 가능
		
		//		String s = new String("~~");
		//		StringBuffer sb = (StringBuffer)s; --> X
		
//		Umma u =new Umma();
//		Ddal d = (Ddal)u;		// 에러는 나지 않지만 문제는 유발
		
		Ddal d = new Ddal();
		Umma u = (Umma)d;		// up casting
		Ddal d2 = (Ddal)u;		// down casting
		

	}

}
