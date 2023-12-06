package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Carga de datos
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

        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 3;

        int choice;

        do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    loginMenu(miSistema);
                    user_21141368_ZunigaTobar user = miSistema.getLoggedUserData(miSistema.getLoggedUser());
                    if (user.isAdmin()) {
                        adminMenu(miSistema);
                    } else {

                    }
                    break;

                case 2:
                    registerMenu(miSistema);
                    break;

                case 3:
                    System.out.println("Cerrando...");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " no es una opción valida! Por favor seleccione la opción correcta.");
            }
        } while (choice != MENU_EXIT_OPTION);
    }

    private static void printMenu() {
        System.out.println("### Sistema de Chatbots - Inicio ###\n");
        System.out.print("1. Login de Usuario\n");
        System.out.print("2. Registro de Usuario\n");
        System.out.print("3. Salir\n");
        System.out.print("INTRODUZCA SU OPCIÓN:\n");
    }
    public static void printLogin() {
        System.out.println("### Sistema de Chatbots - Login ###\n");
        System.out.print("INTRODUZCA NOMBRE DE USUARIO:\n");
    }
    public static void printAdminMenu(system_21141368_ZunigaTobar system){
        System.out.println("### Sistema de Chatbots - Usuario Administrador ###\n");
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
    public static void adminMenu(system_21141368_ZunigaTobar system){
        printAdminMenu(system);
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        switch(selection){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            case 7:
                break;
        }

    }
    public static void loginMenu(system_21141368_ZunigaTobar system){
        printLogin();
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        system.systemLogin(userName.toLowerCase());
    }

    public static void printRegisterMenu() {
        System.out.println("### Sistema de Chatbots - Registro ###\n");
        System.out.print("1. Registrar usuario normal\n");
        System.out.print("2. Registrar usuario administrador\n");
        System.out.print("INTRODUZCA SU OPCIÓN:\n");
    }
    public static void registerMenu(system_21141368_ZunigaTobar system){
        Scanner input = new Scanner(System.in);
        int role;
        printRegisterMenu();
        role = input.nextInt();
        Scanner name = new Scanner(System.in);
        String userName;
        user_21141368_ZunigaTobar newUser;
        switch (role){
            case 1:
                System.out.println("### Sistema de Chatbots - Registro Usuario Normal ###\n");
                System.out.print("INTRODUZCA NOMBRE DEL USUARIO NORMAL:\n");
                userName = name.nextLine();
                newUser = new user_21141368_ZunigaTobar(userName.toLowerCase(), false);
                system.systemAddUser(newUser);
                System.out.print("Se ha registrado el usuario " + userName.toLowerCase() + " como usuario normal");
                break;
            case 2:
                System.out.println("### Sistema de Chatbots - Registro Usuario Administrador ###\n");
                System.out.print("INTRODUZCA NOMBRE DEL USUARIO ADMINISTRADOR:\n");
                userName = name.nextLine();
                newUser = new user_21141368_ZunigaTobar(userName.toLowerCase(), true);
                system.systemAddUser(newUser);
                System.out.print("Se ha registrado el usuario " + userName.toLowerCase() + " como usuario administrador");
                break;
            default:
                System.out.println(role + " no es una opción valida! Por favor seleccione la opción correcta.");
        }
    }
}