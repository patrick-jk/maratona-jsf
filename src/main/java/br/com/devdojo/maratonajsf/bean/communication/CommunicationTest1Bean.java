package br.com.devdojo.maratonajsf.bean.communication;

import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest1Bean implements Serializable {
    private String name;
    private String surname;

    public void printAttributes() {
        String initParameter = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("images.location");
        System.out.println(initParameter);
    }

    public String save() {
        System.out.println(name);
        System.out.println(surname);
        return "communication2?faces-redirect=true&name=" + name + "&surname=" + surname;
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
}
