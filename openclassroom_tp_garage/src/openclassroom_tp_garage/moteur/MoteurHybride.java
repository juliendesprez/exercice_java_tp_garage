package openclassroom_tp_garage.moteur;

public class MoteurHybride extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4664454946927728051L;

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.HYBRIDE);
	}

}
