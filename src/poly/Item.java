package poly;

abstract public class Item   {
	protected String number;
	protected String title;
	
	public Item () {
		
	}
	
	public Item(String number, String title) {
		this.number = number;
		this.title = title;
	}
	
	
	
	abstract public void output();	// 미완성 메소드 

}
