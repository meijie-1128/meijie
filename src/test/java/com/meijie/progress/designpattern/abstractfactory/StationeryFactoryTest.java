package com.meijie.progress.designpattern.abstractfactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class StationeryFactoryTest {
    @Test
    public void test() {

        StationeryFactory factory01 = new MiStationeryFactory();
        factory01.getPen().produce();
        factory01.getRubber().produce();

        StationeryFactory factory02 = new CgStationeryFactory();
        factory02.getPen().produce();
        factory02.getRubber().produce();
    }

}