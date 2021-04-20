package com.meijie.progress.designpattern.structure.proxy.cglib;

import org.junit.jupiter.api.Test;

class CglibHouseSubjectTest {

    @Test
    void test() {
        RealHouseSubject houseSubject =  (RealHouseSubject)new CglibHouseSubject().newProxyInstance(new RealHouseSubject());
        houseSubject.rentHouse();
    }

}