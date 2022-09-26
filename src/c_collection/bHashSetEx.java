package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet <String> set = new HashSet<String>();
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		System.out.println( set );		
	}
	// 순번을 저장하지 않기 때문에 데이터가 중복될수 없음
	// 순번을 저장하지 않기 때문에 데이터가 순서대로 출력되지 않음.
	// Ex) 로또번호등 중복되면 안되는 값에 사용
}
