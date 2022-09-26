package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );
		System.out.println(set.subSet("d", "s"));
		System.out.println(set.headSet("e"));
		System.out.println(set.tailSet("e"));

	}
	// 트리 구조로 작으면 왼쪽, 크면 오른쪽에 저장해 순서되로 읽음
	// 자동으로 정렬된것 처럼 출력해준다.
	// .subSet("d" ,"s") d ~ S 앞에꺼까지 출력  
	// .headSet("e") e 앞에꺼 출력
	// .tailSet("e") e 부터 뒤어꺼 출력
}
