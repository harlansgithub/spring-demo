package com.liudf.spring.ioc.eventbus;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component
public class EventBusRegisterPostProcessor implements BeanPostProcessor {
    @Autowired
    private EventBus eventBus;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> subcriberClazz = bean.getClass();
        Method[] methods = subcriberClazz.getMethods();
        for (Method method:methods){
            if (method.isAnnotationPresent(Subscribe.class)){
                eventBus.register(bean);
                break;
            }
        }
        return bean;
    }
}
