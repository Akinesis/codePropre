package ex3;

import java.util.ArrayList;

import ex3.utils.AnimalClass;
import ex3.utils.FoodType;
import ex3.zones.Zone;

public class Zoo {

	private String nom;
	private ArrayList<Zone> zones;
	
	public Zoo(String nom){
		this.nom = nom;
		zones = new ArrayList<Zone>();
		initZoo();
	}
	
	private void initZoo(){
		zones.add(new Zone("Aquarium", 0.2f, AnimalClass.FISH, FoodType.HERBIVORE ));
		zones.add(new Zone("Ferme au reptiles", 0.1f, AnimalClass.REPTILE, FoodType.CARNIVORE ));
		zones.add(new Zone("Savane affricaine", 10f, AnimalClass.MAMAL, FoodType.HERBIVORE));
		zones.add(new Zone("Carnivores", 10f, AnimalClass.MAMAL, FoodType.CARNIVORE));
	}
	
	public void addAnimal(Animal animalToAdd){
		
		for(Zone z : zones){
			if(z.correctHabitat(animalToAdd)){
				z.addAnimal(animalToAdd);
			}
		}

	}
	
	public void afficherListeAnimaux(){
		for(Zone z : zones){
			System.out.println(z);
		}
	}
	
	
	
	//==============================================================//
	//************************Getters/Setters***********************//
	//==============================================================//
	

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
