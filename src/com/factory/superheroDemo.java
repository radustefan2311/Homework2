package com.factory;

public class superheroDemo {
    public static void main(String[] args) {
        superheroFactory superheroFactory = new superheroFactory();
        Superhero superhero1 = superheroFactory.getsuperhero("Batman");
        superhero1.saveme();
        superhero1.presentation();
        Superhero superhero2 = superheroFactory.getsuperhero("Superman");
        superhero2.saveme();
        superhero2.presentation();
        Superhero superhero3 = superheroFactory.getsuperhero("Spiderman");
        superhero3.saveme();
        superhero3.presentation();
//      Superhero superhero4 = superheroFactory.getsuperhero("Flash");

    }
}
