// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA USER

package org.example;

public class user_21141368_ZunigaTobar implements i_user_21141368_ZunigaTobar{
    String userName;
    boolean isAdmin;

    /**
     * Constructor user_21141368_ZunigaTobar
     * @param userName;
     * @param role;
     */
    public user_21141368_ZunigaTobar(String userName, boolean role) {
        this.userName = userName;
        this.isAdmin = role;
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
     * Pertenencia isAdmin
     * @return boolean
     */
    @Override
    public boolean isAdmin() {
        return isAdmin;
    }
}
