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

    /**
     * Constructor user_21141368_ZunigaTobar
     * @param userName;
     * @param role;
     */
    public user_21141368_ZunigaTobar(String userName, boolean role) {
        this.userName = userName;
        this.isAdmin = role;
        this.ID = Integer.parseInt(userName.replaceAll("[^0-9]", ""));
    }

    /**
     * Selector getUserName
     * @return String
     */
    @Override
    public String getUserName() {
        return userName;
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
     * Pertenencia isAdmin
     * @return boolean
     */
    @Override
    public boolean isAdmin() {
        return isAdmin;
    }
}
