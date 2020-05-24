package com.atsh.java;

/**
 * @author baijunguang
 * @date 2020/5/24-13:05
 */
public class Controller {
    public static void main(String[] args) {
        System.out.println("July is coming!!!");
        System.out.println("July is coming!!!,so hot ShangHai it is...");
        System.out.println(add(3,5));
    }
    //增加求和方法
    public static int add (int a,int b){
        return a+b;
    }
    //增加求差方法
    public static int minus (int a,int b){
        return a-b;
    }
    //增加求乘积方法
    public static int product (int a,int b){
        return a*b;
    }
}
