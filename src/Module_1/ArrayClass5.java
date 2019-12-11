package Module_1;

import java.util.Scanner;

public class ArrayClass5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>=max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
