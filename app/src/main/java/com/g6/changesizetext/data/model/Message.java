package com.g6.changesizetext.data.model;

import java.io.Serializable;

/**
 * Clase que guarda un mensaje de un usuario que ha iniciado sesión
 */
public class Message implements Serializable {
    private User user;
    private String message;
    private int size;

    public Message(User user, String message, int size) {
        this.user = user;
        this.message = message;
        this.size = size;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public int getSize() {
        return size;
    }
}
