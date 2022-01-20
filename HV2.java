package ru.geekbrains.lesson2;

public class HV2 {

    public static void main (String[] args) {

        //System.out.print(Stage1(10,10));
        //Stage2(-1000);
        //System.out.print (Stage3(0));
        //Stage4("Java",7);
    }

    public static boolean Stage1(int value1, int value2) {
        if ((value1 + value2) >= 10 && (value1 + value2) <=20){
          return true;
        }
        else return false;
    }
    public static void Stage2(int a){
        if (a >= 0){
    System.out.print("Число положительное");
        }
      else {
    System.out.print("Число отрицательное");
        }
    }
    public static boolean Stage3(int a){
        if (a >= 0){
            return true;
        }
        else return false;
    }
    public static void Stage4(String a, int b){
        for (int i=0; i < b; i++){
    System.out.println(a);
        }
    }
}
