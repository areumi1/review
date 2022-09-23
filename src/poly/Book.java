package poly;

public class Book extends Item {
	// 부모가 미완성 output() 을 가지고 있는데 니가 무조건 완성해야해.

	private String author;
	private String publisher;
	
	public Book() {
		this("000","제목없음","무명","출판사");
		System.out.println("Book 기본생성자");
	}
	
	public Book (String number, String title, String author, String publisher) {
		//super.number = number;
		//super.title = title;
		super(number,title);
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자생성자");
	}
	
	public void output() {		// 오버라이딩 
		System.out.println("번호 : " + number);
		System.out.println("제목 : "+ title);
		System.out.println("저자 : "+author);
		System.out.println("출판사 : "+publisher);
	}
		

		
}


