package ru.geekbrains.lesson1;

public class HomeWorkApp {

   public static void main (String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
   }

   public static void printThreeWords(){
       System.out.println("Orange");
       System.out.println("Banana");
       System.out.println("Apple");
   }
   public static void checkSumSign(){
       int a = 123;
       int b = -234;
       int c = a + b;
       if (c >= 0) {
           System.out.println("Сумма положительная");
       }
       else {
           System.out.println("Сумма отрицательная");
       }
   }
   public static void printColor(){
       int value = 42;
       if (value <= 0){
            System.out.println("Красный");
       }
       if (value > 0 && value <= 100){
           System.out.println("Жёлтый");
       }
       if (value > 100){
           System.out.println("Зелёный");
       }
   }
   public static void compareNumbers(){
       int a = 3;
       int b = 2;
       if (a >= b){
           System.out.println("a >= b");
       }
       else {
           System.out.println("a < b");
       }
   }
}
