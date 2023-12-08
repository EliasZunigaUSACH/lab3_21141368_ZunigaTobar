// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA USER

package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class user_21141368_ZunigaTobar {
    String userName;
    int ID;
    boolean isAdmin;
    List<String> historial;

    public user_21141368_ZunigaTobar(String userName, boolean role) {
        this.userName = userName;
        this.isAdmin = role;
        int id = getNumberByName(userName);
        this.ID = id;
        this.historial = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static int getNumberByName(String userName){
        return Integer.parseInt(userName.replaceAll("[^0-9]", ""));
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<String> getHistorial() {
        return historial;
    }

    public void setHistorial(List<String> historial) {
        this.historial = historial;
    }
}
