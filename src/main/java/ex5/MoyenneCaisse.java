/**
 * 
 */
package ex5;

/**
 * 
 */
public class MoyenneCaisse extends Caisse {

	public static final int POIDS_MIN = 5;
	public static final int POIDS_MAX = 20;
	/** Constructor
	 * 
	 */
	public MoyenneCaisse() {
		super("Moyens Objets");
	}
	@Override
	public boolean caisseValidation(Item item) {
		return item.getPoids() >= POIDS_MIN && item.getPoids() <= POIDS_MAX;
	}

}
