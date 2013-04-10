package com.gop.expertec.inheritance.fr;

public class PersonneMorale extends PersonneAbstract {

    private String siren; // 732 829 320
    private String nic;// 00074
    private String dateCreation;
    private String formeLegale;

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getFormeLegale() {
        return formeLegale;
    }

    public void setFormeLegale(String formeLegale) {
        this.formeLegale = formeLegale;
    }

}
