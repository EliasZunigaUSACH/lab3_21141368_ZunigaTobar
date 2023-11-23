package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class tda_system_21141368_ZunigaTobar {
    String name;
    List<User> users;
    String loggedUser;
    int initialChatbotCodeLink;
    List<tda_chatbot_21141368_ZunigaTobar> chatbots;
    public tda_system_21141368_ZunigaTobar(String name, int initialChatbotCodeLink, List<tda_chatbot_21141368_ZunigaTobar> chatbots) {
        this.name = name;
        this.users = new ArrayList<User>();
        this.loggedUser = "";
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = chatbots;

    }

    public void systemLogout(){
        this.loggedUser = "";
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getLoggedUser() {
        return loggedUser;
    }

    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }

    public List<tda_chatbot_21141368_ZunigaTobar> getChatbots() {
        return chatbots;
    }
    public List<Integer> getChatbotsIds(List<tda_chatbot_21141368_ZunigaTobar> chatbots){
        List<Integer> chatbotsIds = new ArrayList<>();
        while (!chatbots.isEmpty()){
            chatbotsIds.add(chatbots.get(0).getChatbotID());
            chatbots.remove(0);
        }
        return chatbotsIds;
    }
}
