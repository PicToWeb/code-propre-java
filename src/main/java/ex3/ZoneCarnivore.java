package ex3;


import ex3.enums.Alimentation;
import ex3.enums.TypeAnimal;

public class ZoneCarnivore extends Zone{
	
	/** AVERAGE_WEIGHT_CARNIVOR_ZONE */
	public static final double AVERAGE_WEIGHT_CARNIVOR_ZONE = 10.00;
	
	/** Constructor
	 * 
	 */
	public ZoneCarnivore() {
		super(AVERAGE_WEIGHT_CARNIVOR_ZONE);
		
	}

	@Override
	public boolean animalValidation(Animal animal) {
		
		return animal.getAlimentation().equals(Alimentation.CARNIVORE) && animal.getType().equals(TypeAnimal.MAMMIFERE);
	}

	
}