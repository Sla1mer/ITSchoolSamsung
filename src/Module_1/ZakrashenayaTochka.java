package Module_1;

import java.util.Scanner;

public class ZakrashenayaTochka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        if((x*x+y*y>=4)&&(y<=x)&&(x<=2)&&(y>=0)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
