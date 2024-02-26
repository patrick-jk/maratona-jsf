package br.com.devdojo.maratonajsf.bean.session;

import br.com.devdojo.maratonajsf.model.Student;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class TestSessionBean implements Serializable {
    private List<String> characters;
    private List<String> selectedCharacter = new ArrayList<>();
    private Student student;

    @PostConstruct
    public void init() {
        System.out.println("Entered in PostConstruct of SessionScoped");
        characters = asList("Mike Portnoy", "Dave Lombardo", "Nick Menza");
    }

    public void login() {
        //Simulating a query on db and everything is ok
        student = new Student();
    }

    public void selectCharacter() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String character = characters.get(index);
        selectedCharacter.add(character);
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<String> getSelectedCharacter() {
        return selectedCharacter;
    }

    public void setSelectedCharacter(List<String> selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }
}
