import java.util.Scanner;

public class EvenOddCheker {
    public static void main(String[] args){
        /// scanner object to take in the user input
        Scanner sc = new Scanner(System.in);
        /// user input
        System.out.print("Enter a Integer: ");
        int number= sc.nextInt();
        System.out.println(number);
        /// Checks the number
        if(number>0 && number%2==0){
            System.out.println("Positive even");
        } else if (number>0 || number%2!=0) {
            System.out.println("Positive Odd");

        } else if (number < 0 || number%2==0) {
            System.out.println("Negative even");

        } else if (number<0 || number%2!=0) {
            System.out.println("Negative Odd");

        }else {
            System.out.println("Number is 0");
        }
        /// closes the scanner
        sc.close();
    }

}
