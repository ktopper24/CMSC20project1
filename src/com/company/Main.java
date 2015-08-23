package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal x = new Animal(12, "Henry");

        x.Speak();
        x.Info();

        Giraffe g = new Giraffe(8, "Gregory");

        g.Speak();
        g.Info();
        g.Lick();

    }
}
