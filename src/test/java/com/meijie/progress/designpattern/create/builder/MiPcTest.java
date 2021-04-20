package com.meijie.progress.designpattern.create.builder;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MiPcTest {

    @Test
    public void test () {
        MiPc miPc = new MiPc.Builder().setKeyboard("小米键盘").setMouse("小米鼠标").setMonitor("三星显示器").builder();
        System.out.println(miPc);
    }
}