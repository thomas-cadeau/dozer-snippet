package com.gop.expertec.inheritance.uk;

import java.util.List;

public class Group {

    private List<PersonAbstract> persons;

    public List<PersonAbstract> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonAbstract> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        String res = "\n Group [persons= \n";
        if (persons != null) {
            for (int i = 0; i < persons.size(); i++) {
                PersonAbstract p = persons.get(i);
                res += "[" + i + "] = " + p.toString() + "\n";
            }
        } else {
            res += "null";
        }

        res += "]";

        return res;
    }

}
