package com.meijie.progress.designpattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class MiPen extends Pen{
    @Override
    public void produce() {
        log.info("生产小米笔");
    }
}
