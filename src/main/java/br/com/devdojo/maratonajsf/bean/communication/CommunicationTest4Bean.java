package br.com.devdojo.maratonajsf.bean.communication;

import br.com.devdojo.maratonajsf.model.Student;
import jakarta.faces.event.ActionEvent;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest4Bean implements Serializable {
    private String buttonName = "Bean button name";
    private Student student = new Student();

    public void execute(ActionEvent event) {
        String name = (String) event.getComponent().getAttributes().get("name");
        String adjective = (String) event.getComponent().getAttributes().get("adjective");
        Student student = (Student) event.getComponent().getAttributes().get("student");
        String test = (String) event.getComponent().getAttributes().get("test");
        System.out.println(name);
        System.out.println(adjective);
        System.out.println(student);
        System.out.println(test);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
