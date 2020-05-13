package com.liudf.spring.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeTestPost {
    public BeanLifeTestPost () {
        System.out.println("BeanLifeTestPost`s contruct!");
    }
    @PostConstruct
    public void init(){
        System.out.println("BeanLifeTestPost`s init method!");
    }

    @PreDestroy
    public void destory(){
        System.out.println("BeanLifeTestPost`s destory");
    }
}
