package com.meijie.progress.designpattern.structure.proxy.staticproxy;

import com.meijie.progress.designpattern.structure.proxy.HouseSubject;
import com.meijie.progress.designpattern.structure.proxy.RealHouseSubject;
import org.junit.jupiter.api.Test;

class ProxyHouseSubjectTest {

    @Test
    void test() {
        HouseSubject houseSubject = new StaticProxyHouseSubject(new RealHouseSubject());
        houseSubject.rentHouse();
    }
}