package ex3.enums;

/**
 * 
 * Used to attribuate an animal feed
 */
public enum TypeAnimal {

	/** MAMMIFERE */
	MAMMIFERE("Mammifère"),
	/** OISEAU */
	OISEAU("Oiseau"),
	/** REPTILE */
	REPTILE("REptile"),
	/** POISSON */
	POISSON("Poisson");

	/** animalName class */
	private String animalCategory;

	TypeAnimal(String string) {
		this.animalCategory = string;
	}

	/**
	 * Getter for animalName
	 * 
	 * @return the animalName
	 */
	public String getAnimalCategory() {
		return animalCategory;
	}

}
