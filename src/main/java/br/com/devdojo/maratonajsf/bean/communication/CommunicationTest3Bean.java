package br.com.devdojo.maratonajsf.bean.communication;

import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Named
@ViewScoped
public class CommunicationTest3Bean implements Serializable {
    private String name;
    private String surname;
    private String date;

    public void init() throws ParseException {
//        if (!FacesContext.getCurrentInstance().isPostback()) {
        System.out.println("Created communication3");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(date);
//        }
    }

    public String save() {
        System.out.println("Saving");
        return "result?faces-redirect=true&amp;includeViewParams=true";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
