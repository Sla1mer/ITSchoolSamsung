package Module_1;

import java.util.Scanner;

public class SumThreeNumbersClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трёхзначное число: ");
        int a = in.nextInt();
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        int e = b + c + d;
        System.out.println("Сумма цифр: " + e);
    }
}
