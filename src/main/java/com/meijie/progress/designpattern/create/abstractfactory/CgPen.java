package com.meijie.progress.designpattern.create.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CgPen extends Pen{
    @Override
    public void produce() {
        log.info("生产晨光笔");
    }
}
