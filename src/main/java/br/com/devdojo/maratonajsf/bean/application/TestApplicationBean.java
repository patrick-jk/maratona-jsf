package br.com.devdojo.maratonajsf.bean.application;

import br.com.devdojo.maratonajsf.bean.dependent.TestDependentBean;
import br.com.devdojo.maratonajsf.bean.session.TestSessionBean;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TestApplicationBean implements Serializable {
    private List<String> categoryList;
    private final TestDependentBean dependentBean;
    private final TestSessionBean sessionBean;

    @Inject
    public TestApplicationBean(TestDependentBean dependentBean, TestSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }
    @PostConstruct
    public void init() {
        System.out.println("Entered in PostConstruct of ApplicationScoped");
        categoryList = asList("RPG", "SCI-FI", "Horror");
        dependentBean.getCategoriesList().addAll(asList("Comedy", "Romance"));
        sessionBean.selectCharacter();
    }

    public void changeList() {
        categoryList = asList("RPG", "SCI-FI", "Horror", "Thriller");
    }

    public TestSessionBean getSessionBean() {
        return sessionBean;
    }

    public TestDependentBean getDependentBean() {
        return dependentBean;
    }

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }
}