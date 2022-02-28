package com.example.demo.proxy.cgLib;

import com.example.demo.proxy.ProxyFactory;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class Main {
    public static void main(String[] args) {
        Frank cProxy = (Frank) ProxyFactory.getGcLibDynProxy(new Frank());
        cProxy.submit("工资流水在此");
        cProxy.defend();
    }
}
