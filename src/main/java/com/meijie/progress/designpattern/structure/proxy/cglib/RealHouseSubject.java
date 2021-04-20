package com.meijie.progress.designpattern.structure.proxy.cglib;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealHouseSubject {


    public void rentHouse() {
        log.info("房子的主人收取房租费");
    }
}