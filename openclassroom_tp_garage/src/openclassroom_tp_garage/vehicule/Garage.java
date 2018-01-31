package openclassroom_tp_garage.vehicule;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.nio.file.*;

public class Garage implements Serializable {
	/**
	 * 
	 */	
	private static final long serialVersionUID = 3336940606135789747L;
	private HashSet<Vehicule> voitures;
	private final String DEFAULT_PATH = "C:\\temp\\test.txt";
	
	public Garage() {
		this.voitures = new HashSet<Vehicule>();
		loadFromFile();

	}

	public void addVoiture(Vehicule voit) {
		this.voitures.add(voit);
		addCarsToFile();
	}

	public String toString() {
		String result = "**********************\n*   GARAGE OPENCLASSROOM   *\n***********************\n";
		result = result + "Mon garage contient " + this.voitures.size() + " voitures\n";
		Iterator<Vehicule> it = voitures.iterator();
	    while(it.hasNext())
	    	result = result + ( (Vehicule) it.next() ).toString() + "\n";		
		return result;
	}
	
	private void createFile() {
		Path path = Paths.get(DEFAULT_PATH);
		if (!Files.exists(path) ) { try {
			Files.createFile(path);
		} catch (IOException e) {
			e.printStackTrace();
		} }		
	}
	private void loadFromFile() {
		try (FileInputStream fis = new FileInputStream(DEFAULT_PATH);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			while(true) {
				this.voitures.add( (Vehicule) ois.readObject()) ;
			}
		} catch (FileNotFoundException e) {
			createFile();
			System.out.println("Aucune voiture sauvegardée! Pas de fichier");
		} catch (EOFException e) {
			//..			
		} catch (IOException e) {
			System.out.println("Aucune voiture sauvegardée! Erreur de lecture");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	private void addCarsToFile() {
		createFile();
		try (FileOutputStream fos = new FileOutputStream(DEFAULT_PATH);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			Iterator<Vehicule> it = voitures.iterator();
		    while(it.hasNext())
		    	oos.writeObject((Vehicule) it.next()) ;
		} catch (FileNotFoundException e) {
			createFile();
			System.out.println("Aucune voiture sauvegardée!");
		} catch (IOException e) {
			System.out.println("Aucune voiture sauvegardée!");
		}			
	}
}
