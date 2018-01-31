package openclassroom_tp_garage.moteur;

import java.io.Serializable;

public abstract class Moteur  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4576270951630474679L;
	protected TypeMoteur type;
	private String cylindre;
	private Double prix;

	public Moteur(String cylindre , Double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}

	public String toString() {
		String result = type.toString() + " ";
		result += cylindre;
		return result;
	}

	public Double getPrix() {
		return prix;

	}

	/**
	 * @return the type
	 */
	public TypeMoteur getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeMoteur type) {
		this.type = type;
	}

	/**
	 * @return the cyclindre
	 */
	public String getCyclindre() {
		return cylindre;
	}

	/**
	 * @param cyclindre the cyclindre to set
	 */
	public void setCyclindre(String cyclindre) {
		this.cylindre = cyclindre;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}
}
