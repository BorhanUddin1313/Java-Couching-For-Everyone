import java.util.Scanner;

public class leapYear {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the year: ");
        int year = sc.nextInt();
        System.out.println(year);

        ///condition
        if (year %4==0) {
            System.out.println(year + " " + "is" +"Leap Year");
        }else if (year%400==0) {
            System.out.println(year + " " + "is" +"Leap Year");
        }else if (year%100!=0){
            System.out.println(year + " " + "is"+ " " +"Non Leap Year");
        }else {
            System.out.println("Not leap year");
        }

    }
}
