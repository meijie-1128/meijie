package com.meijie.progress.designpattern.create.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CgRubber extends Rubber{
    @Override
    public void produce() {
        log.info("生产晨光橡皮擦");
    }
}
