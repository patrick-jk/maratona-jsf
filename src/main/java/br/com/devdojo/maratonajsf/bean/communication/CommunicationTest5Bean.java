package br.com.devdojo.maratonajsf.bean.communication;

import br.com.devdojo.maratonajsf.model.Student;
import jakarta.faces.event.ActionEvent;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest5Bean implements Serializable {
    private String name;
    private String surname;
    private Student student = new Student();
    private Student student2;

    public void execute() {
        System.out.println("Inside execute method" + name);
        System.out.println("Inside execute method" + surname);
        System.out.println("Inside execute method" + student2.getGrade1());
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("came from setPropertyActionListener " + name);
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("came from setPropertyActionListener " + surname);
        this.surname = surname;
    }
}
