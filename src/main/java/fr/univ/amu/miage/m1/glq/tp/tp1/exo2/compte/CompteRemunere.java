package fr.univ.amu.miage.m1.glq.tp.tp1.exo2.compte;

import fr.univ.amu.miage.m1.glq.tp.tp1.exo2.personne.Personne;

public class CompteRemunere extends Compte {
	
	private double taux;
	private static int dateEnNombreDeJours = 0;
	private int dateDeDerniereMAJEnNombreDeJours;
	
	public CompteRemunere( Personne p, double montant, double taux) {
		super( p, montant);
		dateDeDerniereMAJEnNombreDeJours = 0;
		this.taux = taux;
	}
	
	public CompteRemunere( Personne p, double montant) {
		this( p, montant, 0.05f);
	}
	
	public CompteRemunere( Personne p) {
		this( p, 0, 0.05f);
	}

	@Override protected String getTypeToString() {
		return "Compte remunéré";
	}
	
	public static void majDate ( int nombreDeJours) {
		dateEnNombreDeJours += nombreDeJours;
	}
	
	private void maj() {
		double nouveauSolde = super.getSolde() * ( taux * 
				((double)(dateEnNombreDeJours - dateDeDerniereMAJEnNombreDeJours) / 365) );
		if ( nouveauSolde != 0 ) super.depot(nouveauSolde);
		dateDeDerniereMAJEnNombreDeJours = dateEnNombreDeJours;
	}
		
	@Override public boolean depot( double montant) {
		maj();
		return super.depot( montant);
	}
	
	@Override public void retrait( double montant) {
		maj();
		super.retrait( montant);
	}
	
	@Override public double getSolde() {
		maj();
		return super.getSolde();
	}
	}
