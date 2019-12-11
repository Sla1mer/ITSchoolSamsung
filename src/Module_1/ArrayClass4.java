package Module_1;

import java.util.Scanner;

public class ArrayClass4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];

        for(int i = 0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int c = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]) c += 1;
        }
        System.out.print(c);
    }
}