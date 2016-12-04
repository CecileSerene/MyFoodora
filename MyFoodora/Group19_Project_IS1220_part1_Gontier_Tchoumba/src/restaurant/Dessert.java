package restaurant;

public class Dessert extends MainDish {

	private String name;
	private double price;
	private boolean glutenfree;
	private Type type;
	
	
	public Dessert(String name, double price, boolean glutenfree, Type type) {
		super(name, price, glutenfree, type);
	}
	
}
