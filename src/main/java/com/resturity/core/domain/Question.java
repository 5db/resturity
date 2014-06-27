package com.resturity.core.domain;

import java.util.Date;
import java.util.Random;

/**
 * @author jsingh on 26/06/2014.
 */
public class Question {

    private Long id;

    private String description;

    private Date createdOn;

    public Question(String description, Date createdOn) {
        this.id = new Random().nextLong();
        this.description = description;
        this.createdOn = createdOn;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
}
