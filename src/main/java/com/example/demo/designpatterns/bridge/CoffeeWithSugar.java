package com.example.demo.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class CoffeeWithSugar implements ICoffee{
    @Override
    public void orderCoffee(int count) {
        System.out.println(String.format("加糖咖啡%d杯",count));
    }
}
