package com.company;

/**
 * Created by justinsenkus on 8/23/15.
 */
public class Giraffe extends Animal {


    public Giraffe(int Age, String Name){
        super(Age, Name);
    }

    public void Lick(){
        System.out.println(String.format("%s is licking the wall.", Name ));
    }

    public void Speak(){
        super.Speak();
        System.out.println("Giraffes make their own noise");

    }



}
