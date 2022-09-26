
package c_collection;
import java.util.ArrayList;

class aArrayListEx1
{
	public static void main(String[] args) 
	{
		ArrayList list = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		Integer	age = 31; // int age = 31;
		Double	height = 162.3;

		ArrayList list = new ArrayList();
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
	}
	// ArrayList 메모리를 많이 차지함
	// 갯수가 명확하지 않으면 ArrayList 사용한다.
	// 동적인 배열로 스스로 넣을때마다 하나씩 방을 늘려준다.
	// ArrayList list = new ArrayList(2); (2)숫자를 넣는게 의미가 없다.
	// list.size() 로 방에 값을 대입
	// .add	 
	// 연결리스트에서 맨 뒤에 새 노드를 연결시키는 것과 같다. -> 
	// 뒤쪽으로 데이터가 쌓이고, 순서를 가진다.
}
