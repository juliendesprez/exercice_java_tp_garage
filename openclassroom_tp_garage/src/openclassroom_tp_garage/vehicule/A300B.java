package openclassroom_tp_garage.vehicule;

public class A300B extends Vehicule {

	/**
	 * 
	 */
	private static final long serialVersionUID = 806378659204240250L;

	public A300B() {
		super();
		this.nom = "A300B";
		this.prix = 10000d;		
		this.nomMarque = Marque.PIGEOT;
	}

}
