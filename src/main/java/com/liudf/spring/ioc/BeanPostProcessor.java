package com.liudf.spring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("tulingDao")) {
            System.out.println("BeanPostProcessor 的beforeinitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("tulingDao")) {
            System.out.println("BeanPostProcessor 的afterinitialization");
        }
        return bean;
    }
}
