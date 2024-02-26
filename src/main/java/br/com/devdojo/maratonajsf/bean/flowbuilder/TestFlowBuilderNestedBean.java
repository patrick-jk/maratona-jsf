package br.com.devdojo.maratonajsf.bean.flowbuilder;

import jakarta.faces.flow.FlowScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@FlowScoped(value = "newpendencies")
public class TestFlowBuilderNestedBean implements Serializable {
    private String userName;
    private String userSurname;

    public String validateUser() {
        System.out.println("Querying data on SERASA");
        System.out.println("Querying data on SPC");
        System.out.println("Requesting God's permission");
        System.out.println("Sacrificing a goat");
//        if (true) {
//            FacesContext context = FacesContext.getCurrentInstance();
//            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "User has not passed in pendencies",
//                    "Some useful detail"));
//            return null;
//        }
        return "proceedToNewRegistration3";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
