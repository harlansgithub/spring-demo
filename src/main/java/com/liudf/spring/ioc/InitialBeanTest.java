package com.liudf.spring.ioc;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitialBeanTest implements InitializingBean {
    @PostConstruct
    public void init(){
        System.out.println("InitialBeanTest->初始化");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitialBeanTest->afterPropertiesSet");
    }
}
