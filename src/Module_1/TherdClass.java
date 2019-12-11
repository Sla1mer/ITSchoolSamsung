package Module_1;

import java.util.Scanner;

public class TherdClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число трёхзначное число: ");
        int x = in.nextInt();
        int a = x / 100;
        int b = x / 10 % 10;
        int c = x % 10;
        int z = a + b + c;
        System.out.println("Сумма чисел = " + z);
    }
}
