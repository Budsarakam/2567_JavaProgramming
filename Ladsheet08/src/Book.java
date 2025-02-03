
public class Book {
	private string title;
	private Author author;
	private int pages;
	
	Book(String title, Author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	Book(String title,Author author) {
		this.title = title;
		this.author = author;
		this.pages = 0;
	}
	
	Book() {
		this.title = null;
		this.author = null;
		this.pages = 0;
	}
	
	public String getTitle() {
		return  this.anothor;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public void etPages(int pages) {
		return this = pages;
	}
	
	public int getpages(int pages) {
		this.pages 
	}
	
	public String toString() {
		return getTitle()+" has " + getPages() + " pages write by " + author.toString();
	}

	private String getPages() {
		// TODO Auto-generated method stub
		return null;
	}
}
