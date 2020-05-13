package com.liudf.spring.ioc;

import org.springframework.stereotype.Component;

@Component
public class TulingLog {
    public TulingLog() {
        System.out.println("Tulinglog 构造方法");
    }
}
