package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        // Carga de datos

        // CHATBOT 0
        option_21141368_ZunigaTobar OP0 = new option_21141368_ZunigaTobar(0, "0) Salir", 0, 0, new ArrayList<String>(List.of(new String[]{"salir", "terminar", "cerrar sesion"})));
        option_21141368_ZunigaTobar OP1 = new option_21141368_ZunigaTobar(1, "1) Viajar", 0, 1, new ArrayList<String>(List.of(new String[]{"viajar", "turistear", "conocer"})));
        option_21141368_ZunigaTobar OP2 = new option_21141368_ZunigaTobar(2, "2) Estudiar", 0, 2, new ArrayList<String>(List.of(new String[]{"estudiar", "aprender", "perfeccionarme"})));
        flow_21141368_ZunigaTobar F10 = new flow_21141368_ZunigaTobar(1, "Flujo 1", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP0, OP1, OP2})));
        chatbot_21141368_ZunigaTobar CB0 = new chatbot_21141368_ZunigaTobar(0, "Inicial", "Bienvenido\n¿Qué te gustaría hacer?", 1, new ArrayList<flow_21141368_ZunigaTobar>(List.of(new flow_21141368_ZunigaTobar[]{F10})));

        // CHATBOT 1
        option_21141368_ZunigaTobar OP3 = new option_21141368_ZunigaTobar(1, "1) New York, USA", 1, 2, new ArrayList<String>(List.of(new String[]{"usa", "estados unidos", "new york"})));
        option_21141368_ZunigaTobar OP4 = new option_21141368_ZunigaTobar(2, "2) París, Francia", 1, 1, new ArrayList<String>(List.of(new String[]{"paris", "eiffel"})));
        option_21141368_ZunigaTobar OP5 = new option_21141368_ZunigaTobar(3, "3) Torres del Paine, Chile", 1, 1, new ArrayList<String>(List.of(new String[]{"chile", "torres", "paine", "torres paine", "torres del paine"})));
        option_21141368_ZunigaTobar OP6 = new option_21141368_ZunigaTobar(4, "4) Volver", 0, 1, new ArrayList<String>(List.of(new String[]{"regresar", "salir", "volver"})));
        option_21141368_ZunigaTobar OP7 = new option_21141368_ZunigaTobar(1, "1) Central Park", 1, 2, new ArrayList<String>(List.of(new String[]{"central", "park", "central park"})));
        option_21141368_ZunigaTobar OP8 = new option_21141368_ZunigaTobar(2, "2) Museos", 1, 2, new ArrayList<String>(List.of(new String[]{"museo"})));
        option_21141368_ZunigaTobar OP9 = new option_21141368_ZunigaTobar(3, "3) Cambiar destino", 1, 1, new ArrayList<String>(List.of(new String[]{"cambiar", "volver", "salir"})));
        option_21141368_ZunigaTobar OP10 = new option_21141368_ZunigaTobar(1, "1) Solo", 1, 3, new ArrayList<String>(List.of(new String[]{"solo"})));
        option_21141368_ZunigaTobar OP11 = new option_21141368_ZunigaTobar(2, "2) En pareja", 1, 3, new ArrayList<String>(List.of(new String[]{"pareja"})));
        option_21141368_ZunigaTobar OP12 = new option_21141368_ZunigaTobar(3, "3) En familia", 1, 3, new ArrayList<String>(List.of(new String[]{"familia"})));
        option_21141368_ZunigaTobar OP13 = new option_21141368_ZunigaTobar(4, "4) En realidad quiero otro destino", 1, 1, new ArrayList<String>(List.of(new String[]{"Cambiar destino"})));
        flow_21141368_ZunigaTobar F20 = new flow_21141368_ZunigaTobar(1, "Flujo 1 Chatbot1\\n¿Dónde te Gustaría ir?", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP3, OP4, OP5, OP6})));
        flow_21141368_ZunigaTobar F30 = new flow_21141368_ZunigaTobar(2, "Flujo 2 Chatbot1\\n¿Qué atractivos te gustaría visitar?", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP7, OP8, OP9})));
        flow_21141368_ZunigaTobar F40 = new flow_21141368_ZunigaTobar(3, "Flujo 3 Chatbot1\n¿Vas solo o acompañado?", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP10, OP11, OP12, OP13})));
        chatbot_21141368_ZunigaTobar CB1 = new chatbot_21141368_ZunigaTobar(1, "Agencia Viajes", "Bienvenido\n¿Dónde quieres viajar?", 1, new ArrayList<flow_21141368_ZunigaTobar>(List.of(new flow_21141368_ZunigaTobar[]{F20, F30, F40})));

        // CHATBOT 2
        option_21141368_ZunigaTobar OP14 = new option_21141368_ZunigaTobar(1, "1) Carrera Técnica", 2, 1, new ArrayList<String>(List.of(new String[]{"técnica", "tecnica"})));
        option_21141368_ZunigaTobar OP15 = new option_21141368_ZunigaTobar(2, "2) Postgrado", 2, 1, new ArrayList<String>(List.of(new String[]{"doctorado", "magister", "postgrado"})));
        option_21141368_ZunigaTobar OP16 = new option_21141368_ZunigaTobar(3, "3) Volver", 0, 1, new ArrayList<String>(List.of(new String[]{"volver", "salir", "regresar"})));
        flow_21141368_ZunigaTobar F50 = new flow_21141368_ZunigaTobar(1, "Flujo 1 Chatbot2\n¿Qué te gustaría estudiar?", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP14, OP15, OP16})));
        chatbot_21141368_ZunigaTobar CB2 = new chatbot_21141368_ZunigaTobar(1, "Orientador Académico", "Bienvenido\n¿Qué te gustaría estudiar?", 1, new ArrayList<flow_21141368_ZunigaTobar>(List.of(new flow_21141368_ZunigaTobar[]{F50})));

        // SISTEMA
        system_21141368_ZunigaTobar SISTEMA = new system_21141368_ZunigaTobar("Chatbots Paradigmas", 0, new ArrayList<chatbot_21141368_ZunigaTobar>(List.of(new chatbot_21141368_ZunigaTobar[]{CB0, CB1, CB2})));

        // MENÚ
        menu_211413689_ZunigaTobar runMenu = new menu_211413689_ZunigaTobar();
        runMenu.mainMenu(SISTEMA);
    }
}