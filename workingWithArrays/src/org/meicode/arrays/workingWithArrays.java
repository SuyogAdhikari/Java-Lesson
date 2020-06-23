package org.meicode.arrays;
import java.io.*;



import java.util.Scanner;

public class workingWithArrays {


    public static void main(String[] args) {
//      A simple program to create 2 arrays with name and phone number and search the number by name
//        TODO :
//         1. Manxe haru ko name ani number ko xuttai array banaune
//         2. harek manxe ko index sanga number match garne
//         3. loop lagaera manxe ko naam ko index le number search garne


        String[] names = {"Scrog", "Samson", "Yolanda", "Shoshanna"};
        String[] number = { "9860073428", "9823717753", "9841787212", "9841468690"};

        System.out.println("Please Enter the user's Name : ");
        Scanner userInput = new Scanner(System.in);
        String inputName = userInput.next();

        for(int i=0; i < names.length; i++)
        {
            if(inputName.toLowerCase() .equals(names[i].toLowerCase()))
            {
                System.out.println(names[i] + " : " + number[i]);
            }
        }
    }

}
