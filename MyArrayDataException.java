package HW2_1;

public class MyArrayDataException extends Exception{
    public int i;
    public int j;


    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public String getMessage(){
        return "Не корректные данные в массиве: x=" + i + " y=" + j;
    }
}
