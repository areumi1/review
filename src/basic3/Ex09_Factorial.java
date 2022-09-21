package basic3;

public class Ex09_Factorial {

	public static void main(String[] args) {


		int fact = facatorial(5);
		System.out.println("!="+fact);

	}
	
	static int facatorial(int i) {
		if(i==1) return 1;
		return i * facatorial(i-1);
	}

}

/*
 * 5! = 5*4*3*2*1
 * 
 * 
 * 
 */
