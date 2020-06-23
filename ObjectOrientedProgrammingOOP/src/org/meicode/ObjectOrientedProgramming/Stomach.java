package org.meicode.ObjectOrientedProgramming;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Stomach extends Organ{
    public boolean isHungry;
    Scanner userInput = new Scanner(System.in);

    public Stomach(String _organName, String _medicalCondition, boolean isHungry) {
        super(_organName, _medicalCondition);
        this.isHungry = isHungry;
    }

    public boolean getIsHungry()
    {return isHungry;}

    public void setIsHungry(boolean _hungry)
    {isHungry = _hungry;}


    @Override
    public void OrganDetails() {
        System.out.println("Medical Condition : " + this.medicalCondition);
        do {
            CheckIfHungry();

            if (this.getIsHungry()) {

                System.out.println("Enter 1 to feed : ");
                int _choice = userInput.nextInt();
                switch (_choice) {
                    case 1:
                        System.out.println("Patient has been fed ");
                        Digest();
                        this.setIsHungry(false);
                        break;

                    default:
                        System.out.println("Patient died");
                        this.setIsHungry(true);
                        break;
                }
            }

            else
                System.out.println("Patient is not hungry so mind your own business...");

        } while (getIsHungry());


    }

    public void CheckIfHungry()
    {
        System.out.println("Enter 1 if patient is hungry and 2 if not hungry : ");
        int _choice = userInput.nextInt();

        if(_choice == 1)
        {setIsHungry(true);}

        else if(_choice == 2)
        {setIsHungry(false);}

        else{
            System.out.println("Patient Died : what are you typing ?? -_-   ");
            CheckIfHungry();
        }
    }

    public void Digest()
    {
        System.out.println("Enter 1 to Digest : ");
        int _choice = userInput.nextInt();
        switch (_choice)
        {
            case 1:
                System.out.println("Digesting has began and now after a long time Patient digested his food ");
                break;

            default:
                System.out.println("what are you typing ?? Patient Died -_- ");
                OrganDetails();
                break;
        }
    }
}
