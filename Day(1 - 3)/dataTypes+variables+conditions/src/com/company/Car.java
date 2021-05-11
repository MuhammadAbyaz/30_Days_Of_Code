package com.company;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weightOfCar = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeople = 1;

    public Car(int customMinSpeed, double customWeight, boolean customIsCarOn) {
        minSpeed = customMinSpeed;
        weightOfCar = customWeight;
        isTheCarOn = customIsCarOn;
    }


    public void printVariables(){
        System.out.println("Cars's max Speed: " + maxSpeed);
        System.out.println("Cars's min Speed: " + minSpeed);
        System.out.println("Cars's Weight: " + weightOfCar);
        System.out.println("Is car on: " + isTheCarOn);
        System.out.println("Cars's condition: " + condition);
        System.out.println("Name of Car: " + nameOfCar);
        System.out.println("Number of people in Car:" + numberOfPeople);
    }
    public void wreckCar(){
        condition  = 'C';
    }
    public void getIn() {
        numberOfPeople++;
    }
    public void getOut() {
        if (numberOfPeople > 0){
            numberOfPeople--;
        }
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    public double maxMilesPerFillUp(){
        return maxFuel*mpg;
    }
    public void turnedTheCarOn(){
        if (isTheCarOn == false){
            isTheCarOn = true;
        }
    }

    public static void main(String[] args) {
        Car birthdayPresent = new Car(10, 20455,true);
        System.out.println("Birthday Car V1");
        birthdayPresent.printVariables();
        System.out.println("Birthday Car V2");
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles:" + birthdayPresent.maxMilesPerFillUp());
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        System.out.println("Birthday Car V3");
        birthdayPresent.printVariables();
//        Car christmasPresent = new Car(500, 50000.23, false);
//        System.out.println("Christmas Car");
//        christmasPresent.printVariables();
    }
}
