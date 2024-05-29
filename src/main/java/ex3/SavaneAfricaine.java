package ex3;

import ex3.enums.Alimentation;
import ex3.enums.TypeAnimal;

/** Class used to add an animal in SavaneAfricaine
 * 
 */
public class SavaneAfricaine extends Zone
{

	/** Constructor
	 * 
	 */
	public SavaneAfricaine() {
		super(10);
		
	}

	@Override
	public boolean animalValidation(Animal animal) {
		
		return animal.getType().equals(TypeAnimal.MAMMIFERE) && animal.getAlimentation().equals(Alimentation.HERBIVORE);
	}

}