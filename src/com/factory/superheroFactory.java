package com.factory;

public class superheroFactory {

    public Superhero getsuperhero(String superheroName){
        if(superheroName == null){
            return null;
        }
        if(superheroName.equalsIgnoreCase("BATMAN")){
            return new Batman();}
        else if(superheroName.equalsIgnoreCase("SUPERMAN")){
            return new Superman();}
        else if(superheroName.equalsIgnoreCase("SPIDERMAN")){
                return new Spiderman();}
        else {throw new IllegalArgumentException("Unknown Superhero " + superheroName);}
        }

    }

