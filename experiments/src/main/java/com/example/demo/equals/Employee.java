package com.example.demo.equals;

public class Employee {

    private int id;
    private String name;

    public Employee(int id,  String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
           return true;
        }
        if(obj==null  || !(obj instanceof Employee)){
            return false;
        }
        Employee that=(Employee) obj;
        return this.id==that.id;

    }
}
