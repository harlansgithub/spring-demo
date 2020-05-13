package com.liudf.spring.transaction;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.params.SetParams;

public class TestFul {
    public static void main(String[] args) {
        System.out.println(2 | 0);
        System.out.println(2 | 1);
        System.out.println(2 | 2);


        System.out.println("======================");
        System.out.println(2 & 2);
        System.out.println(3 & 2);
        System.out.println(2 & 2);
        Jedis jedis = new Jedis();
        SetParams params = new SetParams();
        params.ex(10);
        params.nx();
        jedis.set("key","1",params);
    }
}
