package com.stackroute.domain;

public class Movie {
     private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }


    public void printAboutMovieActor()
    {
        actor.printActor();
    }
}
