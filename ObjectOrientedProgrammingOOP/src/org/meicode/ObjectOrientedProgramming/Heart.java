package org.meicode.ObjectOrientedProgramming;

import java.util.Scanner;

public class Heart extends Organ{
    public int heartRate;

    public Heart(String _organName, String _medicalCondition, int _heartRate){
        super(_organName, _medicalCondition);
        this.heartRate = _heartRate;
    }

    public int getHeartRate()
    {return heartRate;}

    public void setHeartRate(int _heartRate)
    {this.heartRate = _heartRate;}

    @Override
    public void OrganDetails()
    {
        System.out.println("Heart Rate is : " + this.heartRate);
    }


    public void ChangeHeartRate()
    {
        System.out.println("Enter New Heart Rate : ");
        Scanner userInput = new Scanner(System.in);
        int newHeartRate = userInput.nextInt();
        setHeartRate(newHeartRate);
        System.out.println("Heart rate changed..... new Heart rate is  : " + newHeartRate);
    }
}
