package com.meijie.progress.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class GameAspect {

    @Pointcut("execution(* com.meijie.progress.designpattern.factorymodel.GameService.handleWeChatPushInfo(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        log.info("执行不同game逻辑前，统一入库操作");
    }

}
