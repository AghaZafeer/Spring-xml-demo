package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printActor()
    {
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}
