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
    private static int id = 0;

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
                manageMessages();
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
        int _choice = scanner.nextInt();

        switch (_choice) {
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


    //Contacts Manager Section here..... all the function for contacts are written here
    public static void showAllContacts()
    {

        if(contacts.size()>0)
        {
            System.out.println("Need to have some people here right ??? ");
        }else{
            System.out.println("List of all Contacts are : ");
            for (Contacts _c : contacts) {
                _c.getDetails();
            }
        }
        showInitialOptions();
    }


    public static void addNewContact()
    {
        System.out.println("Adding a new contact : " +
                            "\nPlease Enter a Name : ");
        String _name = scanner.next();

        System.out.println("Please Enter Phone Number : ");
        String _number = scanner.next();

        System.out.println("Please Enter Email : ");
        String _email = scanner.next();

        if(_name == ""|| _number == "" || _email == "")
        {
            System.out.println("Invalid Input given please try again ");
            addNewContact();
        }else{
            boolean _doesExist = false ;
            int _index = 0 ;

            for(Contacts _c: contacts)
            {
                if(_c.getName().toLowerCase().equals(_name.toLowerCase()) && _c.getNumber().equals(_number) && _c.getEmail().toLowerCase().equals(_email.toLowerCase())) {
                    _doesExist = true;
                    _index = contacts.indexOf(_c);
                }
            }

            if(_doesExist)
            {
                System.out.println("Give Contact already exist : ");
                for (Contacts _c : contacts)
                {
                    if (_c.getName().toLowerCase().equals(_name.toLowerCase()))
                    {
                        System.out.println("Contact Information ");
                        _c.getDetails();
                    }
                    showInitialOptions();
                }
            }

            if(!_doesExist) {
                Contacts contact = new Contacts(_name, _number, _email);
                contacts.add(contact);

                System.out.println("Contact" + _name.toUpperCase() + "added successfully...");
            }
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
            for (Contacts _c : contacts)
            {
                if (_c.getName().toLowerCase().equals(name.toLowerCase()))
                {
                    doesExist = true;
                    System.out.println("Contact Information ");
                    _c.getDetails();
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
        System.out.println("Delete a Contact : ");
        System.out.println("--------------------------");

        System.out.println("Please enter contact name to be deleted " );
        String name = scanner.next();

        if(name == "")
        {
            System.out.println("Please Enter a valid Name : ");
            deleteContact();
        }else{
            boolean _doesExist = false;
            int _index = 0;
            for (Contacts _c : contacts) {
                if (_c.getName().toLowerCase().equals(name.toLowerCase())) {
                    _doesExist = true;
                    System.out.println("Deleting the following Contact information :");
                    _c.getDetails();
                    System.out.println("------------------------------------------------");
                    _index = contacts.indexOf(_c);
                }
            }

            if(_doesExist){
                contacts.remove(_index);
                System.out.println("Contact " + name.toUpperCase() + " has been removed");
                manageContacts();
            }

            if(!_doesExist) {
                System.out.println("No contact of name " + name.toUpperCase() + " found");
                deleteContact();
            }
        }
    }


    //Messages Management Section Here... all functions for message are written below :

    public static void manageMessages(){
        System.out.println("\n\nPlease Select you preferred desire :\n" +
                           "\t1. Show all Messages\n" +
                           "\t2. Send a new Message\n" +
                           "\t3. Back\n");
        int _choice = scanner.nextInt();

        switch(_choice)
        {
            case 1:
                seeAllMessages();
                break;

            case 2:
                sendNewMessage();
                break;

            case 3 :
                showInitialOptions();
                break;

            default:
                System.out.println("Invalid Input Given try again : ");
                manageMessages();
        }
    }

    public static void seeAllMessages()
    {
        ArrayList<Message> _allMessages = new ArrayList<>();
        for(Contacts c: contacts)
        {
            _allMessages.addAll(c.getMessage());
        }

        if(_allMessages.size() > 0)
        {
            for(Message m: _allMessages)
            {
                m.getDetails();
                showInitialOptions();
            }
        }else{
            System.out.println("Message box is empty you isolated lonely boiii ");
            showInitialOptions();
        }
    }

    public static void sendNewMessage()
    {
        System.out.println("\n\nCreate a New Message : ");
        System.out.println("Please Enter Receiver's Name : ");
        String _name = scanner.next();

        if(_name.equals(""))
        {
            System.out.println("Cannot send message to Voldemort... please enter another number ");
        }else{
            boolean _doesExist = false;
            for(Contacts c: contacts)
            {
                if(c.getName().toLowerCase().equals(_name.toLowerCase())){
                    _doesExist = true;
                }
            }
            if(_doesExist){
                System.out.println("Enter you dope message to the receiver : ");
                String _message = scanner.next();

                if(_message.equals(""))
                {
                    System.out.println("No messages written here boii... type something :/ ");
                    sendNewMessage();
                }else{
                    id++;
                    Message message = new Message(_message, _name, id);
                    for(Contacts c: contacts)
                    {
                        if(c.getName().toLowerCase().equals(_name.toLowerCase()))
                        {
                            ArrayList<Message> messages = c.getMessage();
                            messages.add(message);
                            c.setMessage(messages);
                        }
                    }
                    System.out.println("----------- * Message Sent *-----------");
                }
            }else{
                System.out.println("No such Contacts found : Add a new contact or recheck your contact data : ");
                manageMessages();
            }
        }
        showInitialOptions();
    }
}

