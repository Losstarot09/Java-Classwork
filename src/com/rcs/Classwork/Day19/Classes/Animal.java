package com.rcs.Classwork.Day19.Classes;

public class Animal {
    public String color;

    public Animal(){
        this.color = "unknown";
    }

    public Animal(String color){
        this.color = color;
    }

    public  void saySomething(){
        System.out.println("Animal said something...");
    }
}
