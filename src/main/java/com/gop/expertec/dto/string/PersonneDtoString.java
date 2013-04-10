package com.gop.expertec.dto.string;

import java.util.List;

public class PersonneDtoString {
	protected String nom;
	protected String prenom;
	protected String dateNaissanceString;// format dd/MM/yyyy

	public String getDateNaissanceString() {
		return dateNaissanceString;
	}

	public void setDateNaissanceString(String dateNaissanceString) {
		this.dateNaissanceString = dateNaissanceString;
	}

	protected List<PersonneDtoString> enfants;

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

	public List<PersonneDtoString> getEnfants() {
		return enfants;
	}

	public void setEnfants(List<PersonneDtoString> enfants) {
		this.enfants = enfants;
	}

	@Override
	public String toString() {
		return "PersonneDtoString [nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissanceString=" + dateNaissanceString + ", enfants="
				+ enfants + "]";
	}
}
