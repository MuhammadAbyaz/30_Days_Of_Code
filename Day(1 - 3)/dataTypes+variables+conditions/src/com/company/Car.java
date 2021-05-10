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
    }
    public void wreckCar(){
        condition  = 'C';
    }

    public static void main(String[] args) {
        Car birthdayPresent = new Car(10, 20455,true);
        System.out.println("Birthday Car");
        birthdayPresent.printVariables();
        Car christmasPresent = new Car(500, 50000.23, false);
        System.out.println("Christmas Car");
        christmasPresent.printVariables();
    }
}
