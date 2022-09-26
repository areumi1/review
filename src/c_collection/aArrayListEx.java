
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		Object[] obj = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
	}

	static Object[] dataSet()
	{
		String	name = "김태희";
		Integer	age = 31; // int age = 31;
		Double	height = 162.3;

		Object[] obj = new Object[3];
		obj[0] = name;
		obj[1] = age;
		obj[2] = height;
		
		return obj;
	}
	// return 을 이용해서 dataSet() 에 데이터를 보내야 함 
	// return 은 하나만 보낼수있음
	// 실무에서는 클래스를 함부로 만들수 없어 배열로 만들어야한다.
	// Object는 최상위로 모든값을 포함하고 있음.
	// 배열은 정확한 갯수를 알고 사용해야한다.
	
	// Integer 
	// 매개변수로 객체를 필요로 할 때
	// 기본형 값이 아닌 객체로 저장해야할 때
	// 객체 간 비교가 필요할 때
	// 
}
