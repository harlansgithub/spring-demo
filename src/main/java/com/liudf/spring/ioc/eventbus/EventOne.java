package com.liudf.spring.ioc.eventbus;

public class EventOne {
    private String name;

    public EventOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
