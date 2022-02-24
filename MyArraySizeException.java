package HW2_1;

public class MyArraySizeException extends Exception{
    public String getMessage(){
       return "Принимаемый массив не равен 4x4";
    }
}
