package com.resturity.core.domain;

import java.util.Random;

/**
 * @author jsingh on 26/06/2014.
 */
public class User {

    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    public User(String firstName, String middleName, String lastName) {
        this.id = new Random().nextLong();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
}
