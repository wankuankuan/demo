package com.example.demo.designpatterns.build;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class LenovoComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        this.computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
