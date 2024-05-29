package ex1;

import java.util.Date;

/** Class used for create a company with 4 params
 * 
 */
public class Entreprise {

	/** siret */
	private int siret;
	/** nom */
	private String nom;
	/** adresse */
	private String adresse;
	/** dateCreation */
	private Date dateCreation;

	final int CAPITAL_MAX = 3000000;

	/**
	 * Constructor to create an entreprise
	 * 
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}


	/**
	 * Getter for siret
	 * 
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter for siret
	 * 
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter for nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter for adresse
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter for adresse
	 * 
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter for dateCreation
	 * 
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter for dateCreation
	 * 
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * Getter for capitalMax
	 * 
	 * @return the capitalMax
	 */
	public int getCapitalMax() {
		return CAPITAL_MAX;
	}

}
