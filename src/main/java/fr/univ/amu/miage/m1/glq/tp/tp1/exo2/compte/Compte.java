package fr.univ.amu.miage.m1.glq.tp.tp1.exo2.compte;

import fr.univ.amu.miage.m1.glq.tp.tp1.exo2.personne.Personne;

public class Compte extends CompteAnonyme {
	private Personne titulaire;

	public Compte( Personne p, double montant) {
		super( montant);
		titulaire=p;
	}
	
	public Compte( Personne p) {
		this(p,0);
	}
	
	@Override protected String getTypeToString() {
		return "Compte standard";
	}
	
	public Personne getTitulaire() {
		return titulaire;
	}
	
	@Override protected String finToString() {
		return( ", titulaire : " + getTitulaire()	+ super.finToString());
	}
}
