package com.liudf.spring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TulingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        for (String name:configurableListableBeanFactory.getBeanDefinitionNames()){
            if ("tulingLog".equals(name)){
                BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
                beanDefinition.setLazyInit(true);
            }
        }
    }
}
