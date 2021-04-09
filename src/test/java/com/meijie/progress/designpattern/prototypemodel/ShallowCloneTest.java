package com.meijie.progress.designpattern.prototypemodel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShallowCloneTest {

    @Test
    public void test() throws CloneNotSupportedException {

        Person person = new Person("梅杰", "男");
        ShallowClone shallowClone01 = new ShallowClone(1, person);
        ShallowClone shallowClone02 = shallowClone01.clone();
        person.setName("刘强东");
        System.out.println(shallowClone01);
        System.out.println(shallowClone02);
        // 浅拷贝拷贝的是对象的引用地址
    }

}