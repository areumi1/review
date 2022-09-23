package basic2;

import java.util.Scanner;

/* 
 * 	for 		: 	반복횟수가 정해진 경우
 *  while		:	반복횟수를 모르는 경우
 * 	do~while	:	반복횟수를 모르는 경우 (조건을 나중에 비교)
 * 
 */


public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력 받아서 해당 단의 구구단을 출력

		Scanner input = new Scanner(System.in);




		//		// 1. for 문
//		System.out.println("몇 번 반복을 할까요?");
//		int su = input.nextInt();
//		for(int n=0;n<su;n++){
//			System.out.println("구구단의 단수를 입력해 주세요 >>>");
//			int i = input.nextInt();
//			for (int j = 1; j<=9; j++) {
//				System.out.printf("%d*%d = %d \t",i,j,i*j);
//			}System.out.println();
//		}


		// 2. while
//
//		while(true) {
//		System.out.println("구구단의 단수를 입력해 주세요 >>>");
//			int i = input.nextInt();
//			for (int j = 1; j<=9; j++) {
//				System.out.printf("%d*%d = %d \n",i,j,i*j);
//			}
//		System.out.println("반복을 종료(Y)");
//			input.nextLine();
//			String answer = input.nextLine();
//			if(answer.equalsIgnoreCase("Y")) break;		//equalsIgnoreCase 대소문자 구별없이 Y 입력시 종료
//			
//		}




		do {
			System.out.println("구구단의 단수를 입력해 주세요 >>>");
			int i = input.nextInt();
			for (int j = 1; j<=9; j++) {
				System.out.printf("%d*%d = %d \n",i,j,i*j);
			}

			System.out.println("반복을 종료하시겠습니까?(Y)");
			input.nextLine();	
			//엔터 친거를 읽으려고 씀 next(), nextInt() 후에 사용. // 밑에 적인 인풋을 정상적으로 읽을려면 위에 적인 인풋값 엔터에서 엔터를 처리해야해서 사용.
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("Y")) break;
			
			
			
		}while(true);
		
		




		

	}
}