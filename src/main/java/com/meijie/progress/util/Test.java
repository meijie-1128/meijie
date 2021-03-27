package com.meijie.progress.util;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        // 游戏结果
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("cmd","gameResult");

        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("score",1);
        dataMap.put("type",2);
        dataMap.put("appraise","非常棒");
        dataMap.put("content","返回首页");
        dataMap.put("perfectNum",3);
        dataMap.put("mode",1);
        dataMap.put("timeConsuming",100);
        paramMap.put("data", JSON.toJSONString(dataMap));
        System.out.println(JSON.toJSONString(paramMap));

        // 弹幕查询
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("success",true);
        List<Map<String,Object>> dataList = new ArrayList<>();
        Map<String,Object> dataMap01 = new HashMap<>();
        dataMap01.put("userImg","http://123.png");
        dataMap01.put("content","A刚刚向B发起了挑战！");

        Map<String,Object> dataMap02 = new HashMap<>();
        dataMap02.put("userImg","http://456.png");
        dataMap02.put("content","恭喜A在x日的xx挑战中达成xx的目标，荣登排行榜第x名！");

        dataList.add(dataMap01);
        dataList.add(dataMap02);
        resultMap.put("data",dataList);
        System.out.println(JSON.toJSONString(resultMap));

    }


}
