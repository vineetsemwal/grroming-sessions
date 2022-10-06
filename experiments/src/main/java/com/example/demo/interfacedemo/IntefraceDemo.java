package com.example.demo.interfacedemo;

public class IntefraceDemo {

    public static void main(String[] args) {
        ICalculator calculator = new SamsungCalculator();
        int result = calculator.add(5, 7);
        System.out.println("result=" + result);
    }

}
