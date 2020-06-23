package org.meicode.ObjectOrientedProgramming;

import java.util.Scanner;



public class Main{

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        boolean doQuery = true;
         Patient patient = new Patient(
                                        "Suyog Adhikari",
                                        21,
                                        new Eye("Left Eye", "Far Sighted", "pink", false),
                                        new Eye("Right Eye", "Eye Missing", "black", false),
                                        new Heart("Heart", "Cold Hearted", 120),
                                        new Stomach("Stomach", "Diarrahoea",true ),
                                        new Skin("Skin", "Tanned", "Red", 200)
                                    );
        do{
            System.out.println("Patient Name : " + patient.getPatientName());
            System.out.println("Patient Age : " + patient.getPatientAge());
            System.out.println("-----------------------------------------------");
            System.out.println("\n\n\n Choose an organ to check");
            System.out.println(" 1. Left Eye \n 2. Right Eye \n 3. Heart \n 4. Stomach \n 5. Skin \n 6. Exit ");
            int _choice = userInput.nextInt();

            switch(_choice)
            {
                case 1 :
                    patient.getLeftEye().OrganDetails();
                    if(patient.leftEye.getIsOpened())
                    {
                        System.out.println("Enter 1 to close the eye : ");
                        if(userInput.nextInt() == 1)
                        {
                            patient.leftEye.setIsOpened(false);
                            System.out.println("Left Eye is closed");
                        }else{
                            continue;
                        }
                    }

                    else
                    {
                        System.out.println("Enter 1 to open the eye : ");
                        if(userInput.nextInt() == 1)
                        {
                            patient.leftEye.setIsOpened(true);
                            System.out.println("Left Eye is opened");
                        }else{
                            continue;
                        }
                    }
                    break;

                case 2 :
                    patient.getRightEye().OrganDetails();
                    if(patient.rightEye.getIsOpened())
                    {
                        System.out.println("Enter 1 to close the eye : ");
                        if(userInput.nextInt() == 1)
                        {
                            patient.rightEye.setIsOpened(false);
                            System.out.println("Right Eye is closed");
                        }else{
                            continue;
                        }
                    }

                    else
                    {
                        System.out.println("Enter 1 to open the eye : ");
                        if(userInput.nextInt() == 1)
                        {
                            patient.rightEye.setIsOpened(true);
                            System.out.println("Right Eye is opened");
                        }else{
                            continue;
                        }
                    }
                    break;


                case 3:
                    patient.getHeart().OrganDetails();
                    System.out.println("Press 1 to enter heart rate : ");
                    if(userInput.nextInt() == 1)
                        patient.getHeart().ChangeHeartRate();
                    else
                        continue;
                    break;

                case 4:
                    patient.getStomach().OrganDetails();
                    break;

                case 5 :
                    patient.getSkin().OrganDetails();
                    break;

                default :
                    System.out.println("\n\n\n Application crashed BOOMMM ");
                    doQuery = false;

            }

        }while(doQuery);

    }
}
