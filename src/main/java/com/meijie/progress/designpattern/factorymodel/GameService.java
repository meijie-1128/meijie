package com.meijie.progress.designpattern.factorymodel;

import java.util.Map;

public interface GameService {

    void handleWeChatPushInfo(Map<String,Object> paramMap);
}