package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	/** Animals list */
	private List<Animal> animaux;
	private double poidsConsommeMoyenQuotidien;

	/**
	 * Constructor
	 * 
	 * @param animaux
	 */
	public Zone(double poidsConsommeMoyenQuotidien) {
		this.animaux = new ArrayList<>();
		this.poidsConsommeMoyenQuotidien = poidsConsommeMoyenQuotidien;
	}

	/**
	 * Method used to accept an animal in different area Each area confirm is the
	 * animal can be accepted
	 * 
	 * @param animal
	 * @return boolean
	 */
	public abstract boolean animalValidation(Animal animal);

	/**
	 * Method used for add an animal in the list
	 * 
	 * @param animal
	 */
	public final void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Method used to display animal list of Savane Africaine
	 * 
	 */
	public void afficherListeAnimaux() {
		
		animaux.forEach(a->System.out.println(a.toString()));
	}

	/**
	 * Method used to count animal of the list
	 * 
	 * @return size of list
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * Method used to count kilogrames of food per day
	 * 
	 * @return
	 */
	public int calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}

	/**
	 * Method used to have the total of kilogrammes food per day
	 * 
	 * @return Total of kilogrammes eating per day for animals
	 */
	public final double totalKgFoodPerDay() {
		return animaux.size() * getAverageWeigthFood();
	}

	/** Getter for poidsConsommeMoyenQuotidien
	 * @return poidsConsommeMoyenQuotidien
	 */
	public final double getAverageWeigthFood() {
		return poidsConsommeMoyenQuotidien;
	}

}
