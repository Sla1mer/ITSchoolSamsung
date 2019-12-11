package Module_1;

import java.util.Scanner;

public class StepenClass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите степень в которую хотите возвести число 2: ");
        int a = in.nextInt();

        int a1 = 2;
        System.out.printf(String.valueOf(Math.pow(a1, a)));
    }
}