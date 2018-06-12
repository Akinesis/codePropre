package ex3;

import ex3.utils.AnimalClass;
import ex3.utils.FoodType;
import ex3.utils.PreferedHabitat;

/**
 * @author Joachim
 *
 */
public class Animal {
	
	/** Usage : The name of the animal
	*   String : name
	*/
	private String name;
	
	/** Usage : The family of the animal (eg : mamal)
	*   AnimalClass : family
	*/
	private AnimalClass family;
	
	/** Usage : The food habit of the animal (eg : carnivore)
	*   FoodType : preferedFood
	*/
	private FoodType preferedFood;
	
	/** Constructor for Animal
	 *  @param name The name of the animal
	 *  @param fam The family of the animal
	 *  @param food the prefered food of the animal
	 */
	public Animal(String name, AnimalClass fam, FoodType food){
		this.name = name;
		family = fam;
		preferedFood = food;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return name + ", " + family.getAnimalClass()  +". R�gime : " + preferedFood.getFoodName();
	}
	
	/**
	 * @return The PreferedHabitat object of the animal using is family and food
	 */
	public PreferedHabitat getPreferedHabitat(){
		return new PreferedHabitat(family, preferedFood);
	}
	

}
