package ex3.zones;

import java.util.ArrayList;

import ex3.Animal;
import ex3.utils.AnimalClass;
import ex3.utils.FoodType;
import ex3.utils.PreferedHabitat;

public class Zone {

	private ArrayList<Animal> animals;
	private String name;
	private float foodPerDay;
	
	private PreferedHabitat zoneInhabitants;
	
	public Zone(String zoneName, float foodConsumption, AnimalClass fam, FoodType food){
		animals = new ArrayList<Animal>();
		name = zoneName;
		foodPerDay = foodConsumption;
		zoneInhabitants = new PreferedHabitat(fam, food);
	}
	
	public void addAnimal(Animal animalToAdd){
		animals.add(animalToAdd);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Replace afficherListeAnimaux()
	 */
	public String toString(){
		String temp = "Animal(s) in " + name + " :\n";
		
		for(Animal a : animals){
			temp += a + "\n";
		}
		
		return temp;
	}
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * foodPerDay;
	}
	
	public boolean correctHabitat(Animal animalToAdd){
		
		if(animalToAdd.getPreferedHabitat().equals(zoneInhabitants)){
			return true;
		}
		
		return false;
	}
	
}
