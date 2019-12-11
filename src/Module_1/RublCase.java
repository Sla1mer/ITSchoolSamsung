package Module_1;

import java.util.Scanner;

public class RublCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n%100>=11)&&(n%100<=14)){
            System.out.println(n + " рублей");
        }else
         switch (n%10){
             case 1:
                 System.out.println(" рубль");
                 break;
             case 2:
             case 3:
             case 4:
                 System.out.println(" рубля");
                 break;
             default:
                 System.out.println(" рублей");
         }
    }
}
