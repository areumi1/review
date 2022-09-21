package basic3;

public class Ex01_함수3 {

	public static void main(String[] args) {


		int [] arr = add();
		// a 와 b 값을 받아서 합한 결과를 여기서 출력
		int sum = arr[0] + arr[1];
		System.out.println("합:" + sum);
		
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}System.out.println(sum);
			
	}
	
	static int [] add() {			// return 값은 하나만 보낼수있다. 
		int a = 10, b =20;			// 두개이상 값 반환시 배열을 선언해 배열안에 값을 입렵 후 반환
		int [] arr = {a,b};			
		
		return arr;
	}

}
