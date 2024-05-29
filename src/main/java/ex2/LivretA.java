package ex2;

/** 
 * Class used to create a saving account
 * 
 */
public class LivretA extends CompteBancaire {
	
	
	private double tauxRemunerationAnnuel;
	

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * 
	 * @param solde            représente le solde du compte
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemunerationAnnuel) {
		super(solde,0);

	}
	
	/**
	 * Mehtod used to calculate the remuneration per year
	 */
	public void showRemunerationAnnuel() {
		this.solde=solde+solde*tauxRemunerationAnnuel / 100.0;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemunerationAnnuel() {
		return tauxRemunerationAnnuel;
	}

	/**
	 * Setter for setTauxRemunerationAnnuel
	 * 
	 * @param the TauxRemunerationAnnuel to set
	 */
	public void setTauxRemunerationAnnuel(double tauxRemuneration) {
		this.tauxRemunerationAnnuel = tauxRemuneration;
	}

}
