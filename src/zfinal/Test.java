package zfinal;

class Parent{
	final String field = "부모님꺼";
	final public void jib() {
		System.out.println("부모님이 만드신거");
	}
}
class Child extends Parent{
	Child(){
		//field = "내꺼";
	}
	//public void jib() {
//		System.out.println("내가 탕진함");
//	}
}

public class Test {
	
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
		
		// 부모의 필드값과 메소드를 변경하지 못하게 함
		// 자식생성자에서 부모 필드의 값을 변경하지 못하게 하기위해 부모 필드에 final 
		
		
		
	}

}
