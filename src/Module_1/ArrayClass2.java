package Module_1;

import java.util.Scanner;

public class ArrayClass2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2==0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
