package com.meijie.progress.designpattern.structure.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mi implements Brand {
    @Override
    public void sale() {
      log.info("销售小米品牌");
    }
}
