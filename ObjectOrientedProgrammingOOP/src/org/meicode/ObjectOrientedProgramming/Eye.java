package org.meicode.ObjectOrientedProgramming;

import java.util.Scanner;

public class Eye extends Organ {
    public String color;
    public boolean isOpened;
    public Eye(String _organName, String _medicalCondition, String _color, boolean _isOpened)
    {
        super(_organName, _medicalCondition);
        this.color = _color;
        this.isOpened = _isOpened;
    }

    public String getColor()
    {return color;}

    public void setColor(String _color)
    {this.color = _color;}

    public boolean getIsOpened()
    {return isOpened;}

    public void setIsOpened(boolean _isOpened)
    {this.isOpened = _isOpened;}

    @Override
    public void OrganDetails()
    {
        System.out.println(this.getOrganName() + " has " + this.getColor() + " Color");
    }
}
