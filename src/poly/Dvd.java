package poly;

public class Dvd extends Item {

	private String actor;
	private String director;
	
	public Dvd() {
		
	}
	
	public Dvd (String number, String title, String actor, String director) {
		super.number = number;
		super.title = title;
		this.actor = actor;
		this.director = director;
		
	}
	
	public void output() {
		System.out.println("번호 : " + number);
		System.out.println("제목 : "+ title);
		System.out.println("배우 : "+actor);
		System.out.println("감독 : "+director);
	}

}
