package basic3;

public class Ex03_CallbyValue {

	public static void main(String[] args) {
		int a =10, b =20;
		add(a,b);
		System.out.println("A="+ a +", B="+b);		// 2	a = 10 	b = 20 				// 원본에 영향을 끼치지 않음

	}
	static void add(int a, int b) {
		a += b;
		System.out.println("A="+ a +", B="+b);		// 1	a = 30 	b = 20
	}


	

}
