/**
 * 
 */
package ex5;

/**
 * 
 */
public class PetiteCaisse extends Caisse {

	public static final int POIDS_MAX = 5;
	/** Constructor
	 * 
	 */
	public PetiteCaisse() {
		super("Petits Objets");
	}
	@Override
	public boolean caisseValidation(Item item) {
		return item.getPoids()<POIDS_MAX;
	}

}
