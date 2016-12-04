package restaurant;

public class MainDish extends MenusItem {
	
	private String name;
	private double price;
	private boolean glutenfree;
	private Type type;
	
	
	public MainDish(String name, double price, boolean glutenfree, Type type) {
		super(name, price, glutenfree, type);
	}

}
