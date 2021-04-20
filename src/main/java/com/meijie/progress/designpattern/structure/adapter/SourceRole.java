package com.meijie.progress.designpattern.structure.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SourceRole {

    public void realizeSource() {
        log.info("源目标方法执行");
    }

}
