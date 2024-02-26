package br.com.devdojo.maratonajsf.bean.flowbuilder;

import jakarta.faces.flow.FlowScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@FlowScoped(value = "newregistration")
public class TestFlowBuilderBean implements Serializable {
    private String name;
    private String surname;
    private String address;

    public void save() {
        System.out.println("Saving in database");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(address);
//        return "exitToStart";
//        return "exitToIndex";
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
