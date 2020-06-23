package org.meicode.ObjectOrientedProgramming;

public class Skin extends Organ {
    public String skinColor;
    public int softnessLevel;

    public Skin(String _organName, String _medicalCondition, String skinColor, int softnessLevel) {
        super(_organName, _medicalCondition);
        this.skinColor = skinColor;
        this.softnessLevel = softnessLevel;
    }

    public String getSkinColor()
    {return skinColor;}

    public void setSkinColor(String _skinColor)
    {this.skinColor = _skinColor;}

    public int getSoftnessLevel()
    {return softnessLevel;}

    public void setSoftnessLevel(int softnessLevel)
    {this.softnessLevel = softnessLevel;}

    @Override
    public void OrganDetails()
    {
        System.out.println("Medical condition : " + medicalCondition);
        System.out.println("Skin Color is : " + this.getSkinColor());
        System.out.println("Softness Level is : " + this.getSoftnessLevel());
    }
}
