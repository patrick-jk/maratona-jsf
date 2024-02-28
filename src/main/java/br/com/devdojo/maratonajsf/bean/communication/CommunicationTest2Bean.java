package br.com.devdojo.maratonajsf.bean.communication;

import jakarta.annotation.PostConstruct;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.omnifaces.cdi.Param;

import java.io.Serializable;
import java.util.Map;

@Named
@ViewScoped
public class CommunicationTest2Bean implements Serializable {
    @Inject @Param(name = "name")
    private String name;
    @Inject @Param(name = "surname")
    private String surname;

    @PostConstruct
    public void init() {
        System.out.println("Created communication2");
//        Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
//        name = paramsMap.get("name");
//        surname = paramsMap.get("surname");
        System.out.println(name);
        System.out.println(surname);
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
