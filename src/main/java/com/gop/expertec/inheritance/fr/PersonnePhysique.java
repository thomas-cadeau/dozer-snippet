package com.gop.expertec.inheritance.fr;

import java.util.Date;

public class PersonnePhysique extends PersonneAbstract {

    private String prenom;
    private Date dateNaiss;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

}
