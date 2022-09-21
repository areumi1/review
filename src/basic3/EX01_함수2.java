package basic3;

public class EX01_함수2 {

	public static void main(String[] args) {

		int sum = add();
		// 합을 여기서 출력
		System.out.println("합:"+ sum);
		
	}
	
	static int add() {					// void 입력시 오류. 보낼 함수와 동일한 함수로 입력해 만들기
		int a = 10 , b = 20;
		int sum = a+b;
		return sum;
	}

}
