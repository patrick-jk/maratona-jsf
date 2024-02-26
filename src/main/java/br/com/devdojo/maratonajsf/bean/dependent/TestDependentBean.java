package br.com.devdojo.maratonajsf.bean.dependent;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@Dependent
public class TestDependentBean implements Serializable {
    private List<String> characters;
    private List<String> selectedCharacter = new ArrayList<>();
    private List<String> categoriesList = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("Entered in PostConstruct of @Dependent");
        characters = asList("Naruto", "Hinata", "Yondaime");
    }

    public void selectCharacter() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String character = characters.get(index);
        selectedCharacter.add(character);
    }

    public List<String> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<String> categoriesList) {
        this.categoriesList = categoriesList;
    }

    public List<String> getSelectedCharacter() {
        return selectedCharacter;
    }

    public void setSelectedCharacter(List<String> selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }
}
