package com.example.apple.designpatterndemo.builder;

/**
 * 作者：孔先生 on 2017/3/22 14:57
 * 邮箱：197726885@qq.com
 * 说明：
 */
public class ComputerBuilder {
    private MoonBuilde moonBuilde;
    public ComputerBuilder(MoonBuilde moonBuilde) {
        this.moonBuilde = moonBuilde;
    }

    public Computer createComputer(String cpu,String zb,String ram) {
        moonBuilde.buildCpu(cpu);
        moonBuilde.buildZhuban(zb);
        moonBuilde.buildRam(ram);
        return moonBuilde.create();
    }
}
