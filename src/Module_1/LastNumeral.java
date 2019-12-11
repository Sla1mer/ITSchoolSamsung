package Module_1;

import java.util.Scanner;

public class LastNumeral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        a = a % 10;
        System.out.println("Последняя цифра: " + a);
    }
}
