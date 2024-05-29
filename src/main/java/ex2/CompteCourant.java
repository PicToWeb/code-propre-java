/**
 * 
 */
package ex2;

/**
 * Class used to create a current account
 */
public class CompteCourant extends CompteBancaire {

	/** Constructor
	 * 
	 * @param solde 
	 * @param decouvert
	 * 
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde,decouvert);
	}

}
