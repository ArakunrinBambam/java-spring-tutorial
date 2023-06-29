package com.bambam.configtest;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware{

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

    public void setBeanName(String name){
        System.out.println("Set bean name was called");
    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("Post Construct was called");
    }
}
