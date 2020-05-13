package com.liudf.spring.aop;

public class TulingCalculate implements Calculate {
    @Override
    public int add(int a, int b) throws InterruptedException {
        Math
        return a+b;
    }

    @Override
    public int reduce(int a, int b) {
        return a-b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }

    @Override
    public int multi(int a, int b) {
        return a*b;
    }
}
