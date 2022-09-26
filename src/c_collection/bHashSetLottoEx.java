package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>();
		
		//for (int i=0; i<6; i++) {
		
		while(lottos.size()<6) {
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);
		}
		
		System.out.println(lottos);
		
		ArrayList list = new ArrayList(lottos);
		Collections.sort(list);
		System.out.println(list);
		
	}
	// 순서를 지정하지 않을 때 사용.
	// 중복되면 중복된 수만큼 수가 줄어서 나온다.
	// for문이 아닌 while문으로 6자리가 나와야 출력되게 설정
	// Collections.sort// sort는 list만 사용가능
	
}
