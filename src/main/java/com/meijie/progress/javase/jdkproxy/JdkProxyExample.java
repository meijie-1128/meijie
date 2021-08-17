package com.meijie.progress.javase.jdkproxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class JdkProxyExample {

    public static void main(String[] args) {
        Hello targetObj = new HelloTarget();
        InvocationHandler handler = new InvocationSubject(targetObj);
        // 代理对象也是接口的实现类
        Hello proxyObj = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[]{Hello.class}, handler);
        proxyObj.sayHello();
    }


}


// 目标类实现的接口
interface Hello {
    void sayHello();
}

// 目标类
@Slf4j
class HelloTarget implements Hello {

    @Override
    public void sayHello() {
        log.info("hello world !");
    }
}

// 代理实现
@Slf4j
class InvocationSubject implements InvocationHandler {

    private Object object;

    public InvocationSubject(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("JDK动态代理-----目标方法前置功能");
        Object resultObject = method.invoke(object, args);
        log.info("JDK动态代理-----目标方法后置功能");
        return resultObject;
    }
}
