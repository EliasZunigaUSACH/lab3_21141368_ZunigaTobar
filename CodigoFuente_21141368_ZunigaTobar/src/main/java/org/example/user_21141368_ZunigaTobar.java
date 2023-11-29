// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA USER

package org.example;

public class user_21141368_ZunigaTobar {
    String userName;
    boolean isAdmin;

    public user_21141368_ZunigaTobar(String userName, boolean role) {
        this.userName = userName;
        this.isAdmin = role;
    }

    public String getUserName() {
        return userName;
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
}
