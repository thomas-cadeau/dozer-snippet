package com.gop.expertec.inheritance.uk;

public class MoralPerson extends PersonAbstract {

    // SIREN+NIC
    private String siret; // SIREN 732 829 320 NIC 00074
    private String creationDate;
    private LegalForm legalForm;

    public LegalForm getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(LegalForm legalForm) {
        this.legalForm = legalForm;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
