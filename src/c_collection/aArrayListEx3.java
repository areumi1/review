package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result = method();
		// 학생정보를 여기서 출력하시오
		for(Student s : result) {
			System.out.println(s);
		}
		
		for(int i=0; i < result.size(); i++) {
			Student data = (Student)result.get(i);
			System.out.println(data);
		}
		
		// [참고] 전체요소를 순서대로 검색 중요X
		//	Enumeration -> Iterator
		System.out.println("-----------------------------");
		Iterator<Student> it = result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	
	}
	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길자",25));	// 변수가 한번만 사용할때는 생략해서 사용가능 단 두번 이상일 경우 생략불가
		list.add(new Student("홍길이",33));
		list.add(new Student("홍삼이",44));
		return list;
	}
	// 

}

//----------------------------------------------------------
class Student {		//extends Object 자동으로 상속
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {	// 오버라이딩
		return name +"학생은 " +  age + "세 입니다.";
	}
}
