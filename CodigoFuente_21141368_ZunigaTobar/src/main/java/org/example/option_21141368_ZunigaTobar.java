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

    /**
     * Constructor option_21141368_ZunigaTobar
     * @param OptionId
     * @param message
     * @param chatbotCodeLink
     * @param initialFlowCodeLink
     * @param keywords
     */
    public option_21141368_ZunigaTobar(int OptionId, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords){
        this.OptionId = OptionId;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    /**
     * Selector getOptionId
     * @return int
     */
    public int getOptionId() {
        return OptionId;
    }

    /**
     * Modificador setOptionId
     * @param id
     */
    public void setOptionId(int id) {
        this.OptionId = id;
    }

    /**
     * Selector getMessage
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Selector getChatbotCodeLink
     * @return int
     */
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     *
     * @param chatbotCodeLink
     */
    public void setChatbotCodeLink(int chatbotCodeLink) {
        this.chatbotCodeLink = chatbotCodeLink;
    }

    /**
     * Selector getInitialFlowCodeLink
     * @return int
     */
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    /**
     *
     * @param initialFlowCodeLink
     */
    public void setInitialFlowCodeLink(int initialFlowCodeLink) {
        this.initialFlowCodeLink = initialFlowCodeLink;
    }

    /**
     * Selector getKeywords
     * @return List<String></>
     */
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * Modificador setKeywords
     * @param keywords
     */
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}
