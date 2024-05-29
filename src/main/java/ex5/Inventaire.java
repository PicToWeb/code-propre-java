package ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Inventaire {

	private List<Caisse> caisses = new ArrayList<>();

	public Inventaire() {

		Collections.addAll(caisses, new PetiteCaisse(), new MoyenneCaisse(), new GrandeCaisse());
	}

	public void addItem(Item item) {

		for (Caisse caisse : caisses) {
			if(caisse.caisseValidation(item)) {
				caisse.getItems().add(item);
			}
		}
	}
	

	public void afficherListeItems() {
		for (Caisse caisse : caisses) {
			caisse.afficherListeItems();
		}

	}

	public int taille() {
		int somme = 0;
		for(Caisse caisse : caisses) {
			somme += caisse.taille();
		}
		return somme;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Inventaire : ").append(taille()).append(" objets");
		for (Caisse caisse : caisses) {
			builder.append("\n\t").append(caisse);
		}
		return builder.toString();
		
	}

	
	
	
}
