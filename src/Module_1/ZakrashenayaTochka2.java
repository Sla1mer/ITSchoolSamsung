package Module_1;

import java.util.Scanner;

public class ZakrashenayaTochka2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        if ((2 - x * x > y && y > x) || (2 - x * x > y && x > 0 && y > 0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
