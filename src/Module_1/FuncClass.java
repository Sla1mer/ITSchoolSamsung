package Module_1;

import java.util.Scanner;

public class FuncClass {
    static int a = 6;
    public static void main(String[] args) {
        HelloWorld();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Add(a,b));
        System.out.println((Factorial(6) + Factorial(10)) / Factorial(3) + Factorial(2));
    }

    public static long Factorial(int n){
        long F = 1;
        for (int i = 1; i<=n; i++){
            F*=i;
        }
        return F;
    }

    public static void HelloWorld(){
        System.out.println("Hello, world");
    }

    public static int Add(int x, int y){
        return x + y;
    }

    /*public static void swap(int x, int y){
        int temp = x;
        x = y;                                          Так делать нельзя!
        y = temp;
    }
     */
}
