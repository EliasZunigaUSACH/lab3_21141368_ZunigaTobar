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
    boolean isAdmin;

    public user_21141368_ZunigaTobar(String userName, boolean role) {
        this.userName = userName;
        this.isAdmin = role;
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

    public static int getUserId(String userName){
        List<String> nameList = new ArrayList<>(Collections.singletonList(userName));
//        for (int i : largo) nameList.add(userName.charAt(i));
//        return (int) nameList.get(5);
        String userID = "";
        for(String i : nameList){
            if (isNumeric(i)){
                userID = userID + i;
            }
        }
        return Integer.parseInt(userID);
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
