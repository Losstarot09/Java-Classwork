package com.rcs.Classwork.Day19;

import com.rcs.Classwork.Day19.Classes.Animal;
import com.rcs.Classwork.Day19.Classes.Dog;

public class OOPMain {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        animal1.saySomething();
        Dog rex = new Dog("Dark-Brown", "German Shepard", "Rex");
        rex.saySomething();
    }
}
