// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA SYSTEM

package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class tda_system_21141368_ZunigaTobar {
    String name;
    List<tda_user_21141368_ZunigaTobar> users;
    String loggedUser;
    int initialChatbotCodeLink;
    List<tda_chatbot_21141368_ZunigaTobar> chatbots;
    LocalDateTime fechaCreacion;
    List<String> historial;
    public tda_system_21141368_ZunigaTobar(String name, int initialChatbotCodeLink, List<tda_chatbot_21141368_ZunigaTobar> chatbots) {
        this.name = name;
        this.fechaCreacion = LocalDateTime.now();
        this.users = new ArrayList<tda_user_21141368_ZunigaTobar>();
        this.loggedUser = "";
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        List<tda_chatbot_21141368_ZunigaTobar> chatbotsFiltrados = new ArrayList<>();
        while (!chatbots.isEmpty()){
            List<Integer> chatbotsFiltradosIds = getChatbotsIds(chatbotsFiltrados);
            int chatbotHeadId = chatbots.get(0).getChatbotID();
            if (!chatbotsFiltradosIds.contains(chatbotHeadId)){
                chatbotsFiltrados.add(chatbots.get(0));
            }
            chatbots.remove(0);
        }
        this.chatbots = chatbotsFiltrados;
    }

    public void systemAddChatbot(tda_chatbot_21141368_ZunigaTobar chatbot){
        List<Integer> chatbotsIds = getChatbotsIds(chatbots);
        int chatbotId = chatbot.getChatbotID();
        if (!chatbotsIds.contains(chatbotId)){
            chatbots.add(chatbot);
        }
    }

    public void systemAddUser(String user){
        if (users.isEmpty()){
            tda_user_21141368_ZunigaTobar newUser = new tda_user_21141368_ZunigaTobar(user, false);
            users.add(newUser);
        } else {
            int userID = getUserId(user);
            List<tda_user_21141368_ZunigaTobar> members = getUsers();
            List<Integer> memebersIDs = getUsersIds(members);
            if (!memebersIDs.contains(userID)){
                tda_user_21141368_ZunigaTobar newUser = new tda_user_21141368_ZunigaTobar(user, false);
                users.add(newUser);
            }
        }
    }

    public void systemLogin(String user){
        if (!users.isEmpty()){
            int userID = getUserId(user);
            List<tda_user_21141368_ZunigaTobar> members = getUsers();
            List<Integer> memebersIDs = getUsersIds(members);
            if (memebersIDs.contains(userID)){
                this.loggedUser = user;
            }
        }
    }

    public void systemLogout(){
        this.loggedUser = "";
    }

    public String getName() {
        return name;
    }

    public List<tda_user_21141368_ZunigaTobar> getUsers() {
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
    public List<Integer> getUsersIds(List<tda_user_21141368_ZunigaTobar> members){
        List<Integer> usersIDs = new ArrayList<>();
        while (!members.isEmpty()){
            int userId = getUserId(members.get(0));
            usersIDs.add(userId);
            members.remove(0);
        }
        return usersIDs;
    }
}
