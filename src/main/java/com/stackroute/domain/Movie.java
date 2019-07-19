package com.stackroute.domain;

public class Movie {
     //Actor object as an attribute of Movie class
     Actor actor;

    public void setActor(Actor actor) {//Setting an actor object
        this.actor = actor;
    }

    public void printAboutMovieActor()
    {
        actor.printActor();//Printing Actor description
    }
}
