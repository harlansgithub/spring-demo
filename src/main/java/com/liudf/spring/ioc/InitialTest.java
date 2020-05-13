package com.liudf.spring.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitialTest implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("InitializingBean 销毁方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitialTest 初始化方法");
    }
}
