package ex5;

import java.util.ArrayList;
import java.util.List;

public abstract class Caisse {

	private String nom;
	private List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom) {
		this.nom = nom;
		this.items = new ArrayList<>();
	}
	
	/**
	 * @param item
	 * @return
	 */
	public abstract boolean caisseValidation (Item item);
	
	public void afficherListeItems() {
		for (Item item : items) {
			System.out.println("Caisse : " + getNom() + ", nom : " + item.getNom() + ", poids : " + item.getPoids());
		}

	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("- ").append(taille()).append(" ").append(getNom());
		for (Item item : items) {
			builder.append("\n\t\t").append(item.getNom());
		}
		return builder.toString();
	}

	public int taille() {
		return items.size();
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
