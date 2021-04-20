package com.meijie.progress.designpattern.structure.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Desktop extends Computer {

    @Override
    public void sale() {
        super.sale();
        log.info("销售台式机");
    }
}
