package com.meijie.progress.designpattern.structure.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class JdkProxyHouseSubject implements InvocationHandler {

    private Object realObj;


    public Object newProxyInstance(Object realObj) {
        this.realObj = realObj;
        Class<?> classType = this.realObj.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(realObj, args);
        log.info("中介收取中介费");
        return invoke;
    }
}
