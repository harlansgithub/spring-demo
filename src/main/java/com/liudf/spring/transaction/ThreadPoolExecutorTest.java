package com.liudf.spring.transaction;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,10,20000, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
        Future future = threadPoolExecutor.submit(new Task());
        System.out.println(future.get());
    }
}
class Task implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "hello++++";
    }
}
