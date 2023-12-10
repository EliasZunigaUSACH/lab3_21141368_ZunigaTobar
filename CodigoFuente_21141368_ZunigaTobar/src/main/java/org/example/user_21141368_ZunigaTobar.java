// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA USER

package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class user_21141368_ZunigaTobar implements i_user_21141368_ZunigaTobar{
    String userName;
    int ID;
    boolean isAdmin;

    public user_21141368_ZunigaTobar(String userName, boolean role) {
        this.userName = userName;
        this.isAdmin = role;
        this.ID = getNumberByName(userName);
    }
    @Override
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

    /**
     * Selector getID
     * @return int
     */
    @Override
    public int getID() {
        return ID;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isAdmin() {
        return isAdmin;
    }
}
