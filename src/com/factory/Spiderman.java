package com.factory;

public class Spiderman implements Superhero {

    @Override
    public void presentation(){
        System.out.println("Spiderman aka The Wall Crawler is the superhero of New-York City.");
    }

    @Override
    public void saveme(){
        System.out.println("Spiderman webbed up the villain and saved the person.");
    }
}
