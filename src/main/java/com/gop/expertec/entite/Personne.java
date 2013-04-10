package com.gop.expertec.entite;

import java.util.Date;
import java.util.List;

public class Personne {
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected List<Personne> enfants;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance + ", enfants=" + enfants
				+ "]";
	}
	public List<Personne> getEnfants() {
		return enfants;
	}
	public void setEnfants(List<Personne> enfants) {
		this.enfants = enfants;
	}
}
