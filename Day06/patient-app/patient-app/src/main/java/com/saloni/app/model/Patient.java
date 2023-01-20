package com.saloni.app.model;

import org.springframework.stereotype.Component;

@Component
public class Patient {
    String id;
    String name;
    String age;
    String gender;
    String disease;
    public Patient(){

    }





    public Patient(String id, String name, String age, String gender, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }


    public void setDisease(String disease) {
        this.disease = disease;
    }
}
