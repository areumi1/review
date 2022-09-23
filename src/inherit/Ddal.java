package inherit;

public class Ddal extends Umma {
	
	public Ddal() {
		System.out.println("딸 생성");
	}
	
	public void study() {
		System.out.println("딸은 공부중");
	}	
	public void job() {		
		System.out.println("직업없음");
	}
	public void gene() {
		System.out.println("자녀는 자녀");
	}

}

//부모가 들고있는 메소드를 똑같이 가져와 재정의 하는걸 오버라이딩
// 동일한 메소드를 들고있는 오버라이딩 경우 자식 값을 불러줌.

