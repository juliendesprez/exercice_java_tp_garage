package openclassroom_tp_garage.moteur;

public enum TypeMoteur {
	DIESEL ("Moteur diesel"),
	ESSENCE ("Moteur essence"),
	HYBRIDE ("Moteur hybride"),
	ELECTRIQUE ("Moteur electrique");
	
	  private String name = "";
	   
	  //Constructeur
	  TypeMoteur(String name){
	    this.name = name;
	  }
	   
	  public String toString(){
	    return name;
	  }	
}
