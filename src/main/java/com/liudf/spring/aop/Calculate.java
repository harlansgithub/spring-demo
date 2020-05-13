package com.liudf.spring.aop;

public interface Calculate {
    int add(int a,int b) throws InterruptedException;
    int reduce(int a,int b);
    int div(int a,int b);
    int multi(int a,int b);
}
