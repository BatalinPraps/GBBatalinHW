package HW2_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args){
        ArrayList<String> animalsresult = new ArrayList<>();
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Собака");
        animals.add("Кошка");
        animals.add("Рыбка");
        animals.add("Крыска");
        animals.add("Собака");
        animals.add("Кошка");
        animals.add("Корова");
        animals.add("Мышь");
        animals.add("Крыска");
        animals.add("Попугай");

    Unique(animals);
    Score(animals, animalsresult);
    //phonebook.setPhone(8800, "Александр");
    //phonebook.getPhone("Александр");
    }

    public static void Unique(ArrayList<String>  animals){
        int one = 0;
        System.out.println("Уникальные слова: ");
        for (int i=0; i<animals.size(); i++){
            for (int j=0; j< animals.size(); j++){
               if (animals.get(i) == animals.get(j) && i != j){
                   one +=1;
               }
            }
            if (one == 0) {
                System.out.println(animals.get(i));
            }
            one = 0;
        }
    }

    public static void Score(ArrayList<String>  animals, ArrayList<String> animalsresult){
        int score = 0;
        System.out.println("Количество слов: ");
        for (int i=0; i<animals.size(); i++){
            for (int j=0; j< animals.size(); j++){
                if(animals.get(i) == animals.get(j)) {
                    score += 1;
                }
                if(animals.get(i) == animals.get(j) && i != j) {
                    animals.remove(j);
                }
            }
            System.out.println(animals.get(i) + " " + score);
            score = 0;
        }
    }

}
