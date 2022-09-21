package basic2;

import java.util.Scanner;

public class Ex03_3_회사B {

	public static void main(String[] args) {
		
		//369
		Scanner sc = new Scanner(System.in);
		System.out.println("369 게임을 진행할 수를 입력하세요");
		int num = sc.nextInt();
		if (num < 1 || num > 100000) {
		System.out.println("1 이상 100,000 이하인 자연수만 입력하세요");
		return;			/// main 메소드 void, void 에서 return 참일때 밑에 진행 거짓일경우 프로그램 종료
		}

		int count = 0;
		for (int i = 1; i <= num; i++) {

		int su = i;
		boolean su369 = false;
		while (su != 0) {
		int na = su % 10;

		if (na == 3 || na == 6 || na == 9) {
		su369 = true;
		count++;
		break;
		}
		su = su /10;
		}

		if (i == 3) System.out.print(i);
		else if (su369) System.out.print(", " + i);

		}
		System.out.println("에 숫자 3, 6, 9가 포함되어 총 " + count + "회 손뼉을 칩니다");

		
		
//		Scanner sc = new Scanner(System.in);
//
//		
//		System.out.println("숫자를 입력해 주세요>>>");
//		int num = sc.nextInt();
//		for(int i =1;i<=100000; i++) {
//			int su = i ;
//			boolean su369 = false;
//			
//			while(su!=0) {
//				int na = su % 10;
//				
//				if(na==3||na==6||na==9) {	
//					su369 = true;
//				}
//				su = su /10;
//			}
//			
//			if(su369)System.out.println("짝");
//			else System.out.print(i);
//		}


		

	}

}
