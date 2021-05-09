package com.company;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    float weightOfCar = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

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
        Car familyCar = new Car();
        familyCar.printVariables();
        System.out.println();
        Car aliceCar = familyCar;
        aliceCar.wreckCar();
        aliceCar.printVariables();
    }
}
