package com.topera.drools;

/**
 * Created by topera on 28/04/18.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @SuppressWarnings("unused") // used by drools
    public void setName(String name) {
        this.name = name;
    }

}
