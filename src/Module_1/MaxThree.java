package Module_1;

import java.util.Scanner;

public class MaxThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max;
        if(a > b){
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
