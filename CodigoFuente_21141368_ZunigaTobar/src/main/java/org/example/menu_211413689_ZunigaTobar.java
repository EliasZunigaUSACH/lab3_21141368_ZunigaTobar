package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class menu_211413689_ZunigaTobar implements i_menu_21141368_ZunigaTobar {

    public void mainMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 3;

        int choice;

        do {
            printMenu();
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
    public void printMenu() {
        System.out.println("\n### Sistema de Chatbots - Inicio ###\n");
        System.out.print("1. Login de Usuario\n");
        System.out.print("2. Registro de Usuario\n");
        System.out.print("3. Salir\n");
        System.out.print("INTRODUZCA SU OPCIÓN:\n");
    }
    public void printLogin() {
        System.out.println("\n### Sistema de Chatbots - Login ###\n");
        System.out.print("INTRODUZCA NOMBRE DE USUARIO:\n");
    }
    public void printAdminMenu(system_21141368_ZunigaTobar system){
        System.out.println("\n### Sistema de Chatbots - Usuario Administrador ###\n");
        System.out.print("Bienvenido " + system.getLoggedUser() + " usted es administrador.\n");
        System.out.print("1. Crear un Chatbot\n");
        System.out.print("2. Modificar un Chatbot\n");
        System.out.print("3. Ejecutar un Chatbot\n");
        System.out.print("4. Visualizar todos los chatbots existentes en el sistema\n");
        System.out.print("5. Visualizar todos los chatbots con sus flujos y opciones creadas\n");
        System.out.print("6. Ejecutar una simulación del sistema de chatbot\n");
        System.out.print("7. Salir\n");
        System.out.print("INTRODUZCA SU OPCIÓN:\n");
    }
    public void adminMenu(system_21141368_ZunigaTobar system) {
        Scanner input = new Scanner(System.in);
        int selection;
        do {
            printAdminMenu(system);
            selection = input.nextInt();
            switch (selection) {
                case 1:
                    createChatbotMenu(system);
                    break;
                case 2:
                    modChatbotMenu(system);
                    break;
                case 3:

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
                    simulateMenu(system);
                    break;
                case 7:
                    system.systemLogout();
                    break;
                default:
                    System.out.println(selection + " no es una opción valida! Por favor seleccione la opción correcta\n");
            }
        } while (selection != 7);
    }
    public void loginMenu(system_21141368_ZunigaTobar system){
        printLogin();
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        system.systemLogin(userName.toLowerCase());
    }

    public void printRegisterMenu() {
        System.out.println("\n### Sistema de Chatbots - Registro ###\n");
        System.out.print("1. Registrar usuario normal\n");
        System.out.print("2. Registrar usuario administrador\n");
        System.out.print("3. Salir\n");
        System.out.print("INTRODUZCA SU OPCIÓN:\n");
    }
    public void registerMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        int role;
        Scanner name = new Scanner(System.in);
        String userName;
        user_21141368_ZunigaTobar newUser;
        do {
            printRegisterMenu();
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
    public void printModChatbotMenu(system_21141368_ZunigaTobar system){
        System.out.println("\n### Sistema de Chatbots - Modificación de chatbot ###\n");
        System.out.print("Chatbots existentes: ");
        for (chatbot_21141368_ZunigaTobar chatbot : system.getChatbots()) {
            System.out.println("\t" + chatbot.getChatbotID() + ". " + chatbot.getName() + "\n");
        }
        System.out.print("INTRODUZCA LA ID DEL CHATBOT QUE DESEA MODIFICAR O ESCRIBA '-1' PARA SALIR:\n");
    }
    public void printModChatbotOptionsMenu(){
        System.out.println("\n### Sistema de Chatbots - Modificación de chatbot ###\n");
        System.out.print("1. Agregar flujo\n");
        System.out.print("2. Agregar opciones a cierto flujo\n");
        System.out.print("3. Salir\n");
        System.out.print("INTRODUZCA SU OPCIÓN:\n");
    }
    public void modChatbotOptionsMenu(chatbot_21141368_ZunigaTobar chatbot){
        Scanner input = new Scanner(System.in);
        int selection;
        do {
            printModChatbotOptionsMenu();
            selection = input.nextInt();
            switch (selection){
                case 1:

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
    public void modChatbotMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        int id;
        printModChatbotMenu(system);
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
    public void printModFlowMenu(chatbot_21141368_ZunigaTobar chatbot){
        System.out.println("\n### Sistema de Chatbots - Agregación de opciones ###\n");
        System.out.print("Flujos: \n");
        for (flow_21141368_ZunigaTobar flow : chatbot.getFlows()) {
            System.out.println("\t" + flow.getFlowId() + ". " + flow.getNameMsg() + "\n");
        }
        System.out.print("INTRODUZCA LA ID DEL FLUJO A MODIFICAR O ESCRIBE '-1' PARA SALIR:\n");
    }
    public void modFlowMenu(chatbot_21141368_ZunigaTobar chatbot){
        Scanner input = new Scanner(System.in);
        int id;
        printModFlowMenu(chatbot);
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
    public void printAddOptionToFlowMenu(flow_21141368_ZunigaTobar flow){
        System.out.println("\n### Sistema de Chatbots - Agregacion de opciones ###\n");
        System.out.print("Opciones: \n");
        for (option_21141368_ZunigaTobar opcion : flow.getOptions()) {
            System.out.println("\t" + opcion.getOptionId() + ". " + opcion.getMessage() + "\n");
        }
        System.out.print("\t0. Salir\n");
        System.out.print("INTRODUZCA MENSAJE PARA LA NUEVA OPCION:\n");
    }
    public void addOptionToFlowMenu(flow_21141368_ZunigaTobar flow){
        Scanner input = new Scanner(System.in);
        String name;
        String words;
        int newChatbotCodeLink;
        int newInitialFlowCodeLink;
        printAddOptionToFlowMenu(flow);
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
        List<option_21141368_ZunigaTobar> updatedOptions = flow.getOptions();
        updatedOptions.add(newOption);
        flow.setOptions(updatedOptions);
//        flow.flowAddOption(newOption);
    }
    public void printCreateChatbotMenu(){
        System.out.println("\n### Sistema de Chatbots - Creacion de chatbot ###\n");
        System.out.print("INTRODUZCA NOMBRE PARA EL NUEVO CHATBOT:\n");
    }
    public void createChatbotMenu(system_21141368_ZunigaTobar system){
/*        Scanner input = new Scanner(System.in);
        printCreateChatbotMenu();
        int newID = input.nextInt();
        chatbot_21141368_ZunigaTobar newChatbot = new chatbot_21141368_ZunigaTobar(newID, );
        system.systemAddChatbot(newChatbot);*/
    }
    public void interact(system_21141368_ZunigaTobar system){

    }
    public void printSimulateMenu(){
        System.out.println("\n### Sistema de Chatbots - Simulacion ###\n");
        System.out.print("INTRODUZCA CANTIDAD MAXIMA DE INTERACCIONES:\n");
    }
    public void simulateMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        printSimulateMenu();
        int number = input.nextInt();
        int seed = system.generateRandom();
        system.systemSimulate(number, seed, system);
    }
}
