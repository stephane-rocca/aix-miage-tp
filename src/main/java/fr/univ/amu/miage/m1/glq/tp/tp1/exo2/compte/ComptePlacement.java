package fr.univ.amu.miage.m1.glq.tp.tp1.exo2.compte;

import fr.univ.amu.miage.m1.glq.tp.tp1.exo2.personne.Personne;

public class ComptePlacement extends CompteRemunere {

	public ComptePlacement(Personne p, double montant, double taux) {
		super( p, montant, taux);
	}
	
	public ComptePlacement( Personne p, double montant) {
		super( p, montant);
	}
	
	@Override public String getTypeToString() {
		return "Compte placement";
	}
	
	@Override public boolean depot( double montant) {
		afficheTexteErreur( "Depot impossible");
		return false;
	}
	
}
