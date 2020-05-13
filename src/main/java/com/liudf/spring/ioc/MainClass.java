package com.liudf.spring.ioc;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        ctx.getBean("tulingDao");
//        ctx.publishEvent(new ApplicationEvent("我手工发送了一个事件！") {
//            @Override
//            public Object getSource() {
//                return super.getSource();
//            }
//        });
    }
}
