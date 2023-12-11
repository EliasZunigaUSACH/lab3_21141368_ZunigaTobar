package org.example;

import java.time.LocalDateTime;
import java.util.List;

public interface i_system_21141368_ZunigaTobar {
    public String getName();
    public List<user_21141368_ZunigaTobar> getMembers();
    public String getLoggedUser();
    public int[] getPosicion();
    public void setPosicion(int[] posicion);
    public user_21141368_ZunigaTobar getLoggedUserData(String userName);
    public chatbot_21141368_ZunigaTobar getChatbotById(int id);
    public List<chatbot_21141368_ZunigaTobar> getChatbots();
    public List<Integer> getChatbotsIds(List<chatbot_21141368_ZunigaTobar> chatbots);
    public List<Integer> getUsersIds();
}
