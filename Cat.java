package ru.geekbrains.lesson6;

public class Cat extends Animal {

    public Cat(String name, int RunRange, int SwimRange){
        super(name, RunRange, SwimRange);
        this.RunRangeAnimal = 200;
    }
    public void Swim(){
        System.out.println("Кот " + name + " не умеет плавать");
    }
}
