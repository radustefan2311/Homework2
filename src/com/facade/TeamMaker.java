package com.facade;

public class TeamMaker {
    private FootballTeam jucator;
    private FootballTeam antrenor;
    private FootballTeam finantator;

    public TeamMaker() {
        jucator = new Jucator();
        antrenor = new Antrenor();
        finantator = new Finantator();
    }

    public void descJucator(){
        jucator.description();
    }
    public void descAntrenor(){
        antrenor.description();
    }
    public void descFinantator(){
        finantator.description();
    }
}