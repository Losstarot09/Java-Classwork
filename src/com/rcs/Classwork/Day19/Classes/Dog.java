package com.rcs.Classwork.Day19.Classes;

public class Dog extends Animal{
    public String breed;
    public String name;

    public Dog (String breed){
        super();
        this.breed = breed;
        this.name = "unknown";
    }

    public Dog (String color, String breed, String name){
        super(color);
        this.breed = breed;
        this.name = name;
    }

    public void saySomething(){
        System.out.println("Woof, Woof");
    }
}
