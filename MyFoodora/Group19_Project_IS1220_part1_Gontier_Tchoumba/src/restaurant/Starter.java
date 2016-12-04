package restaurant;

public class Starter extends MenusItem{
	
	private String name;
	private double price;
	private boolean glutenfree;
	private Type type;
	
	
	public Starter(String name, double price, boolean glutenfree, Type type) {
		super(name, price, glutenfree, type);
	}

}
