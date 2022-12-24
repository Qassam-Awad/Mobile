package com.example.carrent.model;

public class Accounts {
    String name , passowrd;

    public static final Accounts exam = new Accounts("Username","Password");

    public Accounts(String name, String passowrd) {
        this.name = name;
        this.passowrd = passowrd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
    public boolean logIn(String name , String passowrd){

        if (!name.equals(exam.name) || !passowrd.equals(exam.passowrd))
            return false;
        return true;

    }
}
