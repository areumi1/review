package basic2;

import java.util.Scanner;

public class Ex03_3_회사B {

	public static void main(String[] args) {
		
		//369
		Scanner sc = new Scanner(System.in);
		System.out.println("num을 입력하시오: ");

		int num = sc.nextInt();
		int count = 0;
		int na = 0 ;
		for(int i = 1; i <= num; i++) {
		int su = i;
		boolean su369 = false;
		while(su !=0) {
		na = su %10;
		if(na ==3|| na ==6|| na ==9) {
		su369 = true;
		}//if
		su = su/10;
		}//while

		if(su369) {
		System.out.print("짝!-");
		count+=1;
		}
		else {
		System.out.print(i+"-");
		}
		}//for

		System.out.println("\n손뼉 친 횟수는: "+ count);
		//main
		
		
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
