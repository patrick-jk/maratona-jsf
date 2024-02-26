package br.com.devdojo.maratonajsf.bean.conversation;

import jakarta.enterprise.context.Conversation;
import jakarta.enterprise.context.ConversationScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ConversationScoped
//Transient
public class TestConversationBean implements Serializable {
    private List<String> characters;
    private java.util.List<String> selectedCharacter = new ArrayList<>();

    @Inject
    private Conversation conversation;

    public void init() {
        System.out.println("Entered in PostConstruct of ConversationScoped");
        characters = asList("Paul Bostaph", "Dave Grohl", "Aquiles Priester");
        if (conversation.isTransient()) {
            // Long Running
            conversation.begin();
            System.out.println("Starting conversation scoped, ID=" + conversation.getId());
        }
    }

    public String endConversation() {
        if (!conversation.isTransient()) {
            conversation.end();
        }
        return "conversation?faces-redirect=true";
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

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public List<String> getSelectedCharacter() {
        return selectedCharacter;
    }

    public void setSelectedCharacter(List<String> selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }
}
