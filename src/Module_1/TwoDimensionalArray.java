package Module_1;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random rnd = new Random();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                array[i][j] = rnd.nextInt(11)-5;
                System.out.print(array[i][j] + " ");
                if (array[i][j]<min){
                    min = array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(min);
        min = Integer.MAX_VALUE;
        for (int i = 0; i < array[i].length; i++){
            for (int j = 0; j < array.length; j++){
                if(array[i][j]%2 == 0){
                    array[i][j] *= 2;
                }else {
                    array[i][j] *= 3;
                }if (array[i][j]<min){
                    min = array[i][j];
                }
                System.out.println(array[i][j] + " ");
            }
        }
        System.out.println(min);
    }
}
