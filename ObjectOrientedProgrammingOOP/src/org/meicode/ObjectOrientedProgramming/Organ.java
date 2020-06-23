package org.meicode.ObjectOrientedProgramming;

public class Organ {
    public String organName;
    public String medicalCondition;

    public Organ(String _organName, String _medicalCondition)
    {
        this.organName = _organName;
        this.medicalCondition = _medicalCondition;
    }

    public void setOrganName(String _organName)
    {this.organName = _organName;}

    public String getOrganName()
    {return organName;}


    public void setMedicalCondition(String _medicalCondition)
    {this.medicalCondition = _medicalCondition;}

    public String getMedicalCondition()
    {return medicalCondition;}

    public void OrganDetails()
    {
        System.out.println("Organ's Name is : " + this.organName);
        System.out.println("Medical Condition : " + this.medicalCondition);
    }
}
