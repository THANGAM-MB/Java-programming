package MyPackage;

import java.awt.Window.Type;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

 class Dish{
	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;
	public Dish() {
		this.name = "";
		this.vegetarian = false;
		this.calories = 0;
		this.type = null;
		
	}
	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public int getCalories() {
	return calories;
	}
	public Type getType() {
	return type;
	}
	@Override
	public String toString() {
	return name;
	}
	public enum Type { MEAT, FISH, OTHER }



}
public class stream {
	public static void main(String args[])
	{
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		
		//Dish dish=new Dish();
		List<String> threeHighCaloricDishNames = menu.stream()
							.filter(d -> d.getCalories() > 300)
							.map(Dish::getName)
							.limit(3)
							.sorted()
							.collect(toList());
							System.out.println(threeHighCaloricDishNames);    
}}
