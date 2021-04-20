package com.meijie.progress.designpattern.create.singletonmodel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SingletonEnumTest {

    @Test
    void test() {
        SingletonEnum.INSTANCE.printLog();
    }

}