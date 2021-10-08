package com.g6.changesizetext;

import android.app.Application;

import com.g6.changesizetext.data.model.User;

public class ChangeSizeApplication extends Application {
    private User user;
    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Eliezer","delgadoeliezer05@gmail.com");
    }

    public User getUser() {
        return user;
    }
}
