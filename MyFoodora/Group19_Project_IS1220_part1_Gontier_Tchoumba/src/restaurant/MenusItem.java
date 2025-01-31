package restaurant;

public class MenusItem {
	
	private String name;
	private double price;
	private boolean glutenfree;
	private Type type;
	
	
	public MenusItem(String name, double price, boolean glutenfree, Type type) {
		super();
		this.name = name;
		this.price = price;
		this.glutenfree = glutenfree;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isGlutenfree() {
		return glutenfree;
	}


	public void setGlutenfree(boolean glutenfree) {
		this.glutenfree = glutenfree;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + ", glutenfree=" + glutenfree + ", type=" + type + "]";
	};
	
	
	
	
	
	

}
