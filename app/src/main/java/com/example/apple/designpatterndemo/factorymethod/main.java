package com.example.apple.designpatterndemo.factorymethod;

/**
 * 作者：孔先生 on 2017/3/22 15:25
 * 邮箱：197726885@qq.com
 * 说明：工厂方法模式 原文http://blog.csdn.net/itachi85/article/details/52326959
 * 我们需要生产苹果电脑，并不需要去修改工厂类，直接创建产品就好了
 */
public class main {
    public static void main(String[] d) {
        new StartComputer().Compay(AuseComputer.class).start();
        new StartComputer().Compay(MacComputer.class).start();
        new StartComputer().Compay(LevoneComputer.class).start();
    }
}
