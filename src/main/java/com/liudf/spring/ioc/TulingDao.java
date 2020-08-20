package com.liudf.spring.ioc;

import com.google.common.eventbus.EventBus;
import com.liudf.spring.ioc.eventbus.EventOne;
import com.liudf.spring.ioc.eventbus.EventThree;
import com.liudf.spring.ioc.eventbus.EventTwo;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class TulingDao implements InitializingBean {
    @Autowired
    private EventBus eventBus;
    public String name = "null";
    TulingDao(){
        System.out.println("TulingDao 构造器");
    }
    public void test(){
        eventBus.post(new EventOne("i am one!"));
        eventBus.post(new EventTwo("i am two!"));
        eventBus.post(new EventThree("i am three"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet,name is " + name);
    }

    public void init(){
        System.out.println("init,name is " + name);
    }
}
