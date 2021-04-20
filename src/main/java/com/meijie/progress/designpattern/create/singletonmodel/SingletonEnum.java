package com.meijie.progress.designpattern.create.singletonmodel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum SingletonEnum {

    INSTANCE;

    public void printLog() {
      log.info("枚举类实现单例模式");
    }

}
