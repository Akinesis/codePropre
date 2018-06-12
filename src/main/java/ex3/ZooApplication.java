package ex3;

import ex3.utils.AnimalClass;
import ex3.utils.FoodType;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		//Create and add new animals to the zoo
		zoo.addAnimal(new Animal("Zèbre", AnimalClass.MAMAL, FoodType.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", AnimalClass.MAMAL, FoodType.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", AnimalClass.MAMAL, FoodType.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", AnimalClass.FISH, FoodType.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", AnimalClass.FISH, FoodType.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", AnimalClass.REPTILE, FoodType.CARNIVORE));
		zoo.addAnimal(new Animal("Python", AnimalClass.REPTILE, FoodType.CARNIVORE));
		
		zoo.printAllAnimals();
		
	}

}
