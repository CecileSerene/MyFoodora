/*
 * Made by Cecile Gontier
 * date : 4th December
 * version 1
 */

package restaurant;

public class HalfMeal extends Meal {
	
	public HalfMeal(MainDish maindish, Dessert dessert){
		super(null, maindish, dessert);
	}
	
	public HalfMeal(Starter starter, MainDish maindish){
		super(starter, maindish, null);
	}

}
