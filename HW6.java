package ru.geekbrains.lesson6;

public class HW6 {

    public static void main(String[] args){

        Cat cat1 = new Cat("Борис",200,10);
        Dog dog1 = new Dog("Бобик", 500,10);
        cat1.Run();
        cat1.Swim();
        dog1.Run();
        dog1.Swim();
    }
}
