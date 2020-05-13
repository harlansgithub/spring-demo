package com.liudf.spring.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PostConstuct {

    @PostConstruct
    public void init(){
        System.out.println("PostConstuct 初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("PostConstuct 的销毁方法");
    }
}
