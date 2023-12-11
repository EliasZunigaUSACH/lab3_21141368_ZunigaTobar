// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA SYSTEM

package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class system_21141368_ZunigaTobar implements i_system_21141368_ZunigaTobar {
    String name;
    List<user_21141368_ZunigaTobar> members;
    String loggedUser;
    int initialChatbotCodeLink;
    List<chatbot_21141368_ZunigaTobar> chatbots;
    LocalDateTime fechaCreacion;
    int[] posicion;
    List<String> chatHistory;

    /**
     * Constructor system_21141368_ZunigaTobar
     *
     * @param name
     * @param initialChatbotCodeLink
     * @param chatbots
     * @author Elías Zuñiga
     */
    public system_21141368_ZunigaTobar(String name, int initialChatbotCodeLink, List<chatbot_21141368_ZunigaTobar> chatbots) {
        this.name = name;
        this.fechaCreacion = LocalDateTime.now();
        this.members = new ArrayList<>();
        this.loggedUser = "";
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        List<chatbot_21141368_ZunigaTobar> chatbotsFiltrados = new ArrayList<>();
        while (!chatbots.isEmpty()) {
            List<Integer> chatbotsFiltradosIds = getChatbotsIds(chatbotsFiltrados);
            int chatbotHeadId = chatbots.get(0).getChatbotID();
            if (!chatbotsFiltradosIds.contains(chatbotHeadId)) {
                chatbotsFiltrados.add(chatbots.get(0));
            }
            chatbots.remove(0);
        }
        this.chatbots = chatbotsFiltrados;
        this.posicion = new int[]{0, 1};
        this.chatHistory = new ArrayList<>();
    }

    /**
     * Modificador systemAddChatbot
     *
     * @param chatbot;
     */
    public void systemAddChatbot(chatbot_21141368_ZunigaTobar chatbot) {
        List<Integer> chatbotsIds = getChatbotsIds(chatbots);
        int chatbotId = chatbot.getChatbotID();
        if (!chatbotsIds.contains(chatbotId)) {
            this.chatbots.add(chatbot);
        }
    }

    /**
     * Modificador systemAddUser
     *
     * @param newUser;
     */
    public void systemAddUser(user_21141368_ZunigaTobar newUser) {
        if (members.isEmpty()) {
            this.members.add(newUser);
        } else {
            int userID = newUser.getID();
            List<Integer> memebersIDs = getUsersIds();
            if (!memebersIDs.contains(userID)) {
                this.members.add(newUser);
                System.out.println("Se ha registrado " + newUser.getUserName() + "\n");
            } else {
                System.out.println("El usuario ya está registrado en el sistema");
            }
        }
    }

    /**
     * Modificador systemLogin
     *
     * @param userName;
     */
    public void systemLogin(String userName) {
        int userID = Integer.parseInt(userName.replaceAll("[^0-9]", ""));
        ;
        List<Integer> membersIDs = getUsersIds();
        if (membersIDs.contains(userID)) {
            setLoggedUser(userName);
//            loadUserHistory(userName);
            System.out.println("El usuario " + userName + " ha iniciado sesión correctamente");
        } else {
            System.out.println("El usuario no está registrado en el sistema");
        }
    }

    /**
     * Modificador systemLogout
     */
    public void systemLogout() {
        if (!loggedUser.isEmpty()) {
            chatHistory.clear();
            setLoggedUser("");
        }
    }

    /**
     * @param msg;
     */
    public void systemTalk(String msg) {
        for (chatbot_21141368_ZunigaTobar chatbot : getChatbots()) {
            if (chatbot.getChatbotID() == posicion[0]) {
                for (flow_21141368_ZunigaTobar flow : chatbot.getFlows()) {
                    if (flow.getFlowId() == posicion[1]) {
                        for (option_21141368_ZunigaTobar opcion : flow.getOptions()) {
                            int numMsg = Integer.parseInt(msg);
                            if ((numMsg == opcion.getOptionId()) || (opcion.getKeywords().contains(msg.toLowerCase()))) {
                                setPosicion(new int[]{opcion.getChatbotCodeLink(), opcion.getInitialFlowCodeLink()});
                                chatHistory.add(msg);
                                chatbot_21141368_ZunigaTobar actualChatbot = getChatbotById(opcion.getChatbotCodeLink());
                                System.out.println(actualChatbot.getName() + ": ");
                                flow_21141368_ZunigaTobar actualFlow = actualChatbot.getFlowById(opcion.getInitialFlowCodeLink());
                                System.out.print(actualFlow.getNameMsg() + "\n");
                                System.out.print(actualChatbot.getWelcomeMessage() + "\n");
                                for (option_21141368_ZunigaTobar actualOption : actualFlow.getOptions()) {
                                    System.out.print("\t" + actualOption.getMessage() + "\n");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     * @param userName;
     */
    public void systemSynthesis(String userName) {
        int chatHisotryLength = chatHistory.size();
        int element = 0;
        while (element < chatHisotryLength - 1) {
            System.out.println(userName + ": " + chatHistory.get(element) + "\n");
            systemTalk(chatHistory.get(element));
            element += 1;
        }
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<user_21141368_ZunigaTobar> getMembers() {
        return members;
    }

    @Override
    public String getLoggedUser() {
        return loggedUser;
    }

    /**
     * Modificador setLoggedUser
     * @param loggedUser
     */
    public void setLoggedUser(String loggedUser) {
        this.loggedUser = loggedUser;
    }

    /**
     * Selector getPosicion
     * @return int[]
     */
    @Override
    public int[] getPosicion() {
        return posicion;
    }

    /**
     * Modificador setPosicion
     * @param posicion
     */
    @Override
    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }

    @Override
    public user_21141368_ZunigaTobar getLoggedUserData(String userName) {
        List<user_21141368_ZunigaTobar> members = getMembers();
        for (user_21141368_ZunigaTobar user : members) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public chatbot_21141368_ZunigaTobar getChatbotById(int id) {
        for (chatbot_21141368_ZunigaTobar chatbot : chatbots) {
            if (id == chatbot.getChatbotID()) {
                return chatbot;
            }
        }
        return null;
    }

    /**
     * Selector getChatbots
     * @return List
     */
    @Override
    public List<chatbot_21141368_ZunigaTobar> getChatbots() {
        return chatbots;
    }

    /**
     * Selector getChatbotsIds
     * @param chatbots
     * @return List
     */
    @Override
    public List<Integer> getChatbotsIds(List<chatbot_21141368_ZunigaTobar> chatbots) {
        List<Integer> chatbotsIds = new ArrayList<>();
        for (chatbot_21141368_ZunigaTobar ch : chatbots) {
            chatbotsIds.add(ch.getChatbotID());
        }
        return chatbotsIds;
    }

    /**
     * Selector getUsersIds
     * @return List
     */
    @Override
    public List<Integer> getUsersIds() {
        List<user_21141368_ZunigaTobar> members = getMembers();
        List<Integer> usersIDs = new ArrayList<>();
        for (user_21141368_ZunigaTobar user : members) {
            usersIDs.add(user.getID());
        }
        return usersIDs;
    }
}
