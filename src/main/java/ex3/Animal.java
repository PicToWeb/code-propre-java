package ex3;

import ex3.enums.Alimentation;
import ex3.enums.TypeAnimal;

/**
 * Class used to manage animals
 */
public class Animal {

	private String nom;
	private TypeAnimal type;
	private Alimentation alimentation;

	/**
	 * Constructor pour créer un animal
	 * 
	 * @param nom
	 * @param type
	 * @param alimentation
	 */
	public Animal(String nom, TypeAnimal type, Alimentation alimentation) {
		this.nom = nom;
		this.type = type;
		this.alimentation = alimentation;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type.getAnimalCategory() + ", alimentation=" + alimentation + "]";
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter for nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**
	 * Getter for alimentation
	 * 
	 * @return the alimentation
	 */
	public Alimentation getAlimentation() {
		return alimentation;
	}

}
