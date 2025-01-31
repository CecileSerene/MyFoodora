/*
 * Made by Cecile Gontier
 * date : 4th December
 * version 1
 */

package restaurant;

import java.util.ArrayList;

import position.Position;

public class Restaurant {
	
	private String name;
	private static int ID;
	private Position position;
	private String username;
	
	private ArrayList<Starter> starterlist;
	private ArrayList<MainDish> maindishlist;
	private ArrayList<Dessert> dessertlist;
	
	private ArrayList<FullMeal> fullmeallist;
	private ArrayList<HalfMeal> halfmeallist;
	
	public Restaurant(String name, Position position, String username) {
		super();
		this.name = name;
		this.position = position;
		this.username = username;
		this.starterlist = new ArrayList<Starter>();
		this.maindishlist = new ArrayList<MainDish>();
		this.dessertlist = new ArrayList<Dessert>();
		this.fullmeallist = new ArrayList<FullMeal>();
		this.halfmeallist = new ArrayList<HalfMeal>();
		
	}
	
	
	//Getters and Setters
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public ArrayList<Starter> getStarterlist() {
		return starterlist;
	}

	public void setStarterlist(ArrayList<Starter> starterlist) {
		this.starterlist = starterlist;
	}

	public ArrayList<MainDish> getMaindishlist() {
		return maindishlist;
	}

	public void setMaindishlist(ArrayList<MainDish> maindishlist) {
		this.maindishlist = maindishlist;
	}

	public ArrayList<Dessert> getDessertlist() {
		return dessertlist;
	}

	public void setDessertlist(ArrayList<Dessert> dessertlist) {
		this.dessertlist = dessertlist;
	}

	public ArrayList<FullMeal> getFullmeallist() {
		return fullmeallist;
	}

	public void setFullmeallist(ArrayList<FullMeal> fullmeallist) {
		this.fullmeallist = fullmeallist;
	}

	public ArrayList<HalfMeal> getHalfmeallist() {
		return halfmeallist;
	}

	public void setHalfmeallist(ArrayList<HalfMeal> halfmeallist) {
		this.halfmeallist = halfmeallist;
	}
	
	//Add method
	public void addStarter(Starter s){
		ArrayList<Starter> old = this.getStarterlist();
		old.add(s);
		this.setStarterlist(old);
		System.out.println("You added the Starter" + s.toString());
	}
	
	public void addMainDish(MainDish m){
		ArrayList<MainDish> old = this.getMaindishlist();
		old.add(m);
		this.setMaindishlist(old);
		System.out.println("You added the MainDish" + m.toString());
	}
	
	public void addDessert(Dessert d){
		ArrayList<Dessert> old = this.getDessertlist();
		old.add(d);
		this.setDessertlist(old);
		System.out.println("You added the Dessert " + d.toString());
	}

	public void addFullMeal(FullMeal fm){
		ArrayList<FullMeal> old = this.getFullmeallist();
		old.add(fm);
		this.setFullmeallist(old);
		System.out.println("You added the FullMeal" + fm.toString());
	}

	public void addHalflMeal(HalfMeal hm){
		ArrayList<HalfMeal> old = this.getHalfmeallist();
		old.add(hm);
		this.setHalfmeallist(old);
		System.out.println("You added the HalfMeal" + hm.toString());
	}

	//Remove methods
	public void removeStarter(Starter s){
		ArrayList<Starter> old = this.getStarterlist();
		old.remove(s);
		this.setStarterlist(old);
	}
	
	public void removeMainDish(MainDish m){
		ArrayList<MainDish> old = this.getMaindishlist();
		old.remove(m);
		this.setMaindishlist(old);
	}
	
	public void removeDessert(Dessert d){
		ArrayList<Dessert> old = this.getDessertlist();
		old.remove(d);
		this.setDessertlist(old);
	}
	
	public void removeFullMeal(FullMeal fm){
		ArrayList<FullMeal> old = this.getFullmeallist();
		old.remove(fm);
		this.setFullmeallist(old);
	}

	public void removeHalflMeal(HalfMeal hm){
		ArrayList<HalfMeal> old = this.getHalfmeallist();
		old.remove(hm);
		this.setHalfmeallist(old);
	}
	
	//MealoftheWeek
	public void setMealoftheweek(Meal m){
		m.setMealoftheweek();
	}
	
	public void resetMealoftheweek(Meal m){
		m.resetMealoftheweek();
	}

	
	public static void main(String[] args) {
		Restaurant r1 = new Restaurant("RU", new Position(0.0,1.0), "RU");
		
		Starter s1 = new Starter("Salad", 10.0, false, Type.VEGETARIAN);
		r1.addStarter(s1);
		MainDish md1 = new MainDish("Chiken", 14.0, false, Type.STANDARD);
		r1.addMainDish(md1);
		Dessert d1 = new Dessert("Chocolate cake", 5.0, true, Type.VEGETARIAN);
		r1.addDessert(d1);
		Meal m1 = new FullMeal(s1, md1, d1);
		r1.addFullMeal((FullMeal) m1);
		
		
	}


}
