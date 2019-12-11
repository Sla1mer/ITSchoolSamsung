package Module_1;

import java.util.Random;
import java.util.Scanner;

public class ArrayClass7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Random rnd = new Random();
        for(int i = 0; i<array.length; i++){
            array[i] = rnd.nextInt(21)-10;
            System.out.print(array[i] + " ");
            if(array[i]>=max) max = array[i];
            if(array[i] > min) min = array[i];
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
