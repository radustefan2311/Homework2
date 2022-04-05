package com.factory;

public class Superman implements Superhero {

    @Override
    public void presentation(){
        System.out.println("Superman aka The Man of Steel is the superhero of Metropolis City.");
    }

    @Override
    public void saveme(){
        System.out.println("Superman's heatwave stopped the villain and saved the person.");
    }

}
