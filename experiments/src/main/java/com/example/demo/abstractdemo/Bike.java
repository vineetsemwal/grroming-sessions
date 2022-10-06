package com.example.demo.abstractdemo;

public class Bike extends Vehicle{
    @Override
    protected void move() {
        System.out.println("moves like a bike");
    }
}
