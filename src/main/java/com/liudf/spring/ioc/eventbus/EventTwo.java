package com.liudf.spring.ioc.eventbus;

public class EventTwo {
    private String name;

    public EventTwo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
