package Module_1;

import java.util.Scanner;

public class NextEvenClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        int c = a - a % 2 + 2;
        System.out.println("Следущее чётное: " + c);
    }
}