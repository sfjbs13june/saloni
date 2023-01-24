package com.saloni.app.model;

public class Student {
    public Student(String name, String roll, String std, String schoolName) {
        this.name = name;
        this.roll = roll;
        this.std = std;
        this.schoolName = schoolName;
    }

    String name;
    String roll;
    String std;
    String schoolName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


}
