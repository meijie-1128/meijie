package com.meijie.progress.designpattern.prototypemodel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DeepCloneTest {

    @Test
    public void test() throws CloneNotSupportedException {

        Person person = new Person("梅杰", "男");
        DeepClone deepClone01 = new DeepClone(1, person);
        DeepClone deepClone02 = deepClone01.clone();
        person.setName("刘强东");
        System.out.println(deepClone01);
        System.out.println(deepClone02);
    }

}