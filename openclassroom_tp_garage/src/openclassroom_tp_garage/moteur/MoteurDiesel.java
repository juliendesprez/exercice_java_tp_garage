package openclassroom_tp_garage.moteur;

public class MoteurDiesel extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5091557832317838887L;

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.DIESEL);
	}

}
