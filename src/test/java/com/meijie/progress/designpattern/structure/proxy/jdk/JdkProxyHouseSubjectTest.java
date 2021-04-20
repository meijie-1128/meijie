package com.meijie.progress.designpattern.structure.proxy.jdk;

import com.meijie.progress.designpattern.structure.proxy.HouseSubject;
import com.meijie.progress.designpattern.structure.proxy.RealHouseSubject;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;


class JdkProxyHouseSubjectTest {

    @Test
    void test(){
        HouseSubject houseSubject = (HouseSubject)new JdkProxyHouseSubject().newProxyInstance(new RealHouseSubject());
        houseSubject.rentHouse();
    }

}