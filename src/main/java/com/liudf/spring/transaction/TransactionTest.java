package com.liudf.spring.transaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TransactionConfig.class);
        OrderService service = ctx.getBean(OrderService.class);
        System.out.println(service.createOrder("2").toString());
    }
}
