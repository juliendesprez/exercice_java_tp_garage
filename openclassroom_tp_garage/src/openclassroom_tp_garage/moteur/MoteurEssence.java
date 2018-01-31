package openclassroom_tp_garage.moteur;

public class MoteurEssence extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5193070554810544096L;

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ESSENCE);
	}

}
