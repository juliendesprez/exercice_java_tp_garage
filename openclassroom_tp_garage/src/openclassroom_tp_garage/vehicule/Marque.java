package openclassroom_tp_garage.vehicule;

public enum Marque {
	RENO ("Reno"),
	PIGEOT ("Pigeot"),
	TROEN ("Troen");
	
	  private String name = "";
	   
	  //Constructeur
	  Marque(String name){
	    this.name = name;
	  }
	   
	  public String toString(){
	    return name;
	  }	
}
