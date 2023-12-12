// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA OPTION

package org.example;

import java.util.List;

public class option_21141368_ZunigaTobar implements i_option_21141368_ZunigaTobar {
    int OptionId;
    String message;
    int chatbotCodeLink;
    int initialFlowCodeLink;
    List<String> keywords;

    /**
     * Constructor option_21141368_ZunigaTobar
     * @param OptionId;
     * @param message;
     * @param chatbotCodeLink;
     * @param initialFlowCodeLink;
     * @param keywords;
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
    @Override
    public int getOptionId() {
        return OptionId;
    }
    /**
     * Selector getMessage
     * @return String
     */
    @Override
    public String getMessage() {
        return message;
    }
    /**
     * Selector getChatbotCodeLink
     * @return int
     */
    @Override
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }
    /**
     * Selector getInitialFlowCodeLink
     * @return int
     */
    @Override
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }
    /**
     * Selector getKeywords
     * @return List
     */
    @Override
    public List<String> getKeywords() {
        return keywords;
    }
}
