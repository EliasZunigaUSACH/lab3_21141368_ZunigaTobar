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
     * @param chatbot;
     */
    @Override
    public void systemAddChatbot(chatbot_21141368_ZunigaTobar chatbot) {
        List<Integer> chatbotsIds = getChatbotsIds(chatbots);
        int chatbotId = chatbot.getChatbotID();
        if (!chatbotsIds.contains(chatbotId)) {
            this.chatbots.add(chatbot);
        }
    }

    /**
     * Modificador systemAddUser
     * @param newUser;
     */
    @Override
    public void systemAddUser(user_21141368_ZunigaTobar newUser) {
        if (members.isEmpty()) {
            this.members.add(newUser);
        } else {
            String user = newUser.getUserName();
            List<String> memebers = getUsersNames();
            if (!memebers.contains(user)) {
                this.members.add(newUser);
                System.out.println("Se ha registrado " + newUser.getUserName() + "\n");
            } else {
                System.out.println("El usuario ya está registrado en el sistema");
            }
        }
    }

    /**
     * Modificador systemLogin
     * @param userName;
     */
     @Override
    public void systemLogin(String userName) {
        List<String> members = getUsersNames();
        if (members.contains(userName)) {
            setLoggedUser(userName);
            System.out.println("El usuario " + userName + " ha iniciado sesión correctamente");
        } else {
            System.out.println("El usuario no está registrado en el sistema");
        }
    }

    /**
     * Modificador systemLogout
     */
    @Override
    public void systemLogout() {
        if (!loggedUser.isEmpty()) {
            chatHistory.clear();
            setLoggedUser("");
        }
    }

    /**
     * Método systemTalk
     * @param msg;
     */
    @Override
    public void systemTalk(String msg) {
        for (chatbot_21141368_ZunigaTobar chatbot : getChatbots()) {
            if (chatbot.getChatbotID() == posicion[0]) {
                for (flow_21141368_ZunigaTobar flow : chatbot.getFlows()) {
                    if (flow.getFlowId() == posicion[1]) {
                        for (option_21141368_ZunigaTobar opcion : flow.getOptions()) {
                            if ((msg.equals(Integer.toString(opcion.getOptionId()))) || (opcion.getKeywords().contains(msg))) {
                                chatHistory.add(msg);
                                if (posicion[0] == opcion.getChatbotCodeLink() && posicion[1] == opcion.getInitialFlowCodeLink()) {
                                    return;
                                }
                                int[] newPosicion = {opcion.getChatbotCodeLink(), opcion.getInitialFlowCodeLink()};
                                setPosicion(newPosicion);
                                chatbot_21141368_ZunigaTobar actualChatbot = getChatbotById(posicion[0]);
                                System.out.println(actualChatbot.getName() + ": ");
                                flow_21141368_ZunigaTobar actualFlow = actualChatbot.getFlowById(posicion[1]);
                                System.out.print(actualFlow.getNameMsg() + "\n");
                                for (option_21141368_ZunigaTobar actualOption : actualFlow.getOptions()) {
                                    System.out.print("\t" + actualOption.getMessage() + "\n");
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Método systemSynthesis
     * @param userName;
     */
    public void systemSynthesis(String userName) {
        if (!chatHistory.isEmpty()) {
            int chatHisotryLength = chatHistory.size();
            int element = 0;
            List<String> historial = getChatHistory();
            while (element <= chatHisotryLength - 1) {
                String msg = historial.get(element);
                System.out.print(userName + ": " + msg + "\n");
                systemTalk(msg);
                element += 1;
            }
        } else {
            System.out.println("El historial está vacío\n");
        }
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
     * Selector getMembers
     * @return List
     */
    @Override
    public List<user_21141368_ZunigaTobar> getMembers() {
        return members;
    }

    /**
     * Selector getLoggedUser
     * @return String
     */
    @Override
    public String getLoggedUser() {
        return loggedUser;
    }
    /**
     * Modificador setLoggedUser
     * @param loggedUser
     */
    @Override
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
     * Modificador setChatbots
     * @param chatbots
     */
    @Override
    public void setChatbots(List<chatbot_21141368_ZunigaTobar> chatbots) {
        this.chatbots = chatbots;
    }

    /**
     * Modificador setPosicion
     * @param posicion
     */
    @Override
    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }

    /**
     * Selector getChatHsitory
     * @return List
     */
    @Override
    public List<String> getChatHistory() {
        return chatHistory;
    }

    /**
     * Selector getLoggedUserData
     * @param userName
     * @return user_21141368_ZunigaTobar
     */
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

    /**
     * Selector getChatbotById
     * @param id
     * @return chatbot_21141368_ZunigaTobar
     */
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
    public List<String> getUsersNames() {
        List<user_21141368_ZunigaTobar> members = getMembers();
        List<String> usersNames = new ArrayList<>();
        for (user_21141368_ZunigaTobar user : members) {
            usersNames.add(user.getUserName());
        }
        return usersNames;
    }
}
