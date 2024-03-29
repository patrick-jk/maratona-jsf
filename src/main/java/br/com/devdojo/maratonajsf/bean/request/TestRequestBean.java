package br.com.devdojo.maratonajsf.bean.request;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class TestRequestBean implements Serializable {
    private List<String> characters;
    private List<String> selectedCharacter = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("Entered in PostConstruct of RequestScoped");
        characters = asList("Yusuke", "Hiei", "Kurama");
    }

    public void selectCharacter() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String character = characters.get(index);
        selectedCharacter.add(character);
    }

    public List<String> getSelectedCharacter() {
        return selectedCharacter;
    }

    public void setSelectedCharacter(List<String> selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }
}
