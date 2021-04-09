package com.meijie.progress.designpattern.factorymodel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class FitnessGameServiceImpl implements GameService{

    @Override
    public void handleWeChatPushInfo(Map<String,Object> paramMap) {
        log.info("微信推送--处理健身游戏扫码信息");
    }
}
