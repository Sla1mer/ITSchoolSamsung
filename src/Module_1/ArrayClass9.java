package Module_1;

import java.util.Random;
import java.util.Scanner;

public class ArrayClass9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mas = new int[in.nextInt()];
        Random rnd = new Random();
        int s = 0;
        int p = 1;
        int k = 0;
        for (int i = 0; i<mas.length; i++){
            mas[i] = rnd.nextInt(46)-19;
            System.out.print(mas[i] + " ");
            if(i%2!=0){
                p *= mas[i];
            }
            if(mas[i] == 0){
                k++;
            }
        }
        System.out.println(s);
        System.out.println(p);
        System.out.println(k);
    }
}
