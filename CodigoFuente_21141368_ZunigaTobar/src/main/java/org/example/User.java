// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA USER

package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    boolean isAdmin;

    public User(String name, boolean role) {
        this.name = name;
        this.isAdmin = role;
    }

    public String getName() {
        return name;
    }

    public int getUserId(String userName){
        List<Character> nameList = new ArrayList<>();
        for (int i = 0; i < userName.length(); i++) nameList.add(userName.charAt(i));
        return (int) nameList.get(5);
    }
}
