package ex5;

public class Application {

	public static void main(String[] args) {
		
		Inventaire inventaire = new Inventaire();
		
		inventaire.addItem(new Item("cahier", 2.5));
		inventaire.addItem(new Item("ordinateur", 7));
		inventaire.addItem(new Item("ordinateur2", 10));
		inventaire.addItem(new Item("bureau", 42.5));
		
		inventaire.afficherListeItems();
		
		System.out.println(inventaire);
		

	}

}
