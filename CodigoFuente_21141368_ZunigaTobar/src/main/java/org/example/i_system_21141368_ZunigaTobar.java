package org.example;

import java.time.LocalDateTime;
import java.util.List;

public interface i_system_21141368_ZunigaTobar {
    public void systemAddChatbot(chatbot_21141368_ZunigaTobar chatbot);
    public void systemAddUser(user_21141368_ZunigaTobar newUser);
    public void systemLogin(String userName);
    public void systemLogout();
    public void systemTalk(String msg);
    public void systemSynthesis(String userName);
    public String getName();
    public List<user_21141368_ZunigaTobar> getMembers();
    public String getLoggedUser();
    public void setLoggedUser(String loggedUser);
    public int[] getPosicion();
    public void setPosicion(int[] posicion);
    public List<String> getChatHistory();
    public user_21141368_ZunigaTobar getLoggedUserData(String userName);
    public chatbot_21141368_ZunigaTobar getChatbotById(int id);
    public List<chatbot_21141368_ZunigaTobar> getChatbots();
    public List<Integer> getChatbotsIds(List<chatbot_21141368_ZunigaTobar> chatbots);
    public List<Integer> getUsersIds();
}
