package Module_1;

import java.util.Scanner;

public class CikliClass2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long res = 0;

        if(b < 0) {
            for (int i = -1; i >= b; i--) {
                res -= a;
            }
        } else {
            for (int i = 1; i <= b; i++) {
                res += a;
            }
        }
        System.out.print(res);
    }
}
