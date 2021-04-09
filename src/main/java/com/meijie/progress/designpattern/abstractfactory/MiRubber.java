package com.meijie.progress.designpattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MiRubber extends Rubber{
    @Override
    public void produce() {
      log.info("生产小米橡皮擦");
    }
}
