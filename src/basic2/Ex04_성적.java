package basic2;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {
		// 배열은 for문이랑 같이나옴 배열이 2개면 for문도 2개 ....
		
		Scanner input = new Scanner(System.in);
		
		int kor[] = new int[5];
		
		for(int i=0;i< kor.length;i++) {
			System.out.println(i +"번 학생의 국어점수를 입력 ->");
			kor[i] = input.nextInt();
		}
		
		// 출력
		for(int i=0;i< kor.length;i++) {
		System.out.println(i+"번 학생의 점수: "+kor[i]);
		}
		
		// 위 학생들 점수의 총점과 평균을 출력
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<kor.length;i++) {
			sum += kor[i];
			count++;
		}System.out.println("총점 : "+sum+" 평균 : "+ sum / (double)count);

	}

}
