package basic4;

public class Student {

	private String hakbun;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public Student() {			// 기본생성자 사용자가 생성자 코드 만들지 않을 경우 컴파일러가 자동 생성
//		this.name = "이름없음";	// 생성자 코드가 있는 경우 자동생성되지 않음 그렇기 때문에 습관적으로 꼭 직접 생성
//		this.kor = 50;
//		this.eng = 50;
//		this.math = 50 ;
		this("이름없음",50,50,50);			// this : 생성자 호출 첫줄에 들어가야 정상실행	
		System.out.println("기본생성자");
	}	
	// this 22번 생성자로 이동 출력후 다시 돌아와 밑으로 출력
	// this 는 첫라인으로만 들어올수 있음.
							
	
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자있는 생성자");
	}
	

	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	public void calTotak() {
		total = kor + eng + math;
	}
	public void calAvg() {
		avg = total / 3;
	}
	public void output() {
		System.out.println(name+"님 성적 : "+ total + "/" + avg );
	}
}

/*
 * 캡슐화
 * 	- 멤버변수(field) : private
 * 	- 멤버메소드 : public
 * 
 */
