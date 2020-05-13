package com.liudf.spring.transaction;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new TestThread());
        t1.start();
        t1.join();
        System.out.println("after running");
    }
}
class TestThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("t1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
