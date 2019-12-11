package Module_1;

import java.util.Scanner;

public class CikliClass1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i<a; i++){
            System.out.print(i * 2 + " ");
        }
    }
}
