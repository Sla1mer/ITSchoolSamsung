package Module_1;

import java.util.Scanner;

public class SummaChisel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        int count = 0;
        while (n != 0){
            result += n%10;
            count++;
            n/=10;
        }
        System.out.println("Result="+result);
        System.out.println("Count="+count);


    }
}
