package ex3.utils;

public enum AnimalClass {
	
	MAMAL ("Mamif�re"),
	FISH("Poisson"),
	REPTILE("Reptile");

    private String animalClass;

    AnimalClass(String s) {
    	animalClass = s;
    }
    
    public String getAnimalClass(){
    	return animalClass;
    }

}
