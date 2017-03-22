package com.example.apple.designpatterndemo.oberver;

/**
 * 具体观察者（ConcrereObserver）
 */
public class WeixinUser implements Observer {
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }


}