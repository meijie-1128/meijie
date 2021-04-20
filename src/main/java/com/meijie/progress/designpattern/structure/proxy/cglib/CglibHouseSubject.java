package com.meijie.progress.designpattern.structure.proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class CglibHouseSubject implements MethodInterceptor {

    private Object realObj;

    public Object newProxyInstance(Object realObj)
    {
        this.realObj = realObj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.realObj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object object = methodProxy.invokeSuper(o, objects);
        log.info("中介收取中介费");
        return object;
    }
}
