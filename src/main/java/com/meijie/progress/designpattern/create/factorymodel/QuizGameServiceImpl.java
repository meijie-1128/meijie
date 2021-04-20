package com.meijie.progress.designpattern.create.factorymodel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class QuizGameServiceImpl implements GameService{
    @Override
    public void handleWeChatPushInfo(Map<String,Object> paramMap) {
        log.info("微信推送--处理答题游戏扫码信息");
    }
}
