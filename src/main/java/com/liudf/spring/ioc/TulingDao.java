package com.liudf.spring.ioc;

import org.springframework.beans.factory.InitializingBean;

public class TulingDao implements InitializingBean {
    public String name = "null";
    TulingDao(){
        System.out.println("TulingDao 构造器");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet,name is " + name);
    }

    public void init(){
        System.out.println("init,name is " + name);
    }
}
