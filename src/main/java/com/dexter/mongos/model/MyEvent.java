package com.dexter.mongos.model;

public class MyEvent implements Event {

    public String event;

    public MyEvent(String event) {
        this.event = event;
    }

    @Override
    public String getEvent() {
        return event;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyEvent{");
        sb.append("event='").append(event).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
