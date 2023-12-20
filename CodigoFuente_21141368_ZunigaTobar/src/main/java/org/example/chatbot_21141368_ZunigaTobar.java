// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA CHATBOT

package org.example;

import java.util.ArrayList;
import java.util.List;

public class chatbot_21141368_ZunigaTobar implements i_chatbot_21141368_ZunigaTobar {
    int chatbotID;
    String name;
    String welcomeMessage;
    int startFlowId;
    List<flow_21141368_ZunigaTobar> flows;

    /**
     * Constructor chatbot_21141368_ZunigaTobar
     * @param chatbotID;
     * @param name;
     * @param welcomeMessage;
     * @param startFlowId;
     * @param flows;
     */
    public chatbot_21141368_ZunigaTobar(int chatbotID, String name, String welcomeMessage, int startFlowId, List<flow_21141368_ZunigaTobar> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        List<flow_21141368_ZunigaTobar> flowsFiltrados = new ArrayList<>();
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

    /**
     * Modificador chatbotAddFlow
     * @param flow
     */
    public void chatbotAddFlow(flow_21141368_ZunigaTobar flow){
        List<Integer> IDs = getFlowsIds(flows);
        int optionId = flow.getFlowId();
        if (!IDs.contains(optionId)) {
            this.flows.add(flow);
        }
    }

    /**
     * Selector getChatbotID
     * @return int
     */
    @Override
    public int getChatbotID() {
        return chatbotID;
    }

    /**
     * Selector getName
     * @return String
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Selector getWelcomeMessage
     * @return String
     */
    @Override
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    /**
     * Selector getFlows
     * @return List
     */
    @Override
    public List<flow_21141368_ZunigaTobar> getFlows() {
        return flows;
    }
    /**
     * Selector getFlowIds
     * @param flows;
     * @return List
     */
    @Override
    public List<Integer> getFlowsIds(List<flow_21141368_ZunigaTobar> flows){
        List<Integer> Ids = new ArrayList<>();
        for (flow_21141368_ZunigaTobar f : flows){
            Ids.add(f.getFlowId());
        }
        return Ids;
    }

    /**
     * Selector getFlowById
     * @param id;
     * @return flow_21141368_ZunigaTobar
     */
    @Override
    public flow_21141368_ZunigaTobar getFlowById(int id){
        for (flow_21141368_ZunigaTobar flow : flows){
            if (id == flow.getFlowId()){
                return flow;
            }
        }
        return null;
    }

    /**
     * Modificador setFlows
     * @param flows
     */
    @Override
    public void setFlows(List<flow_21141368_ZunigaTobar> flows) {
        this.flows = flows;
    }
}