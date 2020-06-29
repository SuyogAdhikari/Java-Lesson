package org.Suyog.challenge2;

import java.util.*;

public class Contacts {

    private String name;
    private String number;
    private String email;

    private ArrayList<Message> message;

    public Contacts(String name, String number, String email, ArrayList<Message> message) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.message = message;
    }


    public Contacts(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.message = new ArrayList<>();
    }


    public void getDetails()
    {
        System.out.println("\n*****************************************");
        System.out.println("Name : " + this.name +
                           "\nNumber : " + this.number +
                           "\nEmail : " + this.email );
        System.out.println("*****************************************\n");
    }






















    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Message> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<Message> message) {
        this.message = message;
    }
}
