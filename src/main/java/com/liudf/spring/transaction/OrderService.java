package com.liudf.spring.transaction;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
public class OrderService {
    @Transactional
    public String createOrder(String id){
        int i = 0;
        return id;
    }
}
