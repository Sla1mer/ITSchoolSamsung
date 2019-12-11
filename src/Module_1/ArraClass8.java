package Module_1;

import java.util.Random;
import java.util.Scanner;

public class ArraClass8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mas = new int[in.nextInt()];
        Random rnd = new Random();
        int s = 0;
        for (int i = 0; i<mas.length; i++){
            mas[i] = rnd.nextInt(25)-13;
            System.out.println(mas[i] + " ");
            s += mas[i];
        }
        System.out.println(s);
    }
}
