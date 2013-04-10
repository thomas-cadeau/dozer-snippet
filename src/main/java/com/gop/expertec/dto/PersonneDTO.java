package com.gop.expertec.dto;

import java.util.Date;
import java.util.List;

public class PersonneDTO {
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected List<PersonneDTO> enfants;
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
		return "PersonneDTO [nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance + ", enfants=" + enfants
				+ "]";
	}
	public List<PersonneDTO> getEnfants() {
		return enfants;
	}
	public void setEnfants(List<PersonneDTO> enfants) {
		this.enfants = enfants;
	}
}
