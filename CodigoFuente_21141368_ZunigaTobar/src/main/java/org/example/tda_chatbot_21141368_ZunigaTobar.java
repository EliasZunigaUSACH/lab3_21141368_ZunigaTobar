package org.example;

import java.util.ArrayList;
import java.util.List;

public class tda_chatbot_21141368_ZunigaTobar {
    int chatbotID;
    String name;
    String welcomeMessage;
    int startFlowId;
    List<tda_flow_21141368_ZunigaTobar> flows;

    public tda_chatbot_21141368_ZunigaTobar(int chatbotID, String name, String welcomeMessage, int startFlowId, List<tda_flow_21141368_ZunigaTobar> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        List<tda_flow_21141368_ZunigaTobar> flowsFiltrados = new ArrayList<>();
        while(!flows.isEmpty()){
            List<Integer> flowsFiltradosIds = getFlowsIds(flowsFiltrados);
            int flowHeadId = flows.get(0).getFlowId();
            if (!flowsFiltradosIds.contains(flowHeadId)){
                flowsFiltrados.add(flows.get(0));
            }
            flows.remove(0);
        }
        this.flows = flowsFiltrados;
    }

    public void chatbotAddFlow(tda_flow_21141368_ZunigaTobar flow){
        List<Integer> IDs = getFlowsIds(flows);
        int optionId = flow.getFlowId();
        if (!IDs.contains(optionId)) {
            this.flows.add(flow);
        }
    }

    public int getChatbotID() {
        return chatbotID;
    }

    public void setChatbotID(int chatbotID) {
        this.chatbotID = chatbotID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public int getStartFlowId() {
        return startFlowId;
    }

    public void setStartFlowId(int startFlowId) {
        this.startFlowId = startFlowId;
    }

    public List<tda_flow_21141368_ZunigaTobar> getFlows() {
        return flows;
    }

    public void setFlows(List<tda_flow_21141368_ZunigaTobar> flows) {
        this.flows = flows;
    }

    public List<Integer> getFlowsIds(List<tda_flow_21141368_ZunigaTobar> flows){
        List<Integer> Ids = new ArrayList<>();
        while (!flows.isEmpty()) {
            Ids.add(flows.get(0).getFlowId());
            flows.remove(0);
        }
        return Ids;
    }
}