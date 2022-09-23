package poly;

import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) {

		Item i = null;
		
		System.out.println("해당하는 물품번호 (1.책, 2.DVD, 3.CD)");
		Scanner input = new Scanner(System.in);
		int sel = input.nextInt();
		
		switch(sel) {
		case 1 : i = new Book("001","총균쇠","제러드","코스모"); break;
		case 2 : i = new Dvd(); break;
		case 3 : i = new Cd(); break;
		}
		
		i.output();		// 상황에 따라 불러지는 메소드가 다름
		
		
		// 다향성
		//상황에 따라 불러지는 메소드가 다름
		// 상속관계여야한다.
		// 오버라이딩이 꼭 되어야한다 
	}

}
