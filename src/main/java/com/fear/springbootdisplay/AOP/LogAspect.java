package com.fear.springbootdisplay.AOP;

import com.fear.springbootdisplay.Service.TrackTime;
import org.apache.commons.logging.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 梁懿豪
 * @version 1.0
 * @Github https://github.com/fearlesslyh
 */
@Aspect
@Component
public class LogAspect {
    @Around("@annotation(trackTime)")
    public Object logExcutionTime(ProceedingJoinPoint joinPoint, TrackTime trackTime) throws Throwable {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("开始执行"+joinPoint.getSignature().getName()+"方法");
        Object proceed = joinPoint.proceed();
        long current = System.currentTimeMillis();
        long excutionTime = current - currentTimeMillis;
        System.out.println("执行"+joinPoint.getSignature().getName()+"方法耗时"+excutionTime+"ms");
        return proceed;
    }
}
