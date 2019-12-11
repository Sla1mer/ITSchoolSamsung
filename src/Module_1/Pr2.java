package Module_1;

import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();

        while (a != 0){
            System.out.println(a % 10);
            a /= 10;
        }
    }
}
