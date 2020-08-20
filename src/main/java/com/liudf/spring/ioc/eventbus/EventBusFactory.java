package com.liudf.spring.ioc.eventbus;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class EventBusFactory implements EventBusService, BeanPostProcessor {
    @Override
    public <E> void register(E e) {

    }

    @Override
    public <E> void unRegister(E e) {

    }

    @Override
    public <T> void post(T e) {

    }
}
