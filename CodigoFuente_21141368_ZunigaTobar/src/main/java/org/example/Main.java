package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void tda_system_21141368_ZunigaTobar(String[] args) {
        // Carga de datos
        List<String> wordsO1 = new ArrayList<>();
        wordsO1.add("viajar");
        wordsO1.add("turistear");
        wordsO1.add("conocer");
        option_21141368_ZunigaTobar OP1 = new option_21141368_ZunigaTobar(1, "1) Viajar", 0, 1, wordsO1);
        List<String> wordsO2 = new ArrayList<>();
        wordsO1.add("estudiar");
        wordsO1.add("aprender");
        wordsO1.add("perfeccionarme");
        option_21141368_ZunigaTobar OP2 = new option_21141368_ZunigaTobar(2, "2) Estudiar", 0, 2, wordsO2);
        List<option_21141368_ZunigaTobar> optionsF1 = new ArrayList<>();
        optionsF1.add(OP1);
        optionsF1.add(OP2);
        flow_21141368_ZunigaTobar F10 = new flow_21141368_ZunigaTobar(1, "Flujo1", optionsF1);
        List<flow_21141368_ZunigaTobar> flowsCB0 = new ArrayList<>();
        flowsCB0.add(F10);
        chatbot_21141368_ZunigaTobar CB0 = new chatbot_21141368_ZunigaTobar(0, "Inicial", "Bienvenido\n¿Qué te gustaría hacer?", 1, flowsCB0);
        List<chatbot_21141368_ZunigaTobar> chatbotsSystem = new ArrayList<>();
        chatbotsSystem.add(CB0);
        system_21141368_ZunigaTobar miSistema = new system_21141368_ZunigaTobar("Chatbots Paradigmas", 0, chatbotsSystem);

        }
    }
}