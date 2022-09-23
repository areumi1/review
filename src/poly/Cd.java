package poly;

public class Cd extends Item{

	private String singer;
	
	public Cd () {
		
	}
	
	public Cd(String number, String title, String singer) {
		super.number = number;
		super.title = title;
		this.singer = singer;
		
	}
	
	public void output() {
		System.out.println("번호 : " + number);
		System.out.println("제목 : "+ title);
		System.out.println("가수 : "+singer);
	}
	

}
