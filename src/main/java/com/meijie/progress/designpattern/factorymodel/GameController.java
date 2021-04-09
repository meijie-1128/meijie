package com.meijie.progress.designpattern.factorymodel;

import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/factoryModel")
public class GameController {

    @Autowired
    private GameFactory gameFactory;

    @RequestMapping(value = "/weChat/receive")
    public void receiveWechatInfo(@RequestBody Map<String,Object> paramMap) {
        String gameType = MapUtils.getString(paramMap, "gameType");
        GameService gameService = gameFactory.getGameService(gameType);
        gameService.handleWeChatPushInfo(paramMap);
    }
}
