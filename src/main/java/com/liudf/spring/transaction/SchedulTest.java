package com.liudf.spring.transaction;

import java.util.concurrent.*;

public class SchedulTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        final ScheduledFuture<?> scheduledFuture = executor.scheduleAtFixedRate(new Test(),0,2000, TimeUnit.MILLISECONDS);
        scheduledFuture.get();
        System.out.println("over");
    }
}
class Test implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("hello");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
