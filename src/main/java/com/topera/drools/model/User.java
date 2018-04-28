package com.topera.drools.model;

/**
 * Created by topera on 28/04/18.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

}
