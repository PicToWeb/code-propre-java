package ex2;


/**
 * Abstract Class used to create a bank account
 * 
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {


	/** solde : solde du compte */
	protected double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double decouvert;


	/**
	 * Contructeur permettant d'initialiser un nouveau compte bancaire
	 * 
	 * @param solde
	 * @param decouvert
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}


	/**
	 * Méthode permettant de créditer un montant sur le compte
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Méthode permettant de débiter un montant sur le compte
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;	
		}
	}
	

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}


	
}
