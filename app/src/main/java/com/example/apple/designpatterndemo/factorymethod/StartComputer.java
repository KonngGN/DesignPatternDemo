package com.example.apple.designpatterndemo.factorymethod;


/**
 * 作者：孔先生 on 2017/3/22 15:29
 * 邮箱：197726885@qq.com
 * 说明：
 */
public class StartComputer implements ComputerFactory {


    @Override
    public <T extends Computer> T Compay(Class<T> clz) {
        Computer computer = null;

        String name = clz.getName();
        try {
            computer = (Computer) Class.forName(name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
