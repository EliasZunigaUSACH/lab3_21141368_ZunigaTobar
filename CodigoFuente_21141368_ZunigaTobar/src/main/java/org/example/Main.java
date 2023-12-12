// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// MAIN

package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        // Carga de datos

        // CHATBOT 0
        option_21141368_ZunigaTobar OP1 = new option_21141368_ZunigaTobar(1, "1) Viajar", 1, 1, new ArrayList<String>(List.of(new String[]{"viajar", "turistear", "conocer"})));
        option_21141368_ZunigaTobar OP2 = new option_21141368_ZunigaTobar(2, "2) Estudiar", 2, 1, new ArrayList<String>(List.of(new String[]{"estudiar", "aprender", "perfeccionarme"})));
        flow_21141368_ZunigaTobar F10 = new flow_21141368_ZunigaTobar(1, "Flujo 1", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP1, OP2})));
        chatbot_21141368_ZunigaTobar CB0 = new chatbot_21141368_ZunigaTobar(0, "Inicial", "Bienvenido\n¿Qué te gustaría hacer?", 1, new ArrayList<flow_21141368_ZunigaTobar>(List.of(new flow_21141368_ZunigaTobar[]{F10})));

        // CHATBOT 1
        option_21141368_ZunigaTobar OP3 = new option_21141368_ZunigaTobar(1, "1) New York, USA", 1, 2, new ArrayList<String>(List.of(new String[]{"usa", "estados unidos", "new york"})));
        option_21141368_ZunigaTobar OP4 = new option_21141368_ZunigaTobar(2, "2) París, Francia", 1, 1, new ArrayList<String>(List.of(new String[]{"paris", "eiffel"})));
        option_21141368_ZunigaTobar OP5 = new option_21141368_ZunigaTobar(3, "3) Torres del Paine, Chile", 1, 1, new ArrayList<String>(List.of(new String[]{"chile", "torres", "paine", "torres paine", "torres del paine"})));
        option_21141368_ZunigaTobar OP6 = new option_21141368_ZunigaTobar(4, "4) Volver", 0, 1, new ArrayList<String>(List.of(new String[]{"regresar", "salir", "volver"})));
        option_21141368_ZunigaTobar OP7 = new option_21141368_ZunigaTobar(1, "1) Central Park", 1, 2, new ArrayList<String>(List.of(new String[]{"central", "park", "central park"})));
        option_21141368_ZunigaTobar OP8 = new option_21141368_ZunigaTobar(2, "2) Museos", 1, 2, new ArrayList<String>(List.of(new String[]{"museo"})));
        option_21141368_ZunigaTobar OP9 = new option_21141368_ZunigaTobar(3, "3) Ningún otro atractivo", 1, 3, new ArrayList<String>(List.of(new String[]{"museo"})));
        option_21141368_ZunigaTobar OP10 = new option_21141368_ZunigaTobar(4, "4) Cambiar destino", 1, 1, new ArrayList<String>(List.of(new String[]{"cambiar", "volver", "salir"})));
        option_21141368_ZunigaTobar OP11 = new option_21141368_ZunigaTobar(1, "1) Solo", 1, 3, new ArrayList<String>(List.of(new String[]{"solo"})));
        option_21141368_ZunigaTobar OP12 = new option_21141368_ZunigaTobar(2, "2) En pareja", 1, 3, new ArrayList<String>(List.of(new String[]{"pareja"})));
        option_21141368_ZunigaTobar OP13 = new option_21141368_ZunigaTobar(3, "3) En familia", 1, 3, new ArrayList<String>(List.of(new String[]{"familia"})));
        option_21141368_ZunigaTobar OP14 = new option_21141368_ZunigaTobar(4, "4) En realidad quiero otro destino", 1, 1, new ArrayList<String>(List.of(new String[]{"Cambiar destino"})));
        flow_21141368_ZunigaTobar F20 = new flow_21141368_ZunigaTobar(1, "Flujo 1 Chatbot1\\n¿Dónde te Gustaría ir?", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP3, OP4, OP5, OP6})));
        flow_21141368_ZunigaTobar F30 = new flow_21141368_ZunigaTobar(2, "Flujo 2 Chatbot1\\n¿Qué atractivos te gustaría visitar?", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP7, OP8, OP9, OP10})));
        flow_21141368_ZunigaTobar F40 = new flow_21141368_ZunigaTobar(3, "Flujo 3 Chatbot1\n¿Vas solo o acompañado?", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP11, OP12, OP13, OP14})));
        chatbot_21141368_ZunigaTobar CB1 = new chatbot_21141368_ZunigaTobar(1, "Agencia Viajes", "Bienvenido\n¿Dónde quieres viajar?", 1, new ArrayList<flow_21141368_ZunigaTobar>(List.of(new flow_21141368_ZunigaTobar[]{F20, F30, F40})));

        // CHATBOT 2
        option_21141368_ZunigaTobar OP15 = new option_21141368_ZunigaTobar(1, "1) Carrera Técnica", 2, 1, new ArrayList<String>(List.of(new String[]{"técnica", "tecnica"})));
        option_21141368_ZunigaTobar OP16 = new option_21141368_ZunigaTobar(2, "2) Postgrado", 2, 1, new ArrayList<String>(List.of(new String[]{"doctorado", "magister", "postgrado"})));
        option_21141368_ZunigaTobar OP17 = new option_21141368_ZunigaTobar(3, "3) Volver", 0, 1, new ArrayList<String>(List.of(new String[]{"volver", "salir", "regresar"})));
        flow_21141368_ZunigaTobar F50 = new flow_21141368_ZunigaTobar(1, "Flujo 1 Chatbot2\n¿Qué te gustaría estudiar?", new ArrayList<option_21141368_ZunigaTobar>(List.of(new option_21141368_ZunigaTobar[]{OP15, OP16, OP17})));
        chatbot_21141368_ZunigaTobar CB2 = new chatbot_21141368_ZunigaTobar(2, "Orientador Académico", "Bienvenido\n¿Qué te gustaría estudiar?", 1, new ArrayList<flow_21141368_ZunigaTobar>(List.of(new flow_21141368_ZunigaTobar[]{F50})));

        // SISTEMA
        system_21141368_ZunigaTobar SISTEMA = new system_21141368_ZunigaTobar("Chatbots Paradigmas", 0, new ArrayList<chatbot_21141368_ZunigaTobar>(List.of(new chatbot_21141368_ZunigaTobar[]{CB0, CB1, CB2})));

        // MENÚ
        mainMenu(SISTEMA);
    }
    public static void mainMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 3;
        int choice;
        do {
            System.out.println("\n### Sistema de Chatbots - Inicio ###\n");
            System.out.print("1. Login de Usuario\n");
            System.out.print("2. Registro de Usuario\n");
            System.out.print("3. Salir\n");
            System.out.print("INTRODUZCA SU OPCIÓN:\n");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    if (!system.getMembers().isEmpty()) {
                        loginMenu(system);
                        user_21141368_ZunigaTobar user = system.getLoggedUserData(system.getLoggedUser());
                        if (user.isAdmin()) {
                            adminMenu(system);
                            break;
                        } else {
                            normalUserMenu(system);
                            break;
                        }
                    } else {
                        System.out.println("No hay ningun usuario registrado en el sistema\n");
                        break;
                    }
                case 2:
                    registerMenu(system);
                    break;

                case 3:
                    System.out.println("Cerrando...");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " no es una opción valida! Por favor seleccione la opción correcta\n");
            }
        } while (choice != MENU_EXIT_OPTION);
    }
    public static void adminMenu(system_21141368_ZunigaTobar system) {
        Scanner input = new Scanner(System.in);
        int selection;
        do {
            System.out.println("\n### Sistema de Chatbots - Usuario Administrador ###\n");
            System.out.print("Bienvenido " + system.getLoggedUser() + " usted es administrador.\n");
            System.out.print("1. Crear un Chatbot\n");
            System.out.print("2. Modificar un Chatbot\n");
            System.out.print("3. Interactuar\n");
            System.out.print("4. Visualizar todos los chatbots existentes en el sistema\n");
            System.out.print("5. Visualizar todos los chatbots con sus flujos y opciones creadas\n");
            System.out.print("6. Salir\n");
            System.out.print("INTRODUZCA SU OPCIÓN:\n");
            selection = input.nextInt();
            switch (selection) {
                case 1:
                    createChatbotMenu(system);
                    break;
                case 2:
                    modChatbotMenu(system);
                    break;
                case 3:
                    interact(system);
                    break;
                case 4:
                    System.out.print("\n");
                    for (chatbot_21141368_ZunigaTobar chatbot : system.getChatbots()) {
                        System.out.println(chatbot.getName());
                    }
                    System.out.print("\n");
                    break;
                case 5:
                    for (chatbot_21141368_ZunigaTobar chatbot : system.getChatbots()) {
                        System.out.println("Nombre: " + chatbot.getName() + "\n");
                        System.out.print("Flujos: \n");
                        for (flow_21141368_ZunigaTobar flow : chatbot.getFlows()) {
                            System.out.print("\tNombre de flujo: " + flow.getNameMsg() + "\n");
                            System.out.print("\tOpciones: \n");
                            for (option_21141368_ZunigaTobar option : flow.getOptions()) {
                                System.out.print("\t\t -" + option.getMessage() + "\n");
                            }
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    break;
                case 6:
                    system.systemLogout();
                    break;
                default:
                    System.out.println(selection + " no es una opción valida! Por favor seleccione la opción correcta\n");
            }
        } while (selection != 7);
    }
    public static void loginMenu(system_21141368_ZunigaTobar system) {
        System.out.println("\n### Sistema de Chatbots - Login ###\n");
        System.out.print("INTRODUZCA NOMBRE DE USUARIO:\n");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        system.systemLogin(userName.toLowerCase());
    }
    public static void registerMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        int role;
        Scanner name = new Scanner(System.in);
        String userName;
        user_21141368_ZunigaTobar newUser;
        do {
            System.out.println("\n### Sistema de Chatbots - Registro ###\n");
            System.out.print("1. Registrar usuario normal\n");
            System.out.print("2. Registrar usuario administrador\n");
            System.out.print("3. Salir\n");
            System.out.print("INTRODUZCA SU OPCIÓN:\n");
            role = input.nextInt();
            switch (role) {
                case 1:
                    System.out.println("\n### Sistema de Chatbots - Registro Usuario Normal ###\n");
                    System.out.print("INTRODUZCA NOMBRE DEL USUARIO NORMAL:\n");
                    userName = name.nextLine();
                    newUser = new user_21141368_ZunigaTobar(userName.toLowerCase(), false);
                    system.systemAddUser(newUser);
//                System.out.print(getNumberByName(userName) + "\n");
                    break;
                case 2:
                    System.out.println("\n### Sistema de Chatbots - Registro Usuario Administrador ###\n");
                    System.out.print("INTRODUZCA NOMBRE DEL USUARIO ADMINISTRADOR:\n");
                    userName = name.nextLine();
                    newUser = new user_21141368_ZunigaTobar(userName.toLowerCase(), true);
                    system.systemAddUser(newUser);
//                System.out.print(getNumberByName(userName) + "\n");
                    break;
                case 3:
                    break;
                default:
                    System.out.println(role + " no es una opción valida! Por favor seleccione la opción correcta.\n");
            }
        } while (role != 3);
    }
    public static void modChatbotOptionsMenu(chatbot_21141368_ZunigaTobar chatbot){
        Scanner input = new Scanner(System.in);
        int selection;
        do {
            System.out.println("\n### Sistema de Chatbots - Modificación de chatbot ###\n");
            System.out.print("1. Agregar flujo\n");
            System.out.print("2. Agregar opciones a cierto flujo\n");
            System.out.print("3. Salir\n");
            System.out.print("INTRODUZCA SU OPCIÓN:\n");
            selection = input.nextInt();
            switch (selection){
                case 1:
                    addFlowMenu(chatbot);
                    break;
                case 2:
                    modFlowMenu(chatbot);
                    break;
                case 3:
                    break;
                default:
                    System.out.println(selection + " no es una opción valida! Por favor seleccione la opción correcta.\n");
            }
        } while (selection != 3);
    }
    public static void addFlowMenu(chatbot_21141368_ZunigaTobar chatbot){
        Scanner input = new Scanner(System.in);
        String nameMsg;
        System.out.println("\n### Sistema de Chatbots - Agrecacion de nuevo flujo ###\n");
        System.out.print("Flujos existentes: ");
        for (flow_21141368_ZunigaTobar flow : chatbot.getFlows()) {
            System.out.println("\t" + flow.getFlowId() + ". " + flow.getNameMsg() + "\n");
        }
        System.out.print("INTRODUZCA EL MENSAJE DE ESTE NUEVO FLUJO:\n");
        nameMsg = input.nextLine();
        List<Integer> flowsIds = chatbot.getFlowsIds(chatbot.getFlows());
        int newId = flowsIds.get(flowsIds.size() - 1) + 1;
        flow_21141368_ZunigaTobar newFlow = new flow_21141368_ZunigaTobar(newId, nameMsg, new ArrayList<>());
        chatbot.chatbotAddFlow(newFlow);
    }
    public static void modChatbotMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        int id;
        System.out.println("\n### Sistema de Chatbots - Modificación de chatbot ###\n");
        System.out.print("Chatbots existentes: ");
        for (chatbot_21141368_ZunigaTobar chatbot : system.getChatbots()) {
            System.out.println("\t" + chatbot.getChatbotID() + ". " + chatbot.getName() + "\n");
        }
        System.out.print("INTRODUZCA LA ID DEL CHATBOT QUE DESEA MODIFICAR O ESCRIBA '-1' PARA SALIR:\n");
        do {
            id = input.nextInt();
            chatbot_21141368_ZunigaTobar chatbotToMod = system.getChatbotById(id);
            if ((chatbotToMod == null) && id != -1){
                System.out.println(id + " no es una opción valida! Por favor seleccione la opción correcta.\n");
            }
            if ((chatbotToMod != null) && id != -1){
                modChatbotOptionsMenu(chatbotToMod);
                break;
            }
        } while (id != -1);
    }
    public static void modFlowMenu(chatbot_21141368_ZunigaTobar chatbot){
        Scanner input = new Scanner(System.in);
        int id;
        System.out.println("\n### Sistema de Chatbots - Agregación de opciones ###\n");
        System.out.print("Flujos: \n");
        for (flow_21141368_ZunigaTobar flow : chatbot.getFlows()) {
            System.out.print("\t" + flow.getFlowId() + ". " + flow.getNameMsg() + "\n");
        }
        System.out.print("INTRODUZCA LA ID DEL FLUJO A MODIFICAR O ESCRIBE '-1' PARA SALIR:\n");
        do {
            id = input.nextInt();
            flow_21141368_ZunigaTobar flowToMod = chatbot.getFlowById(id);
            if ((flowToMod == null) && id != -1){
                System.out.println(id + " no es una opción valida! Por favor seleccione la opcion correcta.\n");
            }
            if ((flowToMod != null) && id != -1){
                addOptionToFlowMenu(flowToMod);
                break;
            }
        } while (id != -1);
    }
    public static void addOptionToFlowMenu(flow_21141368_ZunigaTobar flow){
        Scanner input = new Scanner(System.in);
        String name;
        String words;
        int newChatbotCodeLink;
        int newInitialFlowCodeLink;
        System.out.println("\n### Sistema de Chatbots - Agregacion de opciones ###\n");
        System.out.print("Opciones: \n");
        for (option_21141368_ZunigaTobar opcion : flow.getOptions()) {
            System.out.print("\t" + opcion.getOptionId() + ". " + opcion.getMessage() + "\n");
        }
        System.out.print("\t0. Salir\n");
        System.out.print("INTRODUZCA MENSAJE PARA LA NUEVA OPCION:\n");
        name = input.nextLine();
        System.out.print("INTRODUZCA PALABRAS CLAVE PARA LA NUEVA OPCION DE LA SIGUIENTE FORMA:\n");
        System.out.print("\t'hola,chao,si'\n");
        words = input.nextLine();
        List<String> newKeywords = new ArrayList<>(Arrays.asList(words.split(",")));
        List<Integer> optionsIDS = flow.getOptionsIds(flow.getOptions());
        int newOptionID = optionsIDS.get(optionsIDS.size() - 1);
        String finalName = newOptionID + ") " + name;
        System.out.print("INTRODUZCA LA ID DEL CHATBOT QUE DESEA CONECTAR LA OPCION:\n");
        newChatbotCodeLink = input.nextInt();
        System.out.print("INTRODUZCA LA ID DEL FLUJO INICIAL QUE DESEA CONECTAR LA OPCION\n");
        newInitialFlowCodeLink = input.nextInt();
        option_21141368_ZunigaTobar newOption = new option_21141368_ZunigaTobar(newOptionID, finalName, newChatbotCodeLink, newInitialFlowCodeLink, newKeywords);
        flow.flowAddOption(newOption);
    }
    public static void createChatbotMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        System.out.println("\n### Sistema de Chatbots - Creacion de chatbot ###\n");
        System.out.print("INTRODUZCA NOMBRE PARA EL NUEVO CHATBOT:\n");
        String name = input.nextLine();
        List<Integer> ids = system.getChatbotsIds(system.getChatbots());
        int newID = ids.get(ids.size() -  1) + 1;
        System.out.print("\n### Sistema de Chatbots - Creacion de chatbot ###\n");
        System.out.print("INTRODUZCA MENSAJE DE BIENVENIDA PARA EL NUEVO CHATBOT:\n");
        String msg = input.nextLine();
        List<flow_21141368_ZunigaTobar> flows = new ArrayList<>();
        chatbot_21141368_ZunigaTobar newChatbot = new chatbot_21141368_ZunigaTobar(newID, name, msg, 1, flows);
        system.systemAddChatbot(newChatbot);
    }
    public static void normalUserMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        int selection;
        do {
            System.out.println("\n### Sistema de Chatbots - Creacion de chatbot ###\n");
            System.out.print("1. Interactuar con un chatbot\n");
            System.out.print("2. Consultar síntesis\n");
            System.out.print("3. Salir\n");
            System.out.print("INTRODUZCA SU OPCIÓN:\n");
            selection = input.nextInt();
            switch (selection){
                case 1:
                    interact(system);
                    break;
                case 2:
                    system.systemSynthesis(system.getLoggedUser());
                    break;
                case 3:
                    system.systemLogout();
                    break;
                default:
                    System.out.println(selection + " no es una opción valida! Por favor seleccione la opción correcta.\n");
            }
        } while (selection != 3);
    }
    public static void interact(system_21141368_ZunigaTobar system) {
        Scanner input = new Scanner(System.in);
        String msg;
        System.out.println("\n### Sistema de Chatbots - Interaccion ###\n");
        System.out.print("Sesion iniciada de" + system.getLoggedUser() + "\n");
        int[] position = system.getPosicion();
        chatbot_21141368_ZunigaTobar actualChatbot = system.getChatbotById(position[0]);
        System.out.print(actualChatbot.getName() + ": ");
        flow_21141368_ZunigaTobar actualFlow = actualChatbot.getFlowById(position[1]);
        System.out.print(actualFlow.getNameMsg() + "\n");
        System.out.print(actualChatbot.getWelcomeMessage() + "\n");
        for (option_21141368_ZunigaTobar actualOption : actualFlow.getOptions()) {
            System.out.print("\t" + actualOption.getMessage() + "\n");
        }
        do {
            int []antes = system.getPosicion();
            msg = input.nextLine();
            system.systemTalk(msg);
            if (antes[0] == system.posicion[0] && antes[1] == system.posicion[1]) {
                return;
            }
        } while (!msg.equals("0"));
    }
}