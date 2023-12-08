// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA SYSTEM

package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.example.user_21141368_ZunigaTobar.getNumberByName;

public class system_21141368_ZunigaTobar {
    String name;
    List<user_21141368_ZunigaTobar> members;
    String loggedUser;
    int initialChatbotCodeLink;
    List<chatbot_21141368_ZunigaTobar> chatbots;
    LocalDateTime fechaCreacion;
    int []posicion;
    List<String> localHistory;

    public system_21141368_ZunigaTobar(String name, int initialChatbotCodeLink, List<chatbot_21141368_ZunigaTobar> chatbots) {
        this.name = name;
        this.fechaCreacion = LocalDateTime.now();
        this.members = new ArrayList<>();
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
        this.posicion = new int[]{0, 1};
        this.localHistory = new ArrayList<>();
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
            int userID = newUser.getID();
            List<Integer> memebersIDs = getUsersIds();
            if (!memebersIDs.contains(userID)){
                this.members.add(newUser);
                System.out.println("Se ha registrado " + newUser.getUserName() + "\n");
            } else {
                System.out.println("El usuario ya está registrado en el sistema");
            }
        }
    }

    public void systemLogin(String userName){
        int userID = getNumberByName(userName);
        List<Integer> membersIDs = getUsersIds();
        if (membersIDs.contains(userID)){
            this.loggedUser = userName;
//            loadUserHistory(userName);
            System.out.println("El usuario " + userName + " ha iniciado sesión correctamente");
        } else {
            System.out.println("El usuario no está registrado en el sistema");
        }
    }

    public void systemLogout(){
        if (!loggedUser.isEmpty()) {
//            saveUserHistory(getLoggedUser());
            this.loggedUser = "";
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(List<user_21141368_ZunigaTobar> members) {
        this.members = members;
    }

    public void setLoggedUser(String loggedUser) {
        this.loggedUser = loggedUser;
    }

    public void setInitialChatbotCodeLink(int initialChatbotCodeLink) {
        this.initialChatbotCodeLink = initialChatbotCodeLink;
    }

    public void setChatbots(List<chatbot_21141368_ZunigaTobar> chatbots) {
        this.chatbots = chatbots;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
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
        for (chatbot_21141368_ZunigaTobar ch : chatbots){
            chatbotsIds.add(ch.getChatbotID());
        }
        return chatbotsIds;
    }
    public List<Integer> getUsersIds(){
        List<user_21141368_ZunigaTobar> members = getMembers();
        List<Integer> usersIDs = new ArrayList<>();
        for (user_21141368_ZunigaTobar user : members){
            usersIDs.add(user.getID());
        }
        return usersIDs;
    }
    public void systemTalk(String msg){
        if (!getLoggedUser().isBlank()){
/*            int []actual = getPosicion();
            for (chatbot_21141368_ZunigaTobar chatbot : getChatbots()){
                if (chatbot.getChatbotID() == actual[0]) {
                    for (flow_21141368_ZunigaTobar flow : chatbot.getFlows()){
                        if (flow.getFlowId() == actual[1]) {
                            for (option_21141368_ZunigaTobar opcion : flow.getOptions()){
                                int numMsg = Integer.parseInt(msg);
                                if ((numMsg == opcion.getOptionId()) || (opcion.getKeywords().contains(msg.toLowerCase()))){
                                    setPosicion(new int[]{opcion.getChatbotCodeLink(), opcion.getInitialFlowCodeLink()});
                                    localHistory.add(msg);
                                }
                            }
                        }
                    }
                }
            } */
        } else {
            System.out.println("Aún no se ha iniciado sesión");
        }
    }
/*    public void loadUserHistory(String userName) {
        List<user_21141368_ZunigaTobar> members = getMembers();
        for (user_21141368_ZunigaTobar user : members){
            if (user.getUserName().equals(userName)){
                localHistory = user.getHistorial();
            }
        }
    }
    public void saveUserHistory(String userName){
        List<user_21141368_ZunigaTobar> members = getMembers();
        for (user_21141368_ZunigaTobar user : members){
            if (user.getUserName().equals(userName)){
                user.setHistorial(localHistory);
            }
        }
    } */
    public void systemSynthesis(String userName){
        user_21141368_ZunigaTobar user = getLoggedUserData(userName);
        System.out.println(userName + );
    }
}
