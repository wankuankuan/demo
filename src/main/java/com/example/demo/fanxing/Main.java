package com.example.demo.fanxing;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class Main {
    public static void main(String[] args) {
        Type superType = (AppleContainer.class.getGenericSuperclass());
        System.out.println(superType);

        if (superType instanceof ParameterizedType) {
            ParameterizedType paramType = (ParameterizedType) superType;
            System.out.println(Arrays.toString(paramType.getActualTypeArguments()));
        }
    }
}
