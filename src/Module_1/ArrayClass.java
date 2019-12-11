package Module_1;

import java.util.Random;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] myArray = {1,2,3,4,5,6};

        //ввод элементов массива вручную
        int [] array1 = new int[10];
        for (int i = 0; i<array1.length; i++){
            array1[i]=in.nextInt();
        }
        for (int i = 0; i<array1.length;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //ввод с использованием формулы
        int[] array2 = new int[10];
        for (int i = 0; i<array2.length; i++){
            array2[i] = 2*i+1;
            System.out.print(array2[i]+ " ");
        }
        System.out.println();

        //генерация с помощью генератора случайных чисел
        //1 способ
        int[] array3 = new int[10];
        Random rnd = new Random();
        for (int i = 0; i<array3.length; i++){
            array3[i]=rnd.nextInt(30)+1; //числа от 0 - 29
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        //2 способ
        int[] array4 = new int[10];
        for(int i = 0; i<array4.length; i++){
            array4[i] = (int)(Math.random()*30);
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        int[] a = new int[5];
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}
