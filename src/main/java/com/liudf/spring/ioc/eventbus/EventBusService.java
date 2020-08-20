package com.liudf.spring.ioc.eventbus;

public interface EventBusService {
    <E> void register(E e);
    <E> void unRegister(E e);
    <T> void post(T e);
}
