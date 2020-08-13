package com.test.designmodel.intercept;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class InterceptAspect {

    /*
    @Around("execution(* com.test..*.*Controller.*(..))")
    public Object arroundAsepect(ProceedingJoinPoint joinPoint){
       Object  target=joinPoint.getTarget();
       return target;
    }
    */
    @Pointcut("@annotaion(com.test)")
    public void pointcut(){

    }

}
