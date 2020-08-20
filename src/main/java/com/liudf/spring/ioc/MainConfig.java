package com.liudf.spring.ioc;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {TulingService.class})
@ComponentScan(basePackages = "com.liudf.spring.ioc")
public class MainConfig {
    @Bean(initMethod = "init")
    public TulingDao tulingDao(){
        return new TulingDao();
    }

    @Bean
    public TestBeanPostProcess testBeanPostProcess(){
        return new TestBeanPostProcess();
    }

    @Bean
    public EventBus getEventBus(){
        return new EventBus();
    }
}
