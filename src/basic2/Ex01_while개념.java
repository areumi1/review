package basic2;

public class Ex01_while개념 {

	public static void main(String[] args) {
		
		/*
		// 0. for 문 
		int sum = 0;
		for (int i = 1; i <=10; i++) {  		// i는 1 i는 10 보다 작거나 같다 i는 +1
			sum += i;
		}System.out.println("합 : "+ sum);
		*/
		
		
		/*
		// 1. while 문
		int i = 1;			// 초기값 밖에서 선언
		int sum = 0;
		while (i<=10) {		// 조건문 i 는 10 보다 작거나 같다
			sum += i;
			i++;			// i + 1	증가값은 반복문 끝에 선언
		}System.out.println("합 : "+ sum);
		*/
		
		
		//2. do~while
		int i = 1;			
		int sum = 0;
		do {		
			sum += i;
			i++;			
		}while (i<=10);
		System.out.println("합 : "+ sum);
		
		

		
		
		

	}

}
