package com.karynboyd.week3assignment;

public class Mouse extends Animal {
    public Mouse() {}

    public Mouse(String name, String speech)
    {
        super(name, speech);
    }

    public static void chew(String name, String food)
    {
        food = "cheese";
        System.out.println(name + " is chewing on " + food + ". ");
    }

}
