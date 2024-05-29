package ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Class used to create a zoo within we add animals
 * 
 */
public class Zoo {

	/** nom */
	private String nom;

	/** List of area animal */
	private List<Zone> area = new ArrayList<>();

	/**
	 * Constructor
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
		Collections.addAll(area, new Aquarium(), new FermeReptile(), new SavaneAfricaine(), new ZoneCarnivore());
	}

	/**
	 * Method used to add an animal if he is accepted whith his params
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		for (Zone zone : area) {
			if (zone.animalValidation(animal)) {
				zone.addAnimal(animal);
				break;
			}
		}
	}

	/**
	 * Method used to dispaly each animals of the zoo
	 * 
	 */
	public void afficherListeAnimaux() {
		for (Zone zone : area) {
			zone.afficherListeAnimaux();
		}

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
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}