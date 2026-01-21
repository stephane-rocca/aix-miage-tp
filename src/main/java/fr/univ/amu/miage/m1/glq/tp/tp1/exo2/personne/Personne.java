package fr.univ.amu.miage.m1.glq.tp.tp1.exo2.personne;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Personne {

	private static int anneeCourante = new GregorianCalendar().get(Calendar.YEAR);
	private String nom, prenom;
	private int anneeNaissance;
	
	public Personne (String unNom, String unPrenom, int annee) 
	 {
		if (annee > anneeCourante) annee = anneeCourante ;
		nom = unNom;
		prenom = unPrenom;
		anneeNaissance = annee;
	}
		
	@Override
	public String toString() {
		return prenom + " " + nom ;
	}
		
	public int getAge() {
		return getAge( anneeCourante) ;
	}
	
	public int getAge(int anneeDeReference) {
		if (anneeDeReference <= anneeNaissance)
			throw new IllegalArgumentException();
		int age = anneeDeReference - anneeNaissance;
		return age ;
	}

}
