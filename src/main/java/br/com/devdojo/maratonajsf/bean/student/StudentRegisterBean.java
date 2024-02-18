package br.com.devdojo.maratonajsf.bean.student;

import br.com.devdojo.maratonajsf.model.Student;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@ViewScoped
@Named
public class StudentRegisterBean implements Serializable {
    private Student student = new Student();
    private String[] namesArr = {"DevDojo", "é", "foda"};
    private List<String> namesList = asList("Java", "Kotlin", "Swift", "Ruby");
    private Set<String> namesSet = new HashSet<>(asList("Dave Mustaine", "Tom Araya", "James Hetfield", "Joey Belladonna"));
    private Map<String, String> namesMap = new HashMap<>();
    private boolean showGrades;
    private boolean showLink;

    {
        namesMap.put("Megadeth", "Rust in Peace");
        namesMap.put("Slayer", "Reign in Blood");
        namesMap.put("Sepultura", "Roots");
    }

    public void execute() {
        System.out.println("Doing a search on DB");
        System.out.println("Processing data");
        System.out.println("Showing data");
    }

    public void execute(String param) {
        System.out.println("Doing a search on DB with PARAM: " + param);
        System.out.println("Processing data");
        System.out.println("Showing data");
    }

    public String executeReturn(String param) {
        return "Who's " + param + "?";
    }

    public String goToIndex2() {
        return "index2?faces-redirect=true";
    }

    public void viewGrades() {
        this.showGrades = true;
    }

    public void hideGrades() {
        this.showGrades = false;
    }

    public void viewLink() {
        this.showLink = true;
    }

    public void hideLink() {
        this.showLink = false;
    }

    public boolean getShowLink() {
        return showLink;
    }

    public void setShowLink(boolean showLink) {
        this.showLink = showLink;
    }

    public boolean isShowGrades() {
        return showGrades;
    }

    public void setShowGrades(boolean showGrades) {
        this.showGrades = showGrades;
    }

    public Map<String, String> getNamesMap() {
        return namesMap;
    }

    public void setNamesMap(Map<String, String> namesMap) {
        this.namesMap = namesMap;
    }

    public Set<String> getNamesSet() {
        return namesSet;
    }

    public void setNamesSet(Set<String> namesSet) {
        this.namesSet = namesSet;
    }

    public List<String> getNamesList() {
        return namesList;
    }

    public void setNamesList(List<String> namesList) {
        this.namesList = namesList;
    }

    public String[] getNamesArr() {
        return namesArr;
    }

    public void setNamesArr(String[] namesArr) {
        this.namesArr = namesArr;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
