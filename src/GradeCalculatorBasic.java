import java.util.Random;
import java.util.Scanner;

public class GradeCalculatorBasic {
    public static void main(String[] args){
        Random ran = new Random();
        double Score= ran.nextDouble(100);
        System.out.println(Score);

        /// if statements
        if (Score>=90){
            System.out.println("Grade: A");
        }
        else if (Score>=80 && Score <90) {
            System.out.println("Grade B");
        }
        else if (Score>=70 && Score<80) {
            System.out.println("Grade C");

        }
        else if (Score>=60 && Score<70){
            System.out.println("Grade D");
        }else if (Score<60) {
            System.out.println("Grade F");
        }
    }
}
