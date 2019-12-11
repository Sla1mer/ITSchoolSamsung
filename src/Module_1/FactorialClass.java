package Module_1;

import java.util.Scanner;

public class FactorialClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        long F =1;
        while (i<=n){
            F*=i;
            i++;
        }
        System.out.println(F);
    }
}
