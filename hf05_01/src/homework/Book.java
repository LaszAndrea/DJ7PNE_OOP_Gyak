package homework;

public class Book {

	java.time.LocalDate currentDate = java.time.LocalDate.now();
	private String author;
	private double price;
	private int yearOfPublication;
	private String title;
	
	public String displayInfo() {
		return "konyv [szerzo=" + author + ", ar=" + price + ", ev=" + yearOfPublication + ", cim=" + title + "]";
	}
	
	public Book(String szerzo, double ar, int ev, String cim) {
		this.author = szerzo;
		this.price = ar;
		this.yearOfPublication = ev;
		this.title = cim;
	}
	
	public Book(String author,String title) {
		this.author = author;
		price=2500;
		yearOfPublication = currentDate.getYear(); ;
		this.title = title;
	}

	public void increasePrice(double szazalek)
	{
		if (szazalek > 0)
			this.price = this.price+(price*(szazalek/100));
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void checkPrice() {
		if (this.price<1000) 
		{
			this.price=1000;
		}
	}
	
	public void publication() {
		if(this.yearOfPublication < 1950 || this.yearOfPublication > 2021)
		{
			this.yearOfPublication = 2021;
		}
	}
	
}
