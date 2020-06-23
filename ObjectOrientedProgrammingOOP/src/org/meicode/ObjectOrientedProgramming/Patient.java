package org.meicode.ObjectOrientedProgramming;

import java.util.Scanner;

public class Patient {

    public Eye leftEye;
    public Eye rightEye;
    public Heart heart;
    public Stomach stomach;
    public Skin skin;

    public String patientName;
    public int patientAge;



    public Patient(String _patientName, int _patientAge, Eye _leftEye, Eye _rightEye, Heart _heart, Stomach _stomach, Skin _skin) {
        this.leftEye = _leftEye;
        this.rightEye = _rightEye;
        this.heart = _heart;
        this.stomach = _stomach;
        this.skin = _skin;
        this.patientName = _patientName;
        this.patientAge = _patientAge;

    }

    public void userInput()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Patient name : ");
            patientName = userInput.next();
        System.out.println("Enter Patient age : ");
            patientAge  = userInput.nextInt();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String _patientName) {
        this.patientName = _patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int _patientAge) {
        this.patientAge = _patientAge;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye _leftEye) {
        this.leftEye = _leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye _rightEye) {
        this.rightEye = _rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart _heart) {
        this.heart = _heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach _stomach) {
        this.stomach = _stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin _skin) {
        this.skin = _skin;
    }
}
