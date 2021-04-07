package com.meijie.progress.designpattern.factorymodel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QuizGameServiceImpl implements GameService{
    @Override
    public void handleWeChatPushInfo() {
        log.info("微信推送--处理答题游戏扫码信息");
    }
}
