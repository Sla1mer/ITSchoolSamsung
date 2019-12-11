package Module_1;

public class VlojClass {
    public static void main(String[] args) {
        int k = 30;
        for (int i = 0; i <= 5; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(k+j+" ");
            }
            System.out.println();
            k--;
        }
    }
}
