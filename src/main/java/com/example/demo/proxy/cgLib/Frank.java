package com.example.demo.proxy.cgLib;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class Frank {
    public void submit(String proof) {
        System.out.println(String.format("老板欠薪跑路，证据如下：%s", proof));
    }

    public void defend() {
        System.out.println(String.format("铁证如山，%s还Frank血汗钱", "马旭"));
    }
}
