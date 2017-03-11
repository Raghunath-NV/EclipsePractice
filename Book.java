import java.io.Serializable;

class Book implements Serializable {
	
	int id;
	String title;
	transient String author;
	double price;

	public Book(int id, String title, String author, double price) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;	

	}

	public String toString() {
		return "[" + id + ", " + title + ", " + author + ", " + 
		price + "]";
	}



}