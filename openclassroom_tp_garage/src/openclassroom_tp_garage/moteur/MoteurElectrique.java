package openclassroom_tp_garage.moteur;

public class MoteurElectrique extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6329482585563716407L;

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ELECTRIQUE);
	}

}
