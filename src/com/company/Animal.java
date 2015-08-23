package com.company;

/**
 * Created by justinsenkus on 8/23/15.
 */
public class Animal {

    public int Age;
    public String Name;


    public Animal(int Age, String Name){
        this.Age = Age;
        this.Name = Name;
    }

    public void Speak(){

        System.out.println("Hello");

    }

    public void Info(){

        System.out.println(String.format("This animal is %d years old and is named %s", Age, Name));

    }

}
