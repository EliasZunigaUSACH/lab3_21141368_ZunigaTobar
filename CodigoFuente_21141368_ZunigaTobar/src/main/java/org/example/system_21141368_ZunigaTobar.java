// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA SYSTEM

package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.example.user_21141368_ZunigaTobar.getUserId;

public class system_21141368_ZunigaTobar {
    String name;
    List<user_21141368_ZunigaTobar> members;
    String loggedUser;
    int initialChatbotCodeLink;
    List<chatbot_21141368_ZunigaTobar> chatbots;
    LocalDateTime fechaCreacion;
    List<String> historial;

    public system_21141368_ZunigaTobar(String name, int initialChatbotCodeLink, List<chatbot_21141368_ZunigaTobar> chatbots) {
        this.name = name;
        this.fechaCreacion = LocalDateTime.now();
        this.members = new ArrayList<user_21141368_ZunigaTobar>();
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
        if (members.isEmpty()){
            this.members.add(newUser);
        } else {
            int userID = getUserId(newUser.getUserName());
            List<Integer> memebersIDs = getUsersIds();
            if (!memebersIDs.contains(userID)){
                this.members.add(newUser);
            }
        }
    }

    public void systemLogin(String userName){
        int userID = getUserId(userName);
        List<user_21141368_ZunigaTobar> members = getMembers();
        if (!members.isEmpty()){
            List<Integer> membersIDs = getUsersIds();
            if (membersIDs.contains(userID)){
                systemLogin(userName);
                System.out.println("El usuario " + userName + " ha iniciado sesión correctamente");
            }
        } else {
            System.out.println("No hay ningún usuario registrado en el sistema");
        }
    }

    public void systemLogout(){
        this.loggedUser = "";
    }

    public String getName() {
        return name;
    }

    public List<user_21141368_ZunigaTobar> getMembers() {
        return members;
    }

    public String getLoggedUser() {
        return loggedUser;
    }

    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }

    public user_21141368_ZunigaTobar getLoggedUserData(String userName){
        List<user_21141368_ZunigaTobar> members = getMembers();
        for (user_21141368_ZunigaTobar user : members){
            if (user.getUserName().equals(userName)){
                return user;
            }
        }
        return null;
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
    public List<Integer> getUsersIds(){
        List<user_21141368_ZunigaTobar> members = getMembers();
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

}
