package Module_1;

import java.util.Scanner;

public class CikliClass3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arrBridge = new int[in.nextInt()];
        int h = 437;
        for (int i = 0; i<arrBridge.length; i++){
            arrBridge[i] = in.nextInt();
        }
        for (int i = 0; i<arrBridge.length; i++){
            if(arrBridge[i] < h){
                System.out.println("Crash" + " " + arrBridge[i]);
            }else {
                System.out.println("No Crash");
            }
        }
    }
}
