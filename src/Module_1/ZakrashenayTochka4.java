package Module_1;

import java.util.Scanner;

public class ZakrashenayTochka4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if((x*x+y*y<=1) && (y>=x) || (x*x+y*y<=1) && (x<=0)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
