package ex3.utils;

public class PreferedHabitat {
	
	/** Usage : The animal classification of the habitat
	*   AnimalClass : family
	*/
	private AnimalClass family;
	
	/** Usage : The prefered food of animals in this habitat
	*   FoodType : preferedFood
	*/
	private FoodType preferedFood;
	
	public PreferedHabitat(AnimalClass fam, FoodType food){
		family = fam;
		preferedFood = food;
	}

	public boolean equals(Object object){
		
		if(object instanceof PreferedHabitat){
			PreferedHabitat temp = (PreferedHabitat)object;
			if ((temp.getAnimalClass().equals(this.getAnimalClass())) && (temp.getFoodType().equals(this.getFoodType()))){
				return true;
			}
		}
		
		return false;
	}
	
	public String getAnimalClass(){
		return family.getAnimalClass();
	}
	
	public String getFoodType(){
		return preferedFood.getFoodName();
	}
	
	
	
}
