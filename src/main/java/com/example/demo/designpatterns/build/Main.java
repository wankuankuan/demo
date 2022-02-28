package com.example.demo.designpatterns.build;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();//1
        ComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125");//2
        director.makeComputer(builder);//3
        Computer macComputer = builder.getComputer();//4
        System.out.println("mac computer:" + macComputer.toString());

        ComputerBuilder lenovoBuilder = new LenovoComputerBuilder("I7处理器", "海力士222");
        director.makeComputer(lenovoBuilder);
        Computer lenovoComputer = lenovoBuilder.getComputer();
        System.out.println("lenovo computer:" + lenovoComputer.toString());
    }
}
