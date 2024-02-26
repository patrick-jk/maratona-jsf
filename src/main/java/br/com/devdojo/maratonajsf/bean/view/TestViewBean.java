package br.com.devdojo.maratonajsf.bean.view;

import br.com.devdojo.maratonajsf.bean.dependent.TestDependentBean;
import br.com.devdojo.maratonajsf.bean.session.TestSessionBean;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TestViewBean implements Serializable {
    private List<String> characters;
    private List<String> selectedCharacter = new ArrayList<>();
    private final TestDependentBean dependentBean;
    private final TestSessionBean sessionBean;

    @Inject
    public TestViewBean(TestDependentBean dependentBean, TestSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Entered in PostConstruct of ViewScoped");
        characters = asList("Naruto", "Hinata", "Yondaime");
    }

    public void selectCharacter() {
        System.out.println(sessionBean.getStudent().getName());
        if (sessionBean.getStudent().getName().equals("Patrick")) {
            int index = ThreadLocalRandom.current().nextInt(3);
            String character = characters.get(index);
            selectedCharacter.add(character);
            dependentBean.getSelectedCharacter().add(character);
        }
    }

    public TestDependentBean getDependentBean() {
        return dependentBean;
    }

    public List<String> getSelectedCharacter() {
        return selectedCharacter;
    }

    public void setSelectedCharacter(List<String> selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }
}
