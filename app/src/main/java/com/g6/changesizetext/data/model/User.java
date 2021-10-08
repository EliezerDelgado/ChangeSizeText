package com.g6.changesizetext.data.model;

import java.io.Serializable;

/**
 * Clase que guarda la información del login del usuario
 * Esta clase debe implementar la interfaz Serializable porque está contenida
 * dentro de la clase Message que pasa dentro de un Intent
 * java.lang.ClassCastException: com.g6.changesizetext.data.model.Message cannot be cast to java.io.Serializable
 */
public class User implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    private String name;
    private String email;
}
