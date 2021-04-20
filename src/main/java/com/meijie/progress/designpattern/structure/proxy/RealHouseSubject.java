package com.meijie.progress.designpattern.structure.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealHouseSubject implements HouseSubject{
    @Override
    public void rentHouse() {
      log.info("房子的主人收取房租费");
    }
}