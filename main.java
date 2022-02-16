package ru.geekbrains1.lesson1;

import java.util.Arrays;



public class main {

    public static void main (String[] args) {

        course course1 = new course(5,25,50);
        team[] team1 = {new team("Александр", 6, 25, 100),
                        new team("Алексей", 6,25,50),
                        new team("Андрей", 4,26,50)};

        course1.checkcourse();
        checkteam(team1);
        course1.runcource(team1);
        team1[0].outresults(team1, course1);
        //System.out.println(Arrays.toString(course1.results));
    }

    public static void checkteam(team[] team1){
        System.out.println("Состав команды:");
        for (int i = 0; i < team1.length; i++){
            System.out.println("№" + (i + 1) + " " + team1[i].getteaminfo());
        }
    }

}
