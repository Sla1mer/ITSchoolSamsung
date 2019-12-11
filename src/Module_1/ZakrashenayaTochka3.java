package Module_1;

import java.util.Scanner;

public class ZakrashenayaTochka3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if(y>=x*x-2 && ((y<=x && x>=0) || (y<=-x && x<=0)) ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
