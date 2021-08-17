package com.meijie.progress.javase.reflect;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Slf4j
public class ReflectExample {

    public static void getClassMethod() throws ClassNotFoundException {
        // 获取反射的三种方式
        // 1.通过类的全限定名获取，注意有ClassNotFoundException异常需要处理
        Class c1 = Class.forName("com.meijie.progress.javase.reflect.ReflectInstance");

        // 2.通过目标类获取
        Class c2 = ReflectInstance.class;

        // 3.通过类的对象获取
        ReflectInstance reflectInstance = new ReflectInstance();
        Class c3 = reflectInstance.getClass();

        // 三种方式获取的class对象相同
        log.info("c1.hashCode:{}", c1.hashCode());
        log.info("c2.hashCode:{}", c2.hashCode());
        log.info("c3.hashCode:{}", c3.hashCode());
    }

    public static void researchClass() throws ClassNotFoundException {
        Class c1 = Class.forName("com.meijie.progress.javase.reflect.ReflectInstance");

        // 获取类的属性
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            log.info("field has:{}", field);
        }
        // 获取类的方法（只能获取本类和所属父类（包括object）的公有方法）
        Method[] superAndSelfPublicMethods = c1.getMethods();
        for (Method method : superAndSelfPublicMethods) {
            log.info("superAndSelfPublicMethod has:{}", method);
        }

        // 获取本类的所有方法，包括私有方法、实现的接口方法,不包括继承父类的方法
        Method[] selfAllMethods = c1.getDeclaredMethods();
        for (Method selfAllMethod : selfAllMethods) {
            log.info("selfAllMethod has:{}", selfAllMethod);
        }

        // 获取类的构造器
        Constructor<?>[] constructors = c1.getConstructors();
        for (Constructor<?> constructor : constructors) {
            log.info("constructor has:{}", constructor);
        }

    }

    public static void createInstance() throws Exception {
        Class c1 = Class.forName("com.meijie.progress.javase.reflect.ReflectInstance");
        SuperReflect superReflect = (SuperReflect) c1.newInstance();
        log.info("反射创建的对象为:{}", superReflect);

        Method method = c1.getDeclaredMethod("setNameAndAge", String.class, int.class);
        method.setAccessible(true);
        method.invoke(superReflect, "meijie", 30);
        log.info("使用invoke之后:{}", superReflect);
    }

    public static void researchAnnotation() throws Exception {
        Class c1 = Class.forName("com.meijie.progress.javase.annotation.AnnotationExample");
        // 获取类上的注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            log.info("annotation has:{}", annotation);
        }

        // 获取属性上的注解
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            log.info("field is:{}", field);
            Annotation[] fieldAnnotations = field.getAnnotations();
            for (Annotation fieldAnnotation : fieldAnnotations) {
                log.info("fieldAnnotation has:{}", field);
            }
        }
        // 获取方法上的注解
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            log.info("method is:{}", method);
            Annotation[] methodAnnotations = method.getAnnotations();
            for (Annotation methodAnnotation : methodAnnotations) {
                log.info("methodAnnotation has:{}", methodAnnotation);
            }
        }
        // 获取构造器上的注解
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            log.info("constructor is:{}", constructor);
            Annotation[] constructorAnnotations = constructor.getAnnotations();
            for (Annotation constructorAnnotation : constructorAnnotations) {
                log.info("constructorAnnotation has:{}", constructorAnnotation);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //getClassMethod();
        //researchClass();
        //createInstance();
        researchAnnotation();
    }
}

class SuperReflect {
    public void superMethod() {

    }
}

interface ReflectInterface {

    void InterfaceMethod();
}

class ReflectInstance extends SuperReflect implements ReflectInterface {

    private String name;


    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ReflectInstance() {
    }

    public ReflectInstance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public void InterfaceMethod() {

    }
}
