package access;

import accother.Access;

public class MainTest extends Access {

	public static void main(String[] args) {
		
		MainTest acc = new MainTest();	// 상속후 자식 클래스에 부모 클래스 내용이 모두 들어감. 자식클래스로 객체 생성해야 protected 사용 가능. 
		//acc.a = "프라이빗 변경"; 	//해당 클레스에서만 접근 가능하기 때문에 값변경 불가
		acc.b = "퍼블릭 변경";
		acc.c = "프로텍트드 변경";		//같은 패키지, 상속된 다른 패키지에서만 가능
		//acc.d = "디폴트 변경"; 	//같은 패키지에서만 접근 가능
		acc.output();

	}

}
