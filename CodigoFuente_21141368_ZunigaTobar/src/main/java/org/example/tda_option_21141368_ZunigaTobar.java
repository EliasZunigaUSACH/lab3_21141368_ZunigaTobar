package org.example;

import java.util.List;

public class tda_option_21141368_ZunigaTobar {
    int id;
    String message;
    int chatbotCodeLink;
    int initialFlowCodeLink;
    List<String> keywords;

    public tda_option_21141368_ZunigaTobar(int id, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords){
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    public int getOptionId() {
        return id;
    }

    public void setOptionId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    public void setChatbotCodeLink(int chatbotCodeLink) {
        this.chatbotCodeLink = chatbotCodeLink;
    }

    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    public void setInitialFlowCodeLink(int initialFlowCodeLink) {
        this.initialFlowCodeLink = initialFlowCodeLink;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}
