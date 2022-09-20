package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int kor[] = new int[5];
		
		/*
		 *  3명의 국어점수를 입력하세요(ex. 10/20/30)
		 */
		System.out.println(kor.length+"명의 국어점수를 입력하세요(ex. 10/20/30) ");
		String inputData = input.nextLine();	// "10/20/30"
		StringTokenizer st = new StringTokenizer(inputData,"/");
		for(int i = 0;st.hasMoreTokens();i++) {
			String str = st.nextToken();
			kor[i] = Integer.parseInt(str);
		}
		
//		//1. 가장 간단하게 문자열을 이용해 StringTokenizer 객체를 생성합니다.
//		이럴 경우 문자열은 띄어쓰기 기준으로 나눠지게 됩니다.
//		 
//		2. 어떤 걸 기준으로 나눌지 구분자를 명시해 StringTokenizer 객체를 생성합니다.
//		 
//		3. 생성자 마지막 인자에 true/flase의 boolean 타입의 값을 넣어주는데,
//		true라면 구분자도 토큰에 포함되고, false라면 구분자는 구분하는데만 쓰고 토큰에 포함되지 않습니다.
//		디폴트는 false 입니다.


		
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
