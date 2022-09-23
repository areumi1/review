package Test;

public class Book {
	
	String bookname;
	String author;
	String publisher;
	
	Book(String bookname, String author, String publisher){
		this.bookname = bookname;
		this.author = author;
		this.publisher = publisher;
	}
	
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
}
