package Module_1;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mas = new int[n][n];
        Random rnd = new Random();
        int s = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(7) - 3;
                if (i == j) {
                    s += mas[i][j];
                }
                System.out.print(mas[i][j]);
            }
            System.out.println((float) s / n);
            s = 0;
            for (int k = 0; k < mas.length; k++) {
                for (int j = 0; j < mas[k].length; j++) {
                    if (mas[k][j] < 0) mas[k][j] = Math.abs(mas[k][j]);
                    if (k == j) s += mas[k][j];
                    System.out.print(mas[i][j]);
                }
                System.out.println();
            }
            System.out.println((float) s / n);
        }
    }
}