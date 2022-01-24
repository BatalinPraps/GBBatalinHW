package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {

    public static void main (String[] args){

        //Stage1();
        //Stage2();
        //Stage3();
        //Stage4();
        //String StringStage5 = Arrays.toString(Stage5(5,5));
        //System.out.print(StringStage5);
    }

    public static void Stage1 (){
        Scanner scanner = new Scanner(System.in);
       int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++){
        System.out.print("Введите число > ");
       arr[i] = scanner.nextInt();
    }
    System.out.println("Заданный массив " + Arrays.toString(arr));
    scanner.close();

    for (int i = 0; i < 10; i++){
        if (arr[i] == 0){
            arr[i] = 1;
        }
        else {
            arr[i] = 0;
        }
    }
        System.out.println("Преобразованный массив " + Arrays.toString(arr));
    }
    public static void Stage2 (){
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void Stage3 (){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
               arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Stage4(){
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                   arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] Stage5(int len, int initialValue){
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
