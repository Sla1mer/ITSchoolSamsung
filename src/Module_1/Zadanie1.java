package Module_1;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = new int[10];
        int n = in.nextInt();
        Random rnd = new Random();
        int last = -1;
        int count = 0;
        for (int i = 0; i<array1.length; i++){
            array1[i] = rnd.nextInt(15)-7;
            System.out.print(array1[i] + " ");
            if (array1[i] == n){
                last = i;
                if (array1[i] < n){
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(last);
        System.out.println(count);
    }
}
