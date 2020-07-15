//package cn.huaming.fastjson;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.Signature;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
///**
// * Created by kl on 2017/12/29.
// * Content :给添加@KLock切面加锁处理
// */
//@Aspect
//@Component
//@Order(0)
//@Slf4j
//public class PropertyAspectHandler {
//    @Around(value = "@annotation(scProperty)")
//    public Object around(ProceedingJoinPoint joinPoint, ScProperty scProperty) throws Throwable {
//        log.trace("start=====around=======");
//        long start = System.nanoTime();
//        Object[] args = joinPoint.getArgs();
//        Signature signature = joinPoint.getSignature();
//        long end = System.nanoTime();
//        log.trace("cost:" + (end - start) + "ns");
//        log.trace("end======around======");
//        return null;
//    }
//}
