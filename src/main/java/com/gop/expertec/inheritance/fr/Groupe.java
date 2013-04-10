package com.gop.expertec.inheritance.fr;

import java.util.List;

public class Groupe {

    private List<PersonneAbstract> personnes;

    public List<PersonneAbstract> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<PersonneAbstract> personnes) {
        this.personnes = personnes;
    }

    @Override
    public String toString() {
        String res = "\n Groupe [personnes= \n";
        for (int i = 0; i < personnes.size(); i++) {
            PersonneAbstract p = personnes.get(i);
            res += "[" + i + "] = " + p.toString() + "\n";
        }

        res += "]";

        return res;
    }

}
