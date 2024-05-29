package ex3;

import ex3.enums.TypeAnimal;

/** Class used to add an aqua animal
 * 
 */
public class Aquarium extends Zone {

	/** Constructor
	 * 
	 */
	public Aquarium() {
		super(0.2);

	}

	@Override
	public boolean animalValidation(Animal animal) {

		return animal.getType().equals(TypeAnimal.POISSON);
	}

}