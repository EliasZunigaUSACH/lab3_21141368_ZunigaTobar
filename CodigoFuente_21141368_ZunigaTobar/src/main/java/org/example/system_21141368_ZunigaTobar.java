// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA SYSTEM

package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class system_21141368_ZunigaTobar {
    String name;
    List<user_21141368_ZunigaTobar> users;
    String loggedUser;
    int initialChatbotCodeLink;
    List<chatbot_21141368_ZunigaTobar> chatbots;
    LocalDateTime fechaCreacion;
    List<String> historial;

    public system_21141368_ZunigaTobar(String name, int initialChatbotCodeLink, List<chatbot_21141368_ZunigaTobar> chatbots) {
        this.name = name;
        this.fechaCreacion = LocalDateTime.now();
        this.users = new ArrayList<user_21141368_ZunigaTobar>();
        this.loggedUser = "";
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        List<chatbot_21141368_ZunigaTobar> chatbotsFiltrados = new ArrayList<>();
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

    public void systemAddChatbot(chatbot_21141368_ZunigaTobar chatbot){
        List<Integer> chatbotsIds = getChatbotsIds(chatbots);
        int chatbotId = chatbot.getChatbotID();
        if (!chatbotsIds.contains(chatbotId)){
            this.chatbots.add(chatbot);
        }
    }

    public void systemAddUser(user_21141368_ZunigaTobar newUser){
        if (users.isEmpty()){
            this.users.add(newUser);
        } else {
            int userID = getUserId(newUser.getUserName());
            List<user_21141368_ZunigaTobar> members = getUsers();
            List<Integer> memebersIDs = getUsersIds(members);
            if (!memebersIDs.contains(userID)){
                this.users.add(newUser);
            }
        }
    }

    public void systemLogin(String user){
        if (!users.isEmpty()){
            int userID = getUserId(user);
            List<user_21141368_ZunigaTobar> members = getUsers();
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

    public List<user_21141368_ZunigaTobar> getUsers() {
        return users;
    }

    public String getLoggedUser() {
        return loggedUser;
    }

    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }

    public List<chatbot_21141368_ZunigaTobar> getChatbots() {
        return chatbots;
    }
    public List<Integer> getChatbotsIds(List<chatbot_21141368_ZunigaTobar> chatbots){
        List<Integer> chatbotsIds = new ArrayList<>();
//        while (!chatbots.isEmpty()){
//            chatbotsIds.add(chatbots.get(0).getChatbotID());
//            chatbots.remove(0);
//        }
        for (chatbot_21141368_ZunigaTobar ch : chatbots){
            chatbotsIds.add(ch.getChatbotID());
        }
        return chatbotsIds;
    }
    public List<Integer> getUsersIds(List<user_21141368_ZunigaTobar> members){
        List<Integer> usersIDs = new ArrayList<>();
//        while (!members.isEmpty()){
//            int userId = getUserId(members.get(0));
//            usersIDs.add(userId);
//            members.remove(0);
//        }
        for (user_21141368_ZunigaTobar user : members){
            usersIDs.add(getUserId(user.getUserName()));
        }
        return usersIDs;
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public int getUserId(String userName){
        List<String> nameList = new ArrayList<>(Collections.singletonList(userName));
//        for (int i : largo) nameList.add(userName.charAt(i));
//        return (int) nameList.get(5);
        String userID = "";
        for(String i : nameList){
            if (isNumeric(i)){
                userID = userID + i;
            }
        }
        return Integer.parseInt(userID);
    }

}
