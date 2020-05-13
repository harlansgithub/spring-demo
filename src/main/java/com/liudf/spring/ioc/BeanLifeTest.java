package com.liudf.spring.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeTest implements InitializingBean, DisposableBean {
    public BeanLifeTest (){
        System.out.println("BeanLifeTest`s construct");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeTest`s destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeTest`s properties");
    }
}
