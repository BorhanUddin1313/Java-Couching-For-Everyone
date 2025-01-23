import java.util.Random;
import java.util.Scanner;

public class GradeCalculatorBasic {
    public static void main(String[] args){
        /// Genarates a random number in 0-100
        Random ran = new Random();
        double Score= ran.nextDouble(100);
        System.out.println(Score);

        /// Checks the score to give out grades
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
