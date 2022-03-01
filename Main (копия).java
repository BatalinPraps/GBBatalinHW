package HW2_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main (String[] args){

        String[] arr = {"1", "2"};
        ChArrayElement(arr, 0,1);
        System.out.println(Arrays.toString(arr));

        Box<Apple> appleBox = new Box<>(makeNewApples(10));
        Box<Orange> orangeBox = new Box<>(makeNewOranges(10));
        Box<Orange> secondOrangeBox = new Box<>(makeNewOranges(0));

        appleBox.compare(orangeBox);
        appleBox.compare(secondOrangeBox);
        orangeBox.transferTo(secondOrangeBox);
        appleBox.compare(orangeBox);
        appleBox.compare(secondOrangeBox);
    }

    public static ArrayList<Apple> makeNewApples(int count){
    ArrayList<Apple> fruits = new ArrayList<>();
    for (int i=0; i < count; i++){
        fruits.add(new Apple());
    }
    return fruits;
    }

    public static ArrayList<Orange> makeNewOranges(int count){
        ArrayList<Orange> fruits = new ArrayList<>();
        for (int i=0; i < count; i++){
            fruits.add(new Orange());
        }
        return fruits;
    }

    public static <T>void ChArrayElement(T[] arr, int firstarrel, int secondarrel){

        T arrElement = arr[firstarrel];
        arr[firstarrel] = arr[secondarrel];
        arr[secondarrel] = arrElement;

    }

}
