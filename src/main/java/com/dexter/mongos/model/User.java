package com.dexter.mongos.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    public String id;
    public String name;
    public String pass;
    public Event event;

    public User(String name, String pass, Event event) {
        this.name = name;
        this.pass = pass;
        this.event = event;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", pass='").append(pass).append('\'');
        sb.append(", event=").append(event);
        sb.append('}');
        return sb.toString();
    }
}
