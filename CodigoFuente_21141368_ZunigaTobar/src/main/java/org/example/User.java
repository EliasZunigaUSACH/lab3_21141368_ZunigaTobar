package org.example;

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

    }
}
