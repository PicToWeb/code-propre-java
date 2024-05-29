/**
 * 
 */
package ex5;

/**
 * 
 */
public class GrandeCaisse extends Caisse {

	public static final int POIDS_MAX = 20;
	/** Constructor
	 * 
	 */
	public GrandeCaisse() {
		super("Grands Objets");
	}
	@Override
	public boolean caisseValidation(Item item) {
		return item.getPoids()>=POIDS_MAX;
	}

}
