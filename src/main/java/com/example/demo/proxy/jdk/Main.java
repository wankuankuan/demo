package com.example.demo.proxy.jdk;

import com.example.demo.proxy.CuiHuaNiu;
import com.example.demo.proxy.ILawSuit;
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
        ILawSuit proxy = (ILawSuit) ProxyFactory.getDnyProxy(new CuiHuaNiu());
        proxy.submit("工资流水在此");
        proxy.defend();
    }
}
