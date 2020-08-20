package com.liudf.spring.ioc.eventbus;

import com.google.common.eventbus.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
@Component
public class Listener1 {

    @Subscribe
    public void handle(EventOne one){
        System.out.println(one.getName());
    }
    @Subscribe
    public void handle(EventTwo two){
        System.out.println(two.getName());
    }
    @Subscribe
    public void handle(EventThree three){
        System.out.println(three.getName());
    }
}
