package com.stackroute.domain;

public class Actor {
    //Actor fields
    private String name;
    private String gender;
    private int age;


    public void setName(String name) {//Setter for name
        this.name = name;
    }

    public void setGender(String gender) {//Setter for gender
        this.gender = gender;
    }

    public void setAge(int age) {//Setter for age
        this.age = age;
    }

    public void printActor()
    {   //Printing Actor description
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}
