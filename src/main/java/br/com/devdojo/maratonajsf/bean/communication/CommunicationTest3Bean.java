package br.com.devdojo.maratonajsf.bean.communication;

import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest3Bean implements Serializable {
    private String name;
    private String surname;

    public void init() {
//        if (!FacesContext.getCurrentInstance().isPostback()) {
            System.out.println("Created communication3");
            System.out.println(name);
            System.out.println(surname);
//        }
    }

    public String save() {
        System.out.println("Saving");
        return "result?faces-redirect=true&amp;includeViewParams=true";
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
