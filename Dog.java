package ru.geekbrains.lesson6;

public class Dog extends Animal{

    public Dog(String name, int RunRange, int SwimRange){
        super(name, RunRange, SwimRange);
        this.RunRangeAnimal = 500;
        this.SwimRangeAnimal = 10;
    }

}
