package com.meijie.progress.javase.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.*;

@MyAnnotation(value = "meijie", name = {1,2})
public class AnnotationExample {

    @MyAnnotation(value = "meijie", name = {1,2})
    private String name;

    @MyAnnotation(value = "meijie", name = {1,2})
    public AnnotationExample (String name) {
        this.name = name;
    }

    @MyAnnotation(value = "meijie", name = {1,2})
    public String getName() {
        return  "meijie";
    }
}


// 注解示例
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Inherited
@interface MyAnnotation {

    String value() default "";

    int[] name();
}
