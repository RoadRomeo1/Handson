
public class Book{
 
	private String name;
	private Author a;
	private double price;
	private int stock;
	
	public Book(String name, Author a, double price, int stock) {
		super();
		this.name = name;
		this.a = a;
		this.price = price;
		this.stock = stock;
	}

	
	public static void main(String[] args) {
	Author a=new Author();
	a.setName("Kathy Siera");
	a.setEmail("kathy.1.com");
	a.setGender('F');
	Book b=new Book("Head First Java", a, 1500.29, 10); 
	System.out.println("Book Name: "+b.getName());
	System.out.println("Author Name: "+a.getName());
	System.out.println("Author Email: "+a.getEmail());
	System.out.println("Author Gender: "+a.getGender());
	System.out.println("Book Price: "+b.getPrice());
	System.out.println("Book Availablity(in numbers): "+b.getStock());
	
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Author getA() {
		return a;
	}


	public void setA(Author a) {
		this.a = a;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

}
