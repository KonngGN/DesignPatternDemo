package com.example.apple.designpatterndemo.factorymethod;

/**
 * 作者：孔先生 on 2017/3/22 15:27
 * 邮箱：197726885@qq.com
 * 说明：
 */
public class AuseComputer implements Computer {
    @Override
    public void start() {
        System.out.println("启动华硕电脑");
    }
}
