package HW2_1;

public class Main {

    public static void main (String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] ann = new String[][] {
        {"1", "2", "3", "5"},
        {"2", "3", "2", "6"},
        {"6", "7", "5", "9"},
        {"5", "4", "3", "2"}
        };

        int[][] add = new int[4][4];

        partone(ann, add);

    }

    public static void partone (String[][] ann, int[][] add) throws MyArraySizeException, MyArrayDataException{
        if(add.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < ann.length; i++){
            if(add[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < ann.length; j++){
                try {
                    add[i][j] = Integer.parseInt(ann[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            System.out.print(ann[i][j]);
            System.out.print(" ");
            }
            System.out.println();
        }
    }

}
