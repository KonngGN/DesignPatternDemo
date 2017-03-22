package com.example.apple.designpatterndemo.builder;

/**
 * 作者：孔先生 on 2017/3/22 14:51
 * 邮箱：197726885@qq.com
 * 说明：
 */
public interface Builde {
    public abstract void buildCpu(String cpu);
    public abstract void buildZhuban(String zhuban);
    public abstract void buildRam(String ram);

    public abstract Computer create();
}
