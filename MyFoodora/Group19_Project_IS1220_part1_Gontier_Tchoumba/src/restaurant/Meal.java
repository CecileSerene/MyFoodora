/*
 * Made by Cecile Gontier
 * date : 4th December
 * version 1
 */

package restaurant;

public class Meal {
	
	private String name;
	private double price;
	private boolean glutenfree;
	private Type type;
	
	private Starter starter;
	private MainDish maindish;
	private Dessert dessert;
	
	private boolean mealoftheweek;
	
	public Meal(Starter starter, MainDish maindish, Dessert dessert) {
		super();
		this.starter = starter;
		this.maindish = maindish;
		this.dessert = dessert;
		this.mealoftheweek = false;
		
		//setting if vegetarian
		if (starter == null | starter.getType() == Type.VEGETARIAN){
			if (maindish.getType() == Type.VEGETARIAN){
				if(dessert == null | dessert.getType() == Type.VEGETARIAN){
					this.type = Type.VEGETARIAN;
				}
			}
		}
		this.type = Type.STANDARD;
		
		//setting if glutenfree
		if (starter == null | starter.isGlutenfree()){
			if (maindish.isGlutenfree()){
				if(dessert == null | dessert.isGlutenfree()){
					this.glutenfree = true;
				}
			}
		}
		this.glutenfree = false;
		
		//setting price and name
		double sum = maindish.getPrice();
		String s = "";
		if (starter != null){
			sum = sum + starter.getPrice();
			s = s + starter.getName() +" - ";
		}
		s = s + maindish.getName();
		if (dessert != null){
			sum = sum + dessert.getPrice();
			s = s + " - " + dessert.getName();
		}
		this.price = sum;
		this.name = s;
		
	}

	@Override
	public String toString() {
		return "[name=" + name + ", glutenfree=" + glutenfree + ", type=" + type + "]";
	}

	public double getPrice() {
		return price;
	}
	
	public void setMealoftheweek(){
		this.mealoftheweek = true;
	}
	
	public void resetMealoftheweek(){
		this.mealoftheweek = false;
	}
	
	



}
