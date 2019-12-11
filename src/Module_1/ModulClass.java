package Module_1;

import java.util.Scanner;

public class ModulClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        double x = in.nextDouble();
        if (x>=0){
            System.out.println(x);
        }else {
            System.out.println(-x);
        }
    }
}
