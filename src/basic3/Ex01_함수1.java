package basic3;

public class Ex01_함수1 {

	public static void main(String[] args) {
		int a =10, b = 20;
		add(a,b);
		

	}//main
	
	static void add(int a, int b) {					//static 이 붙은애들은 안 붙인애를 인식할수없다.
		// 여기에서 a, b의 갑을 합해서 출력		//메인메소드에 static 이 붙어 있으므로 void 에도 static을 붙여야 인식가능
		int sum = a+b;					// void 반환하지 못하는 비어있는 메소드
		System.out.println("합:"+ sum);  		//리턴값이 없을때 void 사용
	}
}


