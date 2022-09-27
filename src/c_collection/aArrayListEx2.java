package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노란표시 없애려면 generics 지정
		// 사용하고자 하는 자료형을 처음부터 직접 입력하는것을 generics 라고함.
		
		list.set(3, "rabbit");
		System.out.println(list);
		// set 3번방 값 덮어씀
		
		list.remove(1);
		System.out.println(list);
		// remove 1번방 값 삭제
		
		Collections.sort(list);
		System.out.println(list);
		// 방 정렬 // 순서대로
		
		
		
		
		//System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			String data = (String)list.get(i);
			System.out.println(data);
		}
		
		// 향상된 for문 ( 최근 트렌드)
		for(String data : list) {
			System.out.println(data);
		}
		// list에서 하나씩 뽑아 data에 값이 등록
		// generics을 지정해야 향상된 for문 사용가능 
		// 형변환하는 부분을 제외해야 사용가능 하기때문에 generics을 지정
		

	}
	// ArrayList 엔 자동으로 toString 이 생략되어있음.
	// get 함수는 리턴값을 맞출수 없으므로 무조건 Object 형으로 자료를 보내면
	// 직접 사용하고자하는 형으로 형변환을 해야한다
	
}
