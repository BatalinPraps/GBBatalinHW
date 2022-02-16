package ru.geekbrains1.lesson1;

public class team {

    public String name;
    public int jamp;
    public int swim;
    public int run;

    public team(String name, int jamp, int swim, int run){

    this.name = name;
    this.jamp = jamp;
    this.swim = swim;
    this.run = run;

    }

    public String getteaminfo(){
        return this.name;
    }
    public String getname(){
        return this.name;
    }
    public int getjamp(){
        return this.jamp;
    }
    public int getswim(){
        return this.swim;
    }
    public int getrun(){
        return this.run;
    }

    public void outresults(team[] team1, course course1){
        System.out.println("Результаты:");
        for (int i = 0; i < team1.length; i++) {
            if (course1.results[i] >= 1){
                System.out.println(team1[i].getname() + " прошёл полосу");
            }
            else {
                System.out.println(team1[i].getname() + " не прошёл полосу");
            }
        }
    }

}
