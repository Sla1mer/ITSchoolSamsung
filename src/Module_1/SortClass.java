package Module_1;

import java.util.Random;
import java.util.Scanner;

public class SortClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        Random rnd = new Random();
        for (int i = 0; i<mas.length; i++){
            mas[i] = rnd.nextInt(20)+1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<mas.length-1;i++){
            for (int j = i+1; j<mas.length; j++){
                if (mas[i]>mas[j]){
                    int temp = mas[i];
                    mas[i]=mas[j];
                    mas[j]=temp;
                }
            }
        }
        for (int i:mas){
            System.out.print(i + " ");
        }

    }

}
