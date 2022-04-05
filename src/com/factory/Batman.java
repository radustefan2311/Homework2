package com.factory;

public class Batman implements Superhero {

    @Override
    public void presentation(){
        System.out.println("Batman aka The Dark Knight is the superhero of Gotham City.");
    }

    @Override
    public void saveme(){
        System.out.println("Batman threw a batarang and saved the person.");
    }

}
