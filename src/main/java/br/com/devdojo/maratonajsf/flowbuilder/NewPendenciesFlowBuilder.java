package br.com.devdojo.maratonajsf.flowbuilder;

import jakarta.enterprise.inject.Produces;
import jakarta.faces.flow.Flow;
import jakarta.faces.flow.builder.FlowBuilder;
import jakarta.faces.flow.builder.FlowBuilderParameter;
import jakarta.faces.flow.builder.FlowDefinition;

import java.io.Serializable;

public class NewPendenciesFlowBuilder implements Serializable {
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newpendencies";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/newpendencies/newpendencies.xhtml").markAsStartNode();
        flowBuilder.returnNode("proceedToNewRegistration3").fromOutcome("/newregistration/newregistration3.xhtml");
        flowBuilder.returnNode("exitToNewStart").fromOutcome("/newregistration/newregistration.xhtml");
        flowBuilder.inboundParameter("userName", "#{testFlowBuilderNestedBean.userName}");
        flowBuilder.inboundParameter("userSurname", "#{testFlowBuilderNestedBean.userSurname}");
        return flowBuilder.getFlow();
    }
}
