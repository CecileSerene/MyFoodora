/*
 * Made by Cecile Gontier
 * date : 4th December
 * version 1
 */

package restaurant;

public class FullMeal extends Meal {
	
	private String name;
	private double price;
	private boolean glutenfree;
	private Type type;
	
	private Starter starter;
	private MainDish maindish;
	private Dessert dessert;
	
	public FullMeal(Starter starter, MainDish maindish, Dessert dessert){
		super(starter, maindish, dessert);
	}
	
	

}
