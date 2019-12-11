package Module_1;

import java.util.Scanner;

public class ZadanieThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        for (int i = 0; i < 3; i++) {
            s += n % 10;
            n /= 10;
        }
        System.out.println(s);
    }
}
