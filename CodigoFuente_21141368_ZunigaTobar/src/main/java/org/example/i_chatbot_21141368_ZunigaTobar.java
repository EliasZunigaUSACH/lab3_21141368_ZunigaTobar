package org.example;

import java.util.List;

public interface i_chatbot_21141368_ZunigaTobar {
    public void chatbotAddFlow(flow_21141368_ZunigaTobar flow);
    public int getChatbotID();
    public String getWelcomeMessage();
    public String getName();
    public List<flow_21141368_ZunigaTobar> getFlows();
    public List<Integer> getFlowsIds(List<flow_21141368_ZunigaTobar> flows);
    public flow_21141368_ZunigaTobar getFlowById(int id);
}
