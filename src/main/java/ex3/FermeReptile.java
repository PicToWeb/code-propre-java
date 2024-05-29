package ex3;

import ex3.enums.TypeAnimal;

/** Class used to add an animal in FermeReptile
 * 
 */
public class FermeReptile extends Zone{

	/** Constructor
	 * 
	 */
	public FermeReptile() {
		super(0.1);
	
	}

	/** Validator for FermeReptile
	 *
	 */
	@Override
	public boolean animalValidation(Animal animal) {
		
		return animal.getType().equals(TypeAnimal.REPTILE);
	}


}