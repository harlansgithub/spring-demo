package com.liudf.spring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;


public class TestBeanPostProcess implements BeanPostProcessor , PriorityOrdered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("tulingDao")) {
            System.out.println(beanName+"->beforeInitialization"+bean.toString());
        }
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("tulingDao"))
            System.out.println(beanName+"->afterInitialization"+bean.toString());
        return bean;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
