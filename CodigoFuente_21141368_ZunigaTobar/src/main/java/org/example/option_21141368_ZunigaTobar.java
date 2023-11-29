// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA OPTION

package org.example;

import java.util.List;

public class option_21141368_ZunigaTobar {
    int OptionId;
    String message;
    int chatbotCodeLink;
    int initialFlowCodeLink;
    List<String> keywords;

    public option_21141368_ZunigaTobar(int OptionId, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords){
        this.OptionId = OptionId;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    public int getOptionId() {
        return OptionId;
    }

    public void setOptionId(int id) {
        this.OptionId = id;
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
