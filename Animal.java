package ru.geekbrains.lesson6;

public class Animal {

    public String name;
    public int RunRange;
    public int SwimRange;
    public int RunRangeAnimal;
    public int SwimRangeAnimal;

    public Animal(String name, int RunRange, int SwimRange){
        this.name = name;
        this.RunRange = RunRange;
        this.SwimRange = SwimRange;
    }

    public void Run(){
        if (RunRange <= RunRangeAnimal){
            System.out.println(name + " пробежал " + RunRange);
        }
        else {
            System.out.println(name + " не пробежал " + RunRange);
        }
    }

    public void Swim(){
        if (SwimRange <= SwimRangeAnimal){
            System.out.println(name + " проплыл " + SwimRange);
        }
        else {
            System.out.println(name + " не проплыл " + SwimRange);
        }
    }

}
