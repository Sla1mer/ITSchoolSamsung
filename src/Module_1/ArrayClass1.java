package Module_1;

import java.util.Scanner;

public class ArrayClass1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i<arr.length; i+=2){
            System.out.println(arr[i] + " ");
        }
    }
}
