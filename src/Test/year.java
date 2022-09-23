package Test;

import java.util.Calendar;

public class year {
	
	public static void main(String[] args) {
		
		int year = 1995;
		int age;
		Calendar c = Calendar.getInstance();
		int todayYear = c.get(Calendar.YEAR);
		age = todayYear - year + 1;
		
		System.out.println("출생년도 : "+year);
		System.out.println("나이 : " + age);
		
	}

}
