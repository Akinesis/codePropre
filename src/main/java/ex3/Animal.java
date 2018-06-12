package ex3;

import ex3.utils.AnimalClass;
import ex3.utils.FoodType;
import ex3.utils.PreferedHabitat;

public class Animal {
	
	private String name;
	private AnimalClass family;
	private FoodType preferedFood;
	
	public Animal(String name, AnimalClass fam, FoodType food){
		this.name = name;
		family = fam;
		preferedFood = food;
	}
	
	public String toString(){
		return name + ", " + family.getAnimalClass()  +". Régime : " + preferedFood.getFoodName();
	}
	
	public PreferedHabitat getPreferedHabitat(){
		return new PreferedHabitat(family, preferedFood);
	}
	

}
