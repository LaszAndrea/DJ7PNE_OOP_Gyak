package homework;

public class Homework {

	public static void main(String[] args) {
		Book k1 = new Book("Világok", 990, 2022, "Asd Asd");
		
		k1.checkPrice();
		k1.publication();
		
		System.out.println(k1.displayInfo());
		k1.increasePrice(10);
		System.out.println(k1.displayInfo());

	}

}
