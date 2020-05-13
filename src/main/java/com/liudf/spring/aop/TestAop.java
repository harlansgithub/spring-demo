package com.liudf.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Calculate calculate = ctx.getBean(Calculate.class);
        System.out.println(calculate.add(1, 2));
    }
}
