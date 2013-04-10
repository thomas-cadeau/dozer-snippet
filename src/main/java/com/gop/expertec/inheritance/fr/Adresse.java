package com.gop.expertec.inheritance.fr;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Adresse {

    private String numVoie;
    private String codePostal;
    private String ville;
    private String pays;

    public Adresse() {

    }

    public Adresse(String numVoie, String codePostal, String ville, String pays) {
        this.numVoie = numVoie;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public String getNumVoie() {
        return numVoie;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setNumVoie(String numVoie) {
        this.numVoie = numVoie;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, false, false);
    }
}
