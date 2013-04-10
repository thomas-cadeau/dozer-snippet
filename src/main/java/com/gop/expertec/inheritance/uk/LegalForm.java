package com.gop.expertec.inheritance.uk;

public enum LegalForm {

    ARTISAN_COMMERCANT("11", "Artisan-commerçant"), COMMERCANT("12", "Commerçant"), ARTISAN("13", "Artisan"), OPM("14",
            "Officier public ou ministériel"), PROF_LIB("15", "Profession libérale"), EXP_AGR("16", "Exploitant agricole"), AGENT_COM("17",
            "Agent commercial"), AGS("18", "Associé Gérant de société"), AUTRE("19", "(Autre) personne physique"), INDIVISION("21", "Indivision"), SCF(
            "22", "Société créée de fait"), SEP("23", "Société en participation"), FIDUCIE("24", "Fiducie");

    private String code;
    private String value;

    private LegalForm(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String toString() {
        return code;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
