package com.meijie.progress.designpattern.structure.proxy.staticproxy;

import com.meijie.progress.designpattern.structure.proxy.HouseSubject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticProxyHouseSubject implements HouseSubject {

    private HouseSubject houseSubject;

    public StaticProxyHouseSubject(HouseSubject houseSubject) {
        this.houseSubject = houseSubject;
    }

    @Override
    public void rentHouse() {
        houseSubject.rentHouse();
        log.info("中介收取中介费");
    }
}
