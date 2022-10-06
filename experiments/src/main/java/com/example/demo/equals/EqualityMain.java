package com.example.demo.equals;

public class EqualityMain {
    public static void main(String args[]){
        Employee e1=new Employee(1,"abhishek");
        Employee e2=new Employee(1,"abhishek");
        boolean identity=e1==e2;
        boolean equals=e1.equals(e2);
        System.out.println("identity="+identity);
        System.out.println("equality="+equals);
    }
}
