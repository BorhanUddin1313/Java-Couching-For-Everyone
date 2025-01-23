import java.util.Arrays;
import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[100];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the 3 numbers: ");
            num[i] = sc.nextInt();

        }
        int max = num[0];
        for (int i=0; i<num[i]; i++){
            if (max<num[i]){
                max =num[i];
            }

        }
        System.out.printf(max+ " ");

    }
}
