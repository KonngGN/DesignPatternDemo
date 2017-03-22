package com.example.apple.designpatterndemo.factorymethod;


/**
 * 作者：孔先生 on 2017/3/22 15:43
 * 邮箱：197726885@qq.com
 * 说明：
 */
public interface ComputerFactory {
    public abstract <T extends Computer> T Compay(Class<T> clz);
}
