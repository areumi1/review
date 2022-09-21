package basic3;

public class Ex09_AsumTest {

	public static void main(String[] args) {

		int sum = sumFunc(3);
		System.out.println("합:"+ sum);

	}
	
	static int sumFunc(int i) {
		// sum = 1 + 2 + 3
		
		if(i == 1) return 1;
		return  i +sumFunc(i-1); 	// 재귀호출 : 함수가 자기 함수를 호출하는것
	}
	
	// sum = 3 + sF(3-1)

}
