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
    List<String> historial;

    public User(String name, List<String> historial) {
        this.name = name;
        this.historial = historial;
    }

    public String getName() {
        return name;
    }

    public List<String> getHistorial() {
        return historial;
    }

    public int getUserId(String userName){
        List<Character> nameList = new ArrayList<>();
        for (int i = 0; i < userName.length(); i++) nameList.add(userName.charAt(i));
        return (int) nameList.get(5);
    }
}
