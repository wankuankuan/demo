package com.example.demo.proxy;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class Main {
    public static void main(String[] args) {
        ILawSuit proxy = ProxyFactory.getProxy();
        proxy.submit("工资流水在此");
        proxy.defend();
    }
}
