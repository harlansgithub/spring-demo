package com.liudf.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class TulingLogAspect {
    @Pointcut("execution(* com.liudf.spring.aop.TulingCalculate.*(..))")
    public void pointCut(){}

    @Before(value = "pointCut()")
    public void methodBefore(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法" + methodName + "之前执行<前置通知>，入参+" + Arrays.asList(joinPoint.getArgs()));
    }

    @After(value = "pointCut()")
    public void methodAfter(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法" + methodName + "之后执行<后置通知>，入参+" + Arrays.asList(joinPoint.getArgs()));
    }
//    @Around("execution(* com.liudf.spring.aop.TulingCalculate.*(..))")
//    public int aroundTest(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//        int result = (int) proceedingJoinPoint.proceed();
//        System.out.println("耗时" + (System.currentTimeMillis() - start));
//        return result;
//    }
}
