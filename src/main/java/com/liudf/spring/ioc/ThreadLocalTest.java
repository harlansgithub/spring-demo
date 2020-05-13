package com.liudf.spring.ioc;

public class ThreadLocalTest {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<String>();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread name is "+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                threadLocal.set(Thread.currentThread().getName());
//                System.out.println(threadLocal.get());
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread name is "+Thread.currentThread().getName());
//                try {
//                    Thread.currentThread().join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                threadLocal.set(Thread.currentThread().getName());
//                System.out.println(threadLocal.get());
            }
        },"t2");
        t1.start();
        t2.start();
    }
}
