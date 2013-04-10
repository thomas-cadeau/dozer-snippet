package com.gop.expertec.inheritance.uk;

import java.util.Date;

public class PhysicalPerson extends PersonAbstract {

    private String firstName;
    private Date birthDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
