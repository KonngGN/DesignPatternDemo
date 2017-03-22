package com.example.apple.designpatterndemo.builder;

/**
 * 作者：孔先生 on 2017/3/22 14:53
 * 邮箱：197726885@qq.com
 * 说明：
 */
public class MoonBuilde implements Builde {
    private Computer mComputer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        mComputer.setmCpu(cpu);
    }

    @Override
    public void buildZhuban(String zhuban) {
        mComputer.setmZhuBan(zhuban);
    }

    @Override
    public void buildRam(String ram) {
        mComputer.setmRam(ram);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
