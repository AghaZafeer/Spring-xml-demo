package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;


    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printActor()
    {
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}
