package com.bambam.configtest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff{

    private String qualification;

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }
    

    @Override
    public String toString() {
        return "{" +
            " qualification='" + getQualification() + "'" +
            "}";
    }

}
