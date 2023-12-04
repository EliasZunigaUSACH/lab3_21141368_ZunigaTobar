package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void system_21141368_ZunigaTobar() {
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
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 3;

        int choice;

        do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    printLogin();

                    break;

                case 2:
                    Scanner userType = new Scanner(System.in);
                    int role;
                    printRegisterMenu();
                    role = userType.nextInt();
                    switch (role){
                        Scanner name = new Scanner(System.in);
                        String userName;
                        user_21141368_ZunigaTobar newUser;
                        case 1:
                            System.out.println("### Sistema de Chatbots - Registro Usuario Normal ###\n");
                            System.out.print("INTRODUZCA NOMBRE DEL USUARIO NORMAL:\n");
                            userName = name.nextLine();
                            newUser = new user_21141368_ZunigaTobar(userName, false);

                        case 2:
                            System.out.println("### Sistema de Chatbots - Registro Usuario Administrador ###\n");
                            System.out.print("INTRODUZCA NOMBRE DEL USUARIO ADMINISTRADOR:\n");
                            userName = name.nextLine();
                            newUser = new user_21141368_ZunigaTobar(userName, true);

                    }


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
    public static void printRegisterMenu() {
        System.out.println("### Sistema de Chatbots - Registro ###\n");
        System.out.print("1. Registrar usuario normal\n");
        System.out.print("2. Registrar usuario administrador\n");
        System.out.print("INTRODUZCA SU OPCIÓN:\n");
    }
}