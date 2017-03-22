package com.example.apple.designpatterndemo.builder;

/**
 * 作者：孔先生 on 2017/3/22 14:55
 * 邮箱：197726885@qq.com
 * 说明：建造者模式 原文http://blog.csdn.net/itachi85/article/details/50644745
 * <p>
 * Dirextor: ComputerBuilder指挥者类，用于统一组装流程
 * Builder：抽象Builder类，规范产品的组建，一般是由子类实现。
 * ConcreteBulider: ComputerBuilder抽象Builder类的实现类，实现抽象Builder类定义的所有方法，并且返回一个组建好的对象
 * Product: Computer产品类
 * <p>
 * 使用场景
 * <p>
 * 当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
 * 相同的方法，不同的执行顺序，产生不同的事件结果时。
 * 多个部件或零件,都可以装配到一个对象中，但是产生的运行结果又不相同时。
 * 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能。
 * 创建一些复杂的对象时，这些对象的内部组成构件间的建造顺序是稳定的，但是对象的内部组成构件面临着复杂的变化。
 * 优缺点
 * <p>
 * 优点：
 * <p>
 * 使用建造者模式可以使客户端不必知道产品内部组成的细节。
 * 具体的建造者类之间是相互独立的，容易扩展。
 * 由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任何影响。
 * 缺点：
 * <p>
 * 产生多余的Build对象以及Dirextor类。
 */
public class Main {
    public static void main(String[] ages) {
        MoonBuilde moonBuilde = new MoonBuilde();
        ComputerBuilder computerBuilder = new ComputerBuilder(moonBuilde);
        computerBuilder.createComputer("CPU", "ZHUBAN", "RAM");
    }
}
