package com.meijie.progress.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.MapUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Aspect
@Slf4j
public class GameAspect {

    @Pointcut("execution(* com.meijie.progress.designpattern.create.factorymodel.GameService.handleWeChatPushInfo(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Map<String,Object> paramMap = (Map<String,Object>)args[0];
        log.info("执行不同game逻辑前，统一入库操作,参数为:{}", MapUtils.getString(paramMap, "gameType"));
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint){
        log.info("执行不同game逻辑后续操作");
    }
}
