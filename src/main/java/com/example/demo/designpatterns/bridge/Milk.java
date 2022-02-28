package com.example.demo.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class Milk implements ICoffeeAdditives{
    @Override
    public void addSomething() {
        System.out.println("加奶");
    }
}
