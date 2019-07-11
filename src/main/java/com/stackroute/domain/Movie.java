package com.stackroute.domain;

public class Movie {
     private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

/*  public Movie(Actor actor1, Actor actor2) {
        this.actor1 = actor1;
        this.actor2 = actor2;
    }*/

    public void printAboutMovieActor()
    {
        actor.printActor();

    }
}
