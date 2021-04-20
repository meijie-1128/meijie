package com.meijie.progress.designpattern.structure.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Apple implements Brand {
    @Override
    public void sale() {
      log.info("销售苹果品牌");
    }
}
