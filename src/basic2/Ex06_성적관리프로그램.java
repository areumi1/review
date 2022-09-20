package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_성적관리프로그램 {

	public static void main(String[] args) {
		
		
		
		int[][] sexual = new int [4][3];
		
		Scanner input = new Scanner(System.in);
		for(int i=0; i<sexual.length; i++) {
			System.out.println(i +"번 학생의 국어,영어,수학 점수를 입력해 주세요(ex. 10/20/30)");
			String inputData = input.nextLine();
			StringTokenizer st = new StringTokenizer(inputData, "/");
			String score = st.nextToken();
			for(int j =0; j<sexual[i].length; j++) {
				sexual[i][j] = Integer.parseInt(score);
			}
		}
		
		for(int i=0; i<sexual.length; i++) {
			
			for(int j =0; j<sexual[i].length; j++) {
			System.out.print(sexual[i][j]+"\t");
			}System.out.println();
		}
		
		int sum =0;
		int count = 0;
		for(int i=0; i<sexual.length; i++) {
			for(int j =0; j<sexual[i].length; j++) {
				sum += sexual[i][j];
				count++;
			
			}
			System.out.printf("%d번 학생의 총점은 %d이고 평균은 %4.2f 입니다. \n",i,sum,sum/(double)count);
			sum = 0;
			count = 0;
		}
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i=0; i<sexual.length; i++) {
				kor += sexual[i][0];
				eng += sexual[i][1];
				math += sexual[i][2];
				
		}System.out.println("국어과목 총점 "+kor+"이고 평균은 "+kor/sexual.length);
		System.out.println("영어과목 총점 "+eng+"이고 평균은 "+eng/sexual.length );
		System.out.println("수학과목 총점 "+math+"이고 평균은 "+math/sexual.length );
		
	}

}
