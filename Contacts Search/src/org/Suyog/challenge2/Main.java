package org.Suyog.challenge2;

/* TODO
    Simulate your phone's contact and messages applications
    1. greet the user
    2. show 3 options 1. Manage Contacts
                      2. Messages
                      3. Quit
    3. In case of selecting 1--> show these options :
        1. Show all Contacts
        2. Add a new Contact
        3. Search for existing contact
        4. Delete a contact
        5. Go back to the previous menu
    4. In case of selecting 2--> Show these options :
        1. See the list of all messages
        2. Send a new message
        3. Go back to the previous menu
    5. In case of selecting 3--> close the application
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contacts> contacts;
    private static Scanner scanner;

    public static void main(String[] args) {
        contacts = new ArrayList<>();
        System.out.println("\nWelcome to some weird static contacts application\n");
        showInitialOptions();
    }

    private static void showInitialOptions() {
        System.out.println("\n\nPlease select your preferred options :"
                + "\n\t 1. Manage Contacts"
                + "\n\t 2. Messages"
                + "\n\t 3. Quit");

        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                manageContacts();
                break;

            case 2:
                //manageMessages();
                System.out.println("Manage Message here");
                break;

            default:
                System.exit(0);
                break;

        }
    }

    private static void manageContacts() {
        System.out.println("\n\nPlease Select you preferred desire :\n" +
                "\t1. Show all Contacts\n" +
                "\t2. Add a new Contact\n" +
                "\t3. Search for existing contact\n" +
                "\t4. Delete a contact\n" +
                "\t5. Go back to the previous menu\n"
        );
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showAllContacts();
                break;

            case 2:
                addNewContact();
                break;

            case 3:
                searchForContact();
                break;

            case 4:
                deleteContact();
                break;

            default:
                showInitialOptions();
                break;
        }
    }

    public static void showAllContacts(){
        System.out.println("List of all Contacts are : ");
        for(Contacts c: contacts){
            c.getDetails();
        }
        showInitialOptions();
    }


    public static void addNewContact()
    {
        System.out.println("Adding a new contact : " +
                            "\nPlease Enter a Name : ");
        String name = scanner.next();

        System.out.println("Please Enter Phone Number : ");
        String number = scanner.next();

        System.out.println("Please Enter Email : ");
        String email = scanner.next();

        if(name == ""|| number == "" || email == "")
        {
            System.out.println("Invalid Input given please try again ");
            addNewContact();
        }else{
            Contacts contact = new Contacts(name, number, email);
            contacts.add(contact);

            System.out.println("Contact added successfully...");
        }
        showInitialOptions();
    }


    public static void searchForContact()
    {
        System.out.println("Search for a contact : ");
        System.out.println("----------------------------");

        System.out.println("Please Enter Contact Name : ");
        String name = scanner.next();

        if(name.equals(""))
        {
            System.out.println("no input given please try again...");
            searchForContact();
        }else
        {
            boolean doesExist = false;
            for (Contacts c : contacts)
            {
                if (c.getName().toLowerCase().equals(name.toLowerCase()))
                {
                    doesExist = true;
                    System.out.println("Contact Information ");
                    c.getDetails();
                }
            }

            if(!doesExist)
            {
                System.out.println("No contact of name " + name.toUpperCase() + " found");
                searchForContact();
            }
        }
        showInitialOptions();
    }

    public static void deleteContact()
    {
        boolean doesExist = false;
        System.out.println("Delete a Contact : ");
        System.out.println("--------------------------");

        System.out.println("Please enter contact name to be deleted " );
        String name = scanner.next();

        if(name == "")
        {
            System.out.println("Please Enter a valid Name : ");
            deleteContact();
        }

        for(Contacts c: contacts)
        {
            if(c.getName().toLowerCase().equals(name.toLowerCase()))
            {
                doesExist = true;
                System.out.println("Deleting the following Contact information :");
//                System.out.println("Contact Name  :" + c.getName() +
//                                   "\nContact Number : " + c.getNumber() +
//                                   "\n Contact Email : " + c.getEmail());

                c.getDetails();
                System.out.println("------------------------------------------------");
                contacts.remove(c);

                System.out.println("Contact " + name.toUpperCase() + " has been removed");
                break;
            }
            if(!doesExist)
            {
                System.out.println("No contact of name " + name.toUpperCase() + " found");
                deleteContact();
            }
        }
    }
}

