package br.com.devdojo.maratonajsf.bean.login;

import br.com.devdojo.maratonajsf.model.Student;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class LoginBean implements Serializable {
    private String name;
    private String password;
    private Student student;

    public String login() {
        //Do search on db
        if (name.equals("p") && password.equals("1")) {
            student = new Student();
            return "/restricted/start_system.xhtml?faces-redirect=true";
        }
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid user and/or password", ""));
        return null;
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        student = null;
        return "/login.xhtml?faces-redirect=true";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
