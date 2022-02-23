package ru.geekbrains1.lesson1;

public class course {

    public int distancejamp;
    public int distanceswim;
    public int distancerun;
    public int[] results = new int[3];

    public course (int distancejamp, int distanceswim, int distancerun) {

    this.distancejamp = distancejamp;
    this.distanceswim = distanceswim;
    this.distancerun = distancerun;

    }

    public void checkcourse(){
        System.out.println("Полоса препятствий");
        System.out.println("Прыжок " + distancejamp + " Плаванье " + distanceswim + " Бег " + distancerun);
    }

    public int[] runcource(team[] team1){
        for (int i=0; i < team1.length; i++) {
            if (team1[i].getjamp() >= distancejamp && team1[i].getswim() >= distanceswim && team1[i].getrun() >= distancerun){
            results[i] = 1;
          }

            else {
            results[i] = 0;
            }
        }


        return results;
    }


}
