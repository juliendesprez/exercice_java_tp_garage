package openclassroom_tp_garage.vehicule;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

import openclassroom_tp_garage.moteur.*;
import openclassroom_tp_garage.option.*;

public class Vehicule  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8987814746133081853L;
	protected Double prix;
	protected String nom;
	protected HashSet<Option> options;
	protected Marque nomMarque;
	protected Moteur moteur;
	
	public Vehicule() {
		options = new HashSet<Option>();	
	}
	public Marque getMarque() {
		return nomMarque;
	}

	public Double getPrix() {
		return prix;
	}

	public HashSet<Option> getOptions() {
		return options;
	}
	
	public void addOption(Option opt) {
		options.add(opt);
	}
	
	public String toString() {
		String result = "Véhicule : " + nom;
		result += " Moteur : " + moteur.toString() + " ";
		result += "(" + prix + ") Options : ";
		Iterator<Option> it = options.iterator();
	    while(it.hasNext()) {
	    	Option opt = (Option) it.next();
	    	result = result + opt.getClass().getSimpleName() + " (" + opt.getPrix() + "€), ";
	    }
		result += " d'une valeur totale de " + getValeurTotale() +  "€";		
		return result;		
	}
	
	public void setMoteur(Moteur mot) {
		this.moteur = mot;
	}
	
	public Double getValeurTotale() {
		Double valeur = prix;
		valeur += moteur.getPrix();
		Iterator<Option> it = options.iterator();
	    while(it.hasNext()) {
	    	valeur += ((Option) it.next() ).getPrix();
	    }		
		return valeur;
		
	}
}
