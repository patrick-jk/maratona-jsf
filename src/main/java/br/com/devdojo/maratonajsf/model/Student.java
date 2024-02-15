package br.com.devdojo.maratonajsf.model;

import br.com.devdojo.maratonajsf.model.enums.Shift;

public class Student {
    private String name = "Patrick";
    private String surname = "Violin";
    private double grade1 = 20;
    private double grade2;
    private double grade3 = 10;
    private Shift shift = Shift.MORNING;

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }
}
